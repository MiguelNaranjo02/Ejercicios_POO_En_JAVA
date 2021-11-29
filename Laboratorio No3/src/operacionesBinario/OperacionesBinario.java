/*
	 * Programa: Operaciones de binarios
	 * Autor: Miguel Angel Naranjo Joya
	 * Fecha: 16 oct de 2020
*/
package operacionesBinario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperacionesBinario {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicialización de variables
		int opc = 0;
		int dec1 = 0;
		int dec2 = 0;
		int resDec = 0;
		int reint = 0;
		String bin1 = "";
		String bin2 = "";
		String resBin = "";

		System.out.println("Este programa calcula operaciones aritméticas básicas con binarios");
		while (opc != 5) {// Bucle principal, el cual se detendrá cuando la variable opc sea igual a 5
			System.out.println("Seleccione una opción, digitando el número de esta:");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación"); // Impresión en pantalla de opciones
			System.out.println("4. División");
			System.out.println("5. Salir");

			opc = Integer.parseInt(in.readLine()); // El usuario ingresa la opción de su preferencia
			reint = 0;
			switch (opc) {// Según la opción elegida por el usuario se harán determinadas operaciones
							// aritméticas
			case 1:
				while (reint == 0) {
					System.out.println("Ingrese el primer número en binario"); // El usuario ingresa el número binario
					bin1 = (in.readLine());
					System.out.println("Ingrese el segundo número en binario"); // El usuario ingresa el número binario
					bin2 = (in.readLine());
					dec1 = Integer.parseInt(bin1, 2); // El número binario es convertido en decimal
					dec2 = Integer.parseInt(bin2, 2); // El número binario es convertido en decimal
					resDec = dec1 + dec2; // Operación de los binarios convertidos a decimales
					resBin = Integer.toBinaryString(resDec); // El resultado en números decimales es convertido a
																// binario
					System.out.println(bin1 + " + " + bin2 + " = " + resBin); // Impresión en pantalla del resultado
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
				while (reint == 0) {
					System.out.println("Ingrese el primer número en binario");
					bin1 = (in.readLine());
					System.out.println("Ingrese el segundo número en binario");
					bin2 = (in.readLine());
					dec1 = Integer.parseInt(bin1, 2); // El número binario es convertido en decimal
					dec2 = Integer.parseInt(bin2, 2); // El número binario es convertido en decimal
					if (dec1 > dec2) {// Verificacion de cual número es mayor
						resDec = dec1 - dec2; // Operación de los binarios convertidos a decimales
						resBin = Integer.toBinaryString(resDec); // El resultado en números decimales es convertido a
						// binario
						System.out.println(bin1 + " - " + bin2 + " = " + resBin); // Impresión en pantalla del resultado
					} else {
						resDec = dec2 - dec1; // Operación de los binarios convertidos a decimales

						resBin = Integer.toBinaryString(resDec); // El resultado en números decimales es convertido a
																	// binario
						System.out.println(bin2 + " - " + bin1 + " = " + resBin); // Impresión en pantalla del resultado
					}
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
			case 3:
				while (reint == 0) {
					System.out.println("Ingrese el primer número en binario"); // El usuario ingresa el número binario
					bin1 = (in.readLine());
					System.out.println("Ingrese el segundo número en binario"); // El usuario ingresa el número binario
					bin2 = (in.readLine());
					dec1 = Integer.parseInt(bin1, 2);
					dec2 = Integer.parseInt(bin2, 2);
					resDec = dec1 * dec2; // Operación de los binarios convertidos a decimales
					resBin = Integer.toBinaryString(resDec); // El resultado en números decimales es convertido a
																// binario
					System.out.println(bin1 + " * " + bin2 + " = " + resBin);
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
			case 4:
				while (reint == 0) {
					System.out.println("Ingrese el primer número en binario"); // El usuario ingresa el número binario
					bin1 = (in.readLine());
					System.out.println("Ingrese el segundo número en binario"); // El usuario ingresa el número binario
					bin2 = (in.readLine());
					dec1 = Integer.parseInt(bin1, 2); // El número binario es convertido en decimal
					dec2 = Integer.parseInt(bin2, 2); // El número binario es convertido en decimal
					if (dec2 != 0) {
						resDec = dec1 / dec2; // Operación de los binarios convertidos a decimales
						resBin = Integer.toBinaryString(resDec);
						System.out.println(bin1 + " / " + bin2 + " = " + resBin); // Impresión en pantalla del resultado
					} else {
						System.out.println("No es posible una division entre cero"); // Impresión en pantalla de la
																						// verificación de la división
																						// entre cero
					}

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
			case 5:
				System.out.println("Muchas gracias"); // Despedida
				break;
			default:
				System.out.println("Opción invalida"); // Validación de que el usuario seleccione un valor
														// correspondiente al menú
			}
		}
	}
}
