/*
	 * Programa: Plantilla que calcula la ra�z cuadrada
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 28 oct de 2020.
*/
package OperaAvanNumeros;

public class RaizCuadrada {
	// Inicializaci�n de variables privadas
	private double num = 0;

	public void setNum(double num) {// M�todo setter del n�mero
		this.num = num;
	}

	public double getNum() {// M�todo getter del n�mero
		calculoRaiz();
		return this.num;
	}

	public void calculoRaiz() {// M�todo que calcula la ra�z cuadrada de un n�mero
		this.num = Math.sqrt(num);
	}
}
