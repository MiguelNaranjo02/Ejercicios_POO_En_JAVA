/*
	 * Programa: Programa que obtiene el promedio, la varianza y la desviacion tipica de 5 datos ingresados
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  13 de nov de 2020.
*/
package punto2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto2 {

	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Se crea el vector donde se guardaran los datos
		double[] datos;
		datos = new double[5];
		// Se crean dos objetos
		Promedio promDatos = new Promedio();
		Varianza varDatos = new Varianza();

		System.out.println("Este programa calcula el promedio, la varianza y la desviacion tipica");
		int reint;
		do {
			for (int i = 1; i < datos.length + 1; i++) {// Se recorre el vector llenandolo con los datos introducidos
														// por el usuario
				System.out.println("Ingrese el dato numero " + i);
				datos[i - 1] = Double.parseDouble(in.readLine());

			}
			promDatos.setDatos(datos);// Se le manda el vector al objeto promedio
			varDatos.setDatos(datos);// Se le manda el vector al objeto varianza

			System.out.println("El promedio de los datos es: " + promDatos.prom());// Se imprime el promedio de los
																					// datos llamando al metodo que
																					// realiza esa funcion
			varDatos.setPromedio(promDatos.prom());// Se le manda el promedio al objeto varianza
			System.out.println("La varianza de los datos es: " + varDatos.var());// Se imprime la varianza de los datos
																					// llamando al metodo que realiza
																					// esa funcion
			System.out.println("La desviacion de los datos es: " + varDatos.des());// Se imprime la desviacion de los
																					// datos llamando al metodo que
																					// realiza esa funcion
			System.out.print("\n");
			System.out.print("(0.Volver/1.Salir): ");
			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opción del menú
			while (reint != 0 && reint != 1) {// Bucle de verificación de que el número corresponda a las opciones del
												// menú
				System.out.println("Opción inválida.");
				System.out.print("(0.Volver/1.Salir): ");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");

	}
}
