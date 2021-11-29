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
		// Inicializaci�n de variables
		long ID = 0;
		double salario;
		int reint = 0;
		// Creaci�n de objetos
		DatosEmpleado Empleado = new DatosEmpleado();
		CalculoCheque Cheque = new CalculoCheque();

		System.out.println("Este programa recoge los datos de un empleado y calcula su cheque");
		do {
			System.out.print("Ingrese su identificaci�n: ");
			ID = Long.parseLong(in.readLine());// El usuario ingresa su identificaci�n
			while (ID <= 0) // Bucle que verifica que la identificaci�n no sea negativa
			{
				System.out.println("Opci�n invalida, la identificaci�n tiene que ser mayor a 0");
				System.out.print("Ingrese su identificaci�n: ");
				ID = Long.parseLong(in.readLine());
			}
			Empleado.setID(ID);// Guarda la variable privada ID con la identificaci�n dada por el usuario

			System.out.print("Ingrese su nombre: ");
			Empleado.setNombre(in.readLine());// Guarda la variable privada Nombre con el nombre dado por el usuario
			while (Empleado.getNombre().isEmpty()) {// Bucle que verifica que el nombre no este vac�o
				System.out.println("Tiene que ingresar su nombre ");
				System.out.print("Ingrese su nombre: ");
				Empleado.setNombre(in.readLine());
			}

			System.out.print("Ingrese su apellido: ");
			Empleado.setApellido(in.readLine());// Guarda la variable privada Apellido con el apellido dado por el
												// usuario
			while (Empleado.getApellido().isEmpty()) {// Bucle que verifica que el apellido no este vac�o
				System.out.println("Tiene que ingresar su apellido ");
				System.out.print("Ingrese su apellido: ");
				Empleado.setApellido(in.readLine());
			}

			System.out.print("Ingrese su salario: ");
			salario = Double.parseDouble(in.readLine());// El usuario ingresa su salario
			while (salario <= 0) {// Verificaci�n de que el salario no sea menor o igual a 0
				System.out.println("El salario no puede ser menor o igual a 0");
				System.out.print("Ingrese su salario: ");
				salario = Double.parseDouble(in.readLine());
			}

			Cheque.setSalario(salario);// Guarda la variable privada Salario con el salario digitado por el usuario
			System.out.println("-----------------CHEQUE------------------");// Impresi�n del cheque
			System.out.println("Identificaci�n del empleado: " + Empleado.getID());// Impresi�n de la identificaci�n
			System.out.println("Nombre del empleado: " + Empleado.getNombre());// Impresi�n del nombre
			System.out.println("Apellido del empleado: " + Empleado.getApellido());// Impresi�n del apellido
			System.out.println("Su salario es de: " + Cheque.getSalario() + " pesos");// Impresi�n del salario

			System.out.println("Si quiere salir presione 1\nSi quiere hacer otro cheque presione 0.");// Men� por
																										// si el
																										// usuario
																										// quiere
																										// hacer
																										// otro
																										// cheque
			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opci�n del men�
			while (reint != 0 && reint != 1) {// Verificaci�n de que el n�mero corresponda a las opciones del men�
				System.out.println("Opci�n inv�lida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otro cheque presione 0.");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}

}
