/*
	 * Programa: Cálculo de nota definitva universitaria.
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 21 oct de 2020.
*/
package definitivaUniversitaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class definitivaUniversitaria {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicialización de variables
		int reint = 0;
		double nota1;
		double nota2;
		double nota3;
		double def;
		// Creación de un nuevo objeto
		calculoNota notas = new calculoNota();

		System.out.println(
				"Este programa calcula la definitiva universitaria de un semestre a partir de 3 notas, la primera y la segunda equivalentes al 30% y la tercera equivalente al 40%.");
		do {//Bucle principal
			System.out.println("Ingrese la nota 1 correspondiente al 30%.");
			nota1 = Double.parseDouble(in.readLine());// El usuario ingresa la nota 1
			while (nota1 > 5 || nota1 < 0) {// Bucle de verificación de que el número ingresado por el usuario sea menor
											// o
											// igual a 5, y mayor o igual a 0
				System.out.println("La nota ingresada debe estar entre de 0 y 5.");
				System.out.println("Ingrese la nota 1 correspondiente al 30%.");
				nota1 = Double.parseDouble(in.readLine());
			}
			System.out.println("Ingrese la nota 2 correspondiente al 30%.");
			nota2 = Double.parseDouble(in.readLine()); // El usuario ingresa la nota 2
			while (nota2 > 5 || nota2 < 0) {// Bucle de verificación de que el número ingresado por el usuario sea menor
											// o
											// igual a 5, y mayor o igual a 0
				System.out.println("La nota ingresada debe estar entre de 0 y 5.");
				System.out.println("Ingrese la nota 2 correspondiente al 30%.");
				nota2 = Double.parseDouble(in.readLine());
			}
			System.out.println("Ingrese la nota 3 correspondiente al 40%.");
			nota3 = Double.parseDouble(in.readLine()); // El usuario ingresa la nota 3
			while (nota3 > 5 || nota3 < 0) {// Bucle de verificación de que el número ingresado por el usuario sea menor
											// o
											// igual a 5, y mayor o igual a 0
				System.out.println("La nota ingresada debe estar entre de 0 y 5.");
				System.out.println("Ingrese la nota 3 correspondiente al 40%.");
				nota3 = Double.parseDouble(in.readLine());
			}
			def = notas.calculoDefinitva(nota1, nota2, nota3);// Llamada del método que calcula la definitiva,
																// mandándole 3
																// datos
			System.out.println("Su definitiva es de: " + def + ", " + notas.mensaje(def));// Impresión en pantalla de la
																							// definitiva y el mensaje
																							// correspondiente

			System.out.println("Si quiere salir presione 1\nSi quiere hacer otra cálculo presione 0.");
			reint = Integer.parseInt(in.readLine());// El usuario selecciona una opción del menu
			while (reint != 0 && reint != 1) {// Bucle de verificación de que el usuario seleccione una opción válida en
												// el menú
				System.out.println("Opcion invalida");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otro cálculo presione 0.");
				reint = Integer.parseInt(in.readLine());

			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}

}
