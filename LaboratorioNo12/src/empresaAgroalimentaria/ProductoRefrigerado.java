/*
	 * Programa: Subclase que se especializa en productos refrigerados
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  27 de nov de 2020.
*/
package empresaAgroalimentaria;

import java.util.ArrayList;

public class ProductoRefrigerado extends Producto {
	// Creacion del arrayList
	protected ArrayList<String> codSuperv;

	public ProductoRefrigerado() {// Metodo constructor
		codSuperv = new ArrayList<String>();
	}

//Metodos getters y setters
	public ArrayList<String> getCodSuperv() {
		return codSuperv;
	}

	public void setCodSuperv(ArrayList<String> codSuperv) {
		this.codSuperv = codSuperv;
	}

	public String imprimir() {// Metodo que imprime la informacion de los productos refrigerados
		info = "              Productos Refrigerados \n";
		for (int i = 0; i < nomProd.size(); i++) {

			info = info + "Nombre del producto: " + nomProd.get(i) + "\n";
			info = info + "Fecha de caducidad: " + fechaCad.get(i) + "\n";
			info = info + "Numero de lote: " + numLote.get(i) + "\n";
			info = info + "Codigo del organismo de supervision alimentaria: " + codSuperv.get(i) + "\n";
			info = info + "------------------------------\n";

		}

		return info;
	}
}
