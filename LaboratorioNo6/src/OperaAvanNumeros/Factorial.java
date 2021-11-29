/*
	 * Programa: Plantilla que calcula el factorial
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 28 oct de 2020.
*/
package OperaAvanNumeros;

public class Factorial {
	// Inicializaci�n de variable privada
	private double num = 0;

	public void setNum(double num) {// M�todo setter del n�mero
		this.num = num;
	}

	public void calculoFact() {// M�todo que calcula el factorial del n�mero

		double aux = 1;
		for (double i = this.num; i > 0; i--) {
			aux = aux * i;
		}
		this.num = aux;
	}

	public double getNum() {// M�todo getter del n�mero
		calculoFact();
		return this.num;
	}

}
