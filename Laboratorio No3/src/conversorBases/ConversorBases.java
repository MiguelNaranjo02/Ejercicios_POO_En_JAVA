/*
	 * Programa: Conversor a diferentes bases
	 * Autor: Miguel Angel Naranjo Joya
	 * Fecha: 16 oct de 2020
*/
package conversorBases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConversorBases {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicializaci�n de variables
		int opc = 0;
		int dec;
		int reint = 0;
		String num = "";
		String numConv = "";
		System.out.println("Este programa hace diversas conversiones en distintas bases num�ricas");
		while (opc != 7) { // Bucle principal, el cual se detendr� cuando la variable opc sea igual a 7
			System.out.println("Seleccione una opci�n, digitando el numero de esta:");
			System.out.println("1. Sistema binario a sistema octal");
			System.out.println("2. Sistema octal a sistema hexadecimal");
			System.out.println("3. Sistema binario a sistema hexadecimal"); // Impresi�n en pantalla de opciones
			System.out.println("4. Sistema octal a sistema binario");
			System.out.println("5. Sistema hexadecimal a sistema octal");
			System.out.println("6. Sistema hexadecimal a sistema binario");
			System.out.println("7. Salir");
			opc = Integer.parseInt(in.readLine()); // El usuario ingresa la opci�n de su preferencia
			reint = 0;
			switch (opc) { // Seg�n la opci�n elegida por el usuario se har�n determinadas opciones con el
							// switch
			case 1: // Sistema binario a octal
				System.out.println("Selecciono sistema binario a sistema octal");
				while (reint == 0) { // Bucle del men� de la opci�n, en el cual se elige repetir el mismo tipo de
										// c�lculo o salir al men� principal
					System.out.println("Introduzca el n�mero en sistema binario");
					num = (in.readLine()); // Introducci�n del n�mero a convertir por el usuario
					dec = Integer.parseInt(num, 2);// El n�mero ingresado por el usuario, con la base seleccionada, es
													// convertida a un n�mero decimal
					numConv = Integer.toOctalString(dec); // El n�mero ingresado por el usuario convertido a decimal, es
															// convertido una vez mas a la base solicitada
					System.out.println(num + " en sistema octal es: " + numConv); // Se imprime en pantalla la
																					// conversi�n del n�mero
					System.out.println(// Men� en el cual se le pregunta al usuario si quiere volver a hacer un c�lculo
										// del mismo tipo

							"Si quiere hacer otro c�lculo con la misma opci�n, presione 0\nSi quiere salir al men� anterior presione 1");
					reint = Integer.parseInt(in.readLine()); // Se lee la opci�n del submen� tomada por el usuario
					while (reint != 0 & reint != 1) {// Bucle que valida la opci�n tomada por el usuario respecto al
														// submen�
						System.out.println("Opci�n invalida");
						System.out.println(
								"Si quiere hacer otro c�lculo con la misma opci�n, presione 0\nSi quiere salir al men� anterior presione 1");
						reint = Integer.parseInt(in.readLine());
					}
				}
				break;
			case 2:
				System.out.println("Selecciono sistema octal a sistema hexadecimal");
				while (reint == 0) {
					System.out.println("Introduzca el n�mero en sistema octal");
					num = (in.readLine()); // Introducci�n del n�mero a convertir por el usuario
					dec = Integer.parseInt(num, 8);// El n�mero ingresado por el usuario, con la base seleccionada, es
					// convertida a un n�mero decimal

					numConv = Integer.toHexString(dec);// El n�mero ingresado por el usuario convertido a decimal, es
					// convertido una vez mas a la base solicitada
					System.out.println(num + " en sistema hexadecimal es: " + numConv);// Se imprime en pantalla la
					// conversi�n del n�mero
					System.out.println(
							"Si quiere hacer otro c�lculo con la misma opci�n, presione 0\nSi quiere salir al men� anterior presione 1");
					reint = Integer.parseInt(in.readLine());
					while (reint != 0 & reint != 1) {
						System.out.println("Opci�n invalida");
						System.out.println(
								"Si quiere hacer otro c�lculo con la misma opci�n, presione 0\nSi quiere salir al men� anterior presione 1");
						reint = Integer.parseInt(in.readLine());
					}
				}
				break;
			case 3:
				System.out.println("Selecciono sistema binario a sistema hexadecimal");
				while (reint == 0) {
					System.out.println("Introduzca el n�mero en sistema binario");
					num = (in.readLine()); // Introducci�n del n�mero a convertir por el usuario
					dec = Integer.parseInt(num, 2);// El n�mero ingresado por el usuario, con la base seleccionada, es
					// convertida a un n�mero decimal
					numConv = Integer.toHexString(dec);// El n�mero ingresado por el usuario convertido a decimal, es
					// convertido una vez mas a la base solicitada
					System.out.println(num + " en sistema hexadecimal es: " + numConv);// Se imprime en pantalla la
					// conversi�n del n�mero
					System.out.println(
							"Si quiere hacer otro c�lculo con la misma opci�n, presione 0\nSi quiere salir al men� anterior presione 1");
					reint = Integer.parseInt(in.readLine());
					while (reint != 0 & reint != 1) {
						System.out.println("Opci�n invalida");
						System.out.println(
								"Si quiere hacer otro c�lculo con la misma opci�n, presione 0\nSi quiere salir al men� anterior presione 1");
						reint = Integer.parseInt(in.readLine());
					}
				}
				break;
			case 4:
				System.out.println("Selecciono sistema octal a sistema binario");
				while (reint == 0) {
					System.out.println("Introduzca el n�mero en sistema octal");
					num = (in.readLine()); // Introducci�n del n�mero a convertir por el usuario
					dec = Integer.parseInt(num, 8);// El n�mero ingresado por el usuario, con la base seleccionada, es
					// convertida a un n�mero decimal
					numConv = Integer.toBinaryString(dec);// El n�mero ingresado por el usuario convertido a decimal, es
					// convertido una vez mas a la base solicitada
					System.out.println(num + " en sistema binario es: " + numConv);// Se imprime en pantalla la
					// conversi�n del n�mero
					System.out.println(
							"Si quiere hacer otro c�lculo con la misma opci�n, presione 0\nSi quiere salir al men� anterior presione 1");
					reint = Integer.parseInt(in.readLine());
					while (reint != 0 & reint != 1) {
						System.out.println("Opci�n invalida");
						System.out.println(
								"Si quiere hacer otro c�lculo con la misma opci�n, presione 0\nSi quiere salir al men� anterior presione 1");
						reint = Integer.parseInt(in.readLine());
					}
				}
				break;
			case 5:
				System.out.println("Selecciono sistema hexadecimal a sistema octal");
				while (reint == 0) {
					System.out.println("Introduzca el n�mero en sistema hexadecimal");
					num = (in.readLine()); // Introducci�n del n�mero a convertir por el usuario
					dec = Integer.parseInt(num, 16);// El n�mero ingresado por el usuario, con la base seleccionada, es
					// convertida a un n�mero decimal
					numConv = Integer.toOctalString(dec);// El n�mero ingresado por el usuario convertido a decimal, es
					// convertido una vez mas a la base solicitada
					System.out.println(num + " en sistema octal es: " + numConv);// Se imprime en pantalla la
					// conversi�n del n�mero
					System.out.println(
							"Si quiere hacer otro c�lculo con la misma opci�n, presione 0\nSi quiere salir al men� anterior presione 1");
					reint = Integer.parseInt(in.readLine());
					while (reint != 0 & reint != 1) {
						System.out.println("Opci�n invalida");
						System.out.println(
								"Si quiere hacer otro c�lculo con la misma opci�n, presione 0\nSi quiere salir al men� anterior presione 1");
						reint = Integer.parseInt(in.readLine());
					}
				}
				break;
			case 6:
				System.out.println("Selecciono sistema hexadecimal a sistema binario");
				while (reint == 0) {
					System.out.println("Introduzca el n�mero en sistema hexadecimal");
					num = (in.readLine()); // Introducci�n del n�mero a convertir por el usuario
					dec = Integer.parseInt(num, 16);// El n�mero ingresado por el usuario, con la base seleccionada, es
					// convertida a un n�mero decimal
					numConv = Integer.toBinaryString(dec);// El n�mero ingresado por el usuario convertido a decimal, es
					// convertido una vez mas a la base solicitada
					System.out.println(num + " en sistema binario es: " + numConv);// Se imprime en pantalla la
					// conversi�n del n�mero
					System.out.println(
							"Si quiere hacer otro c�lculo con la misma opci�n, presione 0\nSi quiere salir al men� anterior presione 1");
					reint = Integer.parseInt(in.readLine());
					while (reint != 0 & reint != 1) {
						System.out.println("Opci�n invalida");
						System.out.println(
								"Si quiere hacer otro c�lculo con la misma opci�n, presione 0\nSi quiere salir al men� anterior presione 1");
						reint = Integer.parseInt(in.readLine());
					}
				}
				break;
			case 7:
				System.out.println("Muchas gracias"); // Despedida
				break;
			default:
				System.out.println("Opci�n invalida"); // Validaci�n de que el usuario seleccione un valor
														// correspondiente al men�
			}
		}
	}
}
