/*
	 * Programa: Programa que halla el lado de un tri�ngulo a partir de dos de sus lados y un �ngulo
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  30 de oct de 2020.
*/
package ladTriang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LadTriang {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicializaci�n de variables
		double lad1;
		double lad2;
		double ang;
		double angorig;
		int reint = 0;
		// Creaci�n del nuevo objeto
		CalculoLad medTriang = new CalculoLad();
		System.out.println(
				"Este programa calcula la medida del lado de un tri�ngulo a partir de dos lados del tri�ngulo y el �ngulo que comparten");
		do {
			System.out.print("Ingrese la medida del lado 1: ");
			lad1 = Double.parseDouble(in.readLine());// El usuario ingresa la medida del lado 1
			while (lad1 <= 0) {// Bucle que valida si el lado 1 es menor o igual a 0
				System.out.println("La medida de un lado no puede ser menor o igual a 0");
				System.out.print("Ingrese la medida del lado 1: ");
				lad1 = Double.parseDouble(in.readLine());
			}
			System.out.print("Ingrese la medida del lado 2: ");
			lad2 = Double.parseDouble(in.readLine());// El usuario ingresa la medida del lado 2
			while (lad2 <= 0) {// Bucle que valida si el lado 2 es menor o igual a 0
				System.out.println("La medida de un lado no puede ser menor o igual a 0");
				System.out.print("Ingrese la medida del lado 2: ");
				lad2 = Double.parseDouble(in.readLine());

			}
			System.out.print(
					"Ingrese la medida del �ngulo interno compartido por los dos lados anteriormente digitados en grados sexagesimales: ");
			ang = Double.parseDouble(in.readLine());// El usuario ingresa el valor del �ngulo en grados sexagesimales
			while (ang <= 0 || ang >= 180) {// Bucle de validaci�n de que el �ngulo no sea menor o igual 0, y mayor o
											// igual a 180
				System.out.println(
						"El angulo entre dos lados del tri�ngulo no puede ser negativo, igual a cero, mayor a 180� o igual a 180�");
				System.out.print("Ingrese la medida del �ngulo en grados sexagesimales: ");
				ang = Double.parseDouble(in.readLine());
			}
			angorig = ang;// La medida del �ngulo se guarda en la variable �ngulo original
			ang = Math.toRadians(ang);// El �ngulo es convertido a radianes
			medTriang.setLad1(lad1);// La medida del lado 1 es enviada al objeto
			medTriang.setLad2(lad2);// La medida del lado 2 es enviada al objeto
			medTriang.setAng(ang);// El �ngulo es enviado al objeto
			System.out.println("La medida del tercer lado del tri�ngulo, siendo un lado de " + medTriang.getLad1()
					+ " y el segundo de " + medTriang.getLad2() + " y el �ngulo que comparten de " + angorig + "� es "
					+ medTriang.getLad3() + " unidades"); // Se imprime en pantalla la medida del lado 3, utilizando el
															// m�todo getter del objeto
			System.out.println("Si quiere salir presione 1\nSi quiere hacer otro c�lculo presione 0.");
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
