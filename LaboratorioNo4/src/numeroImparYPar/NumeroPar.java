/*
	 * Programa: Verificador de números pares e impares.
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
		// Creación de un nuevo objeto
		EsPar numeros = new EsPar();
		// Inicialización de variables
		int num;
		int reint = 0;
		System.out.println("Este programa verifica si un número es par o no lo es.");
		do {// Bucle principal
			System.out.println("Ingrese el número a verificar.");
			num = Integer.parseInt(in.readLine());// El usuario ingresa un número
			while (num < 0) {// Validación de que el número no sea menor a 0
				System.out.println("Ingrese un número mayor o igual a 0.");
				num = Integer.parseInt(in.readLine());
			}
			if (numeros.verificaPar(num)) {// Llamada del método al mismo tiempo que verifica si la bandera retornada
											// fue verdadera o falsa
				System.out.println(num + " es par.");// Impresión en pantalla si el número es par
			} else {
				System.out.println(num + " es impar.");// Impresión en pantalla si el número es impar
			}
			System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificación presione 0.");
			reint = Integer.parseInt(in.readLine());// El usuario ingresa su opción del menú
			while (reint != 0 && reint != 1) {// Verificación de que el número ingresado fue valido
				System.out.println("Opción invalida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificación presione 0.");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");

	}
}