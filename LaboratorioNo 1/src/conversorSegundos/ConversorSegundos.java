/*
	 * Programa: Conversor segundos
	 * Autor: Miguel Angel Naranjo Joya
	 * Fecha: 7 oct de 2020
*/
package conversorSegundos;

public class ConversorSegundos {
	public static void main(String Arg[]) {
		// Declaracion de variables
		double segundos = 85062;
		double dias = 0;
		double horas = 0;
		double minutos = 0;

		double resTiempo = 0;

		dias = (int) (segundos / 86400); // Calculo de dias respecto a los segundos
		resTiempo = segundos % 86400; // El tiempo restante de los dias se guarda en una variable
		horas = (int) resTiempo / 3600; // Calculo de horas respecto a los segundos restantes
		resTiempo = resTiempo % 3600; // El tiempo restante de las horas se guarda en una variable
		minutos = (int) resTiempo / 60; // Calculo de minutos respecto a los segundos restantes
		resTiempo = resTiempo % 60; // Calculo de los segundos restantes

		System.out
				.print("Este programa calcula cuantos dias, horas, y minutos, se completan con los segundos dados. \n");
		if (segundos < 0) { // Validacion de datos
			System.out.println(" No se pueden calcular los dias, horas y minutos con el valor dado.");
		} else {
			// Impresion en pantalla
			System.out.print((int) segundos + " segundos, equivalen a: \n");
			System.out.println((int) dias + " dias.");
			System.out.println((int) horas + " horas.");
			System.out.println((int) minutos + " minutos.");
			System.out.println((int) resTiempo + " segundos.");

		}
		System.out.print("Muchas gracias.");
	}

}
