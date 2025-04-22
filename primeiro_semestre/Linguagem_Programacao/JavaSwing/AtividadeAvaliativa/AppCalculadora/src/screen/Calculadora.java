package screen;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEntrada;
	private JTextField txtHistorico;
	double valor1 = 0;
	double valor2 = 0;
	String operador;
	String textoAnteriorHistorico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtEntrada = new JTextField();
		txtEntrada.setEditable(false);
		txtEntrada.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEntrada.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		txtEntrada.setBounds(0, 11, 396, 107);
		contentPane.add(txtEntrada);
		txtEntrada.setColumns(10);

		JButton btnNumero1 = new JButton("1");
		btnNumero1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();

				if (textoAnterior.length() < 10) {
					txtEntrada.setText(textoAnterior + "1");
				}
			}
		});
		btnNumero1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNumero1.setBounds(10, 300, 66, 56);
		contentPane.add(btnNumero1);

		JButton btnNumero2 = new JButton("2");
		btnNumero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();

				if (textoAnterior.length() < 10) {
					txtEntrada.setText(textoAnterior + "2");
				}
			}
		});
		btnNumero2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNumero2.setBounds(86, 300, 66, 56);
		contentPane.add(btnNumero2);

		JButton btnNumero3 = new JButton("3");
		btnNumero3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();

				if (textoAnterior.length() < 10) {
					txtEntrada.setText(textoAnterior + "3");
				}
			}
		});
		btnNumero3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNumero3.setBounds(162, 300, 66, 56);
		contentPane.add(btnNumero3);

		JButton btnNumero4 = new JButton("4");
		btnNumero4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();

				if (textoAnterior.length() < 10) {
					txtEntrada.setText(textoAnterior + "4");
				}
			}
		});
		btnNumero4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNumero4.setBounds(10, 364, 66, 56);
		contentPane.add(btnNumero4);

		JButton btnNumero5 = new JButton("5");
		btnNumero5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();

				if (textoAnterior.length() < 10) {
					txtEntrada.setText(textoAnterior + "5");
				}
			}
		});
		btnNumero5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNumero5.setBounds(86, 364, 66, 56);
		contentPane.add(btnNumero5);

		JButton btnNumero6 = new JButton("6");
		btnNumero6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();

				if (textoAnterior.length() < 10) {
					txtEntrada.setText(textoAnterior + "6");
				}
			}
		});
		btnNumero6.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNumero6.setBounds(162, 364, 66, 56);
		contentPane.add(btnNumero6);

		JButton btnNumero7 = new JButton("7");
		btnNumero7.setIconTextGap(20);
		btnNumero7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();

				if (textoAnterior.length() < 10) {
					txtEntrada.setText(textoAnterior + "7");
				}
			}
		});
		btnNumero7.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNumero7.setBounds(10, 431, 66, 56);
		contentPane.add(btnNumero7);

		JButton btnNumero8 = new JButton("8");
		btnNumero8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();

				if (textoAnterior.length() < 10) {
					txtEntrada.setText(textoAnterior + "8");
				}
			}
		});
		btnNumero8.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNumero8.setBounds(86, 431, 66, 56);
		contentPane.add(btnNumero8);

		JButton btnNumero9 = new JButton("9");
		btnNumero9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();

				if (textoAnterior.length() < 10) {
					txtEntrada.setText(textoAnterior + "9");
				}
			}
		});
		btnNumero9.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNumero9.setBounds(162, 431, 66, 56);
		contentPane.add(btnNumero9);

		JButton btnNumero0 = new JButton("0");
		btnNumero0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();

				if (textoAnterior.length() < 10) {
					txtEntrada.setText(textoAnterior + "0");
				}
			}
		});
		btnNumero0.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNumero0.setBounds(10, 500, 142, 56);
		contentPane.add(btnNumero0);

		txtHistorico = new JTextField();
		txtHistorico.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		txtHistorico.setEditable(false);
		txtHistorico.setBounds(0, 142, 255, 46);
		contentPane.add(txtHistorico);
		txtHistorico.setColumns(10);

		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();
				operador = "+";

				if (textoAnterior == null) {
					txtEntrada.setText("");
				} else {
					txtEntrada.setText(textoAnterior + " " + operador + " ");
					txtHistorico.setText(txtEntrada.getText());
					txtEntrada.setText("");
				}
			}
		});
		btnSoma.setFont(new Font("Comic Sans MS", Font.BOLD, 31));
		btnSoma.setBounds(238, 300, 66, 56);
		contentPane.add(btnSoma);

		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();
				operador = "-";

				if (textoAnterior == null) {
					txtEntrada.setText("");
				} else {
					txtEntrada.setText(textoAnterior + " " + operador + " ");
					txtHistorico.setText(txtEntrada.getText());
					txtEntrada.setText("");
				}
			}
		});
		btnSubtracao.setFont(new Font("Comic Sans MS", Font.BOLD, 34));
		btnSubtracao.setBounds(238, 500, 66, 56);
		contentPane.add(btnSubtracao);

		JButton btnMultiplicacao = new JButton("X");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();
				operador = "x";

				if (textoAnterior == null) {
					txtEntrada.setText("");
				} else {
					txtEntrada.setText(textoAnterior + " " + operador + " ");
					txtHistorico.setText(txtEntrada.getText());
					txtEntrada.setText("");
				}
			}
		});
		btnMultiplicacao.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnMultiplicacao.setBounds(238, 432, 66, 56);
		contentPane.add(btnMultiplicacao);

		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtEntrada.getText());
				valor1 = Double.parseDouble(txtHistorico.getText().replace(operador, ""));

				switch (operador) {

				case "+":
					textoAnteriorHistorico = txtHistorico.getText();
					if (textoAnteriorHistorico == null) {
						txtHistorico.setText("");
					} else {
						txtHistorico.setText(textoAnteriorHistorico + txtEntrada.getText() + " =");
					}

					double Soma = valor1 + valor2;
					String resultadoSoma = String.format("%.2f", Soma);
					txtEntrada.setText(resultadoSoma);
					break;

				case "-":
					textoAnteriorHistorico = txtHistorico.getText();
					if (textoAnteriorHistorico == null) {
						txtHistorico.setText("");
					} else {
						txtHistorico.setText(textoAnteriorHistorico + txtEntrada.getText() + " =");
					}

					double Subtracao = valor1 - valor2;
					String resultadoSubtracao = String.format("%.2f", Subtracao);
					txtEntrada.setText(resultadoSubtracao);
					break;

				case "x":
					textoAnteriorHistorico = txtHistorico.getText();
					if (textoAnteriorHistorico == null) {
						txtHistorico.setText("");
					} else {
						txtHistorico.setText(textoAnteriorHistorico + txtEntrada.getText() + " =");
					}

					double Multiplicacao = valor1 * valor2;
					String resultadoMultiplicacao = String.format("%.2f", Multiplicacao);
					txtEntrada.setText(resultadoMultiplicacao);
					break;

				case "/":
					textoAnteriorHistorico = txtHistorico.getText();
					if (textoAnteriorHistorico == null) {
						txtHistorico.setText("");
					} else {
						txtHistorico.setText(textoAnteriorHistorico + txtEntrada.getText() + " =");
					}

					double Divisao = valor1 / valor2;
					String resultadoDivisao = String.format("%.2f", Divisao);
					txtEntrada.setText(resultadoDivisao);
					break;

				default:
					System.out.println("Erro!");
					break;

				}

			}
		});
		btnResultado.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		btnResultado.setBounds(314, 300, 82, 256);
		contentPane.add(btnResultado);

		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEntrada.setText("");
			}
		});
		btnCE.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnCE.setBounds(10, 233, 66, 56);
		contentPane.add(btnCE);

		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();

				if (textoAnterior.length() < 2) {
					txtEntrada.setText(textoAnterior + ".");
				}
			}
		});
		btnPonto.setFont(new Font("Comic Sans MS", Font.BOLD, 42));
		btnPonto.setBounds(162, 498, 66, 56);
		contentPane.add(btnPonto);

		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAnterior = txtEntrada.getText();
				operador = "/";

				if (textoAnterior == null) {
					txtEntrada.setText("");
				} else {
					txtEntrada.setText(textoAnterior + " " + operador + " ");
					txtHistorico.setText(txtEntrada.getText());
					txtEntrada.setText("");
				}
			}
		});
		btnDivisao.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		btnDivisao.setBounds(238, 362, 66, 56);
		contentPane.add(btnDivisao);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEntrada.setText("");
				txtHistorico.setText("");
			}
		});
		btnC.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnC.setBounds(86, 233, 66, 56);
		contentPane.add(btnC);
	}
}
