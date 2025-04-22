package projetoIntegrador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Screen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCod;
	private JButton btnYPositive;
	private JButton btnZNegative;
	private JButton btnZPositive;
	private JButton btnXNegative;
	private JButton btnXPositive;
	private JTextField txtReservado;
	private int contLinha = 10;
	private JButton btnDel;
	private JButton btnHomePosition;
	private JButton btnApaga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen frame = new Screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Screen() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textComandList = new JTextArea();
		textComandList.setBounds(249, 108, 554, 307);
		contentPane.add(textComandList);
		
		textCod = new JTextField();
		textCod.setHorizontalAlignment(SwingConstants.CENTER);
		textCod.setBounds(249, 483, 356, 39);
		contentPane.add(textCod);
		textCod.setColumns(10);
		
		JButton btnYNegative = new JButton("Y-");
		btnYNegative.setFont(new Font("Arial Black", Font.PLAIN, 34));
		btnYNegative.setBounds(21, 308, 98, 61);
		contentPane.add(btnYNegative);
		
		btnYPositive = new JButton("Y+");
		btnYPositive.setFont(new Font("Arial Black", Font.PLAIN, 34));
		btnYPositive.setBounds(141, 308, 98, 61);
		contentPane.add(btnYPositive);
		
		btnZNegative = new JButton("Z-");
		btnZNegative.setFont(new Font("Arial Black", Font.PLAIN, 34));
		btnZNegative.setBounds(21, 380, 98, 61);
		contentPane.add(btnZNegative);
		
		btnZPositive = new JButton("Z+");
		btnZPositive.setFont(new Font("Arial Black", Font.PLAIN, 34));
		btnZPositive.setBounds(141, 380, 98, 61);
		contentPane.add(btnZPositive);
		
		btnXNegative = new JButton("X-");
		btnXNegative.setFont(new Font("Arial Black", Font.PLAIN, 34));
		btnXNegative.setBounds(21, 236, 98, 61);
		contentPane.add(btnXNegative);
		
		btnXPositive = new JButton("X+");
		btnXPositive.setFont(new Font("Arial Black", Font.PLAIN, 34));
		btnXPositive.setBounds(141, 236, 98, 61);
		contentPane.add(btnXPositive);
		
		JButton btnNewButton = new JButton("ENTER");
		
		
		btnNewButton.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		btnNewButton.setBounds(615, 481, 89, 39);
		contentPane.add(btnNewButton);
		
		JButton btnExecutar = new JButton("START");
		btnExecutar.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		btnExecutar.setBounds(141, 466, 98, 56);
		contentPane.add(btnExecutar);
		
		txtReservado = new JTextField();
		txtReservado.setHorizontalAlignment(SwingConstants.CENTER);
		txtReservado.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtReservado.setText("Reservado");
		txtReservado.setBounds(21, 11, 802, 86);
		contentPane.add(txtReservado);
		txtReservado.setColumns(10);
		
		btnDel = new JButton("DEL");
		
		btnDel.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		btnDel.setBounds(714, 483, 83, 37);
		contentPane.add(btnDel);
		
		btnHomePosition = new JButton("Home");
		btnHomePosition.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnHomePosition.setBounds(21, 466, 99, 56);
		contentPane.add(btnHomePosition);
		
		btnApaga = new JButton("Apagar");
		
		btnApaga.setBounds(615, 453, 89, 23);
		contentPane.add(btnApaga);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cod = textCod.getText();				
				textComandList.append("    " + contLinha+ "- " +cod.toUpperCase() +"\n");
				textCod.setText("");
				contLinha = contLinha + 10; 
				
				btnDel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						textComandList.setText("");
						contLinha = 10;
					}
				});
				
			}
		});
	}
}
