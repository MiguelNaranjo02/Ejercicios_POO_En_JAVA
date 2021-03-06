/*
	 * Programa: Ventana del producto y las vueltas
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 13 de dic de 2020
*/
package maquinaGolosinas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Producto extends JFrame {

	private JPanel contentPane;
	// Se crea un objeto de la ventana de la maquina
	Maquina Maq = new Maquina();

	public Producto(int num, int auxVuel) {
		setTitle("PRODUCTO");// Titulo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);// Control de layout absoluto

		// Se crea la etiqueta donde ira la imagen del producto
		JLabel ProductoImagen = new JLabel("");
		ProductoImagen.setBounds(10, 11, 200, 240);
		contentPane.add(ProductoImagen);

		switch (num) {// Segun el numero pasado por el constructor se imprimira una imagen
		case 0:// Imagen Chocorramo
			ProductoImagen.setIcon(new ImageIcon(getClass().getResource("Chocorramo.png")));
			break;
		case 1:// Imagen galletas oreo
			ProductoImagen.setIcon(new ImageIcon(getClass().getResource("Oreo.png")));
			break;
		case 2:// Imagen jugo hit
			ProductoImagen.setIcon(new ImageIcon(getClass().getResource("JugoHit.png")));
			break;
		case 3:// Imagen coca cola
			ProductoImagen.setIcon(new ImageIcon(getClass().getResource("CocaCola.png")));
			break;
		case 4:// Imagen cheetos
			ProductoImagen.setIcon(new ImageIcon(getClass().getResource("Cheetos.png")));
			break;
		case 5:// Imagen Trident
			ProductoImagen.setIcon(new ImageIcon(getClass().getResource("Trident.png")));
			break;
		case 6:// Imagen pepsi
			ProductoImagen.setIcon(new ImageIcon(getClass().getResource("Pepsi.png")));
			break;
		case 7:// Imagen lays
			ProductoImagen.setIcon(new ImageIcon(getClass().getResource("Lays.png")));
			break;
		case 8:// Imagen hersheys
			ProductoImagen.setIcon(new ImageIcon(getClass().getResource("Hersheys.png")));
			break;
		case 9:// Imagen huevo kinder
			ProductoImagen.setIcon(new ImageIcon(getClass().getResource("HuevoKinder.png")));
			break;
		case 10:// Imagen chocolatina jet
			ProductoImagen.setIcon(new ImageIcon(getClass().getResource("Jet.png")));
			break;
		case 11:// Imagen sprite
			ProductoImagen.setIcon(new ImageIcon(getClass().getResource("Sprite.png")));
			break;
		}

		// Boton salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);// La ventana se vuelve invisible
				Maq.setVisible(true);// La maquina se vuelve visible
				dispose();// Se liberan los recursos de la ventana producto
			}
		});
		btnSalir.setForeground(Color.BLUE);
		btnSalir.setBounds(323, 226, 89, 23);
		contentPane.add(btnSalir);

		// texto Recoge su producto
		JLabel txtProducto = new JLabel("Recoge su producto");
		txtProducto.setBounds(220, 11, 200, 38);
		contentPane.add(txtProducto);

		// Etiqueta donde ira la imagen del dinero
		JLabel Dinerito = new JLabel("");
		Dinerito.setBounds(230, 119, 160, 110);
		contentPane.add(Dinerito);

		// Texto sus vueltas son de
		JLabel txtVueltas = new JLabel("Sus vueltas son de: $");
		if (num == -1) {
			txtProducto.setText("Monto insuficiente, tome su dinero");
			txtVueltas.setText("Su dinero es $" + auxVuel + " pesos");
			txtVueltas.setVisible(true);
			Dinerito.setIcon(new ImageIcon(// Se vuelve visible la imagen del dinero
					"C:\\Users\\57300\\Desktop\\POO\\LaboratorioNo13\\src\\maquinaGolosinas\\Imagenes\\Dinerito.png"));

		} else {
			if (auxVuel >= 50) {// Si las vueltas son mayores a 50 pesos
				txtVueltas.setText(txtVueltas.getText() + "\n" + auxVuel + " pesos");// Se imprime el valor de las
																						// vueltas
				txtVueltas.setVisible(true);// El texto se vuelve visible
				Dinerito.setIcon(new ImageIcon(// Se vuelve visible la imagen del dinero
						"C:\\Users\\57300\\Desktop\\POO\\LaboratorioNo13\\src\\maquinaGolosinas\\Imagenes\\Dinerito.png"));
			} else {
				txtVueltas.setVisible(false);
			}

		}
		txtVueltas.setBounds(220, 43, 265, 80);
		contentPane.add(txtVueltas);
	}

	public static void main(String[] args) {
		int num = -1;
		int auxVuel = -1;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Producto frame = new Producto(num, auxVuel);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
