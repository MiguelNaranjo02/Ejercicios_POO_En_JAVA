/*
	 * Programa: Plantilla que obtiene el promedio de 5 datos ingresados
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  13 de nov de 2020.
*/
package punto2;

public class Promedio {
//Se crean las dos variables privadas
	private double datos[];
	private double promedio;
	//Se crean los metodos getters y setters
	public double[] getDatos() {
		return datos;
	}

	public void setDatos(double[] datos) {
		this.datos = datos;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	public double prom() {
		promedio = 0;
		for (int i = 0; i < this.datos.length; i++) {//Se calcula el promedio recorriendo el arreglo y sumando sus datos
			promedio = promedio + this.datos[i];
		}
		promedio = promedio / datos.length;//Se divide la suma entre el numero de datos

		return promedio;
	}

}
