/*
	 * Programa: Divisores positivos de un número.
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 21 oct de 2020.
*/
package divisoresNumero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisoresNumero {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicialización de variables
		int reint = 0;
		int num = 0;
		// Creacion de un nuevo objeto
		SonDivisores numeros = new SonDivisores();
		System.out.println("Este programa muestra los divisores positivos de un número.");
		do {// Bucle principal
			System.out.println("Ingrese el número a verificar.");
			num = Integer.parseInt(in.readLine());// El usuario ingresa el número a verificar
			while (num < 0) {// Verificación de que el número no sea negativo
				System.out.println("Ingrese un número mayor o igual a 0.");
				num = Integer.parseInt(in.readLine());
			}
			System.out.println("Los divisor(es) de " + num + " son:" + numeros.esDivisor(num) + "."); // Impresión en
																										// pantalla de
																										// los divisores
																										// de un número
																										// a partir del
																										// método en la
																										// plantilla

			System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificación presione 0.");
			reint = Integer.parseInt(in.readLine()); // El usuario ingresa una opción del menú
			while (reint != 0 && reint != 1) {// Verificación de que el usuari ingrese una opción valida del menú
				System.out.println("Opción invalida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificación presione 0.");
				reint = Integer.parseInt(in.readLine());

			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");

	}
}