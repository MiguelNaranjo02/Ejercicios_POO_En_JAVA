/*
	 * Programa: Ventana del cuadrado
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 13 de dic de 2020
*/
package dibujoFiguras;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class VentanaCuadrado extends JFrame {
	// Se crea el objeto que dibuja las figuras
	Dibujador Dibuja = new Dibujador();

	private JPanel contentPane;
	private JTextField IngreLad;
	private JLabel LabelLadoCuadrado;
	private JButton btnEnviar;
	private JTextPane txtpnElAreaEs;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCuadrado frame = new VentanaCuadrado();
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
	public VentanaCuadrado() {
		setTitle("CUADRADO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// Boton salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(237, 226, 160, 35);
		btnSalir.setForeground(Color.RED);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnSalir);
		// Texto el area es
		JTextPane txtpnElAreaEs = new JTextPane();
		txtpnElAreaEs.setEnabled(false);
		txtpnElAreaEs.setEditable(false);
		txtpnElAreaEs.setVisible(false);// Al principio no es visible
		txtpnElAreaEs.setText("El area es:");
		txtpnElAreaEs.setBounds(38, 56, 322, 35);
		contentPane.add(txtpnElAreaEs);
		// Lienzo donde se dibujaran los cuadrados
		JLabel ImagenCuadrado = new JLabel("");
		ImagenCuadrado.setBounds(141, 82, 133, 133);
		contentPane.add(ImagenCuadrado);
		// Campo donde se ingresara el lado del cuadrado
		IngreLad = new JTextField();
		IngreLad.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				ImagenCuadrado.repaint();// Se actualiza el lienzo del cuadrado
				if ((c < '0' || c > '9') && c != '.') {// Si el usuario no ingresa numeros o un punto, no se registrara
					e.consume();
				}
			}
		});
		IngreLad.setColumns(10);
		IngreLad.setBounds(294, 34, 74, 20);
		contentPane.add(IngreLad);

		// Texto ingrese la longitud del cuadrado
		LabelLadoCuadrado = new JLabel("Ingrese la longitud del lado del cuadrado:");
		LabelLadoCuadrado.setBounds(35, 32, 240, 25);
		contentPane.add(LabelLadoCuadrado);
		// Boton enviar
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IngreLad.getText().isEmpty() || Double.parseDouble(IngreLad.getText()) == 0) {
					// Si al momento de presionar el boton enviar, el campo donde se ingresa el lado
					// esta vacio o es cero saltara una alerta
					JOptionPane.showMessageDialog(contentPane, "Debes digitar un numero mayor a cero");
				} else {
					double aux = Double.parseDouble(IngreLad.getText());
					Dibuja.paintCuadrado(ImagenCuadrado.getGraphics(), aux);// Se dibuja el cuadrado
					// Se calcula el area del cuadrado y se redondea
					double lad = Double.parseDouble(IngreLad.getText());
					lad = Math.pow(lad, 2);
					lad = Math.round(lad * 100.0) / 100.0;
					// Se imprime el area del cuadrado
					txtpnElAreaEs.setText("El area del cuadrado es: " + lad + " unidades cuadradas");
					txtpnElAreaEs.setEnabled(true);
					txtpnElAreaEs.setVisible(true);

				}

			}
		});
		btnEnviar.setForeground(new Color(50, 205, 50));
		btnEnviar.setBounds(38, 226, 160, 35);
		contentPane.add(btnEnviar);
	}

}
