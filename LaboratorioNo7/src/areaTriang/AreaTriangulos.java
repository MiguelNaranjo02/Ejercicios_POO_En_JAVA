/*
	 * Programa: Programa que muestra el �rea de cualquier tri�ngulo
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  30 de oct de 2020.
*/
package areaTriang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaTriangulos {

	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicializaci�n de variables
		int reint = 0;
		double lad1;
		double lad2;
		double lad3;
		// Creaci�n del nuevo objeto
		CalculoArea triang = new CalculoArea();
			System.out.println("Este programa calcula el �rea de cualquier tri�ngulo a partir de sus 3 lados");
			do {
			System.out.print("Digite la medida del primer lado: ");
			lad1 = Double.parseDouble(in.readLine());// El usuario ingresa la medida del lado 1
			while (lad1 <= 0) {// Bucle de validaci�n de que el lado no sea menor o igual a cero
				System.out.println("El tri�ngulo no puede tener medidas menores o iguales a 0");
				System.out.print("Digite la medida del primer lado: ");
				lad1 = Double.parseDouble(in.readLine());

			}
			System.out.print("Digite la medida del segundo lado: ");
			lad2 = Double.parseDouble(in.readLine());// El usuario ingresa la medida del lado 2
			while (lad2 <= 0) {// Bucle de validaci�n de que el lado no sea menor o igual a cero
				System.out.println("El tri�ngulo no puede tener medidas menores o iguales a 0");
				System.out.print("Digite la medida del segundo lado: ");
				lad2 = Double.parseDouble(in.readLine());

			}
			System.out.print("Digite la medida del tercer lado: ");
			lad3 = Double.parseDouble(in.readLine());// El usuario ingresa la medida del lado 3
			while (lad3 <= 0) {// Bucle de validaci�n de que el lado no sea menor o igual a cero
				System.out.println("El tri�ngulo no puede tener medidas menores o iguales a 0");
				System.out.print("Digite la medida del tercer lado: ");
				lad3 = Double.parseDouble(in.readLine());

			}
			triang.setLad1(lad1);// La medida del lado uno es enviada al objeto
			triang.setLad2(lad2);// La medida del lado dos es enviada al objeto
			triang.setLad3(lad3);// La medida del lado tres es enviada al objeto
			if (triang.esTriang()) {// Llama al m�todo que verifica si con las medidas dadas se puede hacer un
									// triangulo
				System.out.println("El �rea del tri�ngulo con la medida de lado 1: " + triang.getLad1()
						+ ", medida del lado 2: " + triang.getLad2() + ", medida del lado 3: " + triang.getLad3()
						+ ", es: " + triang.getArea() + " unidades cuadradas");// Imprime en pantalla la medida del �rea
																				// del tri�ngulo llamando al m�todo que
																				// realiza esa funci�n
			} else {// Si el m�todo arroja que es falso se imprimir� este mensaje
				System.out.println("No se puede construir un tri�ngulo con las medidas dadas");
			}
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
