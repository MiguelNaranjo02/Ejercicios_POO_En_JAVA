/*
	 * Plantilla: Calcula los divisores de un Numero.
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 21 oct de 2020.
*/
package divisoresNumero;

public class SonDivisores {
	// Inicializaci�n de variables
	String aux = " ";
	String div = "";

	public String esDivisor(int num) {// M�todo que guarda en un string los divisores de un n�mero
		String aux = " ";
		String div = "";
		for (int i = 1; i <= num; i++) {// Bucle que revisa los n�meros que dividen al n�mero mandado por el main
			if (num % i == 0) {// Si el m�dulo entre el n�mero y la variable de control es igual a 0, la
								// variable de control se concatenara a un string
				aux = " " + i;
				div = div + aux;

			}

		}
		if (num == 0) {// Excepci�n del n�mero 0
			div = " Cero no tiene divisores.";
		}

		return div;// Retorna al main en variable string los divisores del n�mero
	}

}
