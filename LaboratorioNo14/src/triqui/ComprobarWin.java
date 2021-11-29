/*
	 * Programa: Clase que comprueba la victoria del triqui
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  22 de enero del 2021
*/
package triqui;

public class ComprobarWin {
	private boolean esVictoria = false;//Booleano si es victoria
	private String[] posCas = new String[9];// Vector de strings
	private int casWin = 0;//Caso de victoria

	
	//Getters y setters
	public String[] getPosCas() {
		return posCas;
	}

	public void setPosCas(String[] a) {
		posCas = a;
	}

	public boolean isEsVictoria() {
		return esVictoria;
	}

	public void setEsVictoria(boolean esVictoria) {
		this.esVictoria = esVictoria;
	}

	public int getCasWin() {
		return casWin;
	}

	public void setCasWin(int casWin) {
		this.casWin = casWin;
	}

	public boolean Victoria(String[] A) {//Metodo que retorna un bandera verdadera si encuentra una victoria
		//Se concatenan las posiciones de los vectores y se comparan con xxx y ooo
		if ((A[0] + A[1] + A[2]).equals("xxx") || (A[0] + A[1] + A[2]).equals("ooo")) {
			esVictoria = true;//Retoran true
			casWin = 1;//Se guarda la posicion de la victoria
		} else {
			if ((A[3] + A[4] + A[5]).equals("xxx") || (A[3] + A[4] + A[5]).equals("ooo")) {
				esVictoria = true;
				casWin = 2;
			} else {
				if ((A[6] + A[7] + A[8]).equals("xxx") || (A[6] + A[7] + A[8]).equals("ooo")) {
					esVictoria = true;
					casWin = 3;
				} else {
					if ((A[0] + A[3] + A[6]).equals("xxx") || (A[0] + A[3] + A[6]).equals("ooo")) {
						esVictoria = true;
						casWin = 4;
					} else {
						if ((A[1] + A[4] + A[7]).equals("xxx") || (A[1] + A[4] + A[7]).equals("ooo")) {
							esVictoria = true;
							casWin = 5;
						} else {
							if ((A[2] + A[5] + A[8]).equals("xxx") || (A[2] + A[5] + A[8]).equals("ooo")) {
								esVictoria = true;
								casWin = 6;
							} else {
								if ((A[0] + A[4] + A[8]).equals("xxx") || (A[0] + A[4] + A[8]).equals("ooo")) {
									esVictoria = true;
									casWin = 7;
								} else {
									if ((A[2] + A[4] + A[6]).equals("xxx") || (A[2] + A[4] + A[6]).equals("ooo")) {
										esVictoria = true;
										casWin = 8;
									} else {
										esVictoria = false;
										casWin = 0;

									}
								}
							}
						}
					}
				}
			}
		}

		return esVictoria;
	}

}
