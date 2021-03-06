/*
	 * Programa: Ventana del circulo
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 13 de dic de 2020
*/
package dibujoFiguras;

import java.awt.Color;
import java.awt.EventQueue;
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

public class VentanaCirculo extends JFrame {

	private JPanel contentPane;
	private JTextField IngreRad;
	private JLabel LabelIngreseLongitud;
	private JButton btnEnviar;
	// Se crea el objeto que dibuja las figuras
	Dibujador Dibuja = new Dibujador();
	private JLabel ImagenCirculo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCirculo frame = new VentanaCirculo();
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
	public VentanaCirculo() {
		setTitle("CIRCULO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// Boton Salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(264, 237, 160, 35);
		btnSalir.setForeground(Color.RED);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);// La ventana deja de ser visible
				dispose();// Los recursos son liberados
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnSalir);
		JTextPane txtpnElAreaEs = new JTextPane();
		// Texto "El area es:"
		txtpnElAreaEs.setEnabled(false);
		txtpnElAreaEs.setEditable(false);
		txtpnElAreaEs.setVisible(false);// Al abrirse la ventana no esta visible
		txtpnElAreaEs.setText("El area es:");
		txtpnElAreaEs.setBounds(38, 56, 322, 35);
		contentPane.add(txtpnElAreaEs);

		// Jlabel y lienzo de la figura del circulo
		JLabel ImagenCirculo = new JLabel("");
		ImagenCirculo.setBounds(118, 86, 140, 140);
		contentPane.add(ImagenCirculo);

		// Campo en el que se introducira el radio
		IngreRad = new JTextField();
		IngreRad.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				ImagenCirculo.repaint();//Se actualiza el lienzo del circulo
				if ((c < '0' || c > '9') && c != '.') {
					e.consume();// Si el usuario ingresa algo diferente a numeros o el punto, no sera tomado en
								// cuenta
				}
			}
		});

		IngreRad.setBounds(274, 25, 86, 20);
		contentPane.add(IngreRad);
		IngreRad.setColumns(10);

		//Texto Ingrese la longitud del radio
		LabelIngreseLongitud = new JLabel("Ingrese la longitud del radio del circulo:");
		LabelIngreseLongitud.setBounds(28, 23, 240, 25);
		contentPane.add(LabelIngreseLongitud);

		//Boton enviar
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IngreRad.getText().isEmpty() || Double.parseDouble(IngreRad.getText()) == 0) {
					//Si el campo del radio esta vacio o es igual a 0 se genera una alerta
					JOptionPane.showMessageDialog(contentPane, "Debes digitar un numero mayor a cero");
				} else {
					double aux = Double.parseDouble(IngreRad.getText());
					Dibuja.paintCirculo(ImagenCirculo.getGraphics(), aux);//Se dibuja el cirulo

					double rad = Double.parseDouble(IngreRad.getText());

					//Se calcula el area y se redondea
					rad = Math.PI * Math.pow(rad, 2);
					rad = Math.round(rad * 100.0) / 100.0;
					//Se imprime un mensaje con el valor del area
					txtpnElAreaEs.setText("El area del circulo es: " + rad + " unidades cuadradas");
					txtpnElAreaEs.setEnabled(true);
					txtpnElAreaEs.setVisible(true);
				}

			}
		});
		btnEnviar.setForeground(new Color(50, 205, 50));
		btnEnviar.setBounds(30, 237, 160, 35);
		contentPane.add(btnEnviar);

	}
}
