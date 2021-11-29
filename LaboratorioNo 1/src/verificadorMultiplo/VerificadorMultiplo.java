/*
	 * Programa: Verificador de Multiplo
	 * Autor: Miguel Angel Naranjo Joya
	 * Fecha: 7 oct de 2020
*/
package verificadorMultiplo;

public class VerificadorMultiplo {

	public static void main(String Arg[]) {
		// declaracion de variables
		int numMayor = 2;
		int numMenor = 4;
		System.out.print("Este programa verifica si un numero es multiplo de otro, o viceversa. \n");
		if (numMenor != 0 & numMayor != 0) { // Validacion de que ningun dato es igual a 0

			if (numMayor % numMenor == 0) { // Validacion de multiplo
				System.out.print("El numero " + numMayor + " si es multiplo de " + numMenor); // Impresion en pantalla
			} else {
				System.out.print("El numero " + numMayor + " no es multiplo de " + numMenor + " \n"); // Impresion en
																										// pantalla
				if (numMenor % numMayor == 0) { // Validacion de multiplo contraria
					System.out.print("El numero " + numMenor + " si es multiplo de " + numMayor); // Impresion en
																									// pantalla
				}
			}
		}
		System.out.print("\nMuchas gracias ");
	}
}
