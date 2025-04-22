namespace SupervisorioTanqueDeMistura
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.tsMenuLogOutAndDate = new System.Windows.Forms.ToolStrip();
            this.tsbLogOut = new System.Windows.Forms.ToolStripButton();
            this.tslDateSystem = new System.Windows.Forms.ToolStripLabel();
            this.timerDateAndHourSystem = new System.Windows.Forms.Timer(this.components);
            this.tsMenuHour = new System.Windows.Forms.ToolStrip();
            this.tslHoursSystem = new System.Windows.Forms.ToolStripLabel();
            this.tsMenuApplicationsSystem = new System.Windows.Forms.ToolStrip();
            this.tsbCalculator = new System.Windows.Forms.ToolStripButton();
            this.tsSeparator = new System.Windows.Forms.ToolStripSeparator();
            this.tsbNotepad = new System.Windows.Forms.ToolStripButton();
            this.btnStart = new System.Windows.Forms.Button();
            this.btnShutDown = new System.Windows.Forms.Button();
            this.btnEmergency = new System.Windows.Forms.Button();
            this.pbMixingTankOff = new System.Windows.Forms.PictureBox();
            this.pbMixingTankOn = new System.Windows.Forms.PictureBox();
            this.tsMenuLogOutAndDate.SuspendLayout();
            this.tsMenuHour.SuspendLayout();
            this.tsMenuApplicationsSystem.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbMixingTankOff)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbMixingTankOn)).BeginInit();
            this.SuspendLayout();
            // 
            // tsMenuLogOutAndDate
            // 
            this.tsMenuLogOutAndDate.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(224)))), ((int)(((byte)(224)))), ((int)(((byte)(224)))));
            this.tsMenuLogOutAndDate.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.tsMenuLogOutAndDate.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.tsbLogOut,
            this.tslDateSystem});
            this.tsMenuLogOutAndDate.Location = new System.Drawing.Point(0, 669);
            this.tsMenuLogOutAndDate.Name = "tsMenuLogOutAndDate";
            this.tsMenuLogOutAndDate.Size = new System.Drawing.Size(1135, 30);
            this.tsMenuLogOutAndDate.TabIndex = 0;
            // 
            // tsbLogOut
            // 
            this.tsbLogOut.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(224)))), ((int)(((byte)(224)))), ((int)(((byte)(224)))));
            this.tsbLogOut.Font = new System.Drawing.Font("Arial", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tsbLogOut.Image = ((System.Drawing.Image)(resources.GetObject("tsbLogOut.Image")));
            this.tsbLogOut.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.tsbLogOut.Margin = new System.Windows.Forms.Padding(5, 5, 0, 5);
            this.tsbLogOut.Name = "tsbLogOut";
            this.tsbLogOut.Size = new System.Drawing.Size(67, 20);
            this.tsbLogOut.Text = "&LogOut";
            this.tsbLogOut.Click += new System.EventHandler(this.tsbLogOut_Click);
            // 
            // tslDateSystem
            // 
            this.tslDateSystem.Alignment = System.Windows.Forms.ToolStripItemAlignment.Right;
            this.tslDateSystem.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tslDateSystem.Margin = new System.Windows.Forms.Padding(5, 0, 0, 5);
            this.tslDateSystem.Name = "tslDateSystem";
            this.tslDateSystem.Size = new System.Drawing.Size(69, 25);
            this.tslDateSystem.Text = "00/00/0000";
            // 
            // timerDateAndHourSystem
            // 
            this.timerDateAndHourSystem.Enabled = true;
            this.timerDateAndHourSystem.Tick += new System.EventHandler(this.timerDateAndHourSystem_Tick);
            // 
            // tsMenuHour
            // 
            this.tsMenuHour.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(224)))), ((int)(((byte)(224)))), ((int)(((byte)(224)))));
            this.tsMenuHour.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.tsMenuHour.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.tslHoursSystem});
            this.tsMenuHour.Location = new System.Drawing.Point(0, 644);
            this.tsMenuHour.Name = "tsMenuHour";
            this.tsMenuHour.Size = new System.Drawing.Size(1135, 25);
            this.tsMenuHour.TabIndex = 1;
            this.tsMenuHour.Text = "toolStrip2";
            // 
            // tslHoursSystem
            // 
            this.tslHoursSystem.Alignment = System.Windows.Forms.ToolStripItemAlignment.Right;
            this.tslHoursSystem.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Bold);
            this.tslHoursSystem.Name = "tslHoursSystem";
            this.tslHoursSystem.Size = new System.Drawing.Size(55, 22);
            this.tslHoursSystem.Text = "00:00:00";
            // 
            // tsMenuApplicationsSystem
            // 
            this.tsMenuApplicationsSystem.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(224)))), ((int)(((byte)(224)))), ((int)(((byte)(224)))));
            this.tsMenuApplicationsSystem.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.tsbCalculator,
            this.tsSeparator,
            this.tsbNotepad});
            this.tsMenuApplicationsSystem.Location = new System.Drawing.Point(0, 0);
            this.tsMenuApplicationsSystem.Name = "tsMenuApplicationsSystem";
            this.tsMenuApplicationsSystem.Size = new System.Drawing.Size(1135, 30);
            this.tsMenuApplicationsSystem.TabIndex = 2;
            // 
            // tsbCalculator
            // 
            this.tsbCalculator.Font = new System.Drawing.Font("Arial", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tsbCalculator.Image = ((System.Drawing.Image)(resources.GetObject("tsbCalculator.Image")));
            this.tsbCalculator.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.tsbCalculator.Margin = new System.Windows.Forms.Padding(5);
            this.tsbCalculator.Name = "tsbCalculator";
            this.tsbCalculator.Size = new System.Drawing.Size(82, 20);
            this.tsbCalculator.Text = "Calculator";
            this.tsbCalculator.Click += new System.EventHandler(this.tsbCalculator_Click);
            // 
            // tsSeparator
            // 
            this.tsSeparator.AutoSize = false;
            this.tsSeparator.BackColor = System.Drawing.Color.Black;
            this.tsSeparator.ForeColor = System.Drawing.Color.Black;
            this.tsSeparator.Name = "tsSeparator";
            this.tsSeparator.Size = new System.Drawing.Size(6, 30);
            // 
            // tsbNotepad
            // 
            this.tsbNotepad.Font = new System.Drawing.Font("Arial", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tsbNotepad.Image = ((System.Drawing.Image)(resources.GetObject("tsbNotepad.Image")));
            this.tsbNotepad.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.tsbNotepad.Margin = new System.Windows.Forms.Padding(5, 5, 0, 5);
            this.tsbNotepad.Name = "tsbNotepad";
            this.tsbNotepad.Size = new System.Drawing.Size(72, 20);
            this.tsbNotepad.Text = "Notepad";
            this.tsbNotepad.Click += new System.EventHandler(this.tsbNotepad_Click);
            // 
            // btnStart
            // 
            this.btnStart.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.btnStart.Font = new System.Drawing.Font("Arial", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnStart.Location = new System.Drawing.Point(311, 572);
            this.btnStart.Name = "btnStart";
            this.btnStart.Size = new System.Drawing.Size(106, 49);
            this.btnStart.TabIndex = 1;
            this.btnStart.Text = "&Start";
            this.btnStart.UseVisualStyleBackColor = false;
            this.btnStart.Click += new System.EventHandler(this.btnStart_Click);
            // 
            // btnShutDown
            // 
            this.btnShutDown.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnShutDown.Font = new System.Drawing.Font("Arial", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnShutDown.Location = new System.Drawing.Point(687, 572);
            this.btnShutDown.Name = "btnShutDown";
            this.btnShutDown.Size = new System.Drawing.Size(106, 49);
            this.btnShutDown.TabIndex = 2;
            this.btnShutDown.Text = "ShutDo&wn";
            this.btnShutDown.UseVisualStyleBackColor = false;
            this.btnShutDown.Click += new System.EventHandler(this.btnShutDown_Click);
            // 
            // btnEmergency
            // 
            this.btnEmergency.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.btnEmergency.Font = new System.Drawing.Font("Arial", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnEmergency.ForeColor = System.Drawing.Color.White;
            this.btnEmergency.Image = ((System.Drawing.Image)(resources.GetObject("btnEmergency.Image")));
            this.btnEmergency.Location = new System.Drawing.Point(1017, 42);
            this.btnEmergency.Name = "btnEmergency";
            this.btnEmergency.Size = new System.Drawing.Size(106, 49);
            this.btnEmergency.TabIndex = 3;
            this.btnEmergency.Text = "&Emergency";
            this.btnEmergency.UseVisualStyleBackColor = false;
            // 
            // pbMixingTankOff
            // 
            this.pbMixingTankOff.Image = ((System.Drawing.Image)(resources.GetObject("pbMixingTankOff.Image")));
            this.pbMixingTankOff.Location = new System.Drawing.Point(337, 75);
            this.pbMixingTankOff.Name = "pbMixingTankOff";
            this.pbMixingTankOff.Size = new System.Drawing.Size(430, 466);
            this.pbMixingTankOff.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbMixingTankOff.TabIndex = 6;
            this.pbMixingTankOff.TabStop = false;
            // 
            // pbMixingTankOn
            // 
            this.pbMixingTankOn.Image = ((System.Drawing.Image)(resources.GetObject("pbMixingTankOn.Image")));
            this.pbMixingTankOn.Location = new System.Drawing.Point(337, 75);
            this.pbMixingTankOn.Name = "pbMixingTankOn";
            this.pbMixingTankOn.Size = new System.Drawing.Size(430, 466);
            this.pbMixingTankOn.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbMixingTankOn.TabIndex = 7;
            this.pbMixingTankOn.TabStop = false;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Gray;
            this.ClientSize = new System.Drawing.Size(1135, 699);
            this.Controls.Add(this.pbMixingTankOff);
            this.Controls.Add(this.btnEmergency);
            this.Controls.Add(this.btnShutDown);
            this.Controls.Add(this.btnStart);
            this.Controls.Add(this.tsMenuApplicationsSystem);
            this.Controls.Add(this.tsMenuHour);
            this.Controls.Add(this.tsMenuLogOutAndDate);
            this.Controls.Add(this.pbMixingTankOn);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Supervisório Tanque";
            this.tsMenuLogOutAndDate.ResumeLayout(false);
            this.tsMenuLogOutAndDate.PerformLayout();
            this.tsMenuHour.ResumeLayout(false);
            this.tsMenuHour.PerformLayout();
            this.tsMenuApplicationsSystem.ResumeLayout(false);
            this.tsMenuApplicationsSystem.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbMixingTankOff)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbMixingTankOn)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ToolStrip tsMenuLogOutAndDate;
        private System.Windows.Forms.ToolStripButton tsbLogOut;
        private System.Windows.Forms.ToolStripLabel tslDateSystem;
        private System.Windows.Forms.Timer timerDateAndHourSystem;
        private System.Windows.Forms.ToolStrip tsMenuHour;
        private System.Windows.Forms.ToolStripLabel tslHoursSystem;
        private System.Windows.Forms.ToolStrip tsMenuApplicationsSystem;
        private System.Windows.Forms.ToolStripButton tsbCalculator;
        private System.Windows.Forms.ToolStripSeparator tsSeparator;
        private System.Windows.Forms.ToolStripButton tsbNotepad;
        private System.Windows.Forms.Button btnStart;
        private System.Windows.Forms.Button btnShutDown;
        private System.Windows.Forms.Button btnEmergency;
        private System.Windows.Forms.PictureBox pbMixingTankOff;
        private System.Windows.Forms.PictureBox pbMixingTankOn;
    }
}

