/*
	 * Programa: Plantilla que calcula la superficie de un tanque de agua
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  28 de oct de 2020.
*/
package medidasTanqueAgua;

public class SuperficieTanqueAgua {
	// Inicializaci�n de variables privadas
	private double rad;
	private double alt;
	private double supe;

	public double getRad() {// M�todo getter del radio
		return rad;
	}

	public void setRad(double rad) {// M�todo setter del radio
		this.rad = rad;
	}

	public double getAlt() {// M�todo getter de la altura
		return alt;
	}

	public void setAlt(double alt) {// M�todo setter de la altura
		this.alt = alt;
	}

	public double superf() {// M�todo que calcula la superficie del tanque de agua
		supe = 2 * Math.PI * this.rad * (this.rad + this.alt);
		supe = Math.round(supe * 100.0) / 100.0;
		return supe;
	}

}
