package QUIZ;

public class clase1 {
	private int num;
	public clase1(int num) {
		this.num=num;
	}
	public clase1() {
		this.num=0;
	}
	public void sumar(int b) {
		this.num+=b;
	}
	public void multiplicar(int x) {
		this.num*=x;
	}
	public int getNum() {
		return num;
	}

}
