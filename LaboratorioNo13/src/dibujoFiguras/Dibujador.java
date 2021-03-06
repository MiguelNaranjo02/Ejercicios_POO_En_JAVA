/*
	 * Programa: Plantilla que dibuja distintas figuras
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 13 de dic de 2020
*/
package dibujoFiguras;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Dibujador extends JPanel {
	public Dibujador() {

	}

	public void paintCuadrado(Graphics g, double aux) {// Metodo que dibuja cuadrados
		int num = (int) aux;
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.fillRect(20, 20, num, num);
		repaint();

	}

	public void paintCirculo(Graphics g, double aux) {// Metodo que dibuja circulos
		int num = (int) aux;
		num = num * 2;
		if (num > 120) {
			num = 120;
		}
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillOval(20, 20, num, num);
		repaint();

	}

	public void paintOvalo(Graphics g, double aux1, double aux2) {// Metodo que dibuja ovalos
		int num1 = (int) aux1;
		num1 = num1 * 2;
		int num2 = (int) aux2;
		num2 = num2 * 2;
		if (num2 > 170) {
			num2 = 170;
			num1 = 340;
		}
		if (num1 > 340) {
			num1 = 340;
			num2 = 170;
		}

		super.paintComponent(g);
		g.setColor(Color.yellow);
		g.fillOval(20, 20, num1, num2);
		repaint();

	}

	public void paintRectangulo(Graphics g, double aux1, double aux2) {// Metodo que dibuja rectangulos
		int num1 = (int) aux1;
		int num2 = (int) aux2;
		super.paintComponent(g);
		g.setColor(Color.magenta);
		g.fillRect(20, 20, num1, num2);
		repaint();
	}

	public void paintTriangulo(Graphics g, double aux1, double aux2, double aux3) {// Metodo que dibuja triangulos

		int num1 = (int) aux1;
		int num2 = (int) aux2;
		int num3 = (int) aux3;
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		if ((num1 == num2) && (num1 == num3)) {//Triangulo Equilatero
			int[] x = { 20, 60, 100 };
			int[] y = { 100, 30, 100 };
			g.fillPolygon(x, y, 3);
		} else {
			if (num1 != num2 && num1 != num3 && num2 != num3) {//Triangulo Escaleno
				int[] x = { 10, 20, 100 };
				int[] y = { 90, 14, 120 };
				g.fillPolygon(x, y, 3);

			} else {
				if (((num1 == num2) && (num2 != num3)) || ((num2 == num3) && (num1 != num3))
						|| (num1 == num3) && (num1 != num2)) {//Triangulo Isosceles
					int[] x = { 20, 50, 80 };
					int[] y = { 100, 5, 100 };
					g.fillPolygon(x, y, 3);
				}
			}
		}
		repaint();
	}

}
