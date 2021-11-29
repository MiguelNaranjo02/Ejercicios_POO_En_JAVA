
/*
	 * Programa: Plantilla que recoge los datos del Empleado
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 28 oct de 2020.
*/
package chequeEmpleado;

public class DatosEmpleado {
//Inicializaci�n de variables privadas
	private long ID;
	private String nombre = "";
	private String apellido = "";

	public void setID(long iD) {// M�todo setter de la identificaci�n
		ID = iD;
	}

	public long getID() {// M�todo getter de la identificaci�n

		return this.ID;
	}

	public String getNombre() {// M�todo getter del nombre
		return nombre;
	}

	public void setNombre(String nombre) {// M�todo setter del nombre
		this.nombre = nombre;
	}

	public String getApellido() {// M�todo getter del apellido
		return apellido;
	}

	public void setApellido(String apellido) {// M�todo setter del apellido
		this.apellido = apellido;
	}
}
