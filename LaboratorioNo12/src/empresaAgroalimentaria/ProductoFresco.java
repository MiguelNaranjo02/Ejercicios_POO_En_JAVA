/*
	 * Programa: Subclase que se especializa en productos frescos
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  27 de nov de 2020.
*/
package empresaAgroalimentaria;

import java.util.ArrayList;

public class ProductoFresco extends Producto {
	// Creacion de ArrayLists
	protected ArrayList<String> fechaEnvas;
	protected ArrayList<String> paisOrigen;

	public ProductoFresco() {// Metodo constructor
		fechaEnvas = new ArrayList<String>();
		paisOrigen = new ArrayList<String>();
	}

//Metodos getters y setters
	public ArrayList<String> getFechaEnvas() {
		return fechaEnvas;
	}

	public void setFechaEnvas(ArrayList<String> fechaEnvas) {
		this.fechaEnvas = fechaEnvas;
	}

	public ArrayList<String> getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(ArrayList<String> paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String imprimir() {// Metodo que imprime toda la informacion de los producto frescos
		info = "              Productos Frescos \n";
		for (int i = 0; i < nomProd.size(); i++) {

			info = info + "Nombre del producto: " + nomProd.get(i) + "\n";
			info = info + "Fecha de caducidad: " + fechaCad.get(i) + "\n";
			info = info + "Numero de lote: " + numLote.get(i) + "\n";
			info = info + "Fecha de envasado: " + fechaEnvas.get(i) + "\n";
			info = info + "Pais de origen: " + paisOrigen.get(i) + "\n";
			info = info + "------------------------------\n";

		}
		return info;
	}

}
