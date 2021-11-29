/*
	 * Programa: Programa que muestra el factorial, la ra�z cuadrada, y el logaritmo natural de un numero
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
		// Inicializaci�n de variables
		int reint = 0;
		int numEnt = 0;
		int opc = 0;
		// Creaci�n de nuevos objetos
		Factorial fact = new Factorial();
		RaizCuadrada raiz = new RaizCuadrada();
		LogaritmoNatural log = new LogaritmoNatural();
		System.out.println(
				"Este programa permite calcula el factorial, la ra�z cuadrada y el logaritmo natural de un numero digitado");
		do {
			// Impresi�n en pantalla del men�
			System.out.println("Selecciona una opci�n del men� digitando el n�mero correspondiente");
			System.out.println("1. Factorial");
			System.out.println("2. Ra�z cuadrada");
			System.out.println("3. Logaritmo Natural");
			System.out.println("4. Salir");
			opc = Integer.parseInt(in.readLine());// El usuario digita una opci�n
			while (opc != 1 && opc != 2 && opc != 3 && opc != 4) {// Bucle que verifica que el usuario haya ingresado
																	// una opci�n disponible
				System.out.println("Opci�n inv�lida");
				System.out.println("Selecciona una opci�n del men� digitando el n�mero correspondiente");
				System.out.println("1. Factorial");
				System.out.println("2. Ra�z cuadrada");
				System.out.println("3. Logaritmo Natural");
				System.out.println("4. Salir");
				opc = Integer.parseInt(in.readLine());

			}
			switch (opc) {// Estructura que permite realizar diversas acciones seg�n el valor de la opci�n
							// tomada por el usuario
			case 1:// Opci�n del factorial
				System.out.print("Digite un n�mero entero: ");
				numEnt = Integer.parseInt(in.readLine());// El usuario ingresa un n�mero
				while (numEnt < 0) {// Bucle que verifica que el n�mero no sea negativo
					System.out.println("Digitaci�n inv�lida, el n�mero tiene que ser mayor o igual a 0");
					numEnt = Integer.parseInt(in.readLine());
				}
				fact.setNum(numEnt);// El n�mero es enviado a la clase
				System.out.println("El factorial de " + numEnt + " es " + fact.getNum());// Impresi�n en pantalla del
																							// factorial
				break;
			case 2:// Opci�n de la ra�z cuadrada
				System.out.print("Digite un n�mero entero: ");
				numEnt = Integer.parseInt(in.readLine());// El usuario ingresa un n�mero
				while (numEnt < 0) {// Bucle que verifica que el n�mero no sea negativo
					System.out.println("Digitaci�n inv�lida el n�mero tiene que ser mayor o igual a 0");
					numEnt = Integer.parseInt(in.readLine());
				}
				raiz.setNum(numEnt);// El n�mero es enviado a la clase
				System.out.println("La ra�z cuadrada de " + numEnt + " es " + raiz.getNum());// Impresi�n en pantalla de
																								// la ra�z cuadrada
				break;
			case 3:// Opci�n del logaritmo natural
				System.out.print("Digite un n�mero entero: ");
				numEnt = Integer.parseInt(in.readLine());// El usuario ingresa un n�mero
				while (numEnt <= 0) {// Bucle que verifica que el n�mero no sea menor o igual a 0
					System.out.println("Digitaci�n inv�lida el n�mero tiene que ser mayor a 0");
					numEnt = Integer.parseInt(in.readLine());
				}
				log.setNum(numEnt);// El n�mero es enviado a la clase
				System.out.println("El logaritmo natural de " + numEnt + " es " + log.getNum());// Impresi�n en pantalla
																								// del logaritmo natural
				break;
			case 4:// Opci�n de salir
				reint = 1;
				break;
			}

			System.out.println("Si quiere salir presione 1\nSi quiere hacer otro calculo presione 0.");// Men� por si el
																										// usuario
																										// quiere
																										// realizar
																										// otro calculo
			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opci�n del men�
			while (reint != 0 && reint != 1) {// Verificaci�n de que el n�mero corresponda a las opciones del men�
				System.out.println("Opci�n inv�lida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otro calculo presione 0.");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}
}
