/*
	 * Programa: Plantilla que calcula el lado de un tri�ngulo a partir de dos de sus lados y un �ngulo
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  30 de oct de 2020.
*/
package ladTriang;

public class CalculoLad {
	// Inicializaci�n de variables privadas
	private double lad1;
	private double lad2;
	private double ang;
	private double lad3;

	public double getLad1() {// M�todo getter del lado 1
		return lad1;
	}

	public void setLad1(double lad1) {// M�todo setter del lado 1
		this.lad1 = lad1;
	}

	public double getLad2() {// M�todo getter del lado 2
		return lad2;
	}

	public void setLad2(double lad2) {// M�todo setter del lado 2
		this.lad2 = lad2;
	}

	public double getAng() {// M�todo getter del �ngulo
		return ang;
	}

	public void setAng(double ang) {// M�todo setter del �ngulo
		this.ang = ang;
	}

	public double getLad3() {// M�todo getter del lado 3
		calcLad();// Llama al m�todo calcLad, que calcula la medida del lado 3 a partir de 2 lados
					// del tri�ngulo y el �ngulo que comparten
		return this.lad3;
	}

	public void setLad3(double lad3) {// M�todo setter del lado 3
		this.lad3 = lad3;
	}

	public void calcLad() {// M�todo que calcula la medida del lado 3
		this.lad3 = (Math.pow(this.lad1, 2) + Math.pow(this.lad2, 2)
				- (2 * (this.lad1) * (this.lad2) * Math.cos(this.ang)));
		this.lad3 = Math.sqrt(this.lad3);
		this.lad3 = Math.round(this.lad3 * 100.0) / 100.0;
	}

}
