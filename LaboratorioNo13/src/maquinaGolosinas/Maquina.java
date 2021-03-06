/*
	 * Programa: Simulador de maquina de golosinas
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 13 de dic de 2020
*/
package maquinaGolosinas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Maquina extends JFrame {

	// Se crea el panel y los campos de texto a utilizar
	private JPanel contentPane;
	private JTextField Monto;
	private JTextField txtID;
	// Se crea el objeto que verifica si un ID ingresado existe
	IDExis prodExis = new IDExis();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maquina frame = new Maquina();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Maquina() {
		setTitle("MAQUINA EXPENDEDORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);// Control del layout absoluto

		Monto = new JTextField();// Campo de texto donde el usuario ingresara el dinero
		Monto.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ((c < '0' || c > '9')) {// Si el usuario no ingresa numeros no se registrara la entrada por teclado
					e.consume();
				}
			}
		});
		Monto.setBounds(342, 65, 86, 20);
		contentPane.add(Monto);
		Monto.setColumns(10);

		JLabel txtMonto = new JLabel("MONTO:");// Etiqueta que dice monto:
		txtMonto.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		txtMonto.setBounds(342, 40, 70, 14);
		contentPane.add(txtMonto);

		JTextPane txtMensaje = new JTextPane();// Campo de texto donde se dara a conocer al usuario advertencias
		txtMensaje.setEditable(false);
		txtMensaje.setBounds(342, 96, 84, 78);
		contentPane.add(txtMensaje);

		JButton btnEnviar = new JButton("Enviar");// Boton enviar
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Monto.getText().isEmpty() || Integer.parseInt(Monto.getText()) > 10000) {// Si el campo del monto
																								// esta vacio se imprime
																								// // ingrese monto
					if (Monto.getText().isEmpty()) {
						txtMensaje.setText("Ingrese un monto");
					} else {
						if (Integer.parseInt(Monto.getText()) > 10000) {
							txtMensaje.setText("Monto demasiado alto, toma tu dinero");
							Monto.setText("");
						}
					}

				} else {
					if (txtID.getText().isEmpty()) {// Si el campo del ID esta vacio se imprime ingrese ID
						txtMensaje.setText("Ingrese un ID de producto");
					} else {
						if (prodExis.Existe(txtID.getText()) == false) {// Si al llamar a la funcion que verifica si
																		// existe el ID retorna falso
							txtMensaje.setText("ID invalido");// Se imprime ID invalido y se resetea el campo donde va
																// el ID
							txtID.setText("");
						} else {
							int auxI = prodExis.idProd.indexOf(txtID.getText());
							txtMensaje.setText("");
							Integer montoUs = Integer.parseInt(Monto.getText());
							if (montoUs >= prodExis.ProdPrec.get(auxI)) {// Si el monto del usuario es mayor o igual que
																			// el producto a comprar
								int auxVuel = montoUs - prodExis.ProdPrec.get(auxI);
								Producto ventImg = new Producto(auxI, auxVuel);// Se crea un objeto Producto a traves de
																				// un constructor
								ventImg.setVisible(true);// Se hace visible la ventana del producto
								setVisible(false);
							} else {
								int auxVuel = montoUs - prodExis.ProdPrec.get(auxI);
								Producto ventImg = new Producto(-1, montoUs);// Se crea un objeto Producto a traves de
																				// un constructor
								ventImg.setVisible(true);// Se hace visible la ventana del producto
								setVisible(false);
							}
						}

					}

				}

			}
		});
		btnEnviar.setForeground(new Color(50, 205, 50));
		btnEnviar.setBounds(385, 347, 89, 23);
		contentPane.add(btnEnviar);
		// Campo de texto donde se concatenaran el ID introducido por los botones
		txtID = new JTextField();
		txtID.setText("");
		txtID.setEditable(false);
		txtID.setBounds(342, 200, 86, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);

		// Panel que contiene los botones con letras
		JPanel BotonesLetras = new JPanel();
		BotonesLetras.setBounds(286, 231, 185, 23);
		contentPane.add(BotonesLetras);
		BotonesLetras.setLayout(new GridLayout(0, 4, 0, 0));

		JButton btnA = new JButton("A");// Boton A
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().length() > 1) {// Se agregara al campo del ID si no supera mas de dos caracteres
				} else {
					txtID.setText(txtID.getText() + "A");
				}

			}
		});
		btnA.setFont(new Font("Tahoma", Font.BOLD, 9));
		BotonesLetras.add(btnA);

		JButton btnB = new JButton("B");// Boton B
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().length() > 1) {
				} else {
					txtID.setText(txtID.getText() + "B");
				}
			}
		});
		btnB.setFont(new Font("Tahoma", Font.BOLD, 9));
		BotonesLetras.add(btnB);

		JButton btnC = new JButton("C");// Boton C
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().length() > 1) {
				} else {
					txtID.setText(txtID.getText() + "C");
				}
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 9));
		BotonesLetras.add(btnC);

		JButton btnD = new JButton("D"); // Boton D
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().length() > 1) {
				} else {
					txtID.setText(txtID.getText() + "D");
				}
			}
		});
		btnD.setFont(new Font("Tahoma", Font.BOLD, 9));
		BotonesLetras.add(btnD);

		// Panel que contiene los botones de numeros
		JPanel BotonesNumeros = new JPanel();
		BotonesNumeros.setBounds(313, 253, 134, 73);
		contentPane.add(BotonesNumeros);
		BotonesNumeros.setLayout(new GridLayout(0, 3, 0, 0));

		JButton btn1 = new JButton("1"); // Boton 1
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().length() > 1) {
				} else {
					txtID.setText(txtID.getText() + "1");
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 9));
		BotonesNumeros.add(btn1);

		JButton btn2 = new JButton("2"); // Boton 2
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().length() > 1) {
				} else {
					txtID.setText(txtID.getText() + "2");
				}
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 9));
		BotonesNumeros.add(btn2);

		JButton btn3 = new JButton("3"); // Boton 3
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().length() > 1) {
				} else {
					txtID.setText(txtID.getText() + "3");
				}
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 9));
		BotonesNumeros.add(btn3);

		JButton btn4 = new JButton("4"); // Boton 4
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().length() > 1) {
				} else {
					txtID.setText(txtID.getText() + "4");
				}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 9));
		BotonesNumeros.add(btn4);

		JButton btn5 = new JButton("5");// Boton 5
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().length() > 1) {
				} else {
					txtID.setText(txtID.getText() + "5");
				}
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 9));
		BotonesNumeros.add(btn5);

		JButton btn6 = new JButton("6");// Boton 6
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().length() > 1) {
				} else {
					txtID.setText(txtID.getText() + "6");
				}
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 9));
		BotonesNumeros.add(btn6);

		JButton btn7 = new JButton("7");// Boton 7
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().length() > 1) {
				} else {
					txtID.setText(txtID.getText() + "7");
				}
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 9));
		BotonesNumeros.add(btn7);

		JButton btn8 = new JButton("8");// Boton 8
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().length() > 1) {
				} else {
					txtID.setText(txtID.getText() + "8");
				}
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 9));
		BotonesNumeros.add(btn8);

		JButton btn9 = new JButton("9");// Boton 9
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().length() > 1) {
				} else {
					txtID.setText(txtID.getText() + "9");
				}
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 9));
		BotonesNumeros.add(btn9);

		// Boton borrar
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtID.setText("");// Se reinicia la cadena de texto

			}
		});
		btnBorrar.setForeground(Color.RED);
		btnBorrar.setBounds(286, 347, 89, 23);
		contentPane.add(btnBorrar);

		// Etiqueta que contendra la imagen de la maquina de golosinas
		JLabel ImagenMaquina = new JLabel("");
		ImagenMaquina.setBounds(10, 26, 269, 424);
		ImageIcon ico = new ImageIcon(getClass().getResource("MaquinaGolo.png"));
		ImageIcon img = new ImageIcon(ico.getImage().getScaledInstance(ImagenMaquina.getWidth(),
				ImagenMaquina.getHeight(), Image.SCALE_SMOOTH));// Se reescala la imagen
		ImagenMaquina.setIcon(img);
		contentPane.add(ImagenMaquina);

		// Boton de salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);// Cierra el programa
			}
		});
		btnSalir.setForeground(Color.BLUE);
		btnSalir.setBounds(339, 427, 89, 23);
		contentPane.add(btnSalir);

	}
}
