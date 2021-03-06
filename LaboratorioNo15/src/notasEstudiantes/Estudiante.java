/*
	 * Programa: Clase Estudiante que contiene la estructura del objeto
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  31 de enero de 2021.
*/
package notasEstudiantes;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class Estudiante {
	// Creacion de atributos a utilizar
	private String nombre = "";
	private String apellido = "";
	private int codigo;
	private int par1;
	private int par2;
	private int exa;

	// Metodos getters y setters
	public double getDef() {
		return def;
	}

	public void setDef(double def) {
		this.def = def;
	}

	private double def;

	public int getPar1() {
		return par1;
	}

	public void setPar1(int par1) {
		this.par1 = par1;
	}

	public int getPar2() {
		return par2;
	}

	public void setPar2(int par2) {
		this.par2 = par2;
	}

	public int getExa() {
		return exa;
	}

	public void setExa(int exa) {
		this.exa = exa;
	}

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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	// Metodo constructor de la clase, que guarda los atributos
	public Estudiante(String nombre, String apellido, int codigo, int par1, int par2, int exa) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigo = codigo;
		this.par1 = par1;
		this.par2 = par2;
		this.exa = exa;
		def = (par1 * 0.35) + (par2 * 0.35) + (exa * 0.30);// Se calcula la definitiva segun las notas
		def = Math.round(def * 100.0) / 100.0;
	}

	public Estudiante() {

	}

	public void guardar(PrintWriter escribe) {// Metodo que escribe los atributos del objeto en el archivo
		escribe.println(nombre);
		escribe.println(apellido);
		escribe.println(codigo);
		escribe.println(par1);
		escribe.println(par2);
		escribe.println(exa);
		escribe.println(def);

	}

	public Estudiante cargar(BufferedReader almacen) {// Metodo que carga los atributos de los objetos en el archivo
		String nom;
		String ape;
		int cod;
		int pa1;
		int pa2;
		int ex;
		double defin;
		try {
			nom = almacen.readLine();
			ape = almacen.readLine();
			cod = Integer.parseInt(almacen.readLine());
			pa1 = Integer.parseInt(almacen.readLine());
			pa2 = Integer.parseInt(almacen.readLine());
			ex = Integer.parseInt(almacen.readLine());
			defin = Double.parseDouble(almacen.readLine());
			return new Estudiante(nom, ape, cod, pa1, pa2, ex);// Se retorna un nueo objeto como un constructor
		} catch (Exception e) {

		}
		return null;
	}

}
