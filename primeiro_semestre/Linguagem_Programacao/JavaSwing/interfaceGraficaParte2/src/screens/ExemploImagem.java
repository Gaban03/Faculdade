package screens;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ExemploImagem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	boolean visualizar = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploImagem frame = new ExemploImagem();
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
	public ExemploImagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblImagem = new JLabel("");
		lblImagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagem.setBounds(127, 26, 209, 265);
		contentPane.add(lblImagem);
		
		final JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnVisualizar.setBounds(40, 332, 147, 44);
		contentPane.add(btnVisualizar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnSair.setBounds(293, 332, 147, 44);
		contentPane.add(btnSair);
		
		btnVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!visualizar) {
					visualizar = true;
					ImageIcon img = new ImageIcon("imagens/Corinthians_simbolo.png");
					lblImagem.setIcon(img);
					btnVisualizar.setText("Esconder");
				}
				else {
					visualizar = false;
					ImageIcon img = new ImageIcon("");
					lblImagem.setIcon(img);
					btnVisualizar.setText("Visualizar");
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
