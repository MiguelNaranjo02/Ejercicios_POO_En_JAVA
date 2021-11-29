/*
	 * Programa: Programa que verifica si una frase es pal�ndroma
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  11 de nov de 2020.
*/
package frasesPalindromas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrasesPalindromas {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicializaci�n de variables
		String msjOrg = "";
		int reint;
		//Creaci�n del objeto mensajePal
		esPalindromo mensajePal = new esPalindromo();
		System.out.println("Este programa verifica si un mensaje es pal�ndromo");
		do {
			System.out.println("Introduzca el mensaje a verificar");
			msjOrg = (in.readLine());// El usuario ingresa el mensaje a verificar
			while (msjOrg.isEmpty() || msjOrg.length() < 3) {// Bucle que comprueba que el mensaje no este vac�o
				System.out.println("La palabra ingresada no puede tener menos de 3 caracteres, o estar vac�a");
				System.out.println("Introduzca un mensaje");
				msjOrg = (in.readLine());
			}
			System.out.print("\n");
			mensajePal.setMsjOrg(msjOrg);// El mensaje es enviado a la clase
			System.out.println(mensajePal.metMsjCar(msjOrg));// Se llama al m�todo que retorna el string del mensaje
																// limpio
			System.out.println(mensajePal.metMsjReves());// Se llama al m�todo que retorna el string del mensaje limpio
															// invertido
			System.out.print("\n");
			if (mensajePal.siPalindromo()) {// Se llama al m�todo que retorna una bandera verdadera si la frase es
											// pal�ndroma
				System.out.println("La frase SI es pal�ndroma");
			} else {
				System.out.println("La frase NO es pal�ndroma");
			}
			System.out.print("\n");
			System.out.print("(0.Volver/1.Salir): ");
			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opci�n del men�
			while (reint != 0 && reint != 1) {// Bucle de verificaci�n de que el n�mero corresponda a las opciones del
												// men�
				System.out.println("Opci�n inv�lida.");
				System.out.print("(0.Volver/1.Salir): ");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}
}
