/*
	 * Programa: Plantilla que calcula la superficie de un tanque de agua
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  28 de oct de 2020.
*/
package medidasTanqueAgua;

public class SuperficieTanqueAgua {
	// Inicialización de variables privadas
	private double rad;
	private double alt;
	private double supe;

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

	public double superf() {// Método que calcula la superficie del tanque de agua
		supe = 2 * Math.PI * this.rad * (this.rad + this.alt);
		supe = Math.round(supe * 100.0) / 100.0;
		return supe;
	}

}
