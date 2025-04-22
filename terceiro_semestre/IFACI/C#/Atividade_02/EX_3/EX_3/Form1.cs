using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EX_3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            pbStatus.Image = Image.FromFile("c:\\Imagens\\Verde.bmp");
            pbStatus.SizeMode = PictureBoxSizeMode.StretchImage;
            txtStatus.Text = "DESLIGADO";
        }

        // Botão LIGA
        private void btnLigar_Click(object sender, EventArgs e)
        {
            DialogResult mb;
            MessageBoxButtons menssageBtn = MessageBoxButtons.OKCancel;
            MessageBoxIcon icon = MessageBoxIcon.Information;
            MessageBoxDefaultButton defaultButton = MessageBoxDefaultButton.Button2;

            if (txtStatus.Text.Equals("DESLIGADO"))
            {
                mb = MessageBox.Show("A máquina será ligada, \ndeseja continuar ?", "Informação", menssageBtn, icon, defaultButton);

                switch (mb)
                {
                    case DialogResult.Cancel:
                        pbStatus.Image = Image.FromFile("c:\\Imagens\\Verde.bmp");
                        pbStatus.SizeMode = PictureBoxSizeMode.StretchImage;
                        txtStatus.Text = "DESLIGADO";
                        break;

                    case DialogResult.OK:
                        pbStatus.Image = Image.FromFile("c:\\Imagens\\Vermelho.bmp");
                        pbStatus.SizeMode = PictureBoxSizeMode.StretchImage;
                        txtStatus.Text = "LIGADO";
                        break;
                }
            } else
            {
               btnLigar.Enabled = false;
            }
           
        }

        // Botão DESLIGA
        private void btnDesligar_Click(object sender, EventArgs e)
        {
            DialogResult mb;
            MessageBoxButtons menssageBtn = MessageBoxButtons.OKCancel;
            MessageBoxIcon icon = MessageBoxIcon.Information;
            MessageBoxDefaultButton defaultButton = MessageBoxDefaultButton.Button2;

            if (txtStatus.Text.Equals("LIGADO"))
            {
                mb = MessageBox.Show("A máquina será desligada, \ndeseja continuar ?", "Informação", menssageBtn, icon, defaultButton);

                switch (mb)
                {
                    case DialogResult.OK:
                        pbStatus.Image = Image.FromFile("c:\\Imagens\\Verde.bmp");
                        pbStatus.SizeMode = PictureBoxSizeMode.StretchImage;
                        txtStatus.Text = "DESLIGADO";
                        btnLigar.Enabled = true;
                        break;

                    case DialogResult.Cancel:
                        pbStatus.Image = Image.FromFile("c:\\Imagens\\Vermelho.bmp");
                        pbStatus.SizeMode = PictureBoxSizeMode.StretchImage;
                        txtStatus.Text = "LIGADO";
                        btnDesligar.Enabled = true;
                        break;
                }
            } else
            {
                btnDesligar.Enabled = true;
            }
          
        }

        // Botão SAIR
        private void btnSair_Click(object sender, EventArgs e)
        {
            DialogResult mb;
            MessageBoxButtons menssageBtn = MessageBoxButtons.YesNo;
            MessageBoxIcon icon = MessageBoxIcon.Warning;
            MessageBoxDefaultButton defaultButton = MessageBoxDefaultButton.Button2;
            mb = MessageBox.Show("Deseja sair do sistema ?", "Informação", menssageBtn, icon, defaultButton);

            switch (mb)
            {
                case DialogResult.Yes:
                    Application.Exit();
                break;

                case DialogResult.No:
                     
                break;
            }
        }
    }
}
