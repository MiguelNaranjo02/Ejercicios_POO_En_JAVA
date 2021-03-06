/*
	 * Programa: Clase que escribe el fichero
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  25 de enero de 2021.
*/
package ejemploSerializacionGui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ejemploSerializacion.Usuario;

public class Write extends JFrame {

	private JPanel contentPane;
	private JTextField txtApe;
	private JTextField txtNom;
	private JTextField txtEdad;
	private JTextField txtID;
	private JTextField txtCor;
	private JTextField txtCel;
	//Se crean las variables que permitiran escribir el archivo
	FileOutputStream fos = null;
	ObjectOutputStream salida = null;
	Usuario us = new Usuario();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					Write frame = new Write();
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
	public Write() {
		setTitle("INGRESO DE DATOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(49, 49, 46, 14);
		contentPane.add(lblApellido);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(49, 95, 46, 14);
		contentPane.add(lblNombre);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(49, 153, 46, 14);
		contentPane.add(lblEdad);

		JLabel lblIdentificacion = new JLabel("Identificacion");
		lblIdentificacion.setBounds(49, 205, 98, 14);
		contentPane.add(lblIdentificacion);

		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(49, 246, 62, 14);
		contentPane.add(lblCorreo);

		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(49, 289, 46, 14);
		contentPane.add(lblCelular);

		txtApe = new JTextField();
		txtApe.setBounds(149, 46, 201, 20);
		txtApe.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if(txtApe.getText().equals("")) {
					System.out.println("Oh no");
				}
				char c = e.getKeyChar();
				char d;
				d = Character.toLowerCase(c);
				if ((d < 'a' || d > 'z')) {//Se consume sino son letras
					if (d == ' ') {
					} else {
						e.consume();
					}

				}

			}
		});
		contentPane.add(txtApe);
		txtApe.setColumns(10);

		txtNom = new JTextField();
		txtNom.setBounds(149, 92, 201, 20);
		txtNom.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				char d;
				d = Character.toLowerCase(c);
				if ((d < 'a' || d > 'z')) {
					if (d == ' ') {//Se consume sino son letras
					} else {
						e.consume();
					}

				}

			}
		});
		contentPane.add(txtNom);
		txtNom.setColumns(10);

		txtEdad = new JTextField();
		txtEdad.setBounds(149, 150, 201, 20);
		txtEdad.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ((c < '0' || c > '9')) {//Se consume sino son n?meros
					e.consume();
				} else {
					if (txtEdad.getText().length() > 1) {
						e.consume();
					}
				}

			}
		});
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);

		txtID = new JTextField();
		txtID.setBounds(149, 202, 201, 20);
		txtID.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ((c < '0' || c > '9')) {//Se consume sino son n?meros
					e.consume();
				} else {
					if (txtID.getText().length() > 9) {
						e.consume();
					}
				}

			}
		});
		contentPane.add(txtID);
		txtID.setColumns(10);

		txtCor = new JTextField();
		txtCor.setBounds(149, 243, 201, 20);
		contentPane.add(txtCor);
		txtCor.setColumns(10);

		txtCel = new JTextField();
		txtCel.setBounds(149, 286, 201, 20);
		txtCel.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ((c < '0' || c > '9')) {//Se consume sino son n?meros
					e.consume();
				} else {
					if (txtCel.getText().length() > 8) {//No permite ingresar mas de 8 caracteres
						e.consume();
					}
				}

			}
		});
		contentPane.add(txtCel);
		txtCel.setColumns(10);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					fos = new FileOutputStream("src\\ficheros\\personas.txt", true);// Se localiza el fichero en el cual
																					// se
																					// guardaran
																					// los
																					// datos

					salida = new ObjectOutputStream(fos);// Los datos se pasaran al archivo en formato de bytes
					us = new Usuario(txtNom.getText(), txtApe.getText(), Integer.parseInt(txtEdad.getText()),
							Integer.parseInt(txtID.getText()), txtCor.getText(), Integer.parseInt(txtCel.getText()));// Se
																														// escriben
					// datos de
					// ejemplo
					salida.writeObject(us);
				} catch (FileNotFoundException e1) {// Excepcion si no se encuentra el archivo
					System.out.println(e1.getMessage());
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				} catch (NumberFormatException e1) {
					System.out.println(e1.getMessage());
				} finally {
					try {
						if (fos != null)
							fos.close();// Se cierra el fichero
						if (salida != null)
							salida.close();// Se cierra el fichero a la entrada de datos en bytes
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
			}
		});
		btnEnviar.setForeground(Color.BLUE);
		btnEnviar.setBounds(129, 342, 89, 23);
		contentPane.add(btnEnviar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);
			}

		});
		btnSalir.setForeground(Color.RED);
		btnSalir.setBounds(242, 342, 89, 23);
		contentPane.add(btnSalir);
	}
}
