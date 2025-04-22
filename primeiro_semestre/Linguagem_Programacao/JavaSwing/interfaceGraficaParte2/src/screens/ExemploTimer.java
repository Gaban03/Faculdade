package screens;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploTimer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	Timer t;
	int contador = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploTimer frame = new ExemploTimer();
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
	public ExemploTimer() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblContador = new JLabel("0");
		lblContador.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContador.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContador.setBounds(246, 11, 68, 42);
		contentPane.add(lblContador);

		JButton btnStart = new JButton("Start");
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStart.setBounds(10, 198, 102, 69);
		contentPane.add(btnStart);

		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t = new Timer(1000, new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						contador++;
						lblContador.setText("" + contador);
					}
				});
				t.start();
			}
		});
	}

}
