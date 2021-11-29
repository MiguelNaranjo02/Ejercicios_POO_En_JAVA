/*
	 * Programa: Plantilla que verifica si una frase es Palíndroma
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  11 de nov de 2020.
*/
package frasesPalindromas;

import java.text.Normalizer;

public class esPalindromo {
	// Inicialización de variables privadas
	private String msjOrg = "";
	private String msjOrgLim = "";
	private String msjReves = "";
	private boolean sies = false;
	private char[] msjOrgLimCarac;
	private char[] msjOrgCarac;
	private char[] msjRevesCarac;

	// Métodos Getters y Setters
	public String getMsjOrg() {
		return msjOrg;
	}

	public void setMsjOrg(String msjOrg) {
		this.msjOrg = msjOrg;
	}

	public String getMsjOrgLim() {
		return msjOrgLim;
	}

	public void setMsjOrgLim(String msjOrgLim) {
		this.msjOrgLim = msjOrgLim;
	}

	public String getMsjReves() {
		return msjReves;
	}

	public void setMsjReves(String msjReves) {
		this.msjReves = msjReves;
	}

	public char[] getMsjOrgLimCarac() {
		return msjOrgLimCarac;
	}

	public void setMsjOrgLimCarac(char[] msjOrgLimCarac) {
		this.msjOrgLimCarac = msjOrgLimCarac;
	}

	public char[] getMsjOrgCarac() {
		return msjOrgCarac;
	}

	public void setMsjOrgCarac(char[] msjOrgCarac) {
		this.msjOrgCarac = msjOrgCarac;
	}

	public char[] getMsjRevesCarac() {
		return msjRevesCarac;
	}

	public void setMsjRevesCarac(char[] msjRevesCarac) {
		this.msjRevesCarac = msjRevesCarac;
	}

	public boolean isSies() {
		return sies;
	}

	public void setSies(boolean sies) {
		this.sies = sies;
	}

	public String metMsjCar(String msjOrg) {// Método que limpia los caracteres y transforma un mensaje en un arreglo de
											// char
		msjOrgLim = "";
		// Método que elimina los símbolos del mensaje y solo deja las letras
		msjOrg = msjOrg.replace(" ", "");
		msjOrg = msjOrg.replace(",", "");
		msjOrg = msjOrg.replace("?", "");
		msjOrg = msjOrg.replace("¿", "");
		msjOrg = msjOrg.replace("!", "");
		msjOrg = msjOrg.replace("¡", "");
		msjOrg = msjOrg.replace(".", "");
		// Método que limpia las letras con tildes
		msjOrg = Normalizer.normalize(msjOrg, Normalizer.Form.NFD);
		msjOrg = msjOrg.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

		msjOrgCarac = msjOrg.toCharArray();// El mensaje en string es pasado a un arreglo de char
		for (int i = 0; i < msjOrgCarac.length; i++) {
			if (Character.isUpperCase(msjOrgCarac[i])) {// Los caracteres del arreglo son pasados a minuscula
				msjOrgCarac[i] = Character.toLowerCase(msjOrgCarac[i]);
			}

			msjOrgLim = msjOrgLim + msjOrgCarac[i] + " ";
		}
		return msjOrgLim;
	}

	public String metMsjReves() {// Método que invierte un arreglo de caracteres
		msjReves = "";
		metMsjCar(msjOrg);// Llama al método que limpia el arreglo
		msjRevesCarac = new char[msjOrgCarac.length];
		for (int j = 0, i = msjOrgCarac.length - 1; i >= 0; i--, j++) {
			msjRevesCarac[j] = msjOrgCarac[i];
			msjReves = msjReves + msjRevesCarac[j] + " ";
		}
		return msjReves;
	}

	public boolean siPalindromo() {// Método que compara dos vectores
		int aux = 0;
		for (int i = 0; i < msjRevesCarac.length; i++) {
			if (msjRevesCarac[i] == msjOrgCarac[i]) {
				aux = aux + 1;
			}
		}
		if (aux == msjRevesCarac.length) {// Si el contador es igual al número de caracteres entonces es un Palíndromo
			sies = true;
		} else {
			sies = false;
		}

		return sies;
	}

}
