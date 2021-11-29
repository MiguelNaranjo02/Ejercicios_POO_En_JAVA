/*
	 * Programa: Plantilla que calcula el lado de un triángulo a partir de dos de sus lados y un ángulo
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  30 de oct de 2020.
*/
package ladTriang;

public class CalculoLad {
	// Inicialización de variables privadas
	private double lad1;
	private double lad2;
	private double ang;
	private double lad3;

	public double getLad1() {// Método getter del lado 1
		return lad1;
	}

	public void setLad1(double lad1) {// Método setter del lado 1
		this.lad1 = lad1;
	}

	public double getLad2() {// Método getter del lado 2
		return lad2;
	}

	public void setLad2(double lad2) {// Método setter del lado 2
		this.lad2 = lad2;
	}

	public double getAng() {// Método getter del ángulo
		return ang;
	}

	public void setAng(double ang) {// Método setter del ángulo
		this.ang = ang;
	}

	public double getLad3() {// Método getter del lado 3
		calcLad();// Llama al método calcLad, que calcula la medida del lado 3 a partir de 2 lados
					// del triángulo y el ángulo que comparten
		return this.lad3;
	}

	public void setLad3(double lad3) {// Método setter del lado 3
		this.lad3 = lad3;
	}

	public void calcLad() {// Método que calcula la medida del lado 3
		this.lad3 = (Math.pow(this.lad1, 2) + Math.pow(this.lad2, 2)
				- (2 * (this.lad1) * (this.lad2) * Math.cos(this.ang)));
		this.lad3 = Math.sqrt(this.lad3);
		this.lad3 = Math.round(this.lad3 * 100.0) / 100.0;
	}

}
