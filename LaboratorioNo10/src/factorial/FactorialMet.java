/*
	 * Programa: Plantilla que calcula el factorial de un numero
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  20 de nov de 2020.
*/
package factorial;

public class FactorialMet {
	// Inicializacion de variables privadas
	private double num;
	private int ini;

//Metodos getters y setters
	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public int getIni() {
		return ini;
	}

	public void setIni(int ini) {
		this.ini = ini;
		if (ini == 0) {// Si la opcion enviada es cero se llama al metodo que calcula el factorial con
						// recursividad
			System.out.println(factoRer(num));
		}
		if (ini == 1) {// Si la opcion enviada es uno se llama al metodo que calcula el factorial con
						// iteracion
			System.out.println(factoIter(num));
		}
	}

	public double factoRer(double num) {// Metodo que calcula el factorial de modo recursivo
		if (num == 0) {// Si el numero es 0 su factorial sera 1
			return 1;
		} else {
			return num * factoRer(num - 1); // Se retorna y se llama al metodo que calcula el factorial con parametro
											// numero -1 y se multiplica por el numero en cuestion
		}

	}

	public double factoIter(double num) { // Metodo que calcula el factorial de modo iterativo
		if (num == 0) {// Si el numero es 0 su factorial sera 1
			return 1;
		} else {
			double aux = 1;
			for (double i = num; i > 0; i--) {// Se recorre desde el numero ingresado hasta el numero 1 en sentido
												// inverso
				aux = aux * i;// Se multiplica el iterador por el factorial que este en aux
			}
			num = aux;

			return num;
		}

	}

}
