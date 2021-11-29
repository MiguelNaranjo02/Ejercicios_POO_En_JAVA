/*
	 * Programa: Calculadora de medias aritm�ticas
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 23 oct de 2020.
*/
package mediaDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MediaDatos {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//Inicializaci�n de variables
		int reint = 0;
		double dat = 0;
		boolean repet = true;
		int opc;
		//Creaci�n del objeto
		CalculoMedia Datos = new CalculoMedia();
		System.out.println("Este programa calcula la media aritm�tica de los datos introducidos");
		do {
			//Reinicio de datos
			Datos.calcMedia = 0;
			Datos.numDatos = 0;
			Datos.sumDatos = 0;
			do {
				System.out.print("Ingrese el dato: ");
				dat = Double.parseDouble(in.readLine());//El usuario ingresa un dato
				while (dat<0) {//Validaci�n de que el dato no sea negativo
					System.out.println("El n�mero tiene que ser mayor o igual a cero");
					System.out.println("Ingrese el dato");
					dat = Double.parseDouble(in.readLine());
				}
				repet = true;
	
				System.out.println("La media de los datos es de: " + Datos.Media(repet, dat));//Impresi�n en pantalla de la media llamando al m�todo
				
				System.out.println("1. Si quiere ingresar otro dato\n2. Si quiere terminar el c�lculo de la media");//Menu que permite elegir si ingresar otro dato o terminar la media
				opc = Integer.parseInt(in.readLine());
				while (opc != 1 && opc != 2) {//Validaci�n de que el dato del men� sea valido
					System.out.println("Opci�n inv�lida");
					System.out.println("1.Si quiere ingresar otro dato\n2. Si quiere terminar el c�lculo de la media");
					opc = Integer.parseInt(in.readLine());
				}
				if (opc == 1) {
					repet = true;
				} else {
					repet = false;
					System.out.println("La media final de los datos es de: " +Datos.Media(repet, dat));
					
				}
			} while (repet == true);//Condici�n de que se repita el c�lculo de la media

			System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificaci�n presione 0.");//Men� que permite calcular otra media o salir del programa
			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opci�n del men�
			while (reint != 0 && reint != 1) {// Verificaci�n de que el n�mero corresponda a las opciones del men�
				System.out.println("Opci�n invalida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificaci�n presione 0.");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");

	}
}

