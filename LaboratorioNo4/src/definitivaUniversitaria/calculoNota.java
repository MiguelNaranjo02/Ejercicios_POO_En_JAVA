/*
	 * Plantilla: Calcula la nota definitva con 3 notas.
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 21 oct de 2020.
*/
package definitivaUniversitaria;

public class calculoNota {
	// Inicializaci�n de variables
	double def = 0;
	String msj = "";

	public double calculoDefinitva(double nota1, double nota2, double nota3) {// M�todo que calcula la definitiva a
																				// partir de 3 notas par�metro
		def = nota1 * 0.30; // C�lculo de la equivalencia de la nota 1
		def = def + (nota2 * 0.30); // C�lculo de la equivalencia de la nota 2, sumada con la equivalencia de la
									// nota 1
		def = def + (nota3 * 0.40); // C�lculo de nota 3, sumada a las equivalencias sumadas de la nota 1 y la nota
									// 2
		def = Math.round(def * 10.0) / 10.0; // Redondeo de la nota a dos decimales
		return def;// Retorno de la nota definitiva al main
	}

	public String mensaje(Double defin) {// M�todo que selecciona un mensaje determinado a partir de un double par�metro
		if (defin >= 4.5) { // Selecciona un mensaje si el n�mero es mayor o igual a 4.5
			msj = "felicitaciones, usted llegar� lejos.";
		} else if (defin < 4.5 && defin >= 4.0) {// Selecciona un mensaje si el n�mero es mayor o igual a 4.0, y menor a
													// 4.5
			msj = "puede hacerlo mejor.";
		} else if (defin < 4.0 && defin >= 3.0) {// Selecciona un mensaje si el n�mero es mayor o igual a 3.0, y menor a
													// 4.0
			msj = "debe esforzarse mas.";
		} else if (defin < 3.0) {// Selecciona un mensaje si el numero es menor a 3.0
			msj = "debe repetir la asignatura.";
		}
		return msj;// Retorna el mensaje al main
	}

}
