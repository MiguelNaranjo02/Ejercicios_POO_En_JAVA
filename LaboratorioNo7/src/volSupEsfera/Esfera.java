/*
	 * Programa: Plantilla que calcula el valor del volumen y la superficie de una esfera
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  30 de oct de 2020.
*/
package volSupEsfera;

public class Esfera {
	// Inicialización de la variable privada radio
	private double radio;

	public double getRadio() {// Método getter del radio
		return radio;
	}

	public void setRadio(double radio) {// Método setter del radio
		this.radio = radio;
	}

	// Constructor radio sin parámetro
	Esfera() {
		this.radio = 1.0;
	}

	// Constructor de radio con parámetro
	public Esfera(double radio) {
		this.radio = radio;

	}

	// Método que calcula el volumen de una esfera
	public double Volumen() {
		return Math.round((Math.PI * Math.pow(this.radio, 3) * 4) / 3 * 100.0) / 100.0;
	}

	// Método que calcula la superficie de una esfera
	public double Superficie() {
		return Math.round(4 * Math.PI * Math.pow(this.radio, 2) * 100.0) / 100.0;
	}

	// Método que imprime la superficie y el volumen, llamando a las funciones que
	// realizan esa acción
	public void Imprimir() {
		System.out.println("La esfera de radio " + this.radio + ", tiene como volumen " + Volumen()
				+ " unidades cubicas" + " y tiene como superficie " + Superficie() + " unidades cuadradas");

	}

}
