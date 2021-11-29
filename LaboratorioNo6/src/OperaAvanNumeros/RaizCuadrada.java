/*
	 * Programa: Plantilla que calcula la raíz cuadrada
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 28 oct de 2020.
*/
package OperaAvanNumeros;

public class RaizCuadrada {
	// Inicialización de variables privadas
	private double num = 0;

	public void setNum(double num) {// Método setter del número
		this.num = num;
	}

	public double getNum() {// Método getter del número
		calculoRaiz();
		return this.num;
	}

	public void calculoRaiz() {// Método que calcula la raíz cuadrada de un número
		this.num = Math.sqrt(num);
	}
}
