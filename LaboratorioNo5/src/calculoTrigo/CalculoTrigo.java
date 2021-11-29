/*
	 * Programa: Calculadora de funciones trigonom�tricas
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 23 oct de 2020.
*/
package calculoTrigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculoTrigo {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int reint = 0;
		// Creaci�n del nuevo objeto
		FuncionTrigo calculo = new FuncionTrigo();
		System.out.println("Este programa calcula la funci�n trigonom�trica de un �ngulo ingresado");
		do {// Bucle principal
			// Inicializaci�n de variables
			double ang;
			double angorig;
			int opc = 0;
			double aux = 0;
			System.out.print("Ingrese los grados: ");
			ang = Double.parseDouble(in.readLine());// El usuario ingresa un �ngulo
			angorig = ang;
			ang = Math.toRadians(ang); // El �ngulo es convertido a radianes

			System.out.println("Seleccione una opci�n digitando el numero ");
			System.out.println("1. Seno del �ngulo");
			System.out.println("2. Coseno del �ngulo");
			System.out.println("3. Tangente del �ngulo");
			System.out.println("4. Salir");
			opc = Integer.parseInt(in.readLine()); // El usuario selecciona una opci�n del men�

			while (opc != 1 && opc != 2 && opc != 3 && opc != 4) {// Bucle por si el usuario no selecciona una opci�n
																	// v�lida
				System.out.println("Seleccione una opci�n v�lida");
				System.out.println("Seleccione una opci�n digitando el numero ");
				System.out.println("1. Seno del �ngulo");
				System.out.println("2. Coseno del �ngulo");
				System.out.println("3. Tangente del �ngulo");
				System.out.println("4. Salir");
				opc = Integer.parseInt(in.readLine());
			}
			if (opc == 4) {// Si la opci�n del usuario es 4, el programa se saldr� del bucle do-while
				reint = 1;
			} else {
				aux = calculo.fTrigo(opc, ang); // El m�todo es llamado, mand�ndole los par�metros del �ngulo y de la
												// opci�n seleccionada
				if (aux == 2 && opc == 3) {// Verificaci�n por si la tangente del �ngulo no se puede obtener
					System.out.println("No se puede calcular la tangente de ese �ngulo");
				} else {
					if (opc == 1) {
						System.out.print("El seno de " + angorig + " es de: ");
					}
					if (opc == 2) {
						System.out.print("El coseno de " + angorig + " es de: ");
					}
					if (opc == 3) {
						System.out.print("La tangente de " + angorig + " es de: ");

					}
					System.out.print(aux + "\n");
				}

				System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificaci�n presione 0.");
				reint = Integer.parseInt(in.readLine());// El usuario ingresa una opci�n del men�
				while (reint != 0 && reint != 1) {// Verificaci�n de que el numero corresponda a las opciones del men�
					System.out.println("Opci�n invalida.");
					System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificaci�n presione 0.");
					reint = Integer.parseInt(in.readLine());

				}
			}

		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}
}
