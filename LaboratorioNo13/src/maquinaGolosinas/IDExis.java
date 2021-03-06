/*
	 * Programa: Plantilla que verifica si un ID existe
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 13 de dic de 2020
*/
package maquinaGolosinas;

import java.util.ArrayList;
import java.util.List;

public class IDExis {
	// Se crea un booleano para la funcion que verifica si existe el ID
	boolean siEsta = false;

	// Metodos getters y setters
	public boolean isSiEsta() {
		return siEsta;
	}

	public void setSiEsta(boolean siEsta) {
		this.siEsta = siEsta;
	}

	public List<String> getIdProd() {
		return idProd;
	}

	public void setIdProd(List<String> idProd) {
		this.idProd = idProd;
	}

	public List<Integer> getProdPrec() {
		return ProdPrec;
	}

	public void setProdPrec(List<Integer> prodPrec) {
		ProdPrec = prodPrec;
	}

	List<String> idProd = new ArrayList<String>() {// Se crea y se rellena el ArrayList con los IDs de la maquina
		{
			add("A1");
			add("A4");
			add("A8");
			add("B1");
			add("B3");
			add("B6");
			add("C5");
			add("C7");
			add("C9");
			add("D1");
			add("D2");
			add("D4");
		}
	};
	List<Integer> ProdPrec = new ArrayList<Integer>() {// Se crea y se rellena el ArrayList con los precios
														// correspondientes a los productos
		{
			add(1200);
			add(1000);
			add(1500);
			add(2000);
			add(1200);
			add(1400);
			add(1800);
			add(1700);
			add(4000);
			add(4500);
			add(700);
			add(1500);
		}
	};

	public boolean Existe(String id) {// Funcion que verifica si un ID existe en el ArrayList
		if (idProd.contains(id)) {
			siEsta = true;
		} else {
			siEsta = false;
		}
		return siEsta;
	}

}
