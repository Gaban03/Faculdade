package screens;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class CronometroCrescente extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	Timer timer;
	int horas = 0;
	int minutos = 0;
	int segundos = 0;

	boolean rodando = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CronometroCrescente dialog = new CronometroCrescente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CronometroCrescente() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblMinutos = new JLabel("00:");
		lblMinutos.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinutos.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		lblMinutos.setBounds(170, 61, 100, 103);
		contentPanel.add(lblMinutos);

		JLabel lblSegundos = new JLabel("00");
		lblSegundos.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundos.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		lblSegundos.setBounds(276, 61, 86, 103);
		contentPanel.add(lblSegundos);

		JLabel lblHoras = new JLabel("00:");
		lblHoras.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoras.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		lblHoras.setBounds(44, 61, 134, 103);
		contentPanel.add(lblHoras);

		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnIniciar.setBounds(10, 205, 100, 45);
		contentPanel.add(btnIniciar);

		JButton btnPausar = new JButton("Pausar");
		btnPausar.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnPausar.setBounds(170, 205, 100, 45);
		btnPausar.setEnabled(false);
		contentPanel.add(btnPausar);

		JButton btnZerar = new JButton("Zerar");
		btnZerar.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnZerar.setBounds(324, 205, 100, 45);
		btnZerar.setEnabled(false);
		contentPanel.add(btnZerar);

		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Essa flag rodando irá me ajudar qunado eu precisar pausar o cronometro, pois o atributo rodando é
				// boolean e recebe o valor falso, e nessa condição el está em negação, pois se rodando for false ele
				// atende a condição e executa e começa a contagem do cronometro. Mas qunado ele entra rodando recebe true
				// (verdadeiro), continua na ação do botão pausar....
				if (!rodando) {
					rodando = true;
					// Se o botão iniciar for acionado ele será impossibilitado de ser clicado
					// novamente
					// Apenas poderá ser clicado se outro ação (botão) for acionada como pausar
					btnPausar.setEnabled(true);
					btnZerar.setEnabled(false);
					btnIniciar.setEnabled(false);

					timer = new Timer(1000, new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							// Aqui é feita uma função grande de if e else, pois será necessário uma
							// condição para
							// a lógica do cronometro ocorrer, como está onde se segundos forem menores que
							// 59, então ele
							// fica somando +1 no cronometro na label de segundos, mas quando essa condição
							// não for mais verdadeira
							// ele vai zerar e contar +1 na label de minutos.
							// E a mesma lógica é aplicada tanto de segundos para horas, quanto de minutos
							// para horas.
							if (segundos < 59) {
								// Essa condição serve para que quando um número com duas casas como o 10
								// aparecer ele tire
								// o 0 que está na frente e fique contando normalmente;
								if (segundos < 9) {
									segundos++;
									lblSegundos.setText("0" + segundos);
								} else {
									segundos++;
									lblSegundos.setText("" + segundos);
								}
							} else {
								if (minutos < 59) {
									if (minutos < 9) {
										minutos++;
										lblMinutos.setText("0" + minutos + ":");
										segundos = 0;
										lblSegundos.setText("0" + segundos);
									} else {
										minutos++;
										lblMinutos.setText("" + minutos + ":");
										segundos = 0;
										lblSegundos.setText("0" + segundos);
									}
								} else {
									if (horas < 9) {
										horas++;
										lblHoras.setText("0" + horas + ":");
										minutos = 0;
										lblMinutos.setText("0" + minutos);
									} else {
										horas++;
										lblHoras.setText("" + horas + ":");
										minutos = 0;
										lblMinutos.setText("0" + minutos);
									}
								}
							}
						}
					});
					timer.start();
				}
			}
		});

		
		btnPausar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// Continuando a explicação aqui podemos ver o porquê de ele receber true quando ele entra dentro
			// da condição em iniciar, porque se o cronometro estiver rodando ele atende a condição dentro do meu botão pausar
			// e para o cronometro e com isso rodando recebe falso, para que quando eu clicar no botão iniciar novamente
			// o cronometro comece a rodar normalmente da onde havia parado.
				if (rodando) {
					timer.stop();
					rodando = false;
				}
				btnPausar.setEnabled(false);
				btnZerar.setEnabled(true);
				btnIniciar.setEnabled(true);
			}
		});

		btnZerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// Aqui a unica ação que acontece é o reset dos valores horas, minutos e segundos, para que quando
			// eu iniciar novamente minha função eles não incrementem encima dos valores anteriores que já estavam antes
			// de zerar o cronometro. E também muda-se o valor do texto nas labels.
			
				horas = 0;
				minutos = 0;
				segundos = 0;

				lblHoras.setText("00:");
				lblMinutos.setText("00:");
				lblSegundos.setText("00");
			}
		});
	}
}
