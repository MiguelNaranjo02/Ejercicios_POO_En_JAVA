/*
	 * Programa: Programa que realiza cuadros mágicos 
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  11 de nov de 2020.
*/
package cuadradoMagico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuadradoMagico {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//inicialización de variables y vectores
		int reint;
		int opc = 0;
		int[] vector;
		String numeros = "";
		//Creación del objeto CuaMag
		CuaMag mat = new CuaMag();
		System.out.println("Este programa realiza cuadrados mágicos");
		do {
			System.out.println("Ingrese la opción correspondiente al tamaño del cuadrado mágico");
			System.out.println("1. 3x3 \n2. 4x4");
			opc = Integer.parseInt(in.readLine());//El usuario ingresa una opción del menú
			while (opc != 1 && opc != 2) {//Verificación de que el usuario ingrese una opción valida
				System.out.println("Ingrese la opción correspondiente al tamaño del cuadrado mágico");
				System.out.println("1. 3x3 \n2. 4x4");
				opc = Integer.parseInt(in.readLine());
			}
			switch (opc) {//Según la selección del usuario se hará imprimirá un cuadro mágico
			case 1:
				numeros = "";
				mat.setTam(3);//Se le manda al objeto el tamaño 3
				
				System.out.println("Los números a posicionar en el cuadro son:");
				vector = mat.getNum();//Se llama al método que retorna el vector con los números que tendrá el cuadro mágico
				for (int i = 0; i < vector.length; i++) {
					numeros = numeros + vector[i] + " ";
				}
				System.out.println(numeros + "\n");//Se imprimen los números que irán en el cuadro mágico

				System.out.println(mat.imprimir());//Se imprime el cuadro mágico 3x3
				System.out.println("La constante mágica es:"+mat.getSumCua());//Se imprime la constante mágica

				break;
			case 2:
				numeros = "";
				mat.setTam(4);//Se le manda al objeto el tamaño 4
				System.out.println("Los números a posicionar en el cuadro son:");
				vector = mat.getNum();//Se llama al método que retorna el vector con los números que tendrá el arreglo
				for (int i = 0; i < vector.length; i++) {
					numeros = numeros + vector[i] + " ";
				}
				System.out.println(numeros + "\n");//Se imprimen los números que irán en el cuadro mágico

				System.out.println(mat.imprimir());//Se imprime el cuadro mágico 4x4
				System.out.println("La constante mágica es:"+mat.getSumCua());//Se imprime la constante mágica
				break;
			}

			System.out.print("(0.Volver/1.Salir): ");
			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opción del menú
			while (reint != 0 && reint != 1) {// Bucle de verificación de que el número corresponda a las opciones del
												// menú
				System.out.println("Opción inválida.");
				System.out.print("(0.Volver/1.Salir): ");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}
}

