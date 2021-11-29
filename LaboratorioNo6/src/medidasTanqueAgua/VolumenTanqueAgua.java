/*
	 * Programa: Plantilla que calcula el volumen de un tanque de agua
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  28 de oct de 2020.
*/
package medidasTanqueAgua;

public class VolumenTanqueAgua {
	// Inicializaci�n de variables privadas
	private double rad;
	private double alt;
	private double volum;

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

	public double vol() {// M�todo que calcula el volumen de un tanque de agua
		volum = Math.PI * Math.pow(this.rad, 2) * this.alt;
		volum = Math.round(volum * 100.0) / 100.0;

		return volum;
	}

}
