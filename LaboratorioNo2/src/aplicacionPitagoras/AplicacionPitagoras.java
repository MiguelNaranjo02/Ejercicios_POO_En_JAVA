/*
	 * Programa: Aplicacion del teorema de pitagoras
	 * Autor: Miguel Angel Naranjo Joya
	 * Fecha: 9 oct de 2020
*/
package aplicacionPitagoras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplicacionPitagoras {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicializacion de variables
		double cate1 = 0;
		double cate2 = 0;
		double hipo = 0;
		System.out.println(
				"Este programa calcula la hipotenusa de un triangulo rectangulo apartir de la medida de sus dos catetos.");
		System.out.println("Introduzca la medida del primer cateto.");
		cate1 = Double.parseDouble(in.readLine()); // El usuario introduce la medida del primer cateto
		System.out.println("Introduzca la medida del segundo cateto.");
		cate2 = Double.parseDouble(in.readLine()); // El usuario introduce la medida del segundo cateto
		if (cate1 <= 0 || cate2 <= 0) {// Validacion de las medidas de los catetos introducidos por el usuario
			System.out.println("No se puede hallar la hipotenusa del triangulo con las medidas de los catetos dadas.");
		} else {
			hipo = Math.sqrt(Math.pow(cate1, 2) + Math.pow(cate2, 2)); // Calculo de la hipotenusa del triangulo
			hipo = Math.round(hipo * 100.0) / 100.0; // Redondeo de la medida de la hipotenusa
			System.out.println("La hipotenusa del triangulo con la medida de los catetos " + cate1 + " y " + cate2
					+ " es " + hipo + " unidades."); // Impresion en pantalla de la medida de la hipotenusa

		}
		System.out.println("Muchas gracias.");
	}

}
