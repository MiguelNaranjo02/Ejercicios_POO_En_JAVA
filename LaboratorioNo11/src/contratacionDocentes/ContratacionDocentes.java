/*
	 * Programa: Programa que calcula el salario de docentes
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  25 de nov de 2020.
*/
package contratacionDocentes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ContratacionDocentes {
	// funcion que elimina la notacion cientifica
	public static String EliminarNotaciónCientifica(double Número) {

		return new DecimalFormat("#.####################################").format(Número);

	}

	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicializacion de variables
		int numDoc = 0;
		int tipoCont = 0;
		int nivEst = 0;
		int mesHoras = 0;
		int reint;
		// Creacion de objetos
		Planta calcPlant = new Planta();
		VincEspecial calcEspec = new VincEspecial();
		Catedratico calcCated = new Catedratico();
		System.out.println("Este programa calcula los valores a pagar a docentes universitarios en un mes determinado");

		do {
			System.out.print("Ingrese el numero de docentes a calcular su pago: ");
			numDoc = Integer.parseInt(in.readLine());// El usuario ingresa el numero de docentes a calcular su pago
			while (numDoc <= 0) {
				System.out.println("El numero de docentes debe de ser mayor o igual a 1 ");
				System.out.print("Ingrese el numero de docentes a calcular su pago: ");
				numDoc = Integer.parseInt(in.readLine());
			}
			for (int i = 1; i < numDoc + 1; i++) {// For que recolecta los datos de cada docente
				System.out.println("Seleccione el tipo de contratacion del docente numero " + i
						+ "\n1.Planta\n2.Vinculacion Especial\n3.Catedratico\n");
				tipoCont = Integer.parseInt(in.readLine());// Se ingresa el tipo de contratacion del docente
				while ((tipoCont != 1) && (tipoCont != 2) && (tipoCont != 3)) {
					System.out.println("Opcion invalida");
					System.out.println("Seleccione el tipo de contratacion del docente numero " + i
							+ "\n1.Planta\n2.Vinculacion Especial\n3.Catedratico\n");
					tipoCont = Integer.parseInt(in.readLine());
				}
				switch (tipoCont) {// Segun el tipo de contratacion, se guardan los datos en una clase
				case 1:
					System.out.print("Ingrese el nombre del docente numero " + i + ": ");
					calcPlant.nombres.add(in.readLine());// Se añade el nombre al arraylist de los nombres
					System.out.print("Ingrese el apellido del docente numero " + i + ": ");
					calcPlant.apellidos.add(in.readLine());// Se añade el apellido al arraylist de los apellidos
					System.out.println("Seleccione el nivel de estudios del docente numero " + i
							+ "\n1.Doctorado\n2.Maestria\n3.Especializacion\n4.Sin postgrado");
					nivEst = Integer.parseInt(in.readLine());// Se ingresa el nivel de estudios del docente
					while ((nivEst != 1) && (nivEst != 2) && (nivEst != 3) && (nivEst != 4)) {
						System.out.println("Opcion invalida");
						System.out.println("Seleccione el nivel de estudios del docente numero " + i
								+ "\n1.Doctorado\n2.Maestria\n3.Especializacion\n4.Sin postgrado");
						nivEst = Integer.parseInt(in.readLine());
					}
					calcPlant.nivel.add(nivEst);// Se le añade al arraylist de nivel de estudio el numero
												// correspondiente
					calcPlant.setEstudios(nivEst);// Se le manda el nivel del estudio al objeto
					calcPlant.pagoPlanta();// Se inicializa el metodo que calcula el pago
					break;
				case 2:
					System.out.print("Ingrese el nombre del docente numero " + i + ": ");
					calcEspec.nombres.add(in.readLine());
					System.out.print("Ingrese el apellido del docente numero " + i + ": ");
					calcEspec.apellidos.add(in.readLine());
					System.out.println("Seleccione el nivel de estudios del docente numero " + i
							+ "\n1.Doctorado\n2.Maestria\n3.Especializacion\n4.Sin postgrado");
					nivEst = Integer.parseInt(in.readLine());
					while ((nivEst != 1) && (nivEst != 2) && (nivEst != 3) && (nivEst != 4)) {
						System.out.println("Opcion invalida");
						System.out.println("Seleccione el nivel de estudios del docente numero " + i
								+ "\n1.Doctorado\n2.Maestria\n3.Especializacion\n4.Sin postgrado");
						nivEst = Integer.parseInt(in.readLine());
					}
					calcEspec.nivel.add(nivEst);
					calcEspec.setEstudios(nivEst);
					calcEspec.pagoEspecial();
					break;
				case 3:
					System.out.print("Ingrese el nombre del docente numero " + i + ": ");
					calcCated.nombres.add(in.readLine());
					System.out.print("Ingrese el apellido del docente numero " + i + ": ");
					calcCated.apellidos.add(in.readLine());
					System.out.println("Seleccione el nivel de estudios del docente numero " + i
							+ "\n1.Doctorado\n2.Maestria\n3.Especializacion\n4.Sin postgrado");
					nivEst = Integer.parseInt(in.readLine());
					while ((nivEst != 1) && (nivEst != 2) && (nivEst != 3) && (nivEst != 4)) {
						System.out.println("Opcion invalida");
						System.out.println("Seleccione el nivel de estudios del docente numero " + i
								+ "\n1.Doctorado\n2.Maestria\n3.Especializacion\n4.Sin postgrado");
						nivEst = Integer.parseInt(in.readLine());
					}
					calcCated.nivel.add(nivEst);
					calcCated.setEstudios(nivEst);
					System.out.print("Digite la cantidad de horas dictadas al mes por el docente " + i + ": ");
					mesHoras = Integer.parseInt(in.readLine());// Se ingresan las horas dictadas por el docente
					while (mesHoras < 32 || mesHoras > 76) {
						System.out.print(
								"Las cantidad de horas no corresponden a los estatutos, porfavor ingrese una cantidad de horas valida: ");
						mesHoras = Integer.parseInt(in.readLine());
					}
					calcCated.cantHoras.add(mesHoras);// Se añaden las horas al arraylist de las horas
					calcCated.setHoras(mesHoras);// Se le manda al objeto las horas en el mes
					calcCated.pagoCated();// Se inicializa el metodo que calcula el pago
					break;
				}
			}
			// Se imprimen los valores de pago de cada docente
			System.out.println("-------------------Docentes de planta---------------------------------");
			double plantTot = 0;
			for (int i = 0; i < calcPlant.nombres.size(); i++) {
				System.out.println(calcPlant.apellidos.get(i) + " " + calcPlant.nombres.get(i));// Se imprimen los
																								// nombres del docente
				System.out.println("Docente de planta");
				System.out.print("Nivel de estudios: ");
				switch (calcPlant.nivel.get(i)) {// Se imprime el nivel de estudios
				case 1:
					System.out.println("Doctorado");
					break;
				case 2:
					System.out.println("Maestria");
					break;
				case 3:
					System.out.println("Especializacion");
					break;
				case 4:
					System.out.println("Sin postgrado");
					break;
				}
				System.out.println("Pago: $" + Math.round(calcPlant.pago.get(i) * 1) / 1);// Se imprime el valor del
																							// pago siendo redondeado
				System.out.println("\n");
				plantTot = plantTot + calcPlant.pago.get(i);// Se calcula el pago total del tipo de contratacion
			}
			System.out.println("-------------------Docentes de Vinculacion Especial------------------");
			double especTot = 0;
			for (int i = 0; i < calcEspec.nombres.size(); i++) {
				System.out.println(calcEspec.apellidos.get(i) + " " + calcEspec.nombres.get(i));
				System.out.println("Docente de Vinculacion Especial");
				System.out.print("Nivel de estudios: ");
				switch (calcEspec.nivel.get(i)) {
				case 1:
					System.out.println("Doctorado");
					break;
				case 2:
					System.out.println("Maestria");
					break;
				case 3:
					System.out.println("Especializacion");
					break;
				case 4:
					System.out.println("Sin postgrado");
					break;
				}
				System.out.println("Pago: $" + Math.round(calcEspec.pago.get(i) * 1) / 1);
				System.out.println("\n");
				especTot = especTot + calcEspec.pago.get(i);
			}
			System.out.println("-------------------Docentes Catedraticos-----------------------------");
			double cateTot = 0;
			for (int i = 0; i < calcCated.nombres.size(); i++) {
				System.out.println(calcCated.apellidos.get(i) + " " + calcCated.nombres.get(i));

				System.out.println("Docente Catedratico");
				System.out.println("Horas dictadas: " + calcCated.cantHoras.get(i));// Se imprimen las horas dictadas
																					// por el docente

				System.out.print("Nivel de estudios: ");
				switch (calcCated.nivel.get(i)) {
				case 1:
					System.out.println("Doctorado");
					break;
				case 2:
					System.out.println("Maestria");
					break;
				case 3:
					System.out.println("Especializacion");
					break;
				case 4:
					System.out.println("Sin postgrado");
					break;
				}

				System.out.println("Pago: $" + Math.round(calcCated.pago.get(i) * 1) / 1);
				System.out.println("\n");
				cateTot = cateTot + calcCated.pago.get(i);

			}
			// Se imprimen los subtotales de cada tipo de contratacion eliminando la
			// notacion cientifica
			System.out.println("-------------------Subtotales------------------");
			System.out.println("Total del pago a docentes de planta: $" + EliminarNotaciónCientifica(plantTot));
			System.out.println(
					"Total del pago a docentes de vinculacion especial: $" + EliminarNotaciónCientifica(especTot));
			System.out.println("Total del pago a docentes catedraticos: $" + EliminarNotaciónCientifica(cateTot));
			// Se imprime el total a pagar a todos los docentes
			System.out.println("-------------------Total------------------");
			System.out.println("El pago total a todos los docentes es de: $"
					+ EliminarNotaciónCientifica(plantTot + especTot + cateTot));
			// Se limpian los arreglos de las clases
			calcCated.limpiar();
			calcPlant.limpiar();
			calcEspec.limpiar();

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
