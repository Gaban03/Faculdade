namespace EX_3
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
            this.btnLigar = new System.Windows.Forms.Button();
            this.btnDesligar = new System.Windows.Forms.Button();
            this.pbStatus = new System.Windows.Forms.PictureBox();
            this.btnSair = new System.Windows.Forms.Button();
            this.txtStatus = new System.Windows.Forms.TextBox();
            ((System.ComponentModel.ISupportInitialize)(this.pbStatus)).BeginInit();
            this.SuspendLayout();
            // 
            // btnLigar
            // 
            this.btnLigar.BackColor = System.Drawing.SystemColors.ScrollBar;
            this.btnLigar.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnLigar.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.btnLigar.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnLigar.Location = new System.Drawing.Point(33, 426);
            this.btnLigar.Name = "btnLigar";
            this.btnLigar.Size = new System.Drawing.Size(142, 69);
            this.btnLigar.TabIndex = 0;
            this.btnLigar.Text = "&LIGA";
            this.btnLigar.UseVisualStyleBackColor = false;
            this.btnLigar.Click += new System.EventHandler(this.btnLigar_Click);
            // 
            // btnDesligar
            // 
            this.btnDesligar.BackColor = System.Drawing.SystemColors.ScrollBar;
            this.btnDesligar.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnDesligar.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.btnDesligar.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDesligar.Location = new System.Drawing.Point(230, 426);
            this.btnDesligar.Name = "btnDesligar";
            this.btnDesligar.Size = new System.Drawing.Size(142, 69);
            this.btnDesligar.TabIndex = 1;
            this.btnDesligar.Text = "&DESLIGA";
            this.btnDesligar.UseVisualStyleBackColor = false;
            this.btnDesligar.Click += new System.EventHandler(this.btnDesligar_Click);
            // 
            // pbStatus
            // 
            this.pbStatus.Cursor = System.Windows.Forms.Cursors.No;
            this.pbStatus.Location = new System.Drawing.Point(161, 37);
            this.pbStatus.Name = "pbStatus";
            this.pbStatus.Size = new System.Drawing.Size(279, 283);
            this.pbStatus.TabIndex = 2;
            this.pbStatus.TabStop = false;
            // 
            // btnSair
            // 
            this.btnSair.BackColor = System.Drawing.SystemColors.ScrollBar;
            this.btnSair.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnSair.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.btnSair.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSair.Location = new System.Drawing.Point(439, 426);
            this.btnSair.Name = "btnSair";
            this.btnSair.Size = new System.Drawing.Size(142, 69);
            this.btnSair.TabIndex = 2;
            this.btnSair.Text = "&SAIR";
            this.btnSair.UseVisualStyleBackColor = false;
            this.btnSair.Click += new System.EventHandler(this.btnSair_Click);
            // 
            // txtStatus
            // 
            this.txtStatus.BackColor = System.Drawing.SystemColors.Window;
            this.txtStatus.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtStatus.Cursor = System.Windows.Forms.Cursors.No;
            this.txtStatus.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtStatus.Location = new System.Drawing.Point(202, 345);
            this.txtStatus.Multiline = true;
            this.txtStatus.Name = "txtStatus";
            this.txtStatus.ReadOnly = true;
            this.txtStatus.Size = new System.Drawing.Size(188, 44);
            this.txtStatus.TabIndex = 4;
            this.txtStatus.TabStop = false;
            this.txtStatus.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSize = true;
            this.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.ClientSize = new System.Drawing.Size(610, 528);
            this.Controls.Add(this.txtStatus);
            this.Controls.Add(this.btnSair);
            this.Controls.Add(this.pbStatus);
            this.Controls.Add(this.btnDesligar);
            this.Controls.Add(this.btnLigar);
            this.Name = "Form1";
            this.Text = "ON_OFF";
            ((System.ComponentModel.ISupportInitialize)(this.pbStatus)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnLigar;
        private System.Windows.Forms.Button btnDesligar;
        private System.Windows.Forms.PictureBox pbStatus;
        private System.Windows.Forms.Button btnSair;
        private System.Windows.Forms.TextBox txtStatus;
    }
}

