/*
	 * Programa: Programa que muestra la sucesion de Fibonacci
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  20 de nov de 2020.
*/
package fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Se inicializan las variables
		int reint;
		int pos;
		int opc;
		FibonacciMet met = new FibonacciMet();
		System.out.println("Este programa muestra la serie de fibonacci de una posicion indicada");
		do {
			System.out.println("Ingrese la posicion final de la serie de fibonacci");
			pos = Integer.parseInt(in.readLine());// El usuario ingresa la posicion final de la sucesion de fibonacci a
													// mostrar
			while (pos <= 0) {// Si la posicion es igual o menor a cero se pedira otro numero
				System.out.println("Numero invalido, ingrese un numero natural");
				pos = Integer.parseInt(in.readLine());
			}
			System.out.println("Ingrese la opcion de calculo: \n0.Recursivo\n1.Iterativo");// El usuario selecciona la
																							// opcion de calculo de la
																							// sucesion
			opc = Integer.parseInt(in.readLine());
			while (opc != 0 && opc != 1) {
				System.out.println("Opcion invalida \n0.Recursivo\n1.Iterativo");
				opc = Integer.parseInt(in.readLine());
			}
			met.setPos(pos);// La posicion de la sucesion es enviada al objeto
			met.setOpc(opc);// La opcion del menu es enviada al objeto
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
