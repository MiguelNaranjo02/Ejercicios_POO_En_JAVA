/*
	 * Programa: Verificador de Números Primos.
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 21 oct de 2020.
*/
package numeroPrimo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumeroPrimo {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Creación de un nuevo objeto
		EsPrimo numeros = new EsPrimo();
		// Inicialización de variables
		int num;
		int reint = 0;

		System.out.println("Este programa verifica si un número es primo o no.");
		do {// Bucle principal

			System.out.println("Ingrese el número a verificar.");
			num = Integer.parseInt(in.readLine());// El usuario ingresa el número a verificar
			while (num < 0) {// Verificación de que el numero ingresado no sea negativo
				System.out.println("Ingrese un número mayor o igual a 0.");
				num = Integer.parseInt(in.readLine());
			}
			if (numeros.verificaPrimo(num)) {// Llamada del método que verifica si el numero es primo, al mismo tiempo
												// que verifica el valor de verdad, del retorno del método
				System.out.println(num + " Es primo.");//Impresión en pantalla si el número es primo
			} else {
				System.out.println(num + " No es primo.");//Impresión en pantalla si el número es no es primo
			}

			System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificación presione 0.");
			reint = Integer.parseInt(in.readLine());//El usuario ingresa una opción del menú
			while (reint != 0 && reint != 1) {//Verificación de que el numero corresponda a las opciones del menú
				System.out.println("Opción invalida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificación presione 0.");
				reint = Integer.parseInt(in.readLine());

			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");

	}

}
