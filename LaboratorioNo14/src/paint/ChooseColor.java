/*
	 * Programa: Clase que se encarga de cambiar el color del trazo
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  22 de enero del 2021
*/
package paint;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;

public class ChooseColor extends JDialog implements ActionListener {
	// Se crean los objetos
	JColorChooser jcolor = new JColorChooser();
	JButton btAceptar = new JButton("Aceptar");
	Dibujar d;// De tipo dibujar

	public ChooseColor(Dibujar dib) {
		//
		d = dib;// Se iguala el parametro y el objeto creado de la clase
		// Se crea la ventana
		btAceptar.addActionListener(this);
		add(jcolor);
		add(btAceptar);
		setLayout(new FlowLayout());
		setSize(700, 430);
		setTitle("Escoge el color");
		setVisible(true);
		setLocation(220, 100);
		setResizable(false);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btAceptar) {
			d.color = jcolor.getColor();// El color obtenido de la ventana se iguala al color del objeto d de tipo
										// dibujar
		}
		dispose();
	}

}
