/*
	 * Programa: Conversor de Dinero
	 * Autor: Miguel Angel Naranjo Joya
	 * Fecha: 7 oct de 2020
*/
package conversorDinero;

public class ConversorDinero {
	public static void main(String Arg[]) {
		// declaracion de variables
		double cantidadEuro = -1;
		double valorEuroaEU = 1.18;
		double valorEuroaPes = 4516.89;
		double dolares = 0;
		double pesos = 0;
		{
			System.out.print("Este programa calcula el valor de Euros en dolares y en pesos colombianos. \n");
			if (cantidadEuro < 0.0) {// Validacion de medidas
				System.out.print("La conversion no puede ser realizada, dado que no hay Euros negativos. ");

			} else {
				// conversion de euros a dolares
				dolares = cantidadEuro * valorEuroaEU;
				dolares = Math.round(dolares * 10) / 10.0; // redondeo de dolares

				// conversion de euros a pesos colombianos
				pesos = cantidadEuro * valorEuroaPes;
				pesos = Math.round(pesos * 10) / 10.0; // redondeo de pesos

				// Impresion en pantalla
				System.out.println(cantidadEuro + " Euros, en dolares corresponden a: " + dolares + " dolares.");
				System.out.println(
						cantidadEuro + " Euros, en pesos colombianos corresponden a: " + pesos + " pesos colombianos.");
				System.out.println("Muchas gracias.");
			}

		}
	}
}