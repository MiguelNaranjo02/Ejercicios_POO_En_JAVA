/*
	 * Programa: Plantilla que calcula el logaritmo natural
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 28 oct de 2020.
*/
package OperaAvanNumeros;

public class LogaritmoNatural {
	// Inicialización de la variable privada número
	private double num = 0;

	public void setNum(double num) {// Método setter del número
		this.num = num;
	}

	public double getNum() {// Método getter del número
		calculoLog();
		return this.num;
	}

	public void calculoLog() {// Método que calcula el logaritmo del número
		this.num = Math.log(num);
	}
}
