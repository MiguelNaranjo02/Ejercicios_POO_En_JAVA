/*
	 * Programa: Plantilla que obtiene la varianza y la desviacion de 5 datos ingresados
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  13 de nov de 2020.
*/
package punto2;

public class Varianza {
	//Se crean las variables privadas
	private double datos[];
	private double promedio;
	private double varianza;
	private double desviacion;
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

	public double getVarianza() {
		return varianza;
	}

	public void setVarianza(double varianza) {
		this.varianza = varianza;
	}

	public double var() {
		double aux = 0;
		varianza = 0;
		for (int i = 0; i < datos.length; i++) {//Se calcula la varianza recorriendo el vector y restandole a cada elemento el promedio
			aux = (datos[i] - this.promedio);
			aux = Math.pow(aux, 2);//Se eleva al cuadrado el resultado de la resta
			varianza = varianza + aux;
		}
		varianza = varianza / (datos.length);//Se divide la varianza entre el numero de datos

		return varianza;
	}

	public double des() {
		this.desviacion = Math.sqrt(this.varianza);//La desviacion se calcula sacandole la raiz cuadada a la varianza
		desviacion = Math.round(desviacion * 100000.0) / 100000.0;//Se redondea a 5 decimales
		return desviacion;
	}

}
