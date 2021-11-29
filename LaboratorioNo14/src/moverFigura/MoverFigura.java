/*
	 * Programa: Programa que mueve distintas figuras a traves de botones
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  22 de enero del 2021
*/
package moverFigura;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MoverFigura extends JFrame {// Clase que se extiende de Jframe

	private JPanel contentPane;

	// Se inicializan las variables
	private int colu;
	private int fil;
	private int num;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoverFigura frame = new MoverFigura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MoverFigura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String[] fig = { "Triangulo", "Circulo", "Cuadrado" };// Se rellena el vector de opciones

		JComboBox Figuras = new JComboBox(fig);// El vector de opciones se agrega al ComboBox
		Figuras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Figuras.getSelectedIndex();// El numero se iguala al indice de la figura del ComboBox
			}
		});
		Figuras.setMaximumRowCount(3);
		Figuras.setBounds(28, 11, 80, 22);
		Figuras.setSelectedIndex(-1);
		contentPane.add(Figuras);

		JButton Left = new JButton("Izquierda");
		Left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				colu = colu - 10;// A la posicion horizontal se le restan 10 unidades
				repaint();
			}
		});
		Left.setBounds(286, 482, 89, 23);
		contentPane.add(Left);

		JButton Right = new JButton("Derecha");
		Right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colu = colu + 10;// A la posicion horizontal se le suman 10 unidades
				repaint();
			}
		});
		Right.setBounds(385, 482, 89, 23);
		contentPane.add(Right);

		JButton Up = new JButton("Arriba");
		Up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fil = fil - 10;// A la posicion vertical se le restan 10 unidades
				repaint();
			}
		});
		Up.setBounds(336, 454, 89, 23);
		contentPane.add(Up);

		JButton Down = new JButton("Abajo");
		Down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fil = fil + 10;// A la posicion horizontal se le suman 10 unidades
				repaint();
			}
		});
		Down.setBounds(336, 516, 89, 23);
		contentPane.add(Down);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);// Se liberan los recursos del programa
			}
		});
		btnSalir.setForeground(Color.RED);
		btnSalir.setBounds(118, 11, 89, 23);
		contentPane.add(btnSalir);

		JPanel panelDibujo = new JPanel();
		panelDibujo.setBounds(38, 44, 706, 399);
		contentPane.add(panelDibujo);
		setBounds(0, 0, 800, 600);
		colu = 320;// La posicion horizontal se inicializa
		fil = 250;// La posicion vertical se inicializa

	}

	public void paint(Graphics g) {

		super.paint(g);

		if (colu == 0) {// Limites del borde izquierdo
			colu = 10;
		}
		if (colu == 700) {// Limites del borde derecho
			colu = 690;
		}
		if (fil == 60) {// Limites del borde superior
			fil = 70;
		}
		if (fil == 380) {// Limites del borde inferior
			fil = 370;
		}
		if (num == 0) {// Se dibuja un triangulo
			g.setColor(Color.yellow);
			int[] x = { 20 + colu, 60 + colu, 100 + colu };
			int[] y = { 100 + fil, 30 + fil, 100 + fil };
			g.fillPolygon(x, y, 3);
		}
		if (num == 1) {// Se dibuja un circulo
			g.setColor(Color.blue);
			g.fillOval(colu, fil, 100, 100);
		}
		if (num == 2) {// Se dibuja un cuadrado
			g.setColor(Color.red);
			g.fillRect(colu, fil, 100, 100);
		}

	}
}
