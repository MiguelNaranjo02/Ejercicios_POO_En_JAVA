/*
	 * Programa: Programa que verifica si una frase es palíndroma
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
		// Inicialización de variables
		String msjOrg = "";
		int reint;
		//Creación del objeto mensajePal
		esPalindromo mensajePal = new esPalindromo();
		System.out.println("Este programa verifica si un mensaje es palíndromo");
		do {
			System.out.println("Introduzca el mensaje a verificar");
			msjOrg = (in.readLine());// El usuario ingresa el mensaje a verificar
			while (msjOrg.isEmpty() || msjOrg.length() < 3) {// Bucle que comprueba que el mensaje no este vacío
				System.out.println("La palabra ingresada no puede tener menos de 3 caracteres, o estar vacía");
				System.out.println("Introduzca un mensaje");
				msjOrg = (in.readLine());
			}
			System.out.print("\n");
			mensajePal.setMsjOrg(msjOrg);// El mensaje es enviado a la clase
			System.out.println(mensajePal.metMsjCar(msjOrg));// Se llama al método que retorna el string del mensaje
																// limpio
			System.out.println(mensajePal.metMsjReves());// Se llama al método que retorna el string del mensaje limpio
															// invertido
			System.out.print("\n");
			if (mensajePal.siPalindromo()) {// Se llama al método que retorna una bandera verdadera si la frase es
											// palíndroma
				System.out.println("La frase SI es palíndroma");
			} else {
				System.out.println("La frase NO es palíndroma");
			}
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
