/*
	 * Programa: Ventana de los ovalos
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

public class VentanaOvalo extends JFrame {

	private JPanel contentPane;
	private JTextField IngreSem1;
	private JTextField IngreSem2;
	private JLabel TxtPrimerSemieje;
	private JLabel TxtSegundoSemieje;
	private JButton btnEnviar;
	private JTextPane txtpnElAreaEs;
	private JLabel ImagenOvalo;
	// Se crea el objeto que dibuja las figuras
	Dibujador Dibuja = new Dibujador();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOvalo frame = new VentanaOvalo();
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
	public VentanaOvalo() {
		setTitle("OVALO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// Boton salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(240, 350, 160, 35);
		btnSalir.setForeground(Color.RED);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);// Si se presiona la ventana se hace invisible
				dispose();// Se liberan los recursos de la ventana
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnSalir);
		// Campo de texto del semieje 1
		IngreSem1 = new JTextField();
		IngreSem1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				ImagenOvalo.repaint();// Se actualiza el lienzo del ovalo
				if ((c < '0' || c > '9') && c != '.') {// Si se ingresan caracteres distintos a numeros y un punto se
														// ignorara el caracter
					e.consume();
				}
			}
		});
		IngreSem1.setColumns(10);
		IngreSem1.setBounds(279, 30, 74, 20);
		contentPane.add(IngreSem1);
		//Campo de texto del semieje 2
		IngreSem2 = new JTextField();
		IngreSem2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				ImagenOvalo.repaint();
				if ((c < '0' || c > '9') && c != '.') {
					e.consume();
				}
			}
		});
		IngreSem2.setBounds(279, 74, 74, 20);
		contentPane.add(IngreSem2);
		IngreSem2.setColumns(10);

		//Texto ingrese el primer semieje
		TxtPrimerSemieje = new JLabel("Ingrese la longitud del primer semieje:");
		TxtPrimerSemieje.setBounds(10, 28, 240, 25);
		contentPane.add(TxtPrimerSemieje);
		//Texto ingrese el segundo semieje
		TxtSegundoSemieje = new JLabel("Ingrese la longitud del segundo semieje:");
		TxtSegundoSemieje.setBounds(10, 72, 240, 25);
		contentPane.add(TxtSegundoSemieje);
		//Lienzo del ovalo
		ImagenOvalo = new JLabel("");
		ImagenOvalo.setBounds(10, 125, 360, 214);
		contentPane.add(ImagenOvalo);
		
		//Texto el area es
		txtpnElAreaEs = new JTextPane();
		txtpnElAreaEs.setEnabled(false);
		txtpnElAreaEs.setEditable(false);
		txtpnElAreaEs.setVisible(false);//Sera invisible al principio
		txtpnElAreaEs.setText("El area es:");
		txtpnElAreaEs.setBounds(20, 105, 380, 28);
		contentPane.add(txtpnElAreaEs);
		//Boton enviar
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (IngreSem1.getText().isEmpty() || Double.parseDouble(IngreSem1.getText()) == 0
						|| IngreSem2.getText().isEmpty() || Double.parseDouble(IngreSem2.getText()) == 0) {
					//Si algun campo de texto esta vacio, o es igual a cero saltara una advertencia
					JOptionPane.showMessageDialog(contentPane,
							"Debes digitar un numero mayor a cero en las dos casillas");
				} else {
					
					Dibuja.paintOvalo(ImagenOvalo.getGraphics(), Double.parseDouble(IngreSem1.getText()),
							Double.parseDouble(IngreSem2.getText()));//Se dibuja el ovalo
					//Se calcula el area y se redondea
					double area = Double.parseDouble(IngreSem1.getText());
					area = area * Double.parseDouble(IngreSem2.getText()) * Math.PI;
					area = Math.round(area * 100.0) / 100.0;
					//Se imprime el area
					txtpnElAreaEs.setText("El area del ovalo es: " + area + " unidades cuadradas");
					txtpnElAreaEs.setEnabled(true);
					txtpnElAreaEs.setVisible(true);
				}

			}
		});
		btnEnviar.setForeground(new Color(50, 205, 50));
		btnEnviar.setBounds(30, 350, 160, 35);
		contentPane.add(btnEnviar);

		

	}

}
