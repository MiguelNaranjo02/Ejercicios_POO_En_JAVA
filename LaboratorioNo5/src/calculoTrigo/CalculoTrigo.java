/*
	 * Programa: Calculadora de funciones trigonométricas
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
		// Creación del nuevo objeto
		FuncionTrigo calculo = new FuncionTrigo();
		System.out.println("Este programa calcula la función trigonométrica de un ángulo ingresado");
		do {// Bucle principal
			// Inicialización de variables
			double ang;
			double angorig;
			int opc = 0;
			double aux = 0;
			System.out.print("Ingrese los grados: ");
			ang = Double.parseDouble(in.readLine());// El usuario ingresa un ángulo
			angorig = ang;
			ang = Math.toRadians(ang); // El ángulo es convertido a radianes

			System.out.println("Seleccione una opción digitando el numero ");
			System.out.println("1. Seno del ángulo");
			System.out.println("2. Coseno del ángulo");
			System.out.println("3. Tangente del ángulo");
			System.out.println("4. Salir");
			opc = Integer.parseInt(in.readLine()); // El usuario selecciona una opción del menú

			while (opc != 1 && opc != 2 && opc != 3 && opc != 4) {// Bucle por si el usuario no selecciona una opción
																	// válida
				System.out.println("Seleccione una opción válida");
				System.out.println("Seleccione una opción digitando el numero ");
				System.out.println("1. Seno del ángulo");
				System.out.println("2. Coseno del ángulo");
				System.out.println("3. Tangente del ángulo");
				System.out.println("4. Salir");
				opc = Integer.parseInt(in.readLine());
			}
			if (opc == 4) {// Si la opción del usuario es 4, el programa se saldrá del bucle do-while
				reint = 1;
			} else {
				aux = calculo.fTrigo(opc, ang); // El método es llamado, mandándole los parámetros del ángulo y de la
												// opción seleccionada
				if (aux == 2 && opc == 3) {// Verificación por si la tangente del ángulo no se puede obtener
					System.out.println("No se puede calcular la tangente de ese ángulo");
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

				System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificación presione 0.");
				reint = Integer.parseInt(in.readLine());// El usuario ingresa una opción del menú
				while (reint != 0 && reint != 1) {// Verificación de que el numero corresponda a las opciones del menú
					System.out.println("Opción invalida.");
					System.out.println("Si quiere salir presione 1\nSi quiere hacer otra verificación presione 0.");
					reint = Integer.parseInt(in.readLine());

				}
			}

		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}
}
