/*
	 * Programa: Programa que muestra el factorial de un numero
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  20 de nov de 2020.
*/
package factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Se inicializan las variables
		double num;
		int opc;
		int reint;
		// Se crea un objeto que contiene los metodos de calculo del factorial
		FactorialMet met = new FactorialMet();
		System.out.println("Este programa calcula el factorial de un numero ingresado");
		do {
			System.out.println("Ingrese un numero");
			num = Double.parseDouble(in.readLine());// El usuario ingresa un numero
			while (num < 0) {// Validacion de que el numero sea mayor a cero
				System.out.println("El numero no puede ser menor a 0");
				System.out.println("Ingrese un numero");
				num = Double.parseDouble(in.readLine());
			}
			System.out.println("Ingrese la opcion de calculo: \n0.Recursivo\n1.Iterativo");// El usuario selecciona el
																							// tipo de calculo
			opc = Integer.parseInt(in.readLine());
			while (opc != 0 && opc != 1) {
				System.out.println("Opcion invalida \n0.Recursivo\n1.Iterativo");
				opc = Integer.parseInt(in.readLine());
			}
			met.setNum(num);// El numero es enviado al objeto
			met.setIni(opc);// La opcion seleccionada es enviada al objeto
			System.out.print("\n");
			System.out.print("(0.Volver/1.Salir): ");
			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opci?n del men?
			while (reint != 0 && reint != 1) {// Bucle de verificaci?n de que el n?mero corresponda a las opciones del
												// men?
				System.out.println("Opci?n inv?lida.");
				System.out.print("(0.Volver/1.Salir): ");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");

	}
}
