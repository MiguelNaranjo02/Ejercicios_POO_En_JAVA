/*
	 * Programa: Clase que contiene los atributos a escribir en el fichero
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  25 de enero de 2021.
*/
package ejemploSerializacionGui;

import java.io.Serializable;

public class Usuario implements Serializable {
	// Se inicializan los tributos que se escribiran en el fichero
	private String nom;
	private String apel;
	private int edad;
	private int id;
	private String cor;
	private int tel;

	public Usuario() {
	}

//Metodos getters y setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApel() {
		return apel;
	}

	public void setApel(String apel) {
		this.apel = apel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nom;
	}

	public void setNombre(String nombre) {
		this.nom = nombre;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

//Metodo constructor que escribe los tributos de la clase
	public Usuario(String nombre, String apellido, int edad, int identificacion, String correo, int telefono) {
		this.nom = nombre;
		this.apel = apellido;
		this.edad = edad;
		this.id = identificacion;
		this.cor = correo;
		this.tel = telefono;
	}

}