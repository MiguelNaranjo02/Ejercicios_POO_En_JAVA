/*
	 * Programa: Ventana de los triangulos
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 13 de dic de 2020
*/
package dibujoFiguras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;

public class VentanaTriangulo extends JFrame {

	private JPanel contentPane;
	private JTextField IngreLad1;
	private JTextField IngreLad3;
	private JLabel lblIngreLongitud1;
	private JLabel lblIngreLongitud2;
	private JButton btnEnviar;
	private JTextPane txtpnElAreaEs;
	private JTextField IngreLad2;
	private double lado1;
	private double lado2;
	private double lado3;
	// Se crea el objeto que dibuja las figuras
	Dibujador Dibuja = new Dibujador();
	// Se crea el objeto que verifica la existencia del triangulo y calcula su area
	CalculoArea areaTriang = new CalculoArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTriangulo frame = new VentanaTriangulo();
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
	public VentanaTriangulo() {
		setTitle("TRIANGULO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// Boton de salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(245, 317, 160, 35);
		btnSalir.setForeground(Color.RED);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);// Se vuelve invisible la ventana
				dispose();// Se liberan los recursos
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnSalir);
		// Lienzo del dibujo del triangulo
		JLabel ImagenTriangulo = new JLabel("");
		ImagenTriangulo.setBounds(151, 195, 111, 121);
		contentPane.add(ImagenTriangulo);

		IngreLad1 = new JTextField();
		IngreLad1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				ImagenTriangulo.repaint();// Se actualiza el lienzo del triangulo
				if ((c < '0' || c > '9') && c != '.') {// Si el usuario ingresa un caracter no numerico se ignorara el
														// caracter ingresado
					e.consume();
				}
			}
		});
		IngreLad1.setColumns(10);
		IngreLad1.setBounds(338, 48, 86, 20);
		contentPane.add(IngreLad1);

		IngreLad2 = new JTextField();
		IngreLad2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				ImagenTriangulo.repaint();
				if ((c < '0' || c > '9') && c != '.') {
					e.consume();
				}
			}
		});
		IngreLad2.setColumns(10);
		IngreLad2.setBounds(338, 116, 86, 20);
		contentPane.add(IngreLad2);

		IngreLad3 = new JTextField();
		IngreLad3.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				ImagenTriangulo.repaint();
				if ((c < '0' || c > '9') && c != '.') {
					e.consume();
				}
			}
		});
		IngreLad3.setColumns(10);
		IngreLad3.setBounds(338, 79, 86, 20);
		contentPane.add(IngreLad3);
		// Texto que solicita el primer lado del triangulo
		lblIngreLongitud1 = new JLabel("Ingrese la longitud del primer lado del triangulo:");
		lblIngreLongitud1.setBounds(20, 46, 308, 25);
		contentPane.add(lblIngreLongitud1);

		lblIngreLongitud2 = new JLabel("Ingrese la longitud del segundo lado del triangulo:");
		lblIngreLongitud2.setBounds(20, 77, 308, 25);
		contentPane.add(lblIngreLongitud2);
		
		JLabel lblIngreLongitud3 = new JLabel("Ingrese la longitud del tercer lado del triangulo:");
		lblIngreLongitud3.setBounds(20, 114, 308, 25);
		contentPane.add(lblIngreLongitud3);
		// Texto el area es
		txtpnElAreaEs = new JTextPane();
		txtpnElAreaEs.setEnabled(false);
		txtpnElAreaEs.setText("El area es:");
		txtpnElAreaEs.setEditable(false);
		txtpnElAreaEs.setVisible(false);// Al principio es falso
		txtpnElAreaEs.setBounds(20, 165, 336, 35);
		contentPane.add(txtpnElAreaEs);
		// Boton enviar
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IngreLad1.getText().isEmpty() || Double.parseDouble(IngreLad1.getText()) == 0
						|| IngreLad3.getText().isEmpty() || Double.parseDouble(IngreLad3.getText()) == 0
						|| IngreLad2.getText().isEmpty() || Double.parseDouble(IngreLad2.getText()) == 0)
				// Si alguno de los 3 campos de texto esta vacio o es igual a 0 saldra una
				// advertencia
				{
					JOptionPane.showMessageDialog(contentPane,
							"Debes digitar un numero mayor a cero en las tres casillas");

				} else {
					areaTriang.setLad1(Double.parseDouble(IngreLad1.getText()));
					areaTriang.setLad2(Double.parseDouble(IngreLad2.getText()));
					areaTriang.setLad3(Double.parseDouble(IngreLad3.getText()));

					if (areaTriang.esTriang() == false) {// Si la funciona que verifica si el triangulo existe retorna
															// falso saldra una advertencia y se borraran las medidas
						JOptionPane.showMessageDialog(contentPane,
								"Las medidas ingresadas no corresponden a un triangulo");
						IngreLad1.setText("");
						IngreLad2.setText("");
						IngreLad3.setText("");
					} else {
						//Se dibuja el triangulo
						Dibuja.paintTriangulo(ImagenTriangulo.getGraphics(), Double.parseDouble(IngreLad1.getText()),
								Double.parseDouble(IngreLad2.getText()), Double.parseDouble(IngreLad3.getText()));
						//Se imprime el area
						txtpnElAreaEs
								.setText("El area del triangulo es: " + areaTriang.getArea() + " unidades cuadradas");
						txtpnElAreaEs.setEnabled(true);
						txtpnElAreaEs.setVisible(true);
					}
				}
			}
		});
		btnEnviar.setForeground(new Color(50, 205, 50));
		btnEnviar.setBounds(20, 317, 160, 35);
		contentPane.add(btnEnviar);

		

	}
}
