/*
	 * Programa: Calculadora de medias aritméticas
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 23 oct de 2020.
*/
package mediaDatos;

public class CalculoMedia {
	// Inicialización de variables publicas
	public int numDatos = 0;
	public double calcMedia = 0;
	public double sumDatos = 0;

	public double Media(boolean repet, double dato) {// Método que permite calcular la media, necesita dos parametros
		if (repet) {// Si el booleano es verdadero se hará el calculo
			numDatos = numDatos + 1;// Se acumula el número de datos
			sumDatos = sumDatos + dato;// Se suman los datos

		}
		calcMedia = sumDatos / numDatos;// Se divide la suma de datos entre el número de datos

		return calcMedia;// Se retorna el valor de la media
	}
}
