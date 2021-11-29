/*
	 * Programa: Verificador de numeros pares e impares
	 * Autor: Miguel Angel Naranjo Joya
	 * Fecha: 9 oct de 2020
*/
package verificadorPar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VerificadorPar {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicializacion de variable
		int numIntro = 0;
		System.out.println("Este programa verifica si el numero introducido es par o si es impar.");
		System.out.println("Introduzca el número que quiere verificar si es par o impar.");
		numIntro = Integer.parseInt(in.readLine()); // Introduccion del numero a verificar por parte del usuario
		if (numIntro % 2 == 0) {// Validacion del numero, de si es par o impar
			System.out.println("El numero " + numIntro + " es par."); // Impresion en pantalla si es par
		} else {
			System.out.println("El numero " + numIntro + " es impar."); // Impresion en pantalla si es impar
		}
		System.out.println("Muchas gracias.");

	}

}
