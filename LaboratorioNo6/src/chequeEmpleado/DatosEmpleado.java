
/*
	 * Programa: Plantilla que recoge los datos del Empleado
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 28 oct de 2020.
*/
package chequeEmpleado;

public class DatosEmpleado {
//Inicialización de variables privadas
	private long ID;
	private String nombre = "";
	private String apellido = "";

	public void setID(long iD) {// Método setter de la identificación
		ID = iD;
	}

	public long getID() {// Método getter de la identificación

		return this.ID;
	}

	public String getNombre() {// Método getter del nombre
		return nombre;
	}

	public void setNombre(String nombre) {// Método setter del nombre
		this.nombre = nombre;
	}

	public String getApellido() {// Método getter del apellido
		return apellido;
	}

	public void setApellido(String apellido) {// Método setter del apellido
		this.apellido = apellido;
	}
}
