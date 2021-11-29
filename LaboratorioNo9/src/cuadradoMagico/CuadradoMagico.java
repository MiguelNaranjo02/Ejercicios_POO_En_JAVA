/*
	 * Programa: Programa que realiza cuadros m�gicos 
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
		//inicializaci�n de variables y vectores
		int reint;
		int opc = 0;
		int[] vector;
		String numeros = "";
		//Creaci�n del objeto CuaMag
		CuaMag mat = new CuaMag();
		System.out.println("Este programa realiza cuadrados m�gicos");
		do {
			System.out.println("Ingrese la opci�n correspondiente al tama�o del cuadrado m�gico");
			System.out.println("1. 3x3 \n2. 4x4");
			opc = Integer.parseInt(in.readLine());//El usuario ingresa una opci�n del men�
			while (opc != 1 && opc != 2) {//Verificaci�n de que el usuario ingrese una opci�n valida
				System.out.println("Ingrese la opci�n correspondiente al tama�o del cuadrado m�gico");
				System.out.println("1. 3x3 \n2. 4x4");
				opc = Integer.parseInt(in.readLine());
			}
			switch (opc) {//Seg�n la selecci�n del usuario se har� imprimir� un cuadro m�gico
			case 1:
				numeros = "";
				mat.setTam(3);//Se le manda al objeto el tama�o 3
				
				System.out.println("Los n�meros a posicionar en el cuadro son:");
				vector = mat.getNum();//Se llama al m�todo que retorna el vector con los n�meros que tendr� el cuadro m�gico
				for (int i = 0; i < vector.length; i++) {
					numeros = numeros + vector[i] + " ";
				}
				System.out.println(numeros + "\n");//Se imprimen los n�meros que ir�n en el cuadro m�gico

				System.out.println(mat.imprimir());//Se imprime el cuadro m�gico 3x3
				System.out.println("La constante m�gica es:"+mat.getSumCua());//Se imprime la constante m�gica

				break;
			case 2:
				numeros = "";
				mat.setTam(4);//Se le manda al objeto el tama�o 4
				System.out.println("Los n�meros a posicionar en el cuadro son:");
				vector = mat.getNum();//Se llama al m�todo que retorna el vector con los n�meros que tendr� el arreglo
				for (int i = 0; i < vector.length; i++) {
					numeros = numeros + vector[i] + " ";
				}
				System.out.println(numeros + "\n");//Se imprimen los n�meros que ir�n en el cuadro m�gico

				System.out.println(mat.imprimir());//Se imprime el cuadro m�gico 4x4
				System.out.println("La constante m�gica es:"+mat.getSumCua());//Se imprime la constante m�gica
				break;
			}

			System.out.print("(0.Volver/1.Salir): ");
			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opci�n del men�
			while (reint != 0 && reint != 1) {// Bucle de verificaci�n de que el n�mero corresponda a las opciones del
												// men�
				System.out.println("Opci�n inv�lida.");
				System.out.print("(0.Volver/1.Salir): ");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}
}

