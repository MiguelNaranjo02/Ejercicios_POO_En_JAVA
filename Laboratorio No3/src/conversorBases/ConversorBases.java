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
		// Inicialización de variables
		int opc = 0;
		int dec;
		int reint = 0;
		String num = "";
		String numConv = "";
		System.out.println("Este programa hace diversas conversiones en distintas bases numéricas");
		while (opc != 7) { // Bucle principal, el cual se detendrá cuando la variable opc sea igual a 7
			System.out.println("Seleccione una opción, digitando el numero de esta:");
			System.out.println("1. Sistema binario a sistema octal");
			System.out.println("2. Sistema octal a sistema hexadecimal");
			System.out.println("3. Sistema binario a sistema hexadecimal"); // Impresión en pantalla de opciones
			System.out.println("4. Sistema octal a sistema binario");
			System.out.println("5. Sistema hexadecimal a sistema octal");
			System.out.println("6. Sistema hexadecimal a sistema binario");
			System.out.println("7. Salir");
			opc = Integer.parseInt(in.readLine()); // El usuario ingresa la opción de su preferencia
			reint = 0;
			switch (opc) { // Según la opción elegida por el usuario se harán determinadas opciones con el
							// switch
			case 1: // Sistema binario a octal
				System.out.println("Selecciono sistema binario a sistema octal");
				while (reint == 0) { // Bucle del menú de la opción, en el cual se elige repetir el mismo tipo de
										// cálculo o salir al menú principal
					System.out.println("Introduzca el número en sistema binario");
					num = (in.readLine()); // Introducción del número a convertir por el usuario
					dec = Integer.parseInt(num, 2);// El número ingresado por el usuario, con la base seleccionada, es
													// convertida a un número decimal
					numConv = Integer.toOctalString(dec); // El número ingresado por el usuario convertido a decimal, es
															// convertido una vez mas a la base solicitada
					System.out.println(num + " en sistema octal es: " + numConv); // Se imprime en pantalla la
																					// conversión del número
					System.out.println(// Menú en el cual se le pregunta al usuario si quiere volver a hacer un cálculo
										// del mismo tipo

							"Si quiere hacer otro cálculo con la misma opción, presione 0\nSi quiere salir al menú anterior presione 1");
					reint = Integer.parseInt(in.readLine()); // Se lee la opción del submenú tomada por el usuario
					while (reint != 0 & reint != 1) {// Bucle que valida la opción tomada por el usuario respecto al
														// submenú
						System.out.println("Opción invalida");
						System.out.println(
								"Si quiere hacer otro cálculo con la misma opción, presione 0\nSi quiere salir al menú anterior presione 1");
						reint = Integer.parseInt(in.readLine());
					}
				}
				break;
			case 2:
				System.out.println("Selecciono sistema octal a sistema hexadecimal");
				while (reint == 0) {
					System.out.println("Introduzca el número en sistema octal");
					num = (in.readLine()); // Introducción del número a convertir por el usuario
					dec = Integer.parseInt(num, 8);// El número ingresado por el usuario, con la base seleccionada, es
					// convertida a un número decimal

					numConv = Integer.toHexString(dec);// El número ingresado por el usuario convertido a decimal, es
					// convertido una vez mas a la base solicitada
					System.out.println(num + " en sistema hexadecimal es: " + numConv);// Se imprime en pantalla la
					// conversión del número
					System.out.println(
							"Si quiere hacer otro cálculo con la misma opción, presione 0\nSi quiere salir al menú anterior presione 1");
					reint = Integer.parseInt(in.readLine());
					while (reint != 0 & reint != 1) {
						System.out.println("Opción invalida");
						System.out.println(
								"Si quiere hacer otro cálculo con la misma opción, presione 0\nSi quiere salir al menú anterior presione 1");
						reint = Integer.parseInt(in.readLine());
					}
				}
				break;
			case 3:
				System.out.println("Selecciono sistema binario a sistema hexadecimal");
				while (reint == 0) {
					System.out.println("Introduzca el número en sistema binario");
					num = (in.readLine()); // Introducción del número a convertir por el usuario
					dec = Integer.parseInt(num, 2);// El número ingresado por el usuario, con la base seleccionada, es
					// convertida a un número decimal
					numConv = Integer.toHexString(dec);// El número ingresado por el usuario convertido a decimal, es
					// convertido una vez mas a la base solicitada
					System.out.println(num + " en sistema hexadecimal es: " + numConv);// Se imprime en pantalla la
					// conversión del número
					System.out.println(
							"Si quiere hacer otro cálculo con la misma opción, presione 0\nSi quiere salir al menú anterior presione 1");
					reint = Integer.parseInt(in.readLine());
					while (reint != 0 & reint != 1) {
						System.out.println("Opción invalida");
						System.out.println(
								"Si quiere hacer otro cálculo con la misma opción, presione 0\nSi quiere salir al menú anterior presione 1");
						reint = Integer.parseInt(in.readLine());
					}
				}
				break;
			case 4:
				System.out.println("Selecciono sistema octal a sistema binario");
				while (reint == 0) {
					System.out.println("Introduzca el número en sistema octal");
					num = (in.readLine()); // Introducción del número a convertir por el usuario
					dec = Integer.parseInt(num, 8);// El número ingresado por el usuario, con la base seleccionada, es
					// convertida a un número decimal
					numConv = Integer.toBinaryString(dec);// El número ingresado por el usuario convertido a decimal, es
					// convertido una vez mas a la base solicitada
					System.out.println(num + " en sistema binario es: " + numConv);// Se imprime en pantalla la
					// conversión del número
					System.out.println(
							"Si quiere hacer otro cálculo con la misma opción, presione 0\nSi quiere salir al menú anterior presione 1");
					reint = Integer.parseInt(in.readLine());
					while (reint != 0 & reint != 1) {
						System.out.println("Opción invalida");
						System.out.println(
								"Si quiere hacer otro cálculo con la misma opción, presione 0\nSi quiere salir al menú anterior presione 1");
						reint = Integer.parseInt(in.readLine());
					}
				}
				break;
			case 5:
				System.out.println("Selecciono sistema hexadecimal a sistema octal");
				while (reint == 0) {
					System.out.println("Introduzca el número en sistema hexadecimal");
					num = (in.readLine()); // Introducción del número a convertir por el usuario
					dec = Integer.parseInt(num, 16);// El número ingresado por el usuario, con la base seleccionada, es
					// convertida a un número decimal
					numConv = Integer.toOctalString(dec);// El número ingresado por el usuario convertido a decimal, es
					// convertido una vez mas a la base solicitada
					System.out.println(num + " en sistema octal es: " + numConv);// Se imprime en pantalla la
					// conversión del número
					System.out.println(
							"Si quiere hacer otro cálculo con la misma opción, presione 0\nSi quiere salir al menú anterior presione 1");
					reint = Integer.parseInt(in.readLine());
					while (reint != 0 & reint != 1) {
						System.out.println("Opción invalida");
						System.out.println(
								"Si quiere hacer otro cálculo con la misma opción, presione 0\nSi quiere salir al menú anterior presione 1");
						reint = Integer.parseInt(in.readLine());
					}
				}
				break;
			case 6:
				System.out.println("Selecciono sistema hexadecimal a sistema binario");
				while (reint == 0) {
					System.out.println("Introduzca el número en sistema hexadecimal");
					num = (in.readLine()); // Introducción del número a convertir por el usuario
					dec = Integer.parseInt(num, 16);// El número ingresado por el usuario, con la base seleccionada, es
					// convertida a un número decimal
					numConv = Integer.toBinaryString(dec);// El número ingresado por el usuario convertido a decimal, es
					// convertido una vez mas a la base solicitada
					System.out.println(num + " en sistema binario es: " + numConv);// Se imprime en pantalla la
					// conversión del número
					System.out.println(
							"Si quiere hacer otro cálculo con la misma opción, presione 0\nSi quiere salir al menú anterior presione 1");
					reint = Integer.parseInt(in.readLine());
					while (reint != 0 & reint != 1) {
						System.out.println("Opción invalida");
						System.out.println(
								"Si quiere hacer otro cálculo con la misma opción, presione 0\nSi quiere salir al menú anterior presione 1");
						reint = Integer.parseInt(in.readLine());
					}
				}
				break;
			case 7:
				System.out.println("Muchas gracias"); // Despedida
				break;
			default:
				System.out.println("Opción invalida"); // Validación de que el usuario seleccione un valor
														// correspondiente al menú
			}
		}
	}
}
