/*
	 * Programa: Programa que encripta un mensaje con el m�todo Julio Cesar
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  6 de nov de 2020.
*/
package encriptaCesar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class encriptaCesar {
	public static void main(String Arg[]) throws IOException {
		// Creaci�n del objeto encriptacion a partir de la plantilla MetodoJulCesar
		MetodoJulCesar encriptacion = new MetodoJulCesar();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicializaci�n de variables
		String msj = "";
		int corrimiento;
		int reint;
		System.out.println("Este programa encripta un mensaje con el m�todo Cesar");
		do {// Bucle principal
			System.out.print("Ingrese el corrimiento de su preferencia: ");
			corrimiento = Integer.parseInt(in.readLine());// El usuario ingresa el corrimiento
			while (corrimiento < 0 || corrimiento >= encriptacion.getAbcCarac().length) {// Bucle que comprueba que el
																							// corrimiento no sea mayor
																							// a las letras del
																							// abecedario y no sea
																							// negativo
				System.out.println("El corrimiento no puede ser mayor o igual al n�mero de letras en el alfabeto");
				System.out.print("Ingrese el corrimiento de su preferencia: ");
				corrimiento = Integer.parseInt(in.readLine());
			}
			System.out.println("Introduzca el mensaje a encriptar");
			msj = (in.readLine());// El usuario ingresa el mensaje a desencriptar
			while (msj.isEmpty()) {// Bucle que comprueba que el mensaje no este vac�o
				System.out.println("Introduzca un mensaje");
				msj = (in.readLine());
			}
			char[] msjCarac = msj.toCharArray();// El mensaje es convertido a un arreglo de caracteres
			System.out.println(encriptacion.palabrachar(msjCarac) + "\n");// Se imprime el mensaje en caracteres
																			// llamando al m�todo palabrachar
			System.out.println(encriptacion.retoEncript(msjCarac, corrimiento) + "\n");// Se imprime el mensaje
																						// encriptado llamando al m�todo
																						// retoEncript
			System.out.println("Si quiere salir presione 1\nSi quiere hacer otra encriptaci�n presione 0.");
			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opci�n del men�
			while (reint != 0 && reint != 1) {// Bucle de verificaci�n de que el n�mero corresponda a las opciones del
												// men�
				System.out.println("Opci�n inv�lida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otra encriptaci�n presione 0.");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}
}
