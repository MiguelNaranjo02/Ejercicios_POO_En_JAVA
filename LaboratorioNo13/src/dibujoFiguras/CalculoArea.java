/*
	 * Programa: Plantilla que calcula el ?rea de cualquier tri?ngulo
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  30 de oct de 2020, actualizado el 13 de diciembre
*/
package dibujoFiguras;

public class CalculoArea {
	//Inicializaci?n de variables privadas
	private double lad1;
	private double lad2;
	private double lad3;
	private double area;
	private boolean triang = false;

	public double getLad1() {//M?todo getter del lado 1
		return lad1;
	}

	public void setLad1(double lad1) {//M?todo setter del lado 1
		this.lad1 = lad1;
	}

	public double getLad2() {//M?todo getter del lado 2
		return lad2;
	}

	public void setLad2(double lad2) {//M?todo setter del lado 2
		this.lad2 = lad2;
	}

	public double getLad3() {//M?todo getter del lado 3
		return lad3;
	}

	public void setLad3(double lad3) {//M?todo setter del lado 3
		this.lad3 = lad3;
	}

	public boolean esTriang() {//M?todo que verifica si un tri?ngulo existe a partir de la medida de sus lados
		if ((this.lad1 + this.lad2 > this.lad3)  && (this.lad1 + this.lad3 > this.lad2) && (this.lad2 + this.lad3 > this.lad1)) {
					triang = true;
				}else {
					triang=false;
				}
		return triang;
	}

	public void calArea() {//M?todo que calcula el ?rea de un tri?ngulo a partir de sus 3 lados
		double semi = (this.lad1 + this.lad2 + this.lad3) / 2;
		this.area = semi * (semi - this.lad1) * (semi - this.lad2) * (semi - this.lad3);
		this.area = Math.sqrt(this.area);
		this.area = Math.round(this.area * 100.0) / 100.0;

	}

	public double getArea() {//M?todo getter del ?rea
		calArea();
		return this.area;
	}

	public void setArea(double area) {//M?todo setter del ?rea
		this.area = area;
	}

}

