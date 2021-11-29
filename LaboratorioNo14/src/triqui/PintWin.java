/*
	 * Programa: Clase que pinta la linea de victoria
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  22 de enero del 2021
*/
package triqui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class PintWin extends JPanel {

	public void paint(Graphics g, int aux) {

		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g2);
		Color myGreen = new Color(81, 237, 68);
		g2.setPaint(myGreen);//Se le asigna un color nuevo
		g2.setStroke(new BasicStroke(20.0f));//Se le asigna un grosor 
		switch (aux) {
		//Segun el caso de victoria se imprime la linea en una posicion diferente
		case 1:
			g2.draw(new Line2D.Double(0, 23, 160, 23));
			break;
		case 2:
			g2.draw(new Line2D.Double(0, 80, 160, 80));
			break;
		case 3:
			g2.draw(new Line2D.Double(0, 135, 160, 135));
			break;
		case 4:
			g2.draw(new Line2D.Double(25, 0, 25, 160));
			break;
		case 5:
			g2.draw(new Line2D.Double(80, 0, 80, 160));
			break;
		case 6:
			g2.draw(new Line2D.Double(135, 0, 135, 160));
			break;
		case 7:
			g2.draw(new Line2D.Double(0, 0, 160, 160));
			break;
		case 8:
			g2.draw(new Line2D.Double(160, 0, 0, 160));
			break;
		}
		repaint();
	}
}
