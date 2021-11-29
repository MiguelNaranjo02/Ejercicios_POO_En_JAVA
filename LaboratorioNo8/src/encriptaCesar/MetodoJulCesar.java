/*
	 * Programa: Plantilla que encripta un mensaje
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  6 de nov de 2020.
*/
package encriptaCesar;

public class MetodoJulCesar {
	// Inicialización de variables privadas
	private String abc = "abcdefghijklmnñopqrstuvwxyz";
	private char[] abcCarac = abc.toCharArray();
	private String palabraOrg = "";
	private String palabraEncrip = "";

	public String getAbc() {// Método getter del abecedario
		return abc;
	}

	public void setAbc(String abc) {// Método setter del abecedario
		this.abc = abc;
	}

	public char[] getAbcCarac() {// Método getter del arreglo de caracteres del abecedario
		return abcCarac;
	}

	public String getPalabraOrg() {// Método getter del String que contiene la palabra original en caracteres
		return palabraOrg;
	}

	public void setPalabraOrg(String palabraOrg) {// Método setter del String ue contiene la palabra original en
													// caracteres
		this.palabraOrg = palabraOrg;
	}

	public String getPalabraEncrip() {// Método getter de la palabra encriptada en caracteres
		return palabraEncrip;
	}

	public void setPalabraEncrip(String palabraEncrip) {// Método setter de la palabra encriptada
		this.palabraEncrip = palabraEncrip;
	}

	public void setAbcCarac(char[] abcCarac) {// Método setter del arreglo de caracteres del abecedario
		this.abcCarac = abcCarac;
	}

	public String palabrachar(char[] msjCarac) {// Método que convierte un arreglo de caracteres en un string usando un
												// for para recorrer el arreglo
		palabraOrg = "";

		for (int posArrPal = 0; posArrPal < msjCarac.length; posArrPal++) {
			palabraOrg = palabraOrg + msjCarac[posArrPal] + " ";

		}
		return palabraOrg;
	}

	public void encriptacion(char[] msjCarac, int corrimiento) {// Método que encripta una palabra
		for (int posArrPal = 0; posArrPal < msjCarac.length; posArrPal++) {// For que recorre el arreglo de caracteres
																			// de la palabra
			// Sentencia if que revisa si la posición en la palabra no tiene un espacio, una
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
																	// por hacer es mayor que el tamaño del abecedario
					int auxCorrimiento = Math.abs(abcCarac.length - posArrAbc); // La cantidad de espacios que faltan
																				// por recorrer es igual a la longitud
																				// del abecedario menos la posición
																				// actual del abecedario
					posArrAbc = Math.abs(corrimiento - auxCorrimiento);// La posición en el abecedario será igual al
																		// corrimiento menos el auxiliar del corrimiento
				} else {
					posArrAbc = posArrAbc + corrimiento;// La posición del arreglo del abecedario es igual a la posición
														// del arreglo del abecedario más el corrimiento restante
				}

				if (Character.isUpperCase(msjCarac[posArrPal])) {// Si la letra en la palabra es mayúscula, la letra que
																	// se le copee del abecedario será convertida a
																	// mayúscula
					msjCarac[posArrPal] = Character.toUpperCase(abcCarac[posArrAbc]);

				} else {
					msjCarac[posArrPal] = abcCarac[posArrAbc];// La letra en la palabra será reemplazada por la letra en
																// el abecedario que este en la posición en cuestión
				}
			}

		}
	}

	public String retoEncript(char[] msjCarac, int corrimiento) {// Método que convierte un arreglo de caracteres en un
																	// string
		encriptacion(msjCarac, corrimiento);
		palabraEncrip = "";
		for (int posArrPal = 0; posArrPal < msjCarac.length; posArrPal++) {// Recorre el arreglo con un For
			palabraEncrip = palabraEncrip + msjCarac[posArrPal] + " ";
		}

		return palabraEncrip;
	}

}
