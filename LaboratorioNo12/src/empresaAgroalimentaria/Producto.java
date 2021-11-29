/*
	 * Programa: Superclase de 3 tipos de productos de una empresa agroalimentaria
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  27 de nov de 2020.
*/
package empresaAgroalimentaria;

import java.util.ArrayList;

public class Producto {
	// Creacion de variables y arrayLists
	protected ArrayList<String> nomProd;
	protected ArrayList<String> fechaCad;
	protected ArrayList<Integer> numLote;
	protected String info;

	public Producto() {// Metodo constructor
		nomProd = new ArrayList<String>();
		fechaCad = new ArrayList<String>();
		numLote = new ArrayList<Integer>();
		info = "";
	}

//Metodos getters y setters
	public ArrayList<String> getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(ArrayList<String> fechaCad) {
		this.fechaCad = fechaCad;
	}

	public ArrayList<Integer> getNumLote() {
		return numLote;
	}

	public void setNumLote(ArrayList<Integer> numLote) {
		this.numLote = numLote;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
