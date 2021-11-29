/*
	 * Programa: Perimetro del Rectangulo
	 * Autor: Miguel Angel Naranjo Joya
	 * Fecha: 9 oct de 2020
*/
package perimetroRectangulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerimetroRectangulo {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicializacion de variables
		double base = 0;
		double altura = 0;
		double perimetro = 0;
		System.out.println(
				"Este programa calcula el perimetro de un rectangulo dadas las medidas de su base y su altura.");
		System.out.println("Introduzca la medida de la base del rectangulo.");
		base = Double.parseDouble(in.readLine()); // Introduccion por parte del usuario, de la medida de la base

		System.out.println("Introduzca la medida de la altura del rectangulo.");
		altura = Double.parseDouble(in.readLine()); // Introduccion por parte del usuario, de la medida de la altura
		if (base <= 0 || altura <= 0) { // Verificacion de las medidas dadas por el usuario para que se pueda hacer un
										// calculo acertado
			System.out.println("No se puede calcular el perimetro del rectangulo con la medida dada.");
		} else {
			perimetro = (altura * 2) + (base * 2); // Calculo del perimetro del rectangulo

			System.out.println("El perimetro del rectangulo con base " + base + " y altura " + altura + " es de "
					+ perimetro + " unidades."); // Impresion en pantalla del perimetro del rectangulo
			System.out.println("Muchas gracias. ");
		}
	}
}
