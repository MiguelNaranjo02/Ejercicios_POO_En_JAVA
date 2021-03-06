/*
	 * Programa: Programa que obtiene las posibles soluciones de una ecuacion cuadratica
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  13 de nov de 2020.
*/
package punto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto1 {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double a = 0;
		double b = 0;
		double c = 0;
		double valorDisc = 0;
		int reint;
		Cuadratica ecuacion = new Cuadratica();
		System.out.println("Este programa obtiene las posibles soluciones de una ecuacion cuadratica");
		do {
			System.out.println("La ecuacion es de la forma A(x^2)+B(x)+C=0");
			System.out.print("Ingrese el valor de A:");
			a = Double.parseDouble(in.readLine());
			System.out.print("Ingrese el valor de B:");
			b = Double.parseDouble(in.readLine());
			System.out.print("Ingrese el valor de C:");
			c = Double.parseDouble(in.readLine());
			ecuacion.setA(a);
			ecuacion.setB(b);
			ecuacion.setC(c);

			if (a == 0) {
				double aux = 0;
				if (b == 0) {
					System.out.println("No se puede calcular el valor de x, dado que se presenta una incoherencia");

				} else {
					aux = -c / b;
					System.out.println("Dado que la ecuacion es lineal, el valor de x es solo uno y es: " + aux);
				}
			}
			valorDisc = ecuacion.dis();
			if (valorDisc > 0 && a != 0) {
				ecuacion.formula();
				System.out.println("Los valores de x son :"+ecuacion.getSol1()+" y "+ ecuacion.getSol2());

			}
			if (valorDisc == 0 && a != 0) {
				double aux;
				aux=-b/(2*a);
				System.out.println("El valor de x es :"+aux);

			}
			if (valorDisc < 0 && a != 0) {
				System.out.println("Numero imaginario no calculable");
				
				System.out.println(-b+""+valorDisc+"i"+"/"+2*a);
			}
		
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
