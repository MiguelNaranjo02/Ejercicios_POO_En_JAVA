/*
	 * Programa: Juego TRIQUI
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  22 de enero del 2021
*/
package triqui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PantallaPrincipal extends JFrame {

	int jug = 1;// Numero de jugada
	public String[] juga = new String[9];// Vector de 9 posicion correspodientes a una posicion del tablero
	boolean isWin = false;// Boolean si es victoria

	// Creacion de objetos
	ComprobarWin comprob = new ComprobarWin();
	PintWin rayWin = new PintWin();

	private JPanel PantallaPrincipal;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal frame = new PantallaPrincipal();
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
	public void paint(Graphics g) {
		for (int i = 0; i < 9; i++) {// Se rellena el vector de espacios
			juga[i] = " ";
		}

		Graphics2D g2 = (Graphics2D) g;
		super.paint(g);

		Color myYellow = new Color(237, 178, 68);
		g2.setPaint(myYellow);
		g2.setStroke(new BasicStroke(10.0f));// Se le asigna un grosor especifico

		// Se dibuja la figura del triqui usando la libreria Graphics2D
		g2.draw(new Line2D.Double(130, 80, 130, 280));
		g2.draw(new Line2D.Double(186, 80, 186, 280));
		g2.draw(new Line2D.Double(65, 153, 250, 153));
		g2.draw(new Line2D.Double(65, 209, 250, 209));

	}

	public PantallaPrincipal() {

		setTitle("TRIQUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		// Se inicializan los elementos de la interfaz
		PantallaPrincipal = new JPanel();
		PantallaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PantallaPrincipal);
		PantallaPrincipal.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(70, 70, 160, 160);
		PantallaPrincipal.add(panel);
		panel.setLayout(new GridLayout(0, 3, 10, 10));

		JLabel lblH = new JLabel();// Label que contendra los botones
		lblH.setBounds(70, 70, 160, 160);
		PantallaPrincipal.add(lblH);

		JLabel lblTxtJuego = new JLabel("");// Label que dira que numero de jugada es, victoria u empate
		lblTxtJuego.setBounds(264, 134, 143, 50);
		lblTxtJuego.setText("Turno de las X");
		PantallaPrincipal.add(lblTxtJuego);

		// Se crean los botones
		JButton btn1 = new JButton("");
		JButton btn2 = new JButton("");
		JButton btn3 = new JButton("");
		JButton btn4 = new JButton("");
		JButton btn5 = new JButton("");
		JButton btn6 = new JButton("");
		JButton btn7 = new JButton("");
		JButton btn8 = new JButton("");
		JButton btn9 = new JButton("");

		// Todos los botones tienen la misma estructura
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(false);// Si el boton se presiona se inhabilita
				if (jug % 2 != 0) {// Si la jugada es impar, la jugada es de las X
					btn1.setIcon(new ImageIcon(("src\\triqui\\imgs\\X.png")));// Se le agrega la imagen al boton
					btn1.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\X.png"));// A pesar de que el boton este
																					// deshabilitado no se pondra en
																					// gris
					juga[0] = "x";// Se llena el indice correspondiente con la letra correspondiente
					lblTxtJuego.setText("Turno de las O");// Se imprime a quien le toca la siguiente jugada
				} else {// Si la jugada es par, la jugada es de las O
					btn1.setIcon(new ImageIcon(("src\\triqui\\imgs\\O.png")));
					btn1.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\O.png"));
					juga[0] = "o";
					lblTxtJuego.setText("Turno de las X");
				}
				isWin = comprob.Victoria(juga);// Se llama la funcion que comprueba la victoria
				if (isWin == true) {// Si la victoria es verdadera
					if (jug % 2 != 0) {// Si la jugada es impar
						System.out.println("Victoria de las X");
						lblTxtJuego.setText("Victoria de las X");// Se imprime la victoria de las X
					} else {
						System.out.println("Victoria de las O");
						lblTxtJuego.setText("Victoria de las O");// Se imprime la victoria de las O
					}
					// Se inhabilitan todos los botones
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					rayWin.paint(panel.getGraphics(), comprob.getCasWin());// Se imprime la raya de la victoria
				} else {
					if (jug == 9) {// Si la jugada es 9 significa que nadie gano
						lblTxtJuego.setText("Empate");// Se imprime que es empate
					}
				}
				jug = jug + 1;// Se aumenta el numero de la jugada

			}
		});

		panel.add(btn1);

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setEnabled(false);
				if (jug % 2 != 0) {
					btn2.setIcon(new ImageIcon(("src\\triqui\\imgs\\X.png")));
					btn2.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\X.png"));
					juga[1] = "x";
					lblTxtJuego.setText("Turno de las O");
				} else {
					btn2.setIcon(new ImageIcon(("src\\triqui\\imgs\\O.png")));
					btn2.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\O.png"));
					juga[1] = "o";
					lblTxtJuego.setText("Turno de las X");
				}
				isWin = comprob.Victoria(juga);
				if (isWin == true) {
					if (jug % 2 != 0) {
						System.out.println("Victoria de las X");
						lblTxtJuego.setText("Victoria de las X");
					} else {
						System.out.println("Victoria de las O");
						lblTxtJuego.setText("Victoria de las O");
					}
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					rayWin.paint(panel.getGraphics(), comprob.getCasWin());
				} else {
					if (jug == 9) {
						lblTxtJuego.setText("Empate");
					}
				}

				jug = jug + 1;

			}
		});
		panel.add(btn2);

		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setEnabled(false);
				if (jug % 2 != 0) {
					btn3.setIcon(new ImageIcon(("src\\triqui\\imgs\\X.png")));
					btn3.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\X.png"));
					juga[2] = "x";
					lblTxtJuego.setText("Turno de las O");
				} else {
					btn3.setIcon(new ImageIcon(("src\\triqui\\imgs\\O.png")));
					btn3.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\O.png"));
					juga[2] = "o";
					lblTxtJuego.setText("Turno de las X");
				}
				isWin = comprob.Victoria(juga);
				if (isWin == true) {
					if (jug % 2 != 0) {
						System.out.println("Victoria de las X");
						lblTxtJuego.setText("Victoria de las X");
					} else {
						System.out.println("Victoria de las O");
						lblTxtJuego.setText("Victoria de las O");
					}
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					rayWin.paint(panel.getGraphics(), comprob.getCasWin());

				} else {
					if (jug == 9) {
						lblTxtJuego.setText("Empate");
					}
				}

				jug = jug + 1;

			}
		});
		panel.add(btn3);

		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setEnabled(false);
				if (jug % 2 != 0) {
					btn4.setIcon(new ImageIcon(("src\\triqui\\imgs\\X.png")));
					btn4.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\X.png"));
					juga[3] = "x";
					lblTxtJuego.setText("Turno de las O");
				} else {
					btn4.setIcon(new ImageIcon(("src\\triqui\\imgs\\O.png")));
					btn4.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\O.png"));
					juga[3] = "o";
					lblTxtJuego.setText("Turno de las X");
				}
				isWin = comprob.Victoria(juga);
				if (isWin == true) {
					if (jug % 2 != 0) {
						System.out.println("Victoria de las X");
						lblTxtJuego.setText("Victoria de las X");
					} else {
						System.out.println("Victoria de las O");
						lblTxtJuego.setText("Victoria de las O");
					}
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					rayWin.paint(panel.getGraphics(), comprob.getCasWin());
				} else {
					if (jug == 9) {
						lblTxtJuego.setText("Empate");
					}
				}

				jug = jug + 1;

			}
		});
		panel.add(btn4);

		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setEnabled(false);
				if (jug % 2 != 0) {
					btn5.setIcon(new ImageIcon(("src\\triqui\\imgs\\X.png")));
					btn5.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\X.png"));
					juga[4] = "x";
					lblTxtJuego.setText("Turno de las O");
				} else {
					btn5.setIcon(new ImageIcon(("src\\triqui\\imgs\\O.png")));
					btn5.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\O.png"));
					juga[4] = "o";
					lblTxtJuego.setText("Turno de las X");
				}
				isWin = comprob.Victoria(juga);
				if (isWin == true) {
					if (jug % 2 != 0) {
						System.out.println("Victoria de las X");
						lblTxtJuego.setText("Victoria de las X");
					} else {
						System.out.println("Victoria de las O");
						lblTxtJuego.setText("Victoria de las O");
					}
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					rayWin.paint(panel.getGraphics(), comprob.getCasWin());
				} else {
					if (jug == 9) {
						lblTxtJuego.setText("Empate");
					}
				}

				jug = jug + 1;

			}
		});
		panel.add(btn5);

		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setEnabled(false);
				if (jug % 2 != 0) {
					btn6.setIcon(new ImageIcon(("src\\triqui\\imgs\\X.png")));
					btn6.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\X.png"));
					juga[5] = "x";
					lblTxtJuego.setText("Turno de las O");
				} else {
					btn6.setIcon(new ImageIcon(("src\\triqui\\imgs\\O.png")));
					btn6.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\O.png"));
					juga[5] = "o";
					lblTxtJuego.setText("Turno de las X");
				}
				isWin = comprob.Victoria(juga);
				if (isWin == true) {
					if (jug % 2 != 0) {
						System.out.println("Victoria de las X");
						lblTxtJuego.setText("Victoria de las X");
					} else {
						System.out.println("Victoria de las O");
						lblTxtJuego.setText("Victoria de las O");
					}
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					rayWin.paint(panel.getGraphics(), comprob.getCasWin());
				} else {
					if (jug == 9) {
						lblTxtJuego.setText("Empate");
					}
				}

				jug = jug + 1;

			}
		});
		panel.add(btn6);

		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setEnabled(false);
				if (jug % 2 != 0) {
					btn7.setIcon(new ImageIcon(("src\\triqui\\imgs\\X.png")));
					btn7.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\X.png"));
					juga[6] = "x";
					lblTxtJuego.setText("Turno de las O");
				} else {
					btn7.setIcon(new ImageIcon(("src\\triqui\\imgs\\O.png")));
					btn7.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\O.png"));
					juga[6] = "o";
					lblTxtJuego.setText("Turno de las X");
				}
				isWin = comprob.Victoria(juga);
				if (isWin == true) {
					if (jug % 2 != 0) {
						System.out.println("Victoria de las X");
						lblTxtJuego.setText("Victoria de las X");
					} else {
						System.out.println("Victoria de las O");
						lblTxtJuego.setText("Victoria de las O");
					}
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					rayWin.paint(panel.getGraphics(), comprob.getCasWin());
				} else {
					if (jug == 9) {
						lblTxtJuego.setText("Empate");
					}
				}

				jug = jug + 1;

			}
		});
		panel.add(btn7);

		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setEnabled(false);
				if (jug % 2 != 0) {
					btn8.setIcon(new ImageIcon(("src\\triqui\\imgs\\X.png")));
					btn8.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\X.png"));
					juga[7] = "x";
					lblTxtJuego.setText("Turno de las O");
				} else {
					btn8.setIcon(new ImageIcon(("src\\triqui\\imgs\\O.png")));
					btn8.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\O.png"));
					juga[7] = "o";
					lblTxtJuego.setText("Turno de las X");
				}
				isWin = comprob.Victoria(juga);
				if (isWin == true) {
					if (jug % 2 != 0) {
						System.out.println("Victoria de las X");
						lblTxtJuego.setText("Victoria de las X");
					} else {
						System.out.println("Victoria de las O");
						lblTxtJuego.setText("Victoria de las O");
					}
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					rayWin.paint(panel.getGraphics(), comprob.getCasWin());
				} else {
					if (jug == 9) {
						lblTxtJuego.setText("Empate");
					}
				}

				jug = jug + 1;

			}
		});
		panel.add(btn8);

		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setEnabled(false);
				if (jug % 2 != 0) {
					btn9.setIcon(new ImageIcon(("src\\triqui\\imgs\\X.png")));
					btn9.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\X.png"));
					juga[8] = "x";
					lblTxtJuego.setText("Turno de las O");
				} else {
					btn9.setIcon(new ImageIcon(("src\\triqui\\imgs\\O.png")));
					btn9.setDisabledIcon(new ImageIcon("src\\triqui\\imgs\\O.png"));
					juga[8] = "o";
					lblTxtJuego.setText("Turno de las X");
				}
				isWin = comprob.Victoria(juga);
				if (isWin == true) {
					if (jug % 2 != 0) {
						System.out.println("Victoria de las X");
						lblTxtJuego.setText("Victoria de las X");
					} else {
						System.out.println("Victoria de las O");
						lblTxtJuego.setText("Victoria de las O");
					}
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					rayWin.paint(panel.getGraphics(), comprob.getCasWin());
				} else {
					if (jug == 9) {
						lblTxtJuego.setText("Empate");
					}
				}
				jug = jug + 1;
			}
		});
		panel.add(btn9);

		JButton btnSalir = new JButton("Salir");// Boton salir
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);// Se liberan los recursos
			}
		});
		btnSalir.setForeground(Color.RED);
		btnSalir.setBounds(318, 25, 89, 23);
		PantallaPrincipal.add(btnSalir);

		JButton btnReiniciar = new JButton("Reiniciar");// Boton reiniciar
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jug = 1;// La jugada vuelve a ser 1
				// Misma estructura para todos los botones

				btn1.setEnabled(true);// Se habilita el boton
				btn1.setIcon(null);// Se le quita la imagen al boton
				juga[0] = " ";// Se llena la posicion del vector correspondiente con un espacio

				btn2.setEnabled(true);
				btn2.setIcon(null);
				juga[1] = " ";

				btn3.setEnabled(true);
				btn3.setIcon(null);
				juga[2] = " ";

				btn4.setEnabled(true);
				btn4.setIcon(null);
				juga[3] = " ";

				btn5.setEnabled(true);
				btn5.setIcon(null);
				juga[4] = " ";

				btn6.setEnabled(true);
				btn6.setIcon(null);
				juga[5] = " ";

				btn7.setEnabled(true);
				btn7.setIcon(null);
				juga[6] = " ";

				btn8.setEnabled(true);
				btn8.setIcon(null);
				juga[7] = " ";

				btn9.setEnabled(true);
				btn9.setIcon(null);
				juga[8] = " ";
				lblTxtJuego.setText("Turno de las X");// Se reinicia el label de los turnos
				repaint();

			}
		});
		btnReiniciar.setForeground(Color.BLUE);
		btnReiniciar.setBounds(318, 70, 89, 23);
		PantallaPrincipal.add(btnReiniciar);

	}
}
