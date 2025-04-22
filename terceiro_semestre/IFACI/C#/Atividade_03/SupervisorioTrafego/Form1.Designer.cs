namespace SupervisorioTrafego
{
    partial class Form1
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.navigationBar = new System.Windows.Forms.ToolStrip();
            this.btnIconFiremen = new System.Windows.Forms.ToolStripButton();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.btnIconPolice = new System.Windows.Forms.ToolStripButton();
            this.clockDateTime = new System.Windows.Forms.Timer(this.components);
            this.bottomBar = new System.Windows.Forms.ToolStrip();
            this.DatePage = new System.Windows.Forms.ToolStripLabel();
            this.btnLogOut = new System.Windows.Forms.ToolStripButton();
            this.bottomBarTop = new System.Windows.Forms.ToolStrip();
            this.HoursPage = new System.Windows.Forms.ToolStripLabel();
            this.btnEmergency = new System.Windows.Forms.Button();
            this.btnStart = new System.Windows.Forms.Button();
            this.btnShutdown = new System.Windows.Forms.Button();
            this.pbRoadYellow = new System.Windows.Forms.PictureBox();
            this.pbRoadRed = new System.Windows.Forms.PictureBox();
            this.pbAvenueRed = new System.Windows.Forms.PictureBox();
            this.pbAvenueYellow = new System.Windows.Forms.PictureBox();
            this.label1 = new System.Windows.Forms.Label();
            this.lblAvenue = new System.Windows.Forms.Label();
            this.pbAvenueGreen = new System.Windows.Forms.PictureBox();
            this.pbRoadGreen = new System.Windows.Forms.PictureBox();
            this.timerAvenueGreen = new System.Windows.Forms.Timer(this.components);
            this.timerAvenueYellow = new System.Windows.Forms.Timer(this.components);
            this.timerAvenueRed = new System.Windows.Forms.Timer(this.components);
            this.timerRoadRed = new System.Windows.Forms.Timer(this.components);
            this.timerRoadYellow = new System.Windows.Forms.Timer(this.components);
            this.timerRoadGreen = new System.Windows.Forms.Timer(this.components);
            this.timerEmergency = new System.Windows.Forms.Timer(this.components);
            this.navigationBar.SuspendLayout();
            this.bottomBar.SuspendLayout();
            this.bottomBarTop.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbRoadYellow)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbRoadRed)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbAvenueRed)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbAvenueYellow)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbAvenueGreen)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbRoadGreen)).BeginInit();
            this.SuspendLayout();
            // 
            // navigationBar
            // 
            this.navigationBar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(224)))), ((int)(((byte)(224)))), ((int)(((byte)(224)))));
            this.navigationBar.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.btnIconFiremen,
            this.toolStripSeparator1,
            this.btnIconPolice});
            this.navigationBar.Location = new System.Drawing.Point(0, 0);
            this.navigationBar.Name = "navigationBar";
            this.navigationBar.Size = new System.Drawing.Size(1193, 25);
            this.navigationBar.TabIndex = 0;
            this.navigationBar.Text = "toolStrip1";
            // 
            // btnIconFiremen
            // 
            this.btnIconFiremen.Font = new System.Drawing.Font("Arial", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnIconFiremen.Image = ((System.Drawing.Image)(resources.GetObject("btnIconFiremen.Image")));
            this.btnIconFiremen.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnIconFiremen.Name = "btnIconFiremen";
            this.btnIconFiremen.Size = new System.Drawing.Size(73, 22);
            this.btnIconFiremen.Text = "Firemen";
            this.btnIconFiremen.Click += new System.EventHandler(this.btnIconFiremen_Click);
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.BackColor = System.Drawing.Color.Black;
            this.toolStripSeparator1.ForeColor = System.Drawing.Color.Black;
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(6, 25);
            // 
            // btnIconPolice
            // 
            this.btnIconPolice.Font = new System.Drawing.Font("Arial", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnIconPolice.Image = ((System.Drawing.Image)(resources.GetObject("btnIconPolice.Image")));
            this.btnIconPolice.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnIconPolice.Name = "btnIconPolice";
            this.btnIconPolice.Size = new System.Drawing.Size(60, 22);
            this.btnIconPolice.Text = "Police";
            this.btnIconPolice.Click += new System.EventHandler(this.btnIconPolice_Click);
            // 
            // clockDateTime
            // 
            this.clockDateTime.Enabled = true;
            this.clockDateTime.Tick += new System.EventHandler(this.clockDateTime_Tick);
            // 
            // bottomBar
            // 
            this.bottomBar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(224)))), ((int)(((byte)(224)))), ((int)(((byte)(224)))));
            this.bottomBar.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.bottomBar.GripStyle = System.Windows.Forms.ToolStripGripStyle.Hidden;
            this.bottomBar.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.DatePage,
            this.btnLogOut});
            this.bottomBar.Location = new System.Drawing.Point(0, 723);
            this.bottomBar.Name = "bottomBar";
            this.bottomBar.Padding = new System.Windows.Forms.Padding(0, 0, 10, 0);
            this.bottomBar.RenderMode = System.Windows.Forms.ToolStripRenderMode.Professional;
            this.bottomBar.Size = new System.Drawing.Size(1193, 40);
            this.bottomBar.TabIndex = 1;
            this.bottomBar.Text = "toolStrip2";
            // 
            // DatePage
            // 
            this.DatePage.Alignment = System.Windows.Forms.ToolStripItemAlignment.Right;
            this.DatePage.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Bold);
            this.DatePage.Name = "DatePage";
            this.DatePage.Size = new System.Drawing.Size(69, 37);
            this.DatePage.Text = "00/00/0000";
            // 
            // btnLogOut
            // 
            this.btnLogOut.Font = new System.Drawing.Font("Arial", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnLogOut.Image = ((System.Drawing.Image)(resources.GetObject("btnLogOut.Image")));
            this.btnLogOut.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnLogOut.Margin = new System.Windows.Forms.Padding(5, 5, 0, 5);
            this.btnLogOut.Name = "btnLogOut";
            this.btnLogOut.Padding = new System.Windows.Forms.Padding(5);
            this.btnLogOut.Size = new System.Drawing.Size(77, 30);
            this.btnLogOut.Text = "LogOut";
            this.btnLogOut.Click += new System.EventHandler(this.btnLogOut_Click);
            // 
            // bottomBarTop
            // 
            this.bottomBarTop.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(224)))), ((int)(((byte)(224)))), ((int)(((byte)(224)))));
            this.bottomBarTop.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.bottomBarTop.GripStyle = System.Windows.Forms.ToolStripGripStyle.Hidden;
            this.bottomBarTop.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.HoursPage});
            this.bottomBarTop.Location = new System.Drawing.Point(0, 698);
            this.bottomBarTop.Name = "bottomBarTop";
            this.bottomBarTop.Padding = new System.Windows.Forms.Padding(0, 0, 10, 0);
            this.bottomBarTop.RenderMode = System.Windows.Forms.ToolStripRenderMode.Professional;
            this.bottomBarTop.Size = new System.Drawing.Size(1193, 25);
            this.bottomBarTop.TabIndex = 2;
            this.bottomBarTop.Text = "toolStrip3";
            // 
            // HoursPage
            // 
            this.HoursPage.Alignment = System.Windows.Forms.ToolStripItemAlignment.Right;
            this.HoursPage.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Bold);
            this.HoursPage.Name = "HoursPage";
            this.HoursPage.Size = new System.Drawing.Size(55, 22);
            this.HoursPage.Text = "00:00:00";
            // 
            // btnEmergency
            // 
            this.btnEmergency.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnEmergency.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnEmergency.Font = new System.Drawing.Font("Arial", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnEmergency.Location = new System.Drawing.Point(1049, 34);
            this.btnEmergency.Name = "btnEmergency";
            this.btnEmergency.Size = new System.Drawing.Size(132, 49);
            this.btnEmergency.TabIndex = 3;
            this.btnEmergency.Text = "Emergency";
            this.btnEmergency.UseVisualStyleBackColor = false;
            this.btnEmergency.Click += new System.EventHandler(this.btnEmergency_Click);
            // 
            // btnStart
            // 
            this.btnStart.BackColor = System.Drawing.Color.Silver;
            this.btnStart.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnStart.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnStart.Location = new System.Drawing.Point(376, 602);
            this.btnStart.Name = "btnStart";
            this.btnStart.Size = new System.Drawing.Size(160, 57);
            this.btnStart.TabIndex = 4;
            this.btnStart.Text = "Start";
            this.btnStart.UseVisualStyleBackColor = false;
            this.btnStart.Click += new System.EventHandler(this.btnStart_Click);
            // 
            // btnShutdown
            // 
            this.btnShutdown.BackColor = System.Drawing.Color.Silver;
            this.btnShutdown.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnShutdown.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnShutdown.Location = new System.Drawing.Point(601, 602);
            this.btnShutdown.Name = "btnShutdown";
            this.btnShutdown.Size = new System.Drawing.Size(160, 57);
            this.btnShutdown.TabIndex = 5;
            this.btnShutdown.Text = "Shutdown";
            this.btnShutdown.UseVisualStyleBackColor = false;
            this.btnShutdown.Click += new System.EventHandler(this.btnShutdown_Click);
            // 
            // pbRoadYellow
            // 
            this.pbRoadYellow.BackColor = System.Drawing.Color.Transparent;
            this.pbRoadYellow.Image = ((System.Drawing.Image)(resources.GetObject("pbRoadYellow.Image")));
            this.pbRoadYellow.Location = new System.Drawing.Point(671, 63);
            this.pbRoadYellow.Name = "pbRoadYellow";
            this.pbRoadYellow.Size = new System.Drawing.Size(212, 236);
            this.pbRoadYellow.TabIndex = 7;
            this.pbRoadYellow.TabStop = false;
            // 
            // pbRoadRed
            // 
            this.pbRoadRed.BackColor = System.Drawing.Color.Transparent;
            this.pbRoadRed.Image = ((System.Drawing.Image)(resources.GetObject("pbRoadRed.Image")));
            this.pbRoadRed.Location = new System.Drawing.Point(671, 63);
            this.pbRoadRed.Name = "pbRoadRed";
            this.pbRoadRed.Size = new System.Drawing.Size(212, 236);
            this.pbRoadRed.TabIndex = 8;
            this.pbRoadRed.TabStop = false;
            // 
            // pbAvenueRed
            // 
            this.pbAvenueRed.BackColor = System.Drawing.Color.Transparent;
            this.pbAvenueRed.Image = ((System.Drawing.Image)(resources.GetObject("pbAvenueRed.Image")));
            this.pbAvenueRed.Location = new System.Drawing.Point(38, 118);
            this.pbAvenueRed.Name = "pbAvenueRed";
            this.pbAvenueRed.Size = new System.Drawing.Size(212, 236);
            this.pbAvenueRed.TabIndex = 11;
            this.pbAvenueRed.TabStop = false;
            // 
            // pbAvenueYellow
            // 
            this.pbAvenueYellow.BackColor = System.Drawing.Color.Transparent;
            this.pbAvenueYellow.Image = ((System.Drawing.Image)(resources.GetObject("pbAvenueYellow.Image")));
            this.pbAvenueYellow.Location = new System.Drawing.Point(38, 118);
            this.pbAvenueYellow.Name = "pbAvenueYellow";
            this.pbAvenueYellow.Size = new System.Drawing.Size(212, 236);
            this.pbAvenueYellow.TabIndex = 10;
            this.pbAvenueYellow.TabStop = false;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.BackColor = System.Drawing.Color.White;
            this.label1.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.label1.Font = new System.Drawing.Font("Arial", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(730, 34);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(73, 26);
            this.label1.TabIndex = 12;
            this.label1.Text = "ROAD";
            // 
            // lblAvenue
            // 
            this.lblAvenue.AutoSize = true;
            this.lblAvenue.BackColor = System.Drawing.Color.White;
            this.lblAvenue.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.lblAvenue.Font = new System.Drawing.Font("Arial", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblAvenue.Location = new System.Drawing.Point(94, 100);
            this.lblAvenue.Name = "lblAvenue";
            this.lblAvenue.Size = new System.Drawing.Size(94, 26);
            this.lblAvenue.TabIndex = 13;
            this.lblAvenue.Text = "AVENUE";
            // 
            // pbAvenueGreen
            // 
            this.pbAvenueGreen.BackColor = System.Drawing.Color.Transparent;
            this.pbAvenueGreen.Image = ((System.Drawing.Image)(resources.GetObject("pbAvenueGreen.Image")));
            this.pbAvenueGreen.Location = new System.Drawing.Point(38, 118);
            this.pbAvenueGreen.Name = "pbAvenueGreen";
            this.pbAvenueGreen.Size = new System.Drawing.Size(212, 236);
            this.pbAvenueGreen.TabIndex = 14;
            this.pbAvenueGreen.TabStop = false;
            // 
            // pbRoadGreen
            // 
            this.pbRoadGreen.BackColor = System.Drawing.Color.Transparent;
            this.pbRoadGreen.Image = ((System.Drawing.Image)(resources.GetObject("pbRoadGreen.Image")));
            this.pbRoadGreen.Location = new System.Drawing.Point(671, 63);
            this.pbRoadGreen.Name = "pbRoadGreen";
            this.pbRoadGreen.Size = new System.Drawing.Size(212, 236);
            this.pbRoadGreen.TabIndex = 15;
            this.pbRoadGreen.TabStop = false;
            // 
            // timerAvenueGreen
            // 
            this.timerAvenueGreen.Interval = 1000;
            this.timerAvenueGreen.Tick += new System.EventHandler(this.timerAvenueGreen_Tick);
            // 
            // timerAvenueYellow
            // 
            this.timerAvenueYellow.Interval = 1000;
            this.timerAvenueYellow.Tick += new System.EventHandler(this.timerAvenueYellow_Tick);
            // 
            // timerAvenueRed
            // 
            this.timerAvenueRed.Interval = 1000;
            this.timerAvenueRed.Tick += new System.EventHandler(this.timerAvenueRed_Tick);
            // 
            // timerRoadRed
            // 
            this.timerRoadRed.Interval = 1000;
            this.timerRoadRed.Tick += new System.EventHandler(this.timerRoadRed_Tick);
            // 
            // timerRoadYellow
            // 
            this.timerRoadYellow.Interval = 1000;
            this.timerRoadYellow.Tick += new System.EventHandler(this.timerRoadYellow_Tick);
            // 
            // timerRoadGreen
            // 
            this.timerRoadGreen.Interval = 1000;
            this.timerRoadGreen.Tick += new System.EventHandler(this.timerRoadGreen_Tick);
            // 
            // timerEmergency
            // 
            this.timerEmergency.Interval = 1000;
            this.timerEmergency.Tick += new System.EventHandler(this.timerEmergency_Tick);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Black;
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(1193, 763);
            this.Controls.Add(this.lblAvenue);
            this.Controls.Add(this.pbAvenueGreen);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.pbRoadRed);
            this.Controls.Add(this.pbRoadYellow);
            this.Controls.Add(this.btnShutdown);
            this.Controls.Add(this.btnStart);
            this.Controls.Add(this.btnEmergency);
            this.Controls.Add(this.bottomBarTop);
            this.Controls.Add(this.bottomBar);
            this.Controls.Add(this.navigationBar);
            this.Controls.Add(this.pbAvenueYellow);
            this.Controls.Add(this.pbAvenueRed);
            this.Controls.Add(this.pbRoadGreen);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Supervisório Tráfego";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.navigationBar.ResumeLayout(false);
            this.navigationBar.PerformLayout();
            this.bottomBar.ResumeLayout(false);
            this.bottomBar.PerformLayout();
            this.bottomBarTop.ResumeLayout(false);
            this.bottomBarTop.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbRoadYellow)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbRoadRed)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbAvenueRed)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbAvenueYellow)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbAvenueGreen)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbRoadGreen)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ToolStrip navigationBar;
        private System.Windows.Forms.ToolStripButton btnIconFiremen;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.ToolStripButton btnIconPolice;
        private System.Windows.Forms.Timer clockDateTime;
        private System.Windows.Forms.ToolStrip bottomBar;
        private System.Windows.Forms.ToolStripLabel DatePage;
        private System.Windows.Forms.ToolStrip bottomBarTop;
        private System.Windows.Forms.ToolStripLabel HoursPage;
        private System.Windows.Forms.Button btnEmergency;
        private System.Windows.Forms.Button btnStart;
        private System.Windows.Forms.Button btnShutdown;
        private System.Windows.Forms.ToolStripButton btnLogOut;
        private System.Windows.Forms.PictureBox pbRoadYellow;
        private System.Windows.Forms.PictureBox pbRoadRed;
        private System.Windows.Forms.PictureBox pbAvenueRed;
        private System.Windows.Forms.PictureBox pbAvenueYellow;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label lblAvenue;
        private System.Windows.Forms.PictureBox pbAvenueGreen;
        private System.Windows.Forms.PictureBox pbRoadGreen;
        private System.Windows.Forms.Timer timerAvenueGreen;
        private System.Windows.Forms.Timer timerAvenueYellow;
        private System.Windows.Forms.Timer timerAvenueRed;
        private System.Windows.Forms.Timer timerRoadRed;
        private System.Windows.Forms.Timer timerRoadYellow;
        private System.Windows.Forms.Timer timerRoadGreen;
        private System.Windows.Forms.Timer timerEmergency;
    }
}

