/*
	 * Programa: Plantilla que encripta un mensaje
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  6 de nov de 2020.
*/
package encriptaCesar;

public class MetodoJulCesar {
	// Inicializaci�n de variables privadas
	private String abc = "abcdefghijklmn�opqrstuvwxyz";
	private char[] abcCarac = abc.toCharArray();
	private String palabraOrg = "";
	private String palabraEncrip = "";

	public String getAbc() {// M�todo getter del abecedario
		return abc;
	}

	public void setAbc(String abc) {// M�todo setter del abecedario
		this.abc = abc;
	}

	public char[] getAbcCarac() {// M�todo getter del arreglo de caracteres del abecedario
		return abcCarac;
	}

	public String getPalabraOrg() {// M�todo getter del String que contiene la palabra original en caracteres
		return palabraOrg;
	}

	public void setPalabraOrg(String palabraOrg) {// M�todo setter del String ue contiene la palabra original en
													// caracteres
		this.palabraOrg = palabraOrg;
	}

	public String getPalabraEncrip() {// M�todo getter de la palabra encriptada en caracteres
		return palabraEncrip;
	}

	public void setPalabraEncrip(String palabraEncrip) {// M�todo setter de la palabra encriptada
		this.palabraEncrip = palabraEncrip;
	}

	public void setAbcCarac(char[] abcCarac) {// M�todo setter del arreglo de caracteres del abecedario
		this.abcCarac = abcCarac;
	}

	public String palabrachar(char[] msjCarac) {// M�todo que convierte un arreglo de caracteres en un string usando un
												// for para recorrer el arreglo
		palabraOrg = "";

		for (int posArrPal = 0; posArrPal < msjCarac.length; posArrPal++) {
			palabraOrg = palabraOrg + msjCarac[posArrPal] + " ";

		}
		return palabraOrg;
	}

	public void encriptacion(char[] msjCarac, int corrimiento) {// M�todo que encripta una palabra
		for (int posArrPal = 0; posArrPal < msjCarac.length; posArrPal++) {// For que recorre el arreglo de caracteres
																			// de la palabra
			// Sentencia if que revisa si la posici�n en la palabra no tiene un espacio, una
			// coma, o un punto
			if (msjCarac[posArrPal] != ' ' && msjCarac[posArrPal] != '.' && msjCarac[posArrPal] != ',') {
				int posArrAbc = 0;
				while (msjCarac[posArrPal] != abcCarac[posArrAbc]
						// Bucle while que revisa si la letra en la palabra es la misma que en el
						// abecedario
						&& Character.toUpperCase(msjCarac[posArrPal]) != Character.toUpperCase(abcCarac[posArrAbc])) {
					posArrAbc = posArrAbc + 1;

				}
				if (posArrAbc + corrimiento >= abcCarac.length) {// Sentencia if que revisa si el corrimiento que queda
																	// por hacer es mayor que el tama�o del abecedario
					int auxCorrimiento = Math.abs(abcCarac.length - posArrAbc); // La cantidad de espacios que faltan
																				// por recorrer es igual a la longitud
																				// del abecedario menos la posici�n
																				// actual del abecedario
					posArrAbc = Math.abs(corrimiento - auxCorrimiento);// La posici�n en el abecedario ser� igual al
																		// corrimiento menos el auxiliar del corrimiento
				} else {
					posArrAbc = posArrAbc + corrimiento;// La posici�n del arreglo del abecedario es igual a la posici�n
														// del arreglo del abecedario m�s el corrimiento restante
				}

				if (Character.isUpperCase(msjCarac[posArrPal])) {// Si la letra en la palabra es may�scula, la letra que
																	// se le copee del abecedario ser� convertida a
																	// may�scula
					msjCarac[posArrPal] = Character.toUpperCase(abcCarac[posArrAbc]);

				} else {
					msjCarac[posArrPal] = abcCarac[posArrAbc];// La letra en la palabra ser� reemplazada por la letra en
																// el abecedario que este en la posici�n en cuesti�n
				}
			}

		}
	}

	public String retoEncript(char[] msjCarac, int corrimiento) {// M�todo que convierte un arreglo de caracteres en un
																	// string
		encriptacion(msjCarac, corrimiento);
		palabraEncrip = "";
		for (int posArrPal = 0; posArrPal < msjCarac.length; posArrPal++) {// Recorre el arreglo con un For
			palabraEncrip = palabraEncrip + msjCarac[posArrPal] + " ";
		}

		return palabraEncrip;
	}

}
