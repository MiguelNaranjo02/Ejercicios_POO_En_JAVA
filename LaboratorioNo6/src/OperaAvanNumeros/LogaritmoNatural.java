/*
	 * Programa: Plantilla que calcula el logaritmo natural
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 28 oct de 2020.
*/
package OperaAvanNumeros;

public class LogaritmoNatural {
	// Inicializaci�n de la variable privada n�mero
	private double num = 0;

	public void setNum(double num) {// M�todo setter del n�mero
		this.num = num;
	}

	public double getNum() {// M�todo getter del n�mero
		calculoLog();
		return this.num;
	}

	public void calculoLog() {// M�todo que calcula el logaritmo del n�mero
		this.num = Math.log(num);
	}
}
