/*
	 * Programa: Programa que muestra el determinante de una matriz 3x3
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  20 de nov de 2020.
*/
package determinante3x3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Determinante3x3 {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//Inicializacion de variables
		int opc;
		int reint;
		//Creacion de matriz 3x3
		double matriz[][];
		matriz= new double[3][3];
		//Creacion del objeto que calcula la determinante
		DeterminanteMet det = new DeterminanteMet();
		
		System.out.println("Este programa calcula el determinante de una matriz 3x3");
		do {
			for (int i=0;i<3;i++) { //For que recorre la matriz para llenarla de elementos
				for(int j=0;j<3;j++) {
					System.out.println("Ingrese el valor de la posicion "+ i+","+ j);
					matriz[i][j]=Integer.parseInt(in.readLine());
				}
			}
			for (int i=0;i<3;i++) {//For que imprime la matriz 3x3
				for(int j=0;j<3;j++) {
					System.out.print(matriz[i][j]+" ");
				}
				System.out.println("\n");
			}
			System.out.println("Ingrese la opcion de calculo: \n0.Recursivo\n1.Iterativo"); //Menu en el cual el usuario selecciona como sera el calculo de la determinante
			opc=Integer.parseInt(in.readLine());
			while (opc!= 0 && opc!=1) {
				System.out.println("Opcion invalida \n0.Recursivo\n1.Iterativo");
				opc=Integer.parseInt(in.readLine());
			}
			det.setMatriz(matriz);//La matriz es enviada al objeto
			det.setOpc(opc);//La opcion seleccionada es enviada al objeto
			
			System.out.print("(0.Volver/1.Salir): ");//Menu en el cual el usuario elige si hacer otro calculo
			reint = Integer.parseInt(in.readLine());
			while (reint != 0 && reint != 1) {
				System.out.println("Opci?n inv?lida.");
				System.out.print("(0.Volver/1.Salir): ");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");

		}

}
