package screens;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class CronometroDecrescente extends JDialog {

	private static final long serialVersionUID = 1L;

	Timer timer;
	int horas = 0;
	int minutos = 0;
	int segundos = 60;

	int minReset = 0;

	boolean rodando = false;

	ButtonGroup bg = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CronometroDecrescente dialog = new CronometroDecrescente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CronometroDecrescente() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblHoras = new JLabel("00");
		lblHoras.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		lblHoras.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoras.setBounds(45, 89, 109, 66);
		getContentPane().add(lblHoras);

		JLabel lblMinutos = new JLabel("00");
		lblMinutos.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinutos.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		lblMinutos.setBounds(164, 89, 100, 66);
		getContentPane().add(lblMinutos);

		JLabel lblSegundos = new JLabel("00");
		lblSegundos.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		lblSegundos.setBounds(279, 89, 109, 66);
		getContentPane().add(lblSegundos);

		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnIniciar.setBounds(10, 207, 115, 43);
		getContentPane().add(btnIniciar);
		btnIniciar.setEnabled(false);

		JButton btnPausar = new JButton("Pausar");
		btnPausar.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnPausar.setBounds(163, 207, 115, 43);
		getContentPane().add(btnPausar);
		btnPausar.setEnabled(false);

		JButton btnResetar = new JButton("Resetar");
		btnResetar.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnResetar.setBounds(309, 207, 115, 43);
		getContentPane().add(btnResetar);
		btnResetar.setEnabled(false);

		JRadioButton rdbtnQuinzeMinutos = new JRadioButton("15min");
		rdbtnQuinzeMinutos.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		rdbtnQuinzeMinutos.setBounds(16, 7, 109, 23);
		getContentPane().add(rdbtnQuinzeMinutos);

		JRadioButton rdbtnDezMinutos = new JRadioButton("10min");
		rdbtnDezMinutos.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		rdbtnDezMinutos.setBounds(169, 7, 109, 23);
		getContentPane().add(rdbtnDezMinutos);

		JRadioButton rdbtnCincoMinutos = new JRadioButton("5min");
		rdbtnCincoMinutos.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		rdbtnCincoMinutos.setBounds(309, 7, 109, 23);
		getContentPane().add(rdbtnCincoMinutos);

		JLabel lblNewLabel = new JLabel(":");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		lblNewLabel.setBounds(145, 93, 26, 58);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		lblNewLabel_1.setBounds(252, 93, 26, 58);
		getContentPane().add(lblNewLabel_1);

		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!rodando) {

					rodando = true;
					btnIniciar.setEnabled(false);
					btnPausar.setEnabled(true);
					btnResetar.setEnabled(false);
					rdbtnCincoMinutos.setEnabled(false);
					rdbtnDezMinutos.setEnabled(false);
					rdbtnQuinzeMinutos.setEnabled(false);

					timer = new Timer(1000, new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							if (minutos > 10) {
								if (segundos > 59) {
									minutos += -1;
									lblMinutos.setText("" + minutos);
								}
								if (segundos > 10) {
									segundos--;
									lblSegundos.setText("" + segundos);
								} else {
									segundos--;
									lblSegundos.setText("0" + segundos);
								}
								if (segundos < 0) {
									minutos += -1;
									lblMinutos.setText("" + minutos);
									segundos = 59;
									lblSegundos.setText("" + segundos);
								}
								if (minutos == 0 && segundos == 0) {
									if (rodando) {
										rodando = false;
										timer.stop();
										btnIniciar.setEnabled(true);
										btnPausar.setEnabled(false);
										btnResetar.setEnabled(true);
									}
								}
							} else {
								if (segundos > 59) {
									minutos += -1;
									lblMinutos.setText("0" + minutos);
								}
								if (segundos > 10) {
									segundos--;
									lblSegundos.setText("" + segundos);
								} else {
									segundos--;
									lblSegundos.setText("0" + segundos);
								}
								if (segundos < 0) {
									minutos += -1;
									lblMinutos.setText("0" + minutos);
									segundos = 59;
									lblSegundos.setText("" + segundos);
								}
								if (minutos == 0 && segundos == 0) {
									if (rodando) {
										rodando = false;
										timer.stop();
										btnIniciar.setEnabled(true);
										btnPausar.setEnabled(false);
										btnResetar.setEnabled(true);
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
				if (rodando) {
					rodando = false;
					timer.stop();
				}

				btnIniciar.setEnabled(true);
				btnPausar.setEnabled(false);
				btnResetar.setEnabled(true);
			}
		});

		// Serve para que apenas um Radio Button possa ser escolhido, sem que haja
		// vários selecionados
		bg.add(rdbtnQuinzeMinutos);
		bg.add(rdbtnDezMinutos);
		bg.add(rdbtnCincoMinutos);

		rdbtnQuinzeMinutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMinutos.setText("15");
				minutos = 15;
				minReset = 15;
				btnIniciar.setEnabled(true);
			}
		});

		rdbtnDezMinutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMinutos.setText("10");
				minutos = 10;
				minReset = 10;
				btnIniciar.setEnabled(true);
			}
		});

		rdbtnCincoMinutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMinutos.setText("05");
				minutos = 5;
				minReset = 5;
				btnIniciar.setEnabled(true);
			}
		});

		btnResetar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnCincoMinutos.setEnabled(true);
				rdbtnDezMinutos.setEnabled(true);
				rdbtnQuinzeMinutos.setEnabled(true);

				switch (minReset) {

				case 15:
					minutos = 15;
					segundos = 0;
					lblMinutos.setText("15");
					lblSegundos.setText("00");
					break;

				case 10:
					minutos = 10;
					segundos = 0;
					lblMinutos.setText("10");
					lblSegundos.setText("00");
					break;

				case 5:
					minutos = 5;
					segundos = 0;
					lblMinutos.setText("05");
					lblSegundos.setText("00");
					break;
				}

			}
		});
	}
}
