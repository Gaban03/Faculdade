package screens;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class JCheckBoxJTextArea extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckBoxJTextArea frame = new JCheckBoxJTextArea();
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
	public JCheckBoxJTextArea() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JCheckBox chckbxColesterol = new JCheckBox("Colesterol Alto");
		chckbxColesterol.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxColesterol.setBounds(41, 87, 173, 38);
		contentPane.add(chckbxColesterol);

		final JCheckBox chckbxDiabetes = new JCheckBox("Diabetes");
		chckbxDiabetes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxDiabetes.setBounds(41, 153, 173, 38);
		contentPane.add(chckbxDiabetes);

		final JCheckBox chckbxHipertensao = new JCheckBox("Hipertens\u00E3o");
		chckbxHipertensao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxHipertensao.setBounds(41, 222, 173, 38);
		contentPane.add(chckbxHipertensao);

		JLabel lblTopo = new JLabel("Selecione as op\u00E7\u00F5es:");
		lblTopo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTopo.setBounds(10, 11, 309, 38);
		contentPane.add(lblTopo);

		final JTextArea txtrDicas = new JTextArea();
		txtrDicas.setBounds(270, 68, 330, 255);
		contentPane.add(txtrDicas);

		final JButton btnDicas = new JButton("Dicas");
		btnDicas.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDicas.setBounds(41, 345, 162, 38);
		contentPane.add(btnDicas);

		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSair.setBounds(365, 345, 162, 38);
		contentPane.add(btnSair);

		btnDicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrDicas.setText("");
				if (chckbxColesterol.isSelected()) {
					txtrDicas.append("Evite ingerir gordura.\n");
				}
				if (chckbxDiabetes.isSelected()) {
					txtrDicas.append("Evite ingerir açúcar.\n");
				}
				if (chckbxHipertensao.isSelected()) {
					txtrDicas.append("Evite ingerir sal.\n");
				}
				if (!chckbxColesterol.isSelected() && !chckbxDiabetes.isSelected() && !chckbxHipertensao.isSelected()) {
					txtrDicas.append("Dieta sem restrições");
				}
			}
		});

		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
