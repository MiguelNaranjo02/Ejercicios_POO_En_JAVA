/*
	 * Programa: Plantilla que calcula el determinante de una matriz 3x3
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  20 de nov de 2020.
*/
package determinante3x3;

public class DeterminanteMet {
	// Se inicializan las variables privadas
	private int opc;
	private double deter = 0;
	// Se inicializa la matriz 3x3
	private double matriz[][] = new double[3][3];

	public int getOpc() {
		return opc;
	}

	public void setOpc(int opc) {// Segun la opcion se llama a una u otra funcion
		if (opc == 1) {
			System.out.println("El determinante de la matriz es: " + detIter());// Se imprime la determinante llamando a
																				// la funcion iterativa
		}
		if (opc == 0) {
			System.out.println("El determinante de la matriz es: " + detRec(matriz));// Se imprime la determinante
																						// llamando a la funcion
																						// recursiva
		}

		this.opc = opc;
	}

	public double[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(double[][] matriz) {
		this.matriz = matriz;
	}

	public double detIter() { // Metodo que calcula la determinante de manera iterativa usando el metodo de
								// Sarrus
		deter = 0;
		double aux = 1;
		for (int i = 0; i < 3; i++) {// Se recorre la diagonal principal multiplicando sus elementos
			aux = aux * matriz[i][i];
		}
		deter = deter + aux;// Se le suma el producto de la diagonal al determinante
		aux = 1;

		for (int i = 1; i <= 3; i++) {// Se recorre la segunda diagonal de la matriz
			if (i < 3) {
				aux = aux * matriz[i - 1][i];
			}
			if (i == 3) {// Si el iterador es mas grande que la matriz localiza la posicion de ultimo
							// valor
				aux = aux * matriz[i - 1][i - 3];
				i = 4;
			}

		}
		deter = deter + aux;
		aux = 1;

		for (int i = 2; i <= 4; i++) {// Recorre la tercera diagonal de la matriz
			if (i < 3) {
				aux = aux * matriz[i - 2][i];
			}
			if (i >= 3) {// Si el iterador es mas grande que la matriz, localiza la posicion de los
							// valores restantes
				aux = aux * matriz[i - 2][i - 3];
				i = i + 1;
				aux = aux * matriz[i - 2][i - 3];
			}

		}
		deter = deter + aux;
		aux = 1;
		for (int i = 1; i >= -2; i--) {// Recorre la ultima diagonal en sentido contrario
			if (i > 0) {
				aux = aux * matriz[i - 1][i];
				aux = aux * matriz[i][i - 1];
			}
			if (i == 0) {// Localiza el elemento restante
				aux = aux * matriz[i + 2][i + 2];
			}

		}
		deter = deter - aux; // Se le resta al valor del determinante el valor calculado en la diagonal
		aux = 1;
		for (int i = 0; i >= -3; i--) {// Recorre la penultima diagonal en sentido contrario
			if (i == 0) {
				aux = aux * matriz[i][i];
			}
			if (i >= 0) {
				aux = aux * matriz[i + 1][i + 2];
				aux = aux * matriz[i + 2][i + 1];
			}

		}
		deter = deter - aux;
		aux = 1;
		for (int i = 2; i >= 2; i--) {// Recorre la antepenultima diagonal en sentido contrario
			aux = aux * matriz[i - 2][i];
			aux = aux * matriz[i - 1][i - 1];
			aux = aux * matriz[i][i - 2];
		}
		deter = deter - aux;
		aux = 1;

		return deter;
	}

	public double detRec(double matriz[][]) {// Metodo que calcula la determinante de manera recursiva reduciendo la
												// matriz a traves de
		deter = 0.0;
		if (matriz.length == 2) { // Si la matriz es de tamaño 2x2, se calcula facilmente su determinante
			deter = (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1]);
			return deter;
		}
		double deter = 0;
		for (int i = 0; i < matriz.length; i++) { // For que recorre las filas
			double[][] matCof = new double[matriz.length - 1][matriz.length - 1]; // Se crea una matriz de cofactores
																					// con una fila y una columna menos
			for (int j = 0; j < matriz.length; j++) {// For que recorre las columnas
				if (j != i) { // Si la posicion en j e i es diferente se llenara la matriz de cofactores
					for (int k = 1; k < matriz.length; k++) {
						int ind = -1;
						if (j < i) {// Si la posicion de las columnas es menor que las de las filas el indice sera
									// igual a la posicion j
							ind = j;
						} else if (j > i) {// Si la posicion de las columnas es mayor que las de las filas el indice
											// sera igual a la posicion j -1
							ind = j - 1;
						}
						matCof[ind][k - 1] = matriz[j][k];// Se guardaran los valores no tapados de la matriz mas grande
															// en la submatriz
					}
				}
			}
			if (i % 2 == 0)// Si la posicion de i es par se le sumara al determinante, el valor de la
							// matriz de la posicion y se le multiplicara una submatriz mas pequeña
				deter = deter + matriz[i][0] * detRec(matCof);
			else
				deter = deter - matriz[i][0] * detRec(matCof);// Si la posicion de i es par se le restara al
																// determinante, el valor de la matriz de la posicion y
																// se le multiplicara una submatriz mas pequeña
		}
		return deter;
	}
}
