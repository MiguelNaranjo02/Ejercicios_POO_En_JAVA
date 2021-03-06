/*
	 * Programa: Plantilla que utiliza las notas de 3 estudiantes
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  6 de nov de 2020.
*/
package calificacionEstudiantes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DatosEstudiante {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	// Inicializaci?n de variables privadas
	private String nombre;
	private String apellido;
	private String sabanaNotas;
	private int numEs;
	// Declaraci?n y creaci?n de un arreglo de notas con 4 ?ndices
	private double notas[] = new double[4];

	// M?todos getters y setters de las variables privadas
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumEs() {
		return numEs;
	}

	public void setNumEs(int numEs) {
		this.numEs = numEs;
	}

	// M?todo getter y setter del arreglo de notas
	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public void entradaDatos(String nombre, String apellido, int numEs) throws IOException {// M?todo que pide el
																							// nombre, apellido, y 3
																							// notas del estudiante
		System.out.print("Ingrese el nombre del estudiante " + numEs + ": ");
		this.nombre = (in.readLine());// El usuario ingresa el nombre
		while (this.nombre.isEmpty()) {// Bucle de validaci?n de que el nombre no este vac?o
			System.out.print("Ingrese el nombre del estudiante " + numEs + ": ");
			this.nombre = (in.readLine());

		}
		System.out.print("Ingrese el apellido del estudiante " + numEs + ": ");
		this.apellido = (in.readLine());// El usuario ingresa el apellido
		while (this.apellido.isEmpty()) {// Bucle de validaci?n de que el apellido no este vac?o
			System.out.print("Ingrese el apellido del estudiante " + numEs + ": ");
			this.apellido = (in.readLine());

		}
		System.out.print("Ingrese la nota 1 del estudiante " + numEs + " correspondiente al 30%: ");
		notas[0] = Double.parseDouble(in.readLine());// El usuario ingresa la primera nota
		while (notas[0] < 0 || notas[0] > 5) {// Bucle de validaci?n de que no se exceda de los rangos
			System.out.println("La nota no puede ser mayor a 5.0 y menor que 0.0");
			System.out.print("Ingrese la nota 1 del estudiante " + numEs + " correspondiente al 30%: ");
			notas[0] = Double.parseDouble(in.readLine());
		}
		System.out.print("Ingrese la nota 2 del estudiante " + numEs + " correspondiente al 30%: ");
		notas[1] = Double.parseDouble(in.readLine());// El usuario ingresa la segunda nota
		while (notas[1] < 0.0 || notas[1] > 5.0) {// Bucle de validaci?n de que no se exceda de los rangos
			System.out.println("La nota no puede ser mayor a 5.0 y menor que 0.0");
			System.out.print("Ingrese la nota 2 del estudiante " + numEs + " correspondiente al 30%: ");
			notas[1] = Double.parseDouble(in.readLine());
		}
		System.out.print("Ingrese la nota del examen final del estudiante " + numEs + " correspondiente al 40%: ");
		notas[2] = Double.parseDouble(in.readLine());// El usuario ingresa la nota del examen
		while (notas[2] < 0.0 || notas[2] > 5.0) {// Bucle de validaci?n de que no se exceda de los rangos
			System.out.println("La nota no puede ser mayor a 5.0 y menor que 0.0");
			System.out.print("Ingrese la nota del examen final del estudiante " + numEs + " correspondiente al 40%: ");
			notas[2] = Double.parseDouble(in.readLine());
		}

	}

	public void calculoNota(double notas[]) {// M?todo que calcula la nota definitiva a partir de 3 notas en el arreglo
		notas[3] = (notas[0] * 0.30) + (notas[1] * 0.30) + (notas[2] * 0.40);
		notas[3] = Math.round(notas[3] * 100.0) / 100.0; // Redondeo de la nota a dos decimales
	}

	public String imprimir() {// M?todo que imprime las notas de un estudiante
		sabanaNotas = "";
		calculoNota(this.notas);
		sabanaNotas = "Nota 1: " + notas[0] + "\n" + "Nota 2: " + notas[1] + "\n" + "Examen final: " + notas[2] + "\n"
				+ "Nota definitiva: " + notas[3];
		return sabanaNotas;
	}

}
