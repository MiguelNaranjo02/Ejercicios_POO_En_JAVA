/*
	 * Programa: Plantilla que genera tabla de multiplicar
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 28 oct de 2020.
*/
package tablaMultiplicar;

public class GeneradorTabla {
	// Inicialización de variables privadas
	private int num1;
	private int num2;
	private int mult;

	public String gentab() {// Método que genera la tabla de multiplicar según el intervalo y el múltiplo
							// dado
		String tabf = "";
		String tab = "";
		int aux = 0;
		for (int i = num1; i <= num2; i++) {
			aux = mult * i;
			tab = mult + "*" + i + "=" + aux + "\n";
			tabf = tabf + tab;
		}

		return tabf;
	}

	public int getNum1() {// Método getter del límite inferior
		return num1;
	}

	public void setNum1(int num1) {// Método getter del límite inferior
		this.num1 = num1;
	}

	public int getNum2() {// Método getter del límite superior
		return num2;
	}

	public void setNum2(int num2) {// Método setter del límite superior
		this.num2 = num2;
	}

	public int getMult() {// Método getter del múltiplo
		return mult;
	}

	public void setMult(int mult) {// Método setter del múltiplo
		this.mult = mult;
	}

}
