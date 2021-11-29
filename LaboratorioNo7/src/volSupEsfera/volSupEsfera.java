/*
	 * Programa: Programa que muestra el valor del volumen y la superficie de una esfera
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  30 de oct de 2020.
*/
package volSupEsfera;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class volSupEsfera {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicializacion de variables
		int opc;
		int reint;
		double rad;
		System.out.println(
				"Este programa calcula el volumen y la superficie de una esfera, con radio 1, o con un radio digitado por el usuario");
		do {// Bucle principal
			// Impresi�n del men�
			System.out.println("Digite el n�mero correspondiente a la opci�n de su preferencia");
			System.out.println("1. Para el c�lculo del volumen y la superficie con radio 1");
			System.out.println("2. Para el c�lculo del volumen y la superficie con un radio escogido por el usuario");
			opc = Integer.parseInt(in.readLine());// El usuario digita la opci�n del men�
			while (opc != 1 && opc != 2) {// Bucle que verifica que la opci�n seleccionada por el usuario sea valida
				System.out.println("Opci�n inv�lida.");
				System.out.println("Digite el numero correspondiente a la opci�n de su preferencia");
				System.out.println("1. Para el c�lculo del volumen y la superficie con radio 1");
				System.out
						.println("2. Para el c�lculo del volumen y la superficie con un radio escogido por el usuario");
				opc = Integer.parseInt(in.readLine());

			}
			switch (opc) {// Estructura switch que realiza determinadas acciones seg�n la opci�n
							// seleccionada por el usuario
			case 1:
				Esfera calcEsfera = new Esfera();// Se crea el objeto calcEsfera
				calcEsfera.Imprimir();// Se llama al m�todo calcEsfera, el cual imprime un mensaje con la superficie y
										// el volumen de la esfera
				break;
			case 2:
				System.out.print("Ingrese el radio de la esfera: ");
				rad = Double.parseDouble(in.readLine());// El usuario ingresa el valor del radio
				while (rad <= 0) {// Bucle que verifica que el radio no sea menor o igual a 0
					System.out.println("El radio no puede ser menor o igual a 0 ");
					System.out.print("Ingrese el radio de la esfera: ");
					rad = Double.parseDouble(in.readLine());
				}
				Esfera calcEsfera1 = new Esfera(rad);// Se crea el objeto calcEsfera1, mand�ndole el par�metro de la
														// medida del radio
				calcEsfera1.Imprimir();// Se llama al m�todo Imprimir del objeto calcEsfera1 el cual imprime el mensaje
										// con la superficie y el volumen de la esfera
				break;
			}
			System.out.println("Si quiere salir presione 1\nSi quiere hacer otro c�lculo presione 0.");// Bucle de
																										// repetici�n
																										// del calculo
			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opci�n del men�
			while (reint != 0 && reint != 1) {// Verificaci�n de que el n�mero corresponda a las opciones del men�
				System.out.println("Opci�n inv�lida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otro c�lculo presione 0.");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");

	}
}
