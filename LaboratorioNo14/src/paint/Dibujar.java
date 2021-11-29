/*
	 * Programa: Clase que se encarga de dibujar de diversas formas
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  22 de enero del 2021
*/
package paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Dibujar {
	// Se inicializan los atributos
	int X;
	int Y;
	int iniX;
	int iniY;
	int finX;
	int finY;
	Color color = new Color(0, 0, 0);// El color inicial del trazo sera el negro

	// Metodos getters y setters
	public int getIniX() {
		return iniX;
	}

	public void setIniX(int iniX) {
		this.iniX = iniX;
	}

	public int getIniY() {
		return iniY;
	}

	public void setIniY(int iniY) {
		this.iniY = iniY;
	}

	public int getFinX() {
		return finX;
	}

	public void setFinX(int finX) {
		this.finX = finX;
	}

	public int getFinY() {
		return finY;
	}

	public void setFinY(int finY) {
		this.finY = finY;
	}

	public Dibujar() {

	}

	public void leerCoordenadas(MouseEvent e) {// Metodo que lee las coordenadas y las guarda en variables especificas
		if (!e.isMetaDown()) {
			X = e.getX();
			Y = e.getY();
		}
	}

	public void pintar(MouseEvent e, int grosor, int indice) {// Metodo que pinta diversas figuras
		Graphics2D g2 = (Graphics2D) ((JPanel) e.getSource()).getGraphics();// Se dibujara en el panel en el cual se
																			// realizo el evento del mouse
		g2.setStroke(new BasicStroke(grosor));// Se cambia el grosor segun el Slider
		g2.setColor(color);// Se cambia el color del trazo
		if (indice == 0) {// Trazo libre
			int x = e.getX();
			int y = e.getY();
			g2.drawLine(X, Y, x, y);
			g2.dispose();
			X = x;
			Y = y;
		}
		if (indice == 1) {// Linea recta
			int x = e.getX();
			int y = e.getY();
			g2.drawLine(iniX, iniY, x, y);
		} else {
			if (indice == 2) {// Cuadrado/rectangulo
				int x = e.getX();
				int y = e.getY();
				g2.drawRect(Math.min(iniX, x), Math.min(iniY, y), Math.abs(iniX - x), Math.abs(iniY - y));

			} else {
				if (indice == 3) {// Circulo/Elipse
					int x = e.getX();
					int y = e.getY();
					g2.drawOval(Math.min(iniX, x), Math.min(iniY, y), Math.abs(iniX - x), Math.abs(iniY - y));
				}
			}
		}

	}

}
