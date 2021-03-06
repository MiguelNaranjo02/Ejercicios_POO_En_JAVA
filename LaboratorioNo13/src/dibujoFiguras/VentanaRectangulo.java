/*
	 * Programa: Ventana de los rectangulos
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
import javax.swing.JTextPane;

public class VentanaRectangulo extends JFrame {

	private JPanel contentPane;
	private JTextField IngreAlt;
	private JTextField IngreBas;
	private JLabel LabelAltura;
	private JLabel LabelBase;
	private JButton btnEnviar;
	private JTextPane txtpnElAreaEs;
	private JLabel ImagenRectangulo;
	// Se crea el objeto que dibuja las figuras
	Dibujador Dibuja = new Dibujador();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRectangulo frame = new VentanaRectangulo();
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
	public VentanaRectangulo() {
		setTitle("RECTANGULO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// Boton de salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(239, 293, 160, 35);
		btnSalir.setForeground(Color.RED);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);// La ventana se vuelve invisible
				dispose();// Se liberan los recursos de la ventana
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnSalir);

		// Campo de texto de la altura del rectangulo
		IngreAlt = new JTextField();
		IngreAlt.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				ImagenRectangulo.repaint();// Se actualiza el lienzo del rectangulo
				if ((c < '0' || c > '9') && c != '.') {// Si no se introduce un numero o un punto no se escribira el
														// caracter
					e.consume();
				}
			}
		});
		IngreAlt.setColumns(10);
		IngreAlt.setBounds(306, 41, 74, 20);
		contentPane.add(IngreAlt);

		// Campo de texto de la base
		IngreBas = new JTextField();
		IngreBas.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				ImagenRectangulo.repaint();
				if ((c < '0' || c > '9') && c != '.') {
					e.consume();
				}
			}
		});
		IngreBas.setColumns(10);
		IngreBas.setBounds(306, 77, 74, 20);
		contentPane.add(IngreBas);

		// Texto que solicita la altura del rectanglo
		LabelAltura = new JLabel("Ingrese la longitud de la altura del rectangulo:");
		LabelAltura.setBounds(10, 39, 264, 25);
		contentPane.add(LabelAltura);
		// Texto que solicita la base del rectangulo
		LabelBase = new JLabel("Ingrese la longitud de la base del rectangulo:");
		LabelBase.setBounds(10, 75, 264, 25);
		contentPane.add(LabelBase);
		// Texto el area es
		txtpnElAreaEs = new JTextPane();
		txtpnElAreaEs.setEnabled(false);
		txtpnElAreaEs.setEditable(false);
		txtpnElAreaEs.setVisible(false);// Al principio sera invisible
		txtpnElAreaEs.setText("El area es:");
		txtpnElAreaEs.setBounds(20, 108, 360, 35);
		contentPane.add(txtpnElAreaEs);
		// Lienzo de la imagen del rectangulo
		ImagenRectangulo = new JLabel("");
		ImagenRectangulo.setBounds(36, 134, 344, 136);
		contentPane.add(ImagenRectangulo);

		// Boton enviar
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IngreBas.getText().isEmpty() || Double.parseDouble(IngreBas.getText()) == 0
						|| IngreAlt.getText().isEmpty() || Double.parseDouble(IngreAlt.getText()) == 0) {
					// Si alguno de los dos campos de texto estan vacios o son iguales a cero se
					// imprimira una advertencia
					JOptionPane.showMessageDialog(contentPane,
							"Debes digitar un numero mayor a cero en las dos casillas");
				} else {
					Dibuja.paintRectangulo(ImagenRectangulo.getGraphics(), Double.parseDouble(IngreBas.getText()),
							Double.parseDouble(IngreAlt.getText()));// Se imprime la imagen del rectangulo

					// Se calcula el area del rectangulo y se redondea
					double area = Double.parseDouble(IngreBas.getText());
					area = area * Double.parseDouble(IngreAlt.getText());
					area = Math.round(area * 100.0) / 100.0;
					// Se imprime el area del rectangulo
					txtpnElAreaEs.setText("El area del rectangulo es: " + area + " unidades cuadradas");
					txtpnElAreaEs.setEnabled(true);
					txtpnElAreaEs.setVisible(true);
				}
			}
		});
		btnEnviar.setForeground(new Color(50, 205, 50));
		btnEnviar.setBounds(36, 293, 160, 35);
		contentPane.add(btnEnviar);

	}

}
