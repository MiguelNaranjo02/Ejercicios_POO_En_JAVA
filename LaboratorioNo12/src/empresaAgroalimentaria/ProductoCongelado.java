/*
	 * Programa: Subclase que se especializa en productos congelados
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  27 de nov de 2020.
*/
package empresaAgroalimentaria;

import java.util.ArrayList;

public class ProductoCongelado extends Producto {
	// Creacion de ArrayList

	protected ArrayList<Double> tempReco;

	public ProductoCongelado() {// Metodo constructor
		tempReco = new ArrayList<Double>();
	}

	// Metodos getters y setters
	public ArrayList<Double> getTempReco() {
		return tempReco;
	}

	public void setTempReco(ArrayList<Double> tempReco) {
		this.tempReco = tempReco;
	}

	public String imprimir() {// Metodo que imprime la informacion de los productos congelados
		info = "              Productos Congelados \n";
		for (int i = 0; i < nomProd.size(); i++) {

			info = info + "Nombre del producto: " + nomProd.get(i) + "\n";
			info = info + "Fecha de caducidad: " + fechaCad.get(i) + "\n";
			info = info + "Numero de lote: " + numLote.get(i) + "\n";
			info = info + "Temperatura de congelacion recomendada: " + tempReco.get(i) + "\n";
			info = info + "------------------------------\n";

		}

		return info;
	}

}
