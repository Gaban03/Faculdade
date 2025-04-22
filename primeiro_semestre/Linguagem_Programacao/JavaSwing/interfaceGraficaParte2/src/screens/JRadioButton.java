package screens;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class JRadioButton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	ButtonGroup bg = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButton frame = new JRadioButton();
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
	public JRadioButton() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelecaoEtaria = new JLabel("Selecione sua faixa et\u00E1ria:");
		lblSelecaoEtaria.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelecaoEtaria.setBounds(10, 37, 360, 39);
		contentPane.add(lblSelecaoEtaria);
		
		final javax.swing.JRadioButton rdbtnJovem = new javax.swing.JRadioButton("0 - 15 anos");
		rdbtnJovem.setSelected(true);
		rdbtnJovem.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnJovem.setBounds(10, 105, 126, 39);
		contentPane.add(rdbtnJovem);
		
		final javax.swing.JRadioButton rdbtnAdulto = new javax.swing.JRadioButton("16 - 65 anos");
		rdbtnAdulto.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnAdulto.setBounds(10, 167, 126, 39);
		contentPane.add(rdbtnAdulto);
		
		javax.swing.JRadioButton rdbtnIdoso = new javax.swing.JRadioButton("acima de 65 anos");
		rdbtnIdoso.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnIdoso.setBounds(10, 235, 168, 39);
		contentPane.add(rdbtnIdoso);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVerificar.setBounds(197, 321, 133, 39);
		contentPane.add(btnVerificar);
		
		final JLabel lblFaixaEtaria = new JLabel("");
		lblFaixaEtaria.setHorizontalAlignment(SwingConstants.CENTER);
		lblFaixaEtaria.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFaixaEtaria.setBackground(new Color(255, 255, 255));
		lblFaixaEtaria.setBounds(35, 393, 454, 50);
		contentPane.add(lblFaixaEtaria);
		
		bg.add(rdbtnJovem);
		bg.add(rdbtnAdulto);
		bg.add(rdbtnIdoso);
		
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnJovem.isSelected()) {
					lblFaixaEtaria.setText("Jovem");
				}
				else if (rdbtnAdulto.isSelected()) {
					lblFaixaEtaria.setText("Adulto");
				}
				else {
					lblFaixaEtaria.setText("Idoso");
				}
			}
		});
	}
}
