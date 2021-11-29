/*
	 * Programa: Programa que muestra una tabla de multiplicar
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  28 de oct de 2020.
*/
package tablaMultiplicar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TablaMultiplicar {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicialización de variables
		int reint = 0;
		int num1 = 0;
		int num2 = 0;
		int mult = 0;
		// Creación de un nuevo objeto
		GeneradorTabla tabla = new GeneradorTabla();
		System.out.println("Este programa muestra una tabla de multiplicación especificada por el usuario");
		do {
			System.out.println("Digite el primer número del intervalo de la tabla");
			num1 = Integer.parseInt(in.readLine());// El usuario digita el primer límite de la tabla de multiplicar a
													// mostrar
			while (num1 < 0) {// Verificación de que el límite ingresado no sea negativo
				System.out.println("No se permiten números negativos");
				System.out.println("Digite el primer número del intervalo de la tabla");
				num1 = Integer.parseInt(in.readLine());
			}
			System.out.println("Digite el segundo número del intervalo de la tabla");
			num2 = Integer.parseInt(in.readLine());// El usuario digita el segundo límite de la tabla de multiplicar a
													// mostrar
			while (num2 < 0) {// Verificación de que el límite ingresado no sea negativo
				System.out.println("No se permiten números negativos");
				System.out.println("Digite el segundo número del intervalo de la tabla");
				num2 = Integer.parseInt(in.readLine());
			}
			if (num1 > num2) {// Reorganización de los límites para saber cuál es el mayor y cuál es el menor
				int aux;
				aux = num2;
				num2 = num1;
				num1 = aux;
			}
			System.out.println("Digite el múltiplo del cual quiere ver la tabla");
			mult = Integer.parseInt(in.readLine());// El usuario digita el múltiplo de la tabla
			tabla.setNum1(num1);// El límite inferior es enviado a la clase
			tabla.setNum2(num2);// El límite superior es enviado a la clase
			tabla.setMult(mult);// El múltiplo es enviado a la clase
			System.out.println(tabla.gentab());// Se imprime la tabla de multiplicar llamando al método de la clase
			System.out.println("Si quiere salir presione 1\nSi quiere hacer otra tabla presione 0.");
			// Menú por si el usuario quiere hacer otra tabla

			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opción del menú
			while (reint != 0 && reint != 1) {// Verificación de que el numero corresponda a las opciones del menú
				System.out.println("Opción inválida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otra tabla presione 0.");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}

}
