/*
	 * Programa: Area del Circulo
	 * Autor: Miguel Angel Naranjo Joya
	 * Fecha: 9 oct de 2020
*/
package areaCirculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaCirculo {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicializacion de variables
		double longRad = 0;
		double areaCirc = 0;
		System.out.println("Este programa calcula la medida del area del circulo.");
		System.out.println("Introduzca la medida del radio del circulo.");
		longRad = Double.parseDouble(in.readLine()); // El usuario introduce la medida de la longitud del radio
		if (longRad <= 0) { // Verificacion de que la longitud del radio sea valida para hacer el calculo
			System.out.println("No se puede calcular el area con las medidas dadas.");
		} else {
			areaCirc = Math.pow(longRad, 2) * Math.PI; // Calculo del area del circulo
			areaCirc = Math.round(areaCirc * 100.0) / 100.0; // Redondeo a dos decimales del area del circulo
			System.out.println("El area del circulo de radio " + longRad + " es " + areaCirc + " unidades cuadradas."); // Impresion
																														// en
																														// pantalla
																														// del
																														// area
																														// del
																														// circulo
			System.out.println("Muchas gracias.");
		}
	}

}
