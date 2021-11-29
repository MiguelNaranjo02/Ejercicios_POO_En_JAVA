/*
	 * Programa: Area del trapecio
	 * Autor: Miguel Angel Naranjo Joya
	 * Fecha: 7 oct de 2020
*/
package areaTrapecio;

public class AreaTrapecio {
	public static void main(String Arg[]) {
		// Inicializacion de variables
		double baseMenor = 1;
		double baseMayor = 2;
		double altura = 1;
		double areaFigura = 0;
		System.out.print("Este programa calcula el area del trapecio respecto a las medidas dadas. \n");

		if (altura <= 0 || baseMayor <= 0 || baseMenor <= 0) { // Validacion de medidas
			System.out.print("No se puede calcular el area del trapecio con las medidas dadas. \n");
		} else {
			// Calculo del area
			areaFigura = altura * (baseMenor + baseMayor) / 2;
			areaFigura = Math.round(areaFigura * 10.0) / 10.0;
			// Impresion en pantalla
			System.out
					.print("El area del trapecio con las medidas dadas es de: " + areaFigura + " metros cuadrados. \n");
		}
		System.out.print("Muchas gracias.");

	}

}