package screens;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FasesDaLua extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	String[] fases = {"Lua Nova", "Crescente", "Cheia", "Minguante"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FasesDaLua frame = new FasesDaLua();
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
	public FasesDaLua() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fases da lua:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 33));
		lblNewLabel.setBounds(131, 0, 291, 45);
		contentPane.add(lblNewLabel);
		
		final JComboBox cmbFasesLua = new JComboBox();
		cmbFasesLua.setModel(new DefaultComboBoxModel(new String[] {"Escolha...", "Lua Nova", "Crescente", "Cheia", "Minguante"}));
		cmbFasesLua.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		cmbFasesLua.setBounds(10, 67, 175, 52);
		contentPane.add(cmbFasesLua);
		
		final JLabel lblImagem = new JLabel("");
		lblImagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagem.setBounds(73, 130, 416, 308);
		contentPane.add(lblImagem);
		
		cmbFasesLua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon imgCheia = new ImageIcon("imagens/LuaCheia.png");
				ImageIcon imgNova = new ImageIcon("imagens/LuaNova.png");
				ImageIcon imgMinguante = new ImageIcon("imagens/LuaMinguante.png");
				ImageIcon imgCrescente = new ImageIcon("imagens/LuaCrescente.png");
				ImageIcon imgVazia = new ImageIcon(" ");
				
				
				int fasesLua = cmbFasesLua.getSelectedIndex();
				
				switch(fasesLua){
					
					case 0:
						lblImagem.setIcon(imgVazia);
					break;
					
					case 1:
						lblImagem.setIcon(imgNova);
					break;
					
					case 2:
						lblImagem.setIcon(imgCrescente);
					break;
					
					case 3:
						lblImagem.setIcon(imgCheia);
					break;
					
					case 4:
						lblImagem.setIcon(imgMinguante);
					break;
					
				}
			}
		});
	}

}
