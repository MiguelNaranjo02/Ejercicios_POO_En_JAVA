/*
	 * Programa: Subclase de la clase contratacion que se centra en los docentes catedraticos
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  25 de nov de 2020.
*/
package contratacionDocentes;

import java.util.ArrayList;

public class Catedratico extends Contratacion {
	// Se inicializa un arraylist con la cantidad de horas
	ArrayList<Integer> cantHoras = new ArrayList<Integer>();
	// Se inicializa un entero con el numero de horas
	private int horas = 0;

	// Metodos getters y setters
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public ArrayList<Integer> getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(ArrayList<Integer> cantHoras) {
		this.cantHoras = cantHoras;
	}

	public void pagoCated() {// Se guarda el pago en el arraylist de pagos dividiendo el pago del nivel de
								// estudio entre el numero de dias, y calculando el 10% de ese resultado,
								// posteriormente se multiplica por el numero de horas al mes
		switch (estudios) {
		case 1:
			pago.add(((doctorado / 30) / 10) * horas);
			break;
		case 2:
			pago.add(((maestria / 30) / 10) * horas);
			break;
		case 3:
			pago.add(((especializacion / 30) / 10) * horas);
			break;
		case 4:
			pago.add(((sinPostGrado / 30) / 10) * horas);
			break;
		}

	}

	public void limpiar() {//Se le agrega al metodo limpiar original el limpiar el arreglo de la cantidad de horas
		cantHoras.clear();
	}

}
