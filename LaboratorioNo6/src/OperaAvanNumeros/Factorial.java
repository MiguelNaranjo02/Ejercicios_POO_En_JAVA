/*
	 * Programa: Plantilla que calcula el factorial
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 28 oct de 2020.
*/
package OperaAvanNumeros;

public class Factorial {
	// Inicialización de variable privada
	private double num = 0;

	public void setNum(double num) {// Método setter del número
		this.num = num;
	}

	public void calculoFact() {// Método que calcula el factorial del número

		double aux = 1;
		for (double i = this.num; i > 0; i--) {
			aux = aux * i;
		}
		this.num = aux;
	}

	public double getNum() {// Método getter del número
		calculoFact();
		return this.num;
	}

}
