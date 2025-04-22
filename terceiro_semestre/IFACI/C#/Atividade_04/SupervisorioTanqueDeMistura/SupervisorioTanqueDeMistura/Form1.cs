using System;
using System.Windows.Forms;
using System.Diagnostics;

namespace SupervisorioTanqueDeMistura
{
    public partial class Form1: Form
    {
        public Form1()
        {
            InitializeComponent();
            pbMixingTankOff.Visible = true;
            pbMixingTankOn.Visible = false;
        }

        private void tsbLogOut_Click(object sender, EventArgs e)
        {

            DialogResult mb;
            MessageBoxButtons menssageBtn = MessageBoxButtons.YesNo;
            MessageBoxIcon icon = MessageBoxIcon.Exclamation;
            MessageBoxDefaultButton defaultButton = MessageBoxDefaultButton.Button2;

            mb = MessageBox.Show("Do you want to exit the application?", "Exit Application", menssageBtn, icon, defaultButton);

            if (mb == DialogResult.Yes)
            {
                Application.Exit();
            }

        }

        private void timerDateAndHourSystem_Tick(object sender, EventArgs e)
        {
            tslDateSystem.Text = DateTime.Now.ToShortDateString();
            tslHoursSystem.Text = DateTime.Now.ToLongTimeString();
        }

        private void tsbCalculator_Click(object sender, EventArgs e)
        {
            Process.Start("calc");
        }

        private void tsbNotepad_Click(object sender, EventArgs e)
        {
            Process.Start("notepad");
        }

        private void btnStart_Click(object sender, EventArgs e)
        {
            DialogResult mb;
            MessageBoxButtons menssageBtn = MessageBoxButtons.YesNo;
            MessageBoxIcon icon = MessageBoxIcon.Information;
            MessageBoxDefaultButton defaultButton = MessageBoxDefaultButton.Button2;

            mb = MessageBox.Show("Do you want to start the application?", "Start Application", menssageBtn, icon, defaultButton);

            if (mb == DialogResult.Yes)
            {
                pbMixingTankOff.Visible = false;
                pbMixingTankOn.Visible = true;
            }
        }

        private void btnShutDown_Click(object sender, EventArgs e)
        {
            DialogResult mb;
            MessageBoxButtons menssageBtn = MessageBoxButtons.YesNo;
            MessageBoxIcon icon = MessageBoxIcon.Information;
            MessageBoxDefaultButton defaultButton = MessageBoxDefaultButton.Button2;

            mb = MessageBox.Show("Do you want to shutdown the application?", "ShutDown Application", menssageBtn, icon, defaultButton);
            
            if (mb == DialogResult.Yes) {
                pbMixingTankOff.Visible = true;
                pbMixingTankOn.Visible = false; 
            }
        }
    }
}
