using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO.Ports;

namespace interfacePortasCOM
{
    public partial class Form1 : Form
    {
        string RxString;

        public Form1()
        {
            InitializeComponent();
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
                foreach(string s in SerialPort.GetPortNames())
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
            if(quantDiferente == false)
            {
                return; // retorna
            }

            // Limpa comboBox
            cmbCOM.Items.Clear();

            //adiciona todas as COM disponíveis na lista
            foreach(string s in SerialPort.GetPortNames())
            {
                cmbCOM.Items.Add(s);
            }
            //seleciona a primeira posição da lista
            cmbCOM.SelectedIndex = -1;
        }

        private void timerComunication_Tick(object sender, EventArgs e)
        {
          atualizaListaCOMs();
        }

        private void btnConectar_Click(object sender, EventArgs e)
        {
            if (serialPort.IsOpen == false)
            {
                try
                {
                    serialPort.PortName = cmbCOM.Items[cmbCOM.SelectedIndex].ToString();
                    serialPort.Open();
                }
                catch
                {
                    return ;
                }

                if (serialPort.IsOpen)
                {
                    btnConectar.Text = "Desconectar";
                    cmbCOM.Enabled = false;
                }
            }
            else
            {
                try
                {
                    serialPort.Close();
                    cmbCOM.Enabled = true;
                    btnConectar.Text = "Conectar";
                }
                catch
                {
                    return;
                }
            }
        }

        private void Form1_FormClosed(object sender, FormClosedEventArgs e)
        {
            if(serialPort.IsOpen == true) // se porta aberta
            {
                serialPort.Close(); // fecha a porta
            }
        }

        private void btnEnviar_Click(object sender, EventArgs e)
        {
            if(serialPort.IsOpen == true) // se porta está aberta
            {
                serialPort.Write(txtEnviar.Text); // envia o texto presente no textBox Enviar
            }
        }

        private void serialPort_DataReceived(object sender, SerialDataReceivedEventArgs e)
        {
            RxString = serialPort.ReadExisting();
            this.Invoke(new EventHandler(trataDadoRecebido));
        }

        private void trataDadoRecebido(object sender, EventArgs e)
        {
            txtExibirDados.AppendText(RxString);
        }
    }
}
