/*
	 * Programa: Programa que obtiene las posibles soluciones de una ecuacion cuadratica
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  13 de nov de 2020.
*/
package punto1;

public class Cuadratica {
	private double a=0;
	private double b=0;
	private double c=0;
	private double sol1=0;
	private double sol2=0;
	private double discri=0;
	public double getA() {
		
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getSol1() {
		return sol1;
	}
	public void setSol1(double sol1) {
		this.sol1 = sol1;
	}
	public double getSol2() {
		return sol2;
	}
	public void setSol2(double sol2) {
		this.sol2 = sol2;
	}
	public double dis() {
		discri=Math.pow(b, 2);
		discri=(discri)-(4*this.a*this.c);
		if (discri>=0) {
			discri=Math.sqrt(discri);
		}else {
			discri=-1;
		}
		
		return discri;
	}
	public void formula() {
		sol1=((-this.b+this.discri)/(2*this.a));
		sol2=((-this.b-this.discri)/(2*this.a));
	}
	
	
	

}
