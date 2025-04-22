using System.Windows.Forms;
using System.IO.Ports;
using System;

namespace Temp_Arduino
{
    public partial class Thermometer : Form
    {
        public Thermometer()
        {
            InitializeComponent(); // Inicializa componentes do formulário
        }

        private void atualizaListaCOMs()
        {
            int i;
            bool quantDiferente; // flag para sinalizar que a qunatidade de portas mudou

            i = 0;
            quantDiferente = false;

            // se a quantidade de portas mudou
            if (cmbCOM.Items.Count == SerialPort.GetPortNames().Length)
            {
                foreach (string s in SerialPort.GetPortNames())
                {
                    if (cmbCOM.Items[i++].Equals(s) == false)
                    {
                        quantDiferente = true;
                    }
                }
            }
            else
            {
                quantDiferente = true;
            }

            //Se não foi detectado diferença
            if (quantDiferente == false)
            {
                return; // retorna
            }

            // Limpa comboBox
            cmbCOM.Items.Clear();

            //adiciona todas as COM disponíveis na lista
            foreach (string s in SerialPort.GetPortNames())
            {
                cmbCOM.Items.Add(s);
            }
            //seleciona a primeira posição da lista
            cmbCOM.SelectedIndex = -1;
        }

        private void lerTemperatura(object sender, EventArgs e)
        {
            byte[] dados = new byte[2]; // Buffer para dados (não utilizados)
            string valor; // Variável para armazenamento de leitura

            valor = serialPort.ReadExisting(); // Lê todos os dados que serão disponiveis pela porta serial

            if(valor != "") // Se rebebeu dados
            {
                thermControl1.UpdateControl(Convert.ToInt32(valor));

                // Limpa Buffer da porta serial
                serialPort.DiscardInBuffer();
                serialPort.DiscardOutBuffer();
            }
        }

        private void serialPort_DataReceived(object sender, SerialDataReceivedEventArgs e)
        {
            this.Invoke(new EventHandler(lerTemperatura)); // Chama ler temperatura na thread na UI
        }

        private void btnStart_Click(object sender, EventArgs e)
        {
            if (cmbCOM.SelectedIndex > 0) // Verifica se foi informada uma porta
            {
                try
                {
                   serialPort.PortName = cmbCOM.SelectedItem.ToString(); // Configura a porta serial
                }
                catch(Exception ex) {
                    MessageBox.Show($"Erro selecione uma porta COM");
                }
            }
            if (!serialPort.IsOpen)
            {
                try {
                    serialPort.Open(); // Abre a conexão serial
                }
                catch(Exception ex){
                    MessageBox.Show($"Erro ao abrir conexão com a porta serial");
                }
                
            }
        }

        private void btnShutDown_Click(object sender, EventArgs e)
        {
            if(serialPort.IsOpen)
            {
                serialPort.Close(); //Fecha a conexão serial

                Application.Exit(); // Encerra a aplicação
            }
        }

        private void timerComunication_Tick(object sender, EventArgs e)
        {
            atualizaListaCOMs();
        }
    }
}
