/*
	 * Programa: Numeros Primos
	 * Autor: Miguel Angel Naranjo Joya
	 * Fecha: 9 oct de 2020
*/
package numerosPrimos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumerosPrimos {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numIntro = 0;
		System.out.println("Este programa verifica si el numero introducido es primo.");
		System.out.println("Introduzca el numero a verificar si es primo o no.");
		numIntro = Integer.parseInt(in.readLine()); // El usuario introduce el numero a verificar
		if (numIntro < 0) { // Verifica que el numero no sea negativo
			System.out.println("Un numero negativo no puede ser primo.");
		} else {
			if (numIntro == 1) { // Verifica que el numero no sea igual a 1
				System.out.println("El " + numIntro + " no es primo.");
			} else {
				if (numIntro % 2 == 0 & numIntro != 2) {// Verifica que el numero no sea multiplo de 2
					System.out.println("El " + numIntro + " no es primo.");
				} else {
					if (numIntro % 3 == 0 & numIntro != 3) {// Verifica que el numero no sea multiplo de 3
						System.out.println("El " + numIntro + " no es primo.");
					} else {
						if (numIntro % 5 == 0 & numIntro != 5) {// Verifica que el numero no sea multiplo de 5
							System.out.println("El " + numIntro + " no es primo.");
						} else {
							if (numIntro % 7 == 0 & numIntro != 7) {// Verifica que el numero no sea multiplo de 7
								System.out.println("El " + numIntro + " no es primo.");
							} else {
								if (numIntro % 11 == 0 & numIntro != 11) {// Verifica que el numero no sea multiplo de
																			// 11
									System.out.println("El " + numIntro + " no es primo."); // Imprime en pantalla si el
																							// numero no es primo
								} else {
									System.out.println("El " + numIntro + " si es primo."); // Imprime en pantalla si el
																							// numero es primo
								}
							}
						}
					}
				}
			}
		}
		System.out.println("Muchas gracias.");
	}
}