/*
	 * Programa: Divisores positivos de un n�mero.
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
		// Inicializaci�n de variables
		int reint = 0;
		int num = 0;
		// Creacion de un nuevo objeto
		SonDivisores numeros = new SonDivisores();
		System.out.println("Este programa muestra los divisores positivos de un n�mero.");
		do {// Bucle principal
			System.out.println("Ingrese el n�mero a verificar.");
			num = Integer.parseInt(in.readLine());// El usuario ingresa el n�mero a verificar
			while (num < 0) {// Verificaci�n de que el n�mero no sea negativo
				System.out.println("Ingrese un n�mero mayor o igual a 0.");
				num = Integer.parseInt(in.readLine());
			}
			System.out.println("Los divisor(es) de " + num + " son:" + numeros.esDivisor(num) + "."); // Impresi�n en
																										// pantalla de
																										// los divisores
																										// de un n�mero
																										// a partir del
																										// m�todo en la
																										// plantilla

			System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificaci�n presione 0.");
			reint = Integer.parseInt(in.readLine()); // El usuario ingresa una opci�n del men�
			while (reint != 0 && reint != 1) {// Verificaci�n de que el usuari ingrese una opci�n valida del men�
				System.out.println("Opci�n invalida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificaci�n presione 0.");
				reint = Integer.parseInt(in.readLine());

			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");

	}
}