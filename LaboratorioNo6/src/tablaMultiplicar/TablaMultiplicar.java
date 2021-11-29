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
		// Inicializaci�n de variables
		int reint = 0;
		int num1 = 0;
		int num2 = 0;
		int mult = 0;
		// Creaci�n de un nuevo objeto
		GeneradorTabla tabla = new GeneradorTabla();
		System.out.println("Este programa muestra una tabla de multiplicaci�n especificada por el usuario");
		do {
			System.out.println("Digite el primer n�mero del intervalo de la tabla");
			num1 = Integer.parseInt(in.readLine());// El usuario digita el primer l�mite de la tabla de multiplicar a
													// mostrar
			while (num1 < 0) {// Verificaci�n de que el l�mite ingresado no sea negativo
				System.out.println("No se permiten n�meros negativos");
				System.out.println("Digite el primer n�mero del intervalo de la tabla");
				num1 = Integer.parseInt(in.readLine());
			}
			System.out.println("Digite el segundo n�mero del intervalo de la tabla");
			num2 = Integer.parseInt(in.readLine());// El usuario digita el segundo l�mite de la tabla de multiplicar a
													// mostrar
			while (num2 < 0) {// Verificaci�n de que el l�mite ingresado no sea negativo
				System.out.println("No se permiten n�meros negativos");
				System.out.println("Digite el segundo n�mero del intervalo de la tabla");
				num2 = Integer.parseInt(in.readLine());
			}
			if (num1 > num2) {// Reorganizaci�n de los l�mites para saber cu�l es el mayor y cu�l es el menor
				int aux;
				aux = num2;
				num2 = num1;
				num1 = aux;
			}
			System.out.println("Digite el m�ltiplo del cual quiere ver la tabla");
			mult = Integer.parseInt(in.readLine());// El usuario digita el m�ltiplo de la tabla
			tabla.setNum1(num1);// El l�mite inferior es enviado a la clase
			tabla.setNum2(num2);// El l�mite superior es enviado a la clase
			tabla.setMult(mult);// El m�ltiplo es enviado a la clase
			System.out.println(tabla.gentab());// Se imprime la tabla de multiplicar llamando al m�todo de la clase
			System.out.println("Si quiere salir presione 1\nSi quiere hacer otra tabla presione 0.");
			// Men� por si el usuario quiere hacer otra tabla

			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opci�n del men�
			while (reint != 0 && reint != 1) {// Verificaci�n de que el numero corresponda a las opciones del men�
				System.out.println("Opci�n inv�lida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otra tabla presione 0.");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}

}
