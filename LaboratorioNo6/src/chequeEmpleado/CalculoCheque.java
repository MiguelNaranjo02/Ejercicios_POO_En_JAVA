/*
	 * Programa: Plantilla que calcula el valor del cheque del empleado
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 28 oct de 2020.
*/
package chequeEmpleado;

public class CalculoCheque {
	// Inicialización de variables privadas
	private double salario;

	public double getSalario() {// Método getter de salario
		CalculoSalario();
		return this.salario;
	}

	public void setSalario(double salario) {// Método setter de salario
		this.salario = salario;
	}

	public void CalculoSalario() {// Método que calcula el salario neto según las ganancias en el mes de un
									// empleado
		if (this.salario < 500000.00) {// Si el salario es menor a 500000 se le dará un bono del 25%
			this.salario = this.salario + (25 * this.salario) / 100;
		} else {// Si el salario es mayor a 500000 se le dará un bono del 10%
			this.salario = this.salario + (10 * this.salario) / 100;
		}
	}
}
