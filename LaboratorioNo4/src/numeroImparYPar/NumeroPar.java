/*
	 * Programa: Verificador de n�meros pares e impares.
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 21 oct de 2020.
*/
package numeroImparYPar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumeroPar {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Creaci�n de un nuevo objeto
		EsPar numeros = new EsPar();
		// Inicializaci�n de variables
		int num;
		int reint = 0;
		System.out.println("Este programa verifica si un n�mero es par o no lo es.");
		do {// Bucle principal
			System.out.println("Ingrese el n�mero a verificar.");
			num = Integer.parseInt(in.readLine());// El usuario ingresa un n�mero
			while (num < 0) {// Validaci�n de que el n�mero no sea menor a 0
				System.out.println("Ingrese un n�mero mayor o igual a 0.");
				num = Integer.parseInt(in.readLine());
			}
			if (numeros.verificaPar(num)) {// Llamada del m�todo al mismo tiempo que verifica si la bandera retornada
											// fue verdadera o falsa
				System.out.println(num + " es par.");// Impresi�n en pantalla si el n�mero es par
			} else {
				System.out.println(num + " es impar.");// Impresi�n en pantalla si el n�mero es impar
			}
			System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificaci�n presione 0.");
			reint = Integer.parseInt(in.readLine());// El usuario ingresa su opci�n del men�
			while (reint != 0 && reint != 1) {// Verificaci�n de que el n�mero ingresado fue valido
				System.out.println("Opci�n invalida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificaci�n presione 0.");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");

	}
}