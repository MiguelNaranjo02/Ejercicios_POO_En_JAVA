/*
	 * Programa: Plantilla que calcula el valor del cheque del empleado
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 28 oct de 2020.
*/
package chequeEmpleado;

public class CalculoCheque {
	// Inicializaci�n de variables privadas
	private double salario;

	public double getSalario() {// M�todo getter de salario
		CalculoSalario();
		return this.salario;
	}

	public void setSalario(double salario) {// M�todo setter de salario
		this.salario = salario;
	}

	public void CalculoSalario() {// M�todo que calcula el salario neto seg�n las ganancias en el mes de un
									// empleado
		if (this.salario < 500000.00) {// Si el salario es menor a 500000 se le dar� un bono del 25%
			this.salario = this.salario + (25 * this.salario) / 100;
		} else {// Si el salario es mayor a 500000 se le dar� un bono del 10%
			this.salario = this.salario + (10 * this.salario) / 100;
		}
	}
}
