package screens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploJComboBox extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	String[] dia = { "Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira","Sábado" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploJComboBox frame = new ExemploJComboBox();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExemploJComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Escolha um dia da semana:");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		lblNewLabel.setBounds(10, 34, 333, 38);
		contentPane.add(lblNewLabel);

		final JComboBox cmbDiaDaSemana = new JComboBox();
		cmbDiaDaSemana.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		cmbDiaDaSemana.setModel(new DefaultComboBoxModel(dia));
		cmbDiaDaSemana.setBounds(10, 83, 177, 38);
		contentPane.add(cmbDiaDaSemana);

		final JLabel lblMensagem = new JLabel("");
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagem.setBackground(new Color(255, 255, 255));
		lblMensagem.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblMensagem.setBounds(10, 177, 416, 61);
		contentPane.add(lblMensagem);

		cmbDiaDaSemana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensagem.setText(cmbDiaDaSemana.getSelectedItem() +
									" é o " + (cmbDiaDaSemana.getSelectedIndex() + 1) +
									"° dia da semana.");
			}
		});
	}
}
