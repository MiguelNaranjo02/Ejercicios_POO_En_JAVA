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
		// Inicializaci�n de variables
		int opc = 0;
		int dec1 = 0;
		int dec2 = 0;
		int resDec = 0;
		int reint = 0;
		String bin1 = "";
		String bin2 = "";
		String resBin = "";

		System.out.println("Este programa calcula operaciones aritm�ticas b�sicas con binarios");
		while (opc != 5) {// Bucle principal, el cual se detendr� cuando la variable opc sea igual a 5
			System.out.println("Seleccione una opci�n, digitando el n�mero de esta:");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicaci�n"); // Impresi�n en pantalla de opciones
			System.out.println("4. Divisi�n");
			System.out.println("5. Salir");

			opc = Integer.parseInt(in.readLine()); // El usuario ingresa la opci�n de su preferencia
			reint = 0;
			switch (opc) {// Seg�n la opci�n elegida por el usuario se har�n determinadas operaciones
							// aritm�ticas
			case 1:
				while (reint == 0) {
					System.out.println("Ingrese el primer n�mero en binario"); // El usuario ingresa el n�mero binario
					bin1 = (in.readLine());
					System.out.println("Ingrese el segundo n�mero en binario"); // El usuario ingresa el n�mero binario
					bin2 = (in.readLine());
					dec1 = Integer.parseInt(bin1, 2); // El n�mero binario es convertido en decimal
					dec2 = Integer.parseInt(bin2, 2); // El n�mero binario es convertido en decimal
					resDec = dec1 + dec2; // Operaci�n de los binarios convertidos a decimales
					resBin = Integer.toBinaryString(resDec); // El resultado en n�meros decimales es convertido a
																// binario
					System.out.println(bin1 + " + " + bin2 + " = " + resBin); // Impresi�n en pantalla del resultado
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
				while (reint == 0) {
					System.out.println("Ingrese el primer n�mero en binario");
					bin1 = (in.readLine());
					System.out.println("Ingrese el segundo n�mero en binario");
					bin2 = (in.readLine());
					dec1 = Integer.parseInt(bin1, 2); // El n�mero binario es convertido en decimal
					dec2 = Integer.parseInt(bin2, 2); // El n�mero binario es convertido en decimal
					if (dec1 > dec2) {// Verificacion de cual n�mero es mayor
						resDec = dec1 - dec2; // Operaci�n de los binarios convertidos a decimales
						resBin = Integer.toBinaryString(resDec); // El resultado en n�meros decimales es convertido a
						// binario
						System.out.println(bin1 + " - " + bin2 + " = " + resBin); // Impresi�n en pantalla del resultado
					} else {
						resDec = dec2 - dec1; // Operaci�n de los binarios convertidos a decimales

						resBin = Integer.toBinaryString(resDec); // El resultado en n�meros decimales es convertido a
																	// binario
						System.out.println(bin2 + " - " + bin1 + " = " + resBin); // Impresi�n en pantalla del resultado
					}
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
			case 3:
				while (reint == 0) {
					System.out.println("Ingrese el primer n�mero en binario"); // El usuario ingresa el n�mero binario
					bin1 = (in.readLine());
					System.out.println("Ingrese el segundo n�mero en binario"); // El usuario ingresa el n�mero binario
					bin2 = (in.readLine());
					dec1 = Integer.parseInt(bin1, 2);
					dec2 = Integer.parseInt(bin2, 2);
					resDec = dec1 * dec2; // Operaci�n de los binarios convertidos a decimales
					resBin = Integer.toBinaryString(resDec); // El resultado en n�meros decimales es convertido a
																// binario
					System.out.println(bin1 + " * " + bin2 + " = " + resBin);
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
			case 4:
				while (reint == 0) {
					System.out.println("Ingrese el primer n�mero en binario"); // El usuario ingresa el n�mero binario
					bin1 = (in.readLine());
					System.out.println("Ingrese el segundo n�mero en binario"); // El usuario ingresa el n�mero binario
					bin2 = (in.readLine());
					dec1 = Integer.parseInt(bin1, 2); // El n�mero binario es convertido en decimal
					dec2 = Integer.parseInt(bin2, 2); // El n�mero binario es convertido en decimal
					if (dec2 != 0) {
						resDec = dec1 / dec2; // Operaci�n de los binarios convertidos a decimales
						resBin = Integer.toBinaryString(resDec);
						System.out.println(bin1 + " / " + bin2 + " = " + resBin); // Impresi�n en pantalla del resultado
					} else {
						System.out.println("No es posible una division entre cero"); // Impresi�n en pantalla de la
																						// verificaci�n de la divisi�n
																						// entre cero
					}

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
			case 5:
				System.out.println("Muchas gracias"); // Despedida
				break;
			default:
				System.out.println("Opci�n invalida"); // Validaci�n de que el usuario seleccione un valor
														// correspondiente al men�
			}
		}
	}
}
