namespace Temp_Arduino
{
    partial class Thermometer
    {
        /// <summary>
        /// Variável de designer necessária.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpar os recursos que estão sendo usados.
        /// </summary>
        /// <param name="disposing">true se for necessário descartar os recursos gerenciados; caso contrário, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código gerado pelo Windows Form Designer

        /// <summary>
        /// Método necessário para suporte ao Designer - não modifique 
        /// o conteúdo deste método com o editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Thermometer));
            this.btnStart = new System.Windows.Forms.Button();
            this.btnShutDown = new System.Windows.Forms.Button();
            this.lblPort = new System.Windows.Forms.Label();
            this.thermControl1 = new ThermometerControl.ThermControl();
            this.serialPort = new System.IO.Ports.SerialPort(this.components);
            this.cmbCOM = new System.Windows.Forms.ComboBox();
            this.timerComunication = new System.Windows.Forms.Timer(this.components);
            this.SuspendLayout();
            // 
            // btnStart
            // 
            this.btnStart.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.btnStart.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnStart.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnStart.Location = new System.Drawing.Point(34, 656);
            this.btnStart.Name = "btnStart";
            this.btnStart.Size = new System.Drawing.Size(144, 60);
            this.btnStart.TabIndex = 1;
            this.btnStart.Text = "Iniciar";
            this.btnStart.UseVisualStyleBackColor = false;
            this.btnStart.Click += new System.EventHandler(this.btnStart_Click);
            // 
            // btnShutDown
            // 
            this.btnShutDown.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));
            this.btnShutDown.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnShutDown.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnShutDown.Location = new System.Drawing.Point(253, 656);
            this.btnShutDown.Name = "btnShutDown";
            this.btnShutDown.Size = new System.Drawing.Size(144, 60);
            this.btnShutDown.TabIndex = 1;
            this.btnShutDown.Text = "Finalizar";
            this.btnShutDown.UseVisualStyleBackColor = false;
            this.btnShutDown.Click += new System.EventHandler(this.btnShutDown_Click);
            // 
            // lblPort
            // 
            this.lblPort.AutoSize = true;
            this.lblPort.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPort.Location = new System.Drawing.Point(12, 14);
            this.lblPort.Name = "lblPort";
            this.lblPort.Size = new System.Drawing.Size(75, 16);
            this.lblPort.TabIndex = 2;
            this.lblPort.Text = "Porta COM";
            // 
            // thermControl1
            // 
            this.thermControl1.Location = new System.Drawing.Point(121, 71);
            this.thermControl1.MinimumSize = new System.Drawing.Size(180, 315);
            this.thermControl1.Name = "thermControl1";
            this.thermControl1.Size = new System.Drawing.Size(201, 559);
            this.thermControl1.TabIndex = 4;
            this.thermControl1.Value = 0;
            // 
            // serialPort
            // 
            this.serialPort.DataReceived += new System.IO.Ports.SerialDataReceivedEventHandler(this.serialPort_DataReceived);
            // 
            // cmbCOM
            // 
            this.cmbCOM.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(224)))), ((int)(((byte)(224)))), ((int)(((byte)(224)))));
            this.cmbCOM.Cursor = System.Windows.Forms.Cursors.Hand;
            this.cmbCOM.DropDownHeight = 200;
            this.cmbCOM.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cmbCOM.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.cmbCOM.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cmbCOM.FormattingEnabled = true;
            this.cmbCOM.IntegralHeight = false;
            this.cmbCOM.ItemHeight = 16;
            this.cmbCOM.Location = new System.Drawing.Point(93, 11);
            this.cmbCOM.Name = "cmbCOM";
            this.cmbCOM.Size = new System.Drawing.Size(121, 24);
            this.cmbCOM.TabIndex = 3;
            // 
            // timerComunication
            // 
            this.timerComunication.Enabled = true;
            this.timerComunication.Tick += new System.EventHandler(this.timerComunication_Tick);
            // 
            // Thermometer
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.BackColor = System.Drawing.SystemColors.Window;
            this.ClientSize = new System.Drawing.Size(437, 739);
            this.Controls.Add(this.cmbCOM);
            this.Controls.Add(this.thermControl1);
            this.Controls.Add(this.lblPort);
            this.Controls.Add(this.btnShutDown);
            this.Controls.Add(this.btnStart);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "Thermometer";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Termômetro";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnStart;
        private System.Windows.Forms.Button btnShutDown;
        private System.Windows.Forms.Label lblPort;
        private ThermometerControl.ThermControl thermControl1;
        private System.IO.Ports.SerialPort serialPort;
        private System.Windows.Forms.ComboBox cmbCOM;
        private System.Windows.Forms.Timer timerComunication;
    }
}

