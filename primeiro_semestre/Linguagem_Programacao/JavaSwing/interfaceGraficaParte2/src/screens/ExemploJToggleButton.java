package screens;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploJToggleButton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploJToggleButton frame = new ExemploJToggleButton();
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
	public ExemploJToggleButton() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JToggleButton tglbtnOnOff = new JToggleButton("ON");
		tglbtnOnOff.setToolTipText("");
		tglbtnOnOff.setFont(new Font("Tahoma", Font.BOLD, 17));
		tglbtnOnOff.setBounds(48, 469, 183, 46);
		contentPane.add(tglbtnOnOff);
		
		final JLabel lblImagem = new JLabel("");
		lblImagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagem.setBounds(10, 72, 264, 363);
		contentPane.add(lblImagem);
		ImageIcon img = new ImageIcon("imagens/OFF.png");
		lblImagem.setIcon(img);
		
		JLabel lblNewLabel = new JLabel("Interruptor Digital");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel.setBounds(29, 0, 213, 46);
		contentPane.add(lblNewLabel);
		
		
		tglbtnOnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnOnOff.isSelected()) {
					ImageIcon img = new ImageIcon("imagens/ON.png");
					lblImagem.setIcon(img);
					tglbtnOnOff.setText("OFF");
				}
				else {
					ImageIcon img = new ImageIcon("imagens/OFF.png");
					lblImagem.setIcon(img);
					tglbtnOnOff.setText("ON");
				}
			}
		});
	}
}
