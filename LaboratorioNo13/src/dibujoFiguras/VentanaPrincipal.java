/*
	 * Programa: Ventana principal que permite abrir otras ventanas
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 13 de dic de 2020
*/
package dibujoFiguras;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setTitle("DIBUJADOR DE FIGURAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// Boton que abre la ventana de circulos
		JButton btnCirculo = new JButton("Dibujar circulos");
		btnCirculo.setForeground(Color.BLACK);
		btnCirculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCirculo Circ = new VentanaCirculo();
				Circ.setVisible(true);// La ventana de los circulos se hace visible
			}
		});
		btnCirculo.setBounds(48, 123, 160, 35);
		contentPane.add(btnCirculo);
		// Boton que abre la ventana de cuadrados
		JButton btnCuadrado = new JButton("Dibujar cuadrados");
		btnCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCuadrado Cuad = new VentanaCuadrado();
				Cuad.setVisible(true);// La ventana de los cuadrados se hace visible
				
			}
		});
		btnCuadrado.setBounds(233, 123, 160, 35);
		contentPane.add(btnCuadrado);

		// Boton que abre la ventana de triangulos
		JButton btnTriangulo = new JButton("Dibujar triangulos");
		btnTriangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaTriangulo Triang = new VentanaTriangulo();
				Triang.setVisible(true);// La ventana de los triangulos se hace visible
			}
		});
		btnTriangulo.setBounds(48, 169, 160, 35);
		contentPane.add(btnTriangulo);

		// Boton que abre la ventana de los rectangulos
		JButton btnRectangulo = new JButton("Dibujar rectangulos");
		btnRectangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaRectangulo Rect = new VentanaRectangulo();
				Rect.setVisible(true);// La ventana de los rectangulos se hace visible
			}
		});
		btnRectangulo.setBounds(233, 169, 160, 35);
		contentPane.add(btnRectangulo);

		// Boton que abre la ventana de los ovalos
		JButton btnOvalo = new JButton("Dibujar ovalos");
		btnOvalo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOvalo Ova = new VentanaOvalo();
				Ova.setVisible(true);// La ventana de los ovalos se hace visible
			}
		});
		btnOvalo.setBounds(48, 215, 160, 35);
		contentPane.add(btnOvalo);

		// Boton que cierra el programa
		JButton btnSalir = new JButton("Salir");
		btnSalir.setForeground(Color.RED);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);// El programa se cierra
			}
		});
		btnSalir.setBounds(233, 215, 160, 35);
		contentPane.add(btnSalir);
		// Texto este programa dibuja diversas figuras y calcula su area
		JLabel LabelInfo = new JLabel("Este programa dibuja diversas figuras y calcula su area");
		LabelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		LabelInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LabelInfo.setBounds(34, 11, 374, 101);
		contentPane.add(LabelInfo);
	}
}
