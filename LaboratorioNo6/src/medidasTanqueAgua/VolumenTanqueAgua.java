/*
	 * Programa: Plantilla que calcula el volumen de un tanque de agua
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  28 de oct de 2020.
*/
package medidasTanqueAgua;

public class VolumenTanqueAgua {
	// Inicialización de variables privadas
	private double rad;
	private double alt;
	private double volum;

	public double getRad() {// Método getter del radio
		return rad;
	}

	public void setRad(double rad) {// Método setter del radio
		this.rad = rad;
	}

	public double getAlt() {// Método getter de la altura
		return alt;
	}

	public void setAlt(double alt) {// Método setter de la altura
		this.alt = alt;
	}

	public double vol() {// Método que calcula el volumen de un tanque de agua
		volum = Math.PI * Math.pow(this.rad, 2) * this.alt;
		volum = Math.round(volum * 100.0) / 100.0;

		return volum;
	}

}
