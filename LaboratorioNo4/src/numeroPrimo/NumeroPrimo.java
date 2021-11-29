/*
	 * Programa: Verificador de N�meros Primos.
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
		// Creaci�n de un nuevo objeto
		EsPrimo numeros = new EsPrimo();
		// Inicializaci�n de variables
		int num;
		int reint = 0;

		System.out.println("Este programa verifica si un n�mero es primo o no.");
		do {// Bucle principal

			System.out.println("Ingrese el n�mero a verificar.");
			num = Integer.parseInt(in.readLine());// El usuario ingresa el n�mero a verificar
			while (num < 0) {// Verificaci�n de que el numero ingresado no sea negativo
				System.out.println("Ingrese un n�mero mayor o igual a 0.");
				num = Integer.parseInt(in.readLine());
			}
			if (numeros.verificaPrimo(num)) {// Llamada del m�todo que verifica si el numero es primo, al mismo tiempo
												// que verifica el valor de verdad, del retorno del m�todo
				System.out.println(num + " Es primo.");//Impresi�n en pantalla si el n�mero es primo
			} else {
				System.out.println(num + " No es primo.");//Impresi�n en pantalla si el n�mero es no es primo
			}

			System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificaci�n presione 0.");
			reint = Integer.parseInt(in.readLine());//El usuario ingresa una opci�n del men�
			while (reint != 0 && reint != 1) {//Verificaci�n de que el numero corresponda a las opciones del men�
				System.out.println("Opci�n invalida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificaci�n presione 0.");
				reint = Integer.parseInt(in.readLine());

			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");

	}

}
