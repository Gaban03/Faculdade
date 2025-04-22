using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EX_02
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnLigar_Click(object sender, EventArgs e)
        {
            DialogResult dialogResult; 
            MessageBoxButtons messageBoxButtons = MessageBoxButtons.OKCancel;
            MessageBoxIcon icon = MessageBoxIcon.Information;
            MessageBoxDefaultButton defaultButton = MessageBoxDefaultButton.Button2;

            dialogResult = MessageBox.Show("O sistema foi ligada!", "Informação", messageBoxButtons, icon, defaultButton);

        }

        private void btnDesligar_Click(object sender, EventArgs e)
        {
            DialogResult dialogResult;
            MessageBoxButtons messageBoxButtons = MessageBoxButtons.OKCancel;
            MessageBoxIcon icon = MessageBoxIcon.Information;
            MessageBoxDefaultButton defaultButton = MessageBoxDefaultButton.Button2;

            dialogResult = MessageBox.Show("O sistema foi desligada!", "Informação", messageBoxButtons, icon, defaultButton);
        }

        private void btnErro_Click(object sender, EventArgs e)
        {
            DialogResult dialogResult;
            MessageBoxButtons messageBoxButtons = MessageBoxButtons.OKCancel;
            MessageBoxIcon icon = MessageBoxIcon.Error;
            MessageBoxDefaultButton defaultButton = MessageBoxDefaultButton.Button2;

            dialogResult = MessageBox.Show("Erro no sistema!", "Erro", messageBoxButtons, icon, defaultButton);
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            DialogResult dialogResult;
            MessageBoxButtons messageBoxButtons = MessageBoxButtons.OK;
            MessageBoxIcon icon = MessageBoxIcon.Information;
            MessageBoxDefaultButton defaultButton = MessageBoxDefaultButton.Button2;

            dialogResult = MessageBox.Show("Saindo do sistema!", "Sair", messageBoxButtons, icon, defaultButton);
            
            Application.Exit();
           
        }
    }
}
