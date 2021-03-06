/*
	 * Programa: Clase que lee el fichero
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  25 de enero de 2021.
*/
package ejemploSerializacionGui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import ejemploSerializacion.Usuario;

public class Read extends JFrame {
	//Creacion de las series que permiten manejar archivos
	FileInputStream fis = null;
	ObjectInputStream entrada = null;
	Usuario p;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Read frame = new Read();
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

	public Read() {
		setTitle("LECTURA DE DATOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea Txt = new JTextArea();
		Txt.setEditable(false);
		Txt.setBounds(22, 11, 534, 567);
		contentPane.add(Txt);

		JButton btnLeer = new JButton("Leer");//Boton leer
		btnLeer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					fis = new FileInputStream("src\\ficheros\\personas.txt");// Se localiza el fichero a leer
					String textoAnt = "";//String que concatenara los datos
				while(true) {
						entrada = new ObjectInputStream(fis);// En la entrada se localizara el fichero para ser leido
						p = (Usuario) entrada.readObject(); // Se leera el fichero deserializado en formato de la clase
						
						textoAnt = textoAnt + "Apellidos: "+p.getApel() + "\n" + "Nombre: "+p.getNombre() + "\n" +"Edad: " +p.getEdad() +"\n"+ "Identificaci?n: "
								+ p.getId() + "\n" +"Correo: " +p.getCor() + "\n" +"Celular: "+ p.getTel() + "\n"+"----------------------------------------"+"\n";
						//Se concatenan los datos
						Txt.setText(textoAnt);// Se imprimira los datos del fichero

					} 

				} catch (FileNotFoundException e1) {// Excepcion sino se encuentra el archivo
					System.out.println(e1.getMessage());
				} catch (ClassNotFoundException e1) {// Excepcion sino encuentra la clase usuario para hacer el casting
														// de datos
					System.out.println(e1.getMessage());
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				} finally {
					try {
						if (fis != null) {
							fis.close();// Se cierra el fichero
						}
						if (entrada != null) {
							entrada.close();// Se cierra la entrada de datos
						}
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
			}
		});
		btnLeer.setBounds(566, 12, 89, 23);
		contentPane.add(btnLeer);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);
			}
		});
		btnSalir.setForeground(Color.RED);
		btnSalir.setBounds(566, 66, 89, 23);
		contentPane.add(btnSalir);
	}
}
