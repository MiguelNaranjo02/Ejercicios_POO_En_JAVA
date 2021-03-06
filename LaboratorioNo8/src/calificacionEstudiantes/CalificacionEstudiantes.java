/*
	 * Programa: Programa que muestra las notas finales de 3 estudiantes
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  6 de nov de 2020.
*/
package calificacionEstudiantes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalificacionEstudiantes {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Inicializaci?n de variables
		String nombre = "";
		String apellido = "";
		double def;
		int reint;
		// Creaci?n de los 3 objetos, uno por cada estudiante
		DatosEstudiante Est1 = new DatosEstudiante();
		DatosEstudiante Est2 = new DatosEstudiante();
		DatosEstudiante Est3 = new DatosEstudiante();
		System.out.println("Este programa calcula la nota definitiva de 3 estudiantes y el promedio del grupo a partir de 3 notas de cada estudiante");
		do {
			// Se llama al m?todo que introduce los datos en cada objeto
			Est1.entradaDatos(nombre, apellido, 1);
			Est2.entradaDatos(nombre, apellido, 2);
			Est3.entradaDatos(nombre, apellido, 3);
			System.out.println("\n");
			// Se obtiene el apellido y el nombre usando m?todo getter, y se imprimen las
			// notas usando el m?todo imprimir
			System.out.println(Est1.getApellido() + " " + Est1.getNombre() + "\n" + Est1.imprimir() + "\n");
			System.out.println(Est2.getApellido() + " " + Est2.getNombre() + "\n" + Est2.imprimir() + "\n");
			System.out.println(Est3.getApellido() + " " + Est3.getNombre() + "\n" + Est3.imprimir() + "\n");
			// Se calcula el promedio sumando las notas definitivas de cada estudiante y
			// dividi?ndolo en 3
			def = Math.round(((Est1.getNotas()[3] + Est2.getNotas()[3] + Est3.getNotas()[3]) / 3) * 100.0) / 100.0;
			System.out.println("El promedio del grupo es de: " + def);// Se imprime el promedio

			System.out.println("Si quiere salir presione 1\nSi quiere hacer otro c?lculo de notas presione 0.");
			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opci?n del men?
			while (reint != 0 && reint != 1) {// Bucle de verificaci?n de que el n?mero corresponda a las opciones del
												// men?
				System.out.println("Opci?n inv?lida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otro c?lculo de notas presione 0.");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}
}
