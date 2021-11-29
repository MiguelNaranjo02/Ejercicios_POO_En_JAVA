/*
	 * Programa: Programa que gestiona 3 tipos de productos de una empresa agroalimentaria
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  27 de nov de 2020.
*/
package empresaAgroalimentaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestHerencia {
	public static void main(String Arg[]) throws IOException {
		// Inicializacion de variables
		int numProd = 0;
		int tipoProd = 0;
		int lote;
		int reint;
		String nomb = "";
		System.out.println("Este programa gestiona 3 tipos de productos en una empresa agroalimentaria");
		do {
			// Creacion de objetos
			ProductoFresco fres = new ProductoFresco();
			ProductoRefrigerado refri = new ProductoRefrigerado();
			ProductoCongelado conge = new ProductoCongelado();

			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Ingrese la cantidad de productos a gestionar: ");
			numProd = Integer.parseInt(in.readLine());// El usuario ingresa el numero de productos
			while (numProd <= 0) {
				System.out.print("Debe ingresar al menos un producto: ");
				numProd = Integer.parseInt(in.readLine());
			}
			for (int i = 0; i < numProd; i++) {// For que pregunta n veces segun el numero de productos
				System.out.println(
						"Seleccione el tipo de producto:\n1.Producto fresco\n2.Producto refrigerado\n3.Producto congelado");
				tipoProd = Integer.parseInt(in.readLine());// El usuario seleccione el tipo de producto
				while ((tipoProd != 1) && (tipoProd != 2) && (tipoProd != 3)) {
					System.out.println("Entrada invalida");
					System.out.println(
							"Seleccione el tipo de producto:\n1.Producto fresco\n2.Producto refrigerado\n3.Producto congelado");
					tipoProd = Integer.parseInt(in.readLine());

				}
				System.out.print("Ingrese el nombre del producto: ");
				switch (tipoProd) {// Segun el tipo de producto se guardara la informacion en un objeto distinto
				case 1:
					nomb = in.readLine();
					while (nomb.isEmpty()) {// Se verifica que el nombre no este vacio
						System.out.print("El nombre no puede estar vacio\nIngrese el nombre del producto: ");
						nomb = in.readLine();
					}
					fres.nomProd.add(nomb);// Se añade el nombre a la clase
					// -----------------------------------------
					System.out.print("Ingrese la fecha de caducidad del producto: ");
					fres.fechaCad.add(in.readLine());// Se añade la fecha de caducidad a la clase
					// -----------------------------------------
					System.out.print("Ingrese el numero de lote: ");
					lote = Integer.parseInt(in.readLine());
					while (lote <= 0) {// Se verifica que no sea negativo
						System.out.print("Numero de lote invalido, ingrese un numero de lote mayor a 0: ");
						lote = Integer.parseInt(in.readLine());
					}
					fres.numLote.add(lote);// Se añade a la clase
					// -----------------------------------------
					System.out.print("Ingrese la fecha de envasado: ");
					fres.fechaEnvas.add(in.readLine());// Se añade la fecha de envasado
					// -----------------------------------------
					String pais = "";
					System.out.print("Ingrese el pais de origen: ");
					pais = (in.readLine());
					while (pais.isEmpty()) {// Se verifica que no este vacio
						System.out.print("Ingrese un pais valido: ");
						pais = (in.readLine());
					}
					fres.paisOrigen.add(pais);// Se añade a la clase
					// -----------------------------------------
					System.out.print("\n");
					break;
				case 2:
					nomb = in.readLine();
					while (nomb.isEmpty()) {
						System.out.print("El nombre no puede estar vacio\nIngrese el nombre del producto: ");
						nomb = in.readLine();
					}
					refri.nomProd.add(nomb);
					// -----------------------------------------
					System.out.print("Ingrese la fecha de caducidad del producto: ");
					refri.fechaCad.add(in.readLine());
					// -----------------------------------------
					System.out.print("Ingrese el numero de lote: ");
					lote = Integer.parseInt(in.readLine());
					while (lote <= 0) {
						System.out.print("Numero de lote invalido, ingrese un numero de lote mayor a 0: ");
						lote = Integer.parseInt(in.readLine());
					}
					refri.numLote.add(lote);
					// -----------------------------------------
					System.out.print("Ingrese el codigo del organismo de supervision alimentaria: ");
					refri.codSuperv.add(in.readLine());// Se añade el codigo del organismo de supervision alimentaria a
														// la clase
					System.out.print("\n");
					break;
				case 3:
					nomb = in.readLine();
					while (nomb.isEmpty()) {
						System.out.print("El nombre no puede estar vacio\nIngrese el nombre del producto: ");
						nomb = in.readLine();
					}
					conge.nomProd.add(nomb);
					// -----------------------------------------
					System.out.print("Ingrese la fecha de caducidad del producto: ");
					conge.fechaCad.add(in.readLine());
					// -----------------------------------------
					System.out.print("Ingrese el numero de lote: ");
					lote = Integer.parseInt(in.readLine());
					while (lote <= 0) {
						System.out.print("Numero de lote invalido, ingrese un numero de lote mayor a 0: ");
						lote = Integer.parseInt(in.readLine());
					}
					conge.numLote.add(lote);
					// -----------------------------------------
					System.out.print("Ingrese la temperatura de congelacion recomendada en °C: ");
					double temp;
					temp = Double.parseDouble(in.readLine());
					while ((temp > 15) && (temp < -50)) {// Se verifica que la temperatura no sea mayor a 15 grados y
															// menor a -50 grados
						System.out.print("Ingrese una temperatura valida: ");
						temp = Double.parseDouble(in.readLine());
					}
					conge.tempReco.add(temp);// Se añade la temperatura a la clase
					System.out.print("\n");
					break;
				}
			}
			// Se imprime la informacion de los objetos
			System.out.println(fres.imprimir());
			System.out.println(refri.imprimir());
			System.out.println(conge.imprimir());
			System.out.print("\n");
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
