namespace Projeto1
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
            System.Windows.Forms.AGaugeLabel aGaugeLabel1 = new System.Windows.Forms.AGaugeLabel();
            System.Windows.Forms.AGaugeRange aGaugeRange1 = new System.Windows.Forms.AGaugeRange();
            System.Windows.Forms.AGaugeRange aGaugeRange2 = new System.Windows.Forms.AGaugeRange();
            System.Windows.Forms.AGaugeRange aGaugeRange3 = new System.Windows.Forms.AGaugeRange();
            System.Windows.Forms.AGaugeRange aGaugeRange4 = new System.Windows.Forms.AGaugeRange();
            System.Windows.Forms.AGaugeLabel aGaugeLabel2 = new System.Windows.Forms.AGaugeLabel();
            this.Temperature = new System.Windows.Forms.AGauge();
            this.aGauge2 = new System.Windows.Forms.AGauge();
            this.SuspendLayout();
            // 
            // Temperature
            // 
            this.Temperature.BaseArcColor = System.Drawing.Color.Gray;
            this.Temperature.BaseArcRadius = 80;
            this.Temperature.BaseArcStart = 135;
            this.Temperature.BaseArcSweep = 270;
            this.Temperature.BaseArcWidth = 2;
            this.Temperature.Center = new System.Drawing.Point(100, 100);
            aGaugeLabel1.Color = System.Drawing.SystemColors.WindowText;
            aGaugeLabel1.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            aGaugeLabel1.Name = "lblTemperature";
            aGaugeLabel1.Position = new System.Drawing.Point(63, 150);
            aGaugeLabel1.Text = "Temperatura";
            this.Temperature.GaugeLabels.Add(aGaugeLabel1);
            aGaugeRange1.Color = System.Drawing.Color.Lime;
            aGaugeRange1.EndValue = 30F;
            aGaugeRange1.InnerRadius = 50;
            aGaugeRange1.InRange = false;
            aGaugeRange1.Name = "GaugeRangeNormal";
            aGaugeRange1.OuterRadius = 80;
            aGaugeRange1.StartValue = 0F;
            aGaugeRange2.Color = System.Drawing.Color.Yellow;
            aGaugeRange2.EndValue = 60F;
            aGaugeRange2.InnerRadius = 50;
            aGaugeRange2.InRange = false;
            aGaugeRange2.Name = "GaugeRangeAlerta1";
            aGaugeRange2.OuterRadius = 80;
            aGaugeRange2.StartValue = 30F;
            aGaugeRange3.Color = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(0)))));
            aGaugeRange3.EndValue = 90F;
            aGaugeRange3.InnerRadius = 50;
            aGaugeRange3.InRange = false;
            aGaugeRange3.Name = "GaugeRangeAlerta2";
            aGaugeRange3.OuterRadius = 80;
            aGaugeRange3.StartValue = 60F;
            aGaugeRange4.Color = System.Drawing.Color.Red;
            aGaugeRange4.EndValue = 120F;
            aGaugeRange4.InnerRadius = 50;
            aGaugeRange4.InRange = false;
            aGaugeRange4.Name = "GaugeRangeAlerta3";
            aGaugeRange4.OuterRadius = 80;
            aGaugeRange4.StartValue = 90F;
            this.Temperature.GaugeRanges.Add(aGaugeRange1);
            this.Temperature.GaugeRanges.Add(aGaugeRange2);
            this.Temperature.GaugeRanges.Add(aGaugeRange3);
            this.Temperature.GaugeRanges.Add(aGaugeRange4);
            this.Temperature.Location = new System.Drawing.Point(107, 123);
            this.Temperature.MaxValue = 120F;
            this.Temperature.MinValue = 0F;
            this.Temperature.Name = "Temperature";
            this.Temperature.NeedleColor1 = System.Windows.Forms.AGaugeNeedleColor.Gray;
            this.Temperature.NeedleColor2 = System.Drawing.Color.DimGray;
            this.Temperature.NeedleRadius = 80;
            this.Temperature.NeedleType = System.Windows.Forms.NeedleType.Advance;
            this.Temperature.NeedleWidth = 2;
            this.Temperature.ScaleLinesInterColor = System.Drawing.Color.Black;
            this.Temperature.ScaleLinesInterInnerRadius = 73;
            this.Temperature.ScaleLinesInterOuterRadius = 80;
            this.Temperature.ScaleLinesInterWidth = 1;
            this.Temperature.ScaleLinesMajorColor = System.Drawing.Color.Black;
            this.Temperature.ScaleLinesMajorInnerRadius = 70;
            this.Temperature.ScaleLinesMajorOuterRadius = 80;
            this.Temperature.ScaleLinesMajorStepValue = 10F;
            this.Temperature.ScaleLinesMajorWidth = 2;
            this.Temperature.ScaleLinesMinorColor = System.Drawing.Color.Gray;
            this.Temperature.ScaleLinesMinorInnerRadius = 75;
            this.Temperature.ScaleLinesMinorOuterRadius = 80;
            this.Temperature.ScaleLinesMinorTicks = 9;
            this.Temperature.ScaleLinesMinorWidth = 1;
            this.Temperature.ScaleNumbersColor = System.Drawing.Color.Black;
            this.Temperature.ScaleNumbersFormat = null;
            this.Temperature.ScaleNumbersRadius = 95;
            this.Temperature.ScaleNumbersRotation = 0;
            this.Temperature.ScaleNumbersStartScaleLine = 0;
            this.Temperature.ScaleNumbersStepScaleLines = 1;
            this.Temperature.Size = new System.Drawing.Size(205, 180);
            this.Temperature.TabIndex = 0;
            this.Temperature.Text = "aGauge1";
            this.Temperature.Value = 0F;
            // 
            // aGauge2
            // 
            this.aGauge2.BaseArcColor = System.Drawing.Color.Gray;
            this.aGauge2.BaseArcRadius = 80;
            this.aGauge2.BaseArcStart = 135;
            this.aGauge2.BaseArcSweep = 270;
            this.aGauge2.BaseArcWidth = 2;
            this.aGauge2.Center = new System.Drawing.Point(100, 100);
            aGaugeLabel2.Color = System.Drawing.SystemColors.WindowText;
            aGaugeLabel2.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            aGaugeLabel2.Name = "lblAdjustment";
            aGaugeLabel2.Position = new System.Drawing.Point(64, 150);
            aGaugeLabel2.Text = "Ajuste(%)";
            this.aGauge2.GaugeLabels.Add(aGaugeLabel2);
            this.aGauge2.Location = new System.Drawing.Point(515, 123);
            this.aGauge2.MaxValue = 120F;
            this.aGauge2.MinValue = 0F;
            this.aGauge2.Name = "aGauge2";
            this.aGauge2.NeedleColor1 = System.Windows.Forms.AGaugeNeedleColor.Gray;
            this.aGauge2.NeedleColor2 = System.Drawing.Color.DimGray;
            this.aGauge2.NeedleRadius = 80;
            this.aGauge2.NeedleType = System.Windows.Forms.NeedleType.Advance;
            this.aGauge2.NeedleWidth = 2;
            this.aGauge2.ScaleLinesInterColor = System.Drawing.Color.Black;
            this.aGauge2.ScaleLinesInterInnerRadius = 73;
            this.aGauge2.ScaleLinesInterOuterRadius = 80;
            this.aGauge2.ScaleLinesInterWidth = 1;
            this.aGauge2.ScaleLinesMajorColor = System.Drawing.Color.Black;
            this.aGauge2.ScaleLinesMajorInnerRadius = 70;
            this.aGauge2.ScaleLinesMajorOuterRadius = 80;
            this.aGauge2.ScaleLinesMajorStepValue = 50F;
            this.aGauge2.ScaleLinesMajorWidth = 2;
            this.aGauge2.ScaleLinesMinorColor = System.Drawing.Color.Gray;
            this.aGauge2.ScaleLinesMinorInnerRadius = 75;
            this.aGauge2.ScaleLinesMinorOuterRadius = 80;
            this.aGauge2.ScaleLinesMinorTicks = 9;
            this.aGauge2.ScaleLinesMinorWidth = 1;
            this.aGauge2.ScaleNumbersColor = System.Drawing.Color.Black;
            this.aGauge2.ScaleNumbersFormat = null;
            this.aGauge2.ScaleNumbersRadius = 95;
            this.aGauge2.ScaleNumbersRotation = 0;
            this.aGauge2.ScaleNumbersStartScaleLine = 0;
            this.aGauge2.ScaleNumbersStepScaleLines = 1;
            this.aGauge2.Size = new System.Drawing.Size(205, 180);
            this.aGauge2.TabIndex = 1;
            this.aGauge2.Text = "aGauge2";
            this.aGauge2.Value = 50F;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.aGauge2);
            this.Controls.Add(this.Temperature);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.AGauge Temperature;
        private System.Windows.Forms.AGauge aGauge2;
    }
}

