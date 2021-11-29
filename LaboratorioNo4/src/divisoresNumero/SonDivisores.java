/*
	 * Plantilla: Calcula los divisores de un Numero.
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 21 oct de 2020.
*/
package divisoresNumero;

public class SonDivisores {
	// Inicialización de variables
	String aux = " ";
	String div = "";

	public String esDivisor(int num) {// Método que guarda en un string los divisores de un número
		String aux = " ";
		String div = "";
		for (int i = 1; i <= num; i++) {// Bucle que revisa los números que dividen al número mandado por el main
			if (num % i == 0) {// Si el módulo entre el número y la variable de control es igual a 0, la
								// variable de control se concatenara a un string
				aux = " " + i;
				div = div + aux;

			}

		}
		if (num == 0) {// Excepción del número 0
			div = " Cero no tiene divisores.";
		}

		return div;// Retorna al main en variable string los divisores del número
	}

}
