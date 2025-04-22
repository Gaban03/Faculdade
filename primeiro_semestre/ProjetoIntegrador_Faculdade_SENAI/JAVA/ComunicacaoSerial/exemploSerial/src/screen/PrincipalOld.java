package screen;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PrincipalOld extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEnviar;

	// flag para sinalizar status da porta
	boolean conectado = false;

	// String para preenchimento do Baul Rate
	String[] baudRate = { "110", "300", "600", "1200", "2400", "4800", "9600", "14400", "19200", "38400", "57600",
			"115200", "128000", "256000" };

	// Cria objeto para comunicação serial
	Serial com = new Serial();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalOld frame = new PrincipalOld();
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
	public PrincipalOld() {
		setTitle("Terminal Serial RS232");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel pnlComunicacao = new JPanel();
		pnlComunicacao.setBackground(new Color(255, 255, 255));
		pnlComunicacao.setBounds(10, 11, 766, 83);
		contentPane.add(pnlComunicacao);
		pnlComunicacao.setLayout(null);

		JLabel lblPorta = new JLabel("Porta");
		lblPorta.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPorta.setBounds(10, 11, 94, 17);
		pnlComunicacao.add(lblPorta);

		JComboBox cmbPortas = new JComboBox(com.listaCom());
		cmbPortas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cmbPortas.setBounds(10, 37, 163, 35);
		pnlComunicacao.add(cmbPortas);

		JLabel lblBaudRate = new JLabel("BaudRate");
		lblBaudRate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBaudRate.setBounds(194, 8, 108, 22);
		pnlComunicacao.add(lblBaudRate);

		JComboBox cmbBaudRate = new JComboBox(baudRate);
		cmbBaudRate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cmbBaudRate.setSelectedIndex(11);
		cmbBaudRate.setBounds(194, 37, 163, 35);
		pnlComunicacao.add(cmbBaudRate);

		JButton btnConectar = new JButton("Conectar");
		btnConectar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnConectar.setBounds(403, 11, 151, 43);
		pnlComunicacao.add(btnConectar);

		JButton btnDesconectar = new JButton("Desconectar");
		btnDesconectar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDesconectar.setBounds(591, 11, 151, 43);
		pnlComunicacao.add(btnDesconectar);

		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(new Color(227, 227, 227));
		pnlPrincipal.setBounds(10, 105, 766, 458);
		contentPane.add(pnlPrincipal);
		pnlPrincipal.setLayout(null);

		JLabel lblDadosRecebidos = new JLabel("Dados Recebidos");
		lblDadosRecebidos.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDadosRecebidos.setBounds(10, 11, 152, 25);
		pnlPrincipal.add(lblDadosRecebidos);

		JTextArea txtDadosRecebidos = new JTextArea();
		txtDadosRecebidos.setBounds(10, 42, 746, 353);
		pnlPrincipal.add(txtDadosRecebidos);

		txtEnviar = new JTextField();
		txtEnviar.setBounds(10, 406, 438, 41);
		pnlPrincipal.add(txtEnviar);
		txtEnviar.setColumns(10);

		JComboBox cmbFinalDeLinha = new JComboBox();
		cmbFinalDeLinha.setToolTipText("");
		cmbFinalDeLinha.setBounds(458, 406, 152, 41);
		pnlPrincipal.add(cmbFinalDeLinha);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnEnviar.setBounds(620, 406, 136, 41);
		pnlPrincipal.add(btnEnviar);
	}

	// método para habilitar ou desabilitar um JPanel
	void setPanelEnabled(JPanel panel, Boolean isEnabled) {
		panel.setEnabled(isEnabled);

		Component[] components = panel.getComponents();

		for (Component component : components) {
			if (component instanceof JPanel) {
				setPanelEnabled((JPanel) component, isEnabled);
			}
			component.setEnabled(isEnabled);
		}
	}
}
