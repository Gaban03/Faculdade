package screens;

import java.awt.Dialog.ModalityType;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTelaCrescente = new JButton("Cronometro crescente");
		btnTelaCrescente.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		btnTelaCrescente.setBounds(77, 46, 237, 88);
		contentPane.add(btnTelaCrescente);
		
		JButton btnTelaDecrescente = new JButton("Cronometro decrescente");
		btnTelaDecrescente.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnTelaDecrescente.setBounds(77, 188, 237, 88);
		contentPane.add(btnTelaDecrescente);
		
		
		btnTelaCrescente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CronometroCrescente cronometroCrescente = new CronometroCrescente();
				cronometroCrescente.setModalityType(ModalityType.APPLICATION_MODAL);
				cronometroCrescente.setVisible(true);
				cronometroCrescente.setLocationRelativeTo(null);
			}
		});
		
		
		btnTelaDecrescente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CronometroDecrescente cronometroDecrescente = new CronometroDecrescente();
				cronometroDecrescente.setModalityType(ModalityType.APPLICATION_MODAL);
				cronometroDecrescente.setVisible(true);
				cronometroDecrescente.setLocationRelativeTo(null);
			}
		});
	}
}
