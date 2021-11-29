/*
	 * Programa: Programa que muestra el valor del cheque del empleado
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 28 oct de 2020.
*/
package chequeEmpleado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChequeEmpleado {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicialización de variables
		long ID = 0;
		double salario;
		int reint = 0;
		// Creación de objetos
		DatosEmpleado Empleado = new DatosEmpleado();
		CalculoCheque Cheque = new CalculoCheque();

		System.out.println("Este programa recoge los datos de un empleado y calcula su cheque");
		do {
			System.out.print("Ingrese su identificación: ");
			ID = Long.parseLong(in.readLine());// El usuario ingresa su identificación
			while (ID <= 0) // Bucle que verifica que la identificación no sea negativa
			{
				System.out.println("Opción invalida, la identificación tiene que ser mayor a 0");
				System.out.print("Ingrese su identificación: ");
				ID = Long.parseLong(in.readLine());
			}
			Empleado.setID(ID);// Guarda la variable privada ID con la identificación dada por el usuario

			System.out.print("Ingrese su nombre: ");
			Empleado.setNombre(in.readLine());// Guarda la variable privada Nombre con el nombre dado por el usuario
			while (Empleado.getNombre().isEmpty()) {// Bucle que verifica que el nombre no este vacío
				System.out.println("Tiene que ingresar su nombre ");
				System.out.print("Ingrese su nombre: ");
				Empleado.setNombre(in.readLine());
			}

			System.out.print("Ingrese su apellido: ");
			Empleado.setApellido(in.readLine());// Guarda la variable privada Apellido con el apellido dado por el
												// usuario
			while (Empleado.getApellido().isEmpty()) {// Bucle que verifica que el apellido no este vacío
				System.out.println("Tiene que ingresar su apellido ");
				System.out.print("Ingrese su apellido: ");
				Empleado.setApellido(in.readLine());
			}

			System.out.print("Ingrese su salario: ");
			salario = Double.parseDouble(in.readLine());// El usuario ingresa su salario
			while (salario <= 0) {// Verificación de que el salario no sea menor o igual a 0
				System.out.println("El salario no puede ser menor o igual a 0");
				System.out.print("Ingrese su salario: ");
				salario = Double.parseDouble(in.readLine());
			}

			Cheque.setSalario(salario);// Guarda la variable privada Salario con el salario digitado por el usuario
			System.out.println("-----------------CHEQUE------------------");// Impresión del cheque
			System.out.println("Identificación del empleado: " + Empleado.getID());// Impresión de la identificación
			System.out.println("Nombre del empleado: " + Empleado.getNombre());// Impresión del nombre
			System.out.println("Apellido del empleado: " + Empleado.getApellido());// Impresión del apellido
			System.out.println("Su salario es de: " + Cheque.getSalario() + " pesos");// Impresión del salario

			System.out.println("Si quiere salir presione 1\nSi quiere hacer otro cheque presione 0.");// Menú por
																										// si el
																										// usuario
																										// quiere
																										// hacer
																										// otro
																										// cheque
			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opción del menú
			while (reint != 0 && reint != 1) {// Verificación de que el número corresponda a las opciones del menú
				System.out.println("Opción inválida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otro cheque presione 0.");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}

}
