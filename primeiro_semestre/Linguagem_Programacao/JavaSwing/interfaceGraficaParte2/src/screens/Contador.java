package screens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValorAtual;
	
	int contador = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contador frame = new Contador();
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
	public Contador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblContador = new JLabel("Contador:");
		lblContador.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		lblContador.setBounds(10, 91, 123, 74);
		contentPane.add(lblContador);
		
		txtValorAtual = new JTextField();
		txtValorAtual.setBackground(new Color(255, 255, 255));
		txtValorAtual.setEditable(false);
		txtValorAtual.setHorizontalAlignment(SwingConstants.RIGHT);
		txtValorAtual.setFont(new Font("Consolas", Font.PLAIN, 29));
		txtValorAtual.setText("0");
		txtValorAtual.setBounds(143, 110, 196, 50);
		contentPane.add(txtValorAtual);
		txtValorAtual.setColumns(10);
		
		JButton btnUp = new JButton("UP");
		btnUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnUp.setBounds(363, 110, 63, 50);
		contentPane.add(btnUp);
		
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador++;
				txtValorAtual.setText("" + contador++);
			}
		});
		
	}
}
