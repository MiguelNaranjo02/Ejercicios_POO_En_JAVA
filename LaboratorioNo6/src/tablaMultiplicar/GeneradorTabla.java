/*
	 * Programa: Plantilla que genera tabla de multiplicar
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 28 oct de 2020.
*/
package tablaMultiplicar;

public class GeneradorTabla {
	// Inicializaci�n de variables privadas
	private int num1;
	private int num2;
	private int mult;

	public String gentab() {// M�todo que genera la tabla de multiplicar seg�n el intervalo y el m�ltiplo
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

	public int getNum1() {// M�todo getter del l�mite inferior
		return num1;
	}

	public void setNum1(int num1) {// M�todo getter del l�mite inferior
		this.num1 = num1;
	}

	public int getNum2() {// M�todo getter del l�mite superior
		return num2;
	}

	public void setNum2(int num2) {// M�todo setter del l�mite superior
		this.num2 = num2;
	}

	public int getMult() {// M�todo getter del m�ltiplo
		return mult;
	}

	public void setMult(int mult) {// M�todo setter del m�ltiplo
		this.mult = mult;
	}

}
