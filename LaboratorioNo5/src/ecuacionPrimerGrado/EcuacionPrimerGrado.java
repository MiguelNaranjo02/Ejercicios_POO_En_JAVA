/*
	 * Programa: Calcula la variable de una ecuaci�n de primer grado
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 23 oct de 2020.
*/
package ecuacionPrimerGrado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EcuacionPrimerGrado {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//Inicializaci�n de variables
		double A=0;
		double B=0;
		double C=0;
		int reint=0;
		//Creaci�n del nuevo objeto
		CalculoDespeje ecuacion = new CalculoDespeje();
		do {
		System.out.println("Este programa calcula el valor de una variable en una ecuaci�n de primer grado");
		System.out.println("La ecuaci�n a despejar es de la forma Ax+B=C");
		System.out.print("Ingrese el valor de A: ");
		A=Double.parseDouble(in.readLine());//El usuario ingresa el valor correspondiente a A
		System.out.print("Ingrese el valor de B: ");
		B=Double.parseDouble(in.readLine());//El usuario ingresa el valor correspondiente a B
		System.out.print("Ingrese el valor de C: ");
		C=Double.parseDouble(in.readLine());//El usuario ingresa el valor correspondiente a C
		if (A!=0) {//Se verifica que A sea diferente de 0 para que no se presenten divisiones entre 0 ni errores
			System.out.println("La ecuaci�n de la forma ("+A+")x"+"+("+B+")="+C+", tiene como valor de x: "+ ecuacion.despeje(A, B,C));//Se imprime el pantalla el valor de x
		}else {
			System.out.println("No puede hallarse el valor de x, es una indeterminaci�n");
		}
		System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificaci�n presione 0.");//Men� por si el usuario quiere hacer otro calculo
		reint = Integer.parseInt(in.readLine());// El usuario ingresa una opci�n del men�
		while (reint != 0 && reint != 1) {// Verificaci�n de que el numero corresponda a las opciones del men�
			System.out.println("Opci�n inv�lida.");
			System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificaci�n presione 0.");
			reint = Integer.parseInt(in.readLine());
		}
	} while (reint == 0);
	System.out.println("Muchas gracias.");
		
	}

}

