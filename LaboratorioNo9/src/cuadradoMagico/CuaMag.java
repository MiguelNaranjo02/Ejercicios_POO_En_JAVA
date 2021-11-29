/*
	 * Programa: Plantilla que rellena un cuadro m�gico
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  11 de nov de 2020.
*/
package cuadradoMagico;

import java.util.ArrayList;

public class CuaMag {
	// Inicializamos variables privadas
	ArrayList<Integer> numPar;
	private int matriz[][];
	private int num[];
	private String mat = "";
	private int tam = 0;
	private int sumCua = 0;
	// M�todos getters y setters

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {

		this.matriz = matriz;
	}

	public void setNum(int[] num) {
		this.num = num;
	}

	public String getMat() {
		return mat;
	}

	public void setMat(String mat) {
		this.mat = mat;
	}

	public int getSumCua() {
		return sumCua;
	}

	public void setSumCua(int sumCua) {
		this.sumCua = sumCua;
	}

	public int[] getNum() {// Vector que contiene los n�meros que ir�n en el arreglo
		num = new int[(int) Math.pow(this.tam, 2)];// Se crea el vector con el tama�o del lado del cuadro m�gico al
													// cuadrado
		// Se crea un Arraylist de los n�meros pares que ir�n en el cuadro
		numPar = new ArrayList<Integer>(num.length);
		for (int i = 0; i < Math.pow(this.tam, 2); i++) {
			num[i] = i + 1;// Se llena el vector con todos los n�meros que van en el arreglo
		}
		for (int i = 1; i < Math.pow(this.tam, 2); i++) {
			// Se rellenan los vectores de n�meros pares
			if (i % 2 == 0) {
				numPar.add(i);
			}
		}

		return num;
	}

	public void CuaMagic() {// M�todo que llena el cuadro m�gico
		sumCua = (int) (this.tam * (Math.pow(this.tam, 2) + 1)) / 2;// Se calcula la constante magica
		for (int i = 0; i < this.tam; i++) {// Se rellena el cuadro con ceros
			for (int j = 0; j < this.tam; j++) {
				matriz[i][j] = 0;
			}
		}
		if (this.tam == 3) {// Se rellena de una forma si el cuadrado es de lado 3
			matriz[1][1] = num[num.length / 2];// Se posiciona el valor en el centro del cuadro
			// Se posicionan las esquinas del cuadro con los n�meros pares
			matriz[0][0] = numPar.get(0);
			numPar.remove(0); // Se borra el valor del arraylist
			matriz[0][2] = numPar.get(0);
			numPar.remove(0);
			matriz[2][0] = numPar.get(0);
			numPar.remove(0);
			matriz[2][2] = numPar.get(0);
			numPar.remove(0);
			// Se calcula el valor de la posici�n de los valores restantes a partir de lo
			// que debe dar la suma
			matriz[0][1] = sumCua - matriz[0][0] - matriz[0][2];
			matriz[1][0] = sumCua - matriz[0][0] - matriz[2][0];
			matriz[1][2] = sumCua - matriz[0][2] - matriz[2][2];
			matriz[2][1] = sumCua - matriz[0][1] - matriz[1][1];

		} else {// Se rellena de una forma si el cuadrado es de lado 4
			int l = 1;
			for (int i = 0; i < this.tam; i++) {// Se rellena el cuadrado con los n�meros del 1 al 16
				for (int j = 0; j < this.tam; j++) {
					matriz[i][j] = l;
					l = l + 1;
				}

			}
			// Se posicionan los valores en sus posiciones contrarias
			matriz[3][2] = matriz[0][1];
			matriz[0][2] = matriz[3][1];
			matriz[2][3] = matriz[1][0];
			matriz[2][0] = matriz[1][3];
			// Se calcula el valor de las posiciones restantes
			matriz[0][1] = sumCua - matriz[0][2] - matriz[0][3] - matriz[0][0];
			matriz[3][1] = sumCua - matriz[3][0] - matriz[3][2] - matriz[3][3];
			matriz[1][0] = sumCua - matriz[0][0] - matriz[2][0] - matriz[3][0];
			matriz[1][3] = sumCua - matriz[1][0] - matriz[1][1] - matriz[1][2];
		}

	}

	public String imprimir() {// M�todo que devuelve un string del arreglo
		matriz = new int[this.tam][this.tam];
		CuaMagic();// Se llama al m�todo que rellena el cuadro m�gico
		mat = "";
		for (int i = 0; i < this.tam; i++) {
			for (int j = 0; j < this.tam; j++) {
				mat = mat + matriz[i][j] + "      ";
			}
			mat = mat + "\n";// Se concatena el arreglo en un String
		}

		return mat;
	}

}
