/*
	 * Programa: Volumen del cono
	 * Autor: Miguel Angel Naranjo Joya
	 * Fecha: 7 oct de 2020
*/
package volumenCono;

public class VolumenCono {
	public static void main(String Arg[]) {
		// Declaracion de variables
		double radioCono = 30;
		double alturaCono = 5;
		double volCon = 0;
		System.out.print("Este programa calcula el volumen de un cono, dadas sus medidas.\n");
		if (radioCono <= 0 || alturaCono <= 0) { // Validacion de medidas del cono
			System.out.print("El volumen del cono no se puede hallar con las medidas dadas."); // Impresion en pantalla
		} else {
			volCon = (float) ((Math.pow(radioCono, 2) * alturaCono * Math.PI) / 3); // Calculo del area del cono
			volCon = Math.round(volCon * 100.0) / 100.0; // Redondeo del area
			System.out.print("El volumen del cono es de " + volCon + " metros cubicos."); // Impresion en pantalla

		}
		System.out.print("\nMuchas gracias.");
	}

}
