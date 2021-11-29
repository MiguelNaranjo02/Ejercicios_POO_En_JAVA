/*
	 * Programa: Plantilla verifica números pares.
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 21 oct de 2020.
*/
package numeroImparYPar;

public class EsPar {
	boolean verificaPar(int num) {// Método que verifica si un numero es par
		if (num % 2 == 0) {// Si el módulo entre el número y 2 es 0 la clase retornara una bandera
							// verdadera, sino sera falsa
			return true;
		} else {
			return false;
		}

	}

}
