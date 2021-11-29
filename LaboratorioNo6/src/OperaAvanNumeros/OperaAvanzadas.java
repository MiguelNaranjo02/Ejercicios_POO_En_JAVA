/*
	 * Programa: Programa que muestra el factorial, la raíz cuadrada, y el logaritmo natural de un numero
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 28 oct de 2020.
*/
package OperaAvanNumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperaAvanzadas {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicialización de variables
		int reint = 0;
		int numEnt = 0;
		int opc = 0;
		// Creación de nuevos objetos
		Factorial fact = new Factorial();
		RaizCuadrada raiz = new RaizCuadrada();
		LogaritmoNatural log = new LogaritmoNatural();
		System.out.println(
				"Este programa permite calcula el factorial, la raíz cuadrada y el logaritmo natural de un numero digitado");
		do {
			// Impresión en pantalla del menú
			System.out.println("Selecciona una opción del menú digitando el número correspondiente");
			System.out.println("1. Factorial");
			System.out.println("2. Raíz cuadrada");
			System.out.println("3. Logaritmo Natural");
			System.out.println("4. Salir");
			opc = Integer.parseInt(in.readLine());// El usuario digita una opción
			while (opc != 1 && opc != 2 && opc != 3 && opc != 4) {// Bucle que verifica que el usuario haya ingresado
																	// una opción disponible
				System.out.println("Opción inválida");
				System.out.println("Selecciona una opción del menú digitando el número correspondiente");
				System.out.println("1. Factorial");
				System.out.println("2. Raíz cuadrada");
				System.out.println("3. Logaritmo Natural");
				System.out.println("4. Salir");
				opc = Integer.parseInt(in.readLine());

			}
			switch (opc) {// Estructura que permite realizar diversas acciones según el valor de la opción
							// tomada por el usuario
			case 1:// Opción del factorial
				System.out.print("Digite un número entero: ");
				numEnt = Integer.parseInt(in.readLine());// El usuario ingresa un número
				while (numEnt < 0) {// Bucle que verifica que el número no sea negativo
					System.out.println("Digitación inválida, el número tiene que ser mayor o igual a 0");
					numEnt = Integer.parseInt(in.readLine());
				}
				fact.setNum(numEnt);// El número es enviado a la clase
				System.out.println("El factorial de " + numEnt + " es " + fact.getNum());// Impresión en pantalla del
																							// factorial
				break;
			case 2:// Opción de la raíz cuadrada
				System.out.print("Digite un número entero: ");
				numEnt = Integer.parseInt(in.readLine());// El usuario ingresa un número
				while (numEnt < 0) {// Bucle que verifica que el número no sea negativo
					System.out.println("Digitación inválida el número tiene que ser mayor o igual a 0");
					numEnt = Integer.parseInt(in.readLine());
				}
				raiz.setNum(numEnt);// El número es enviado a la clase
				System.out.println("La raíz cuadrada de " + numEnt + " es " + raiz.getNum());// Impresión en pantalla de
																								// la raíz cuadrada
				break;
			case 3:// Opción del logaritmo natural
				System.out.print("Digite un número entero: ");
				numEnt = Integer.parseInt(in.readLine());// El usuario ingresa un número
				while (numEnt <= 0) {// Bucle que verifica que el número no sea menor o igual a 0
					System.out.println("Digitación inválida el número tiene que ser mayor a 0");
					numEnt = Integer.parseInt(in.readLine());
				}
				log.setNum(numEnt);// El número es enviado a la clase
				System.out.println("El logaritmo natural de " + numEnt + " es " + log.getNum());// Impresión en pantalla
																								// del logaritmo natural
				break;
			case 4:// Opción de salir
				reint = 1;
				break;
			}

			System.out.println("Si quiere salir presione 1\nSi quiere hacer otro calculo presione 0.");// Menú por si el
																										// usuario
																										// quiere
																										// realizar
																										// otro calculo
			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opción del menú
			while (reint != 0 && reint != 1) {// Verificación de que el número corresponda a las opciones del menú
				System.out.println("Opción inválida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otro calculo presione 0.");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}
}
