package screen;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValor1;
	private JTextField txtValor2;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Aplicativo Soma");
		lblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		lblTitulo.setBounds(216, 11, 198, 38);
		contentPane.add(lblTitulo);
		
		JLabel lblValor2 = new JLabel("Valor 2");
		lblValor2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblValor2.setBounds(282, 154, 67, 14);
		contentPane.add(lblValor2);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblResultado.setBounds(484, 154, 97, 14);
		contentPane.add(lblResultado);
		
		JLabel lblValor1 = new JLabel("Valor 1");
		lblValor1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblValor1.setBounds(81, 154, 70, 14);
		contentPane.add(lblValor1);
		
		txtValor1 = new JTextField();
		txtValor1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		txtValor1.setBounds(46, 182, 135, 38);
		contentPane.add(txtValor1);
		txtValor1.setColumns(10);
		
		txtValor2 = new JTextField();
		txtValor2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		txtValor2.setBounds(248, 182, 135, 38);
		contentPane.add(txtValor2);
		txtValor2.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		txtResultado.setBounds(457, 182, 135, 38);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JLabel lblErro = new JLabel("Clique em Somar");
		lblErro.setHorizontalAlignment(SwingConstants.CENTER);
		lblErro.setForeground(new Color(255, 0, 0));
		lblErro.setBackground(new Color(0, 0, 0));
		lblErro.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		lblErro.setBounds(10, 353, 611, 26);
		contentPane.add(lblErro);
		
		JButton btnSomar = new JButton("Somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double valor1 = Double.parseDouble(txtValor1.getText().replace(",", "."));
					double valor2 = Double.parseDouble(txtValor2.getText().replace(",", "."));
					double resultado = valor1 + valor2;
					txtResultado.setText(("" + resultado).replace(".", ",").substring(0,9));
					lblErro.setText("Clique em Somar");
				} 
				catch(Exception erro) {
					lblErro.setText("Valor(es) Incorreto(s)!");
				}
			}
		});
		btnSomar.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnSomar.setBounds(46, 255, 116, 47);
		contentPane.add(btnSomar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					txtValor1.setText("");
					txtValor2.setText("");
					txtResultado.setText("");
				}catch(Exception erro) {
					lblErro.setText("Não há Valor(es) Inserido(s)!");
				}
			}
		});
		btnLimpar.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnLimpar.setBounds(267, 258, 116, 47);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair\r\n");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnSair.setBounds(476, 255, 116, 47);
		contentPane.add(btnSair);
	}
}
