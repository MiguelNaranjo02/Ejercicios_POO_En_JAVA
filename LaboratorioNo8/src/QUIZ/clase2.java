package QUIZ;

import java.io.IOException;

public class clase2 {
	public static void main(String Arg[]) throws IOException {
		clase1 amigo= new clase1(8);
		System.out.println("Valor Inicial:"+ amigo.getNum());
		amigo.sumar(2);
		amigo.multiplicar(5);
		System.out.println("Ahora el numero vale:"+ amigo.getNum());
	}
}
