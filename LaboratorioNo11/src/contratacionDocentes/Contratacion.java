/*
	 * Programa: Superclase de la contratacion docente en una universidad
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  25 de nov de 2020.
*/
package contratacionDocentes;

import java.util.ArrayList;

public class Contratacion {
	//Se inicializan los arraylist de los datos del docente
	protected ArrayList<String> nombres = new ArrayList<String>();
	protected ArrayList<String> apellidos = new ArrayList<String>();
	protected ArrayList<Double> pago = new ArrayList<Double>();
	protected ArrayList<Integer> nivel = new ArrayList<Integer>();
	//Se inicializan las variables con los valores para cada nivel de estudio
	protected double doctorado = 7000000;
	protected double maestria = 5000000;
	protected double especializacion = 4000000;
	protected double sinPostGrado = 3000000;
	//Se inicializa un entero con el numero correspondiente a los niveles de estudio
	protected int estudios=0;
	//Metodos getters and setters
	public ArrayList<String> getNombres() {
		return nombres;
	}
	public void setNombres(ArrayList<String> nombres) {
		this.nombres = nombres;
	}
	public ArrayList<String> getApellidos() {
		return apellidos;
	}
	public void setApellidos(ArrayList<String> apellidos) {
		this.apellidos = apellidos;
	}
	public ArrayList<Double> getPago() {
		return pago;
	}
	public void setPago(ArrayList<Double> pago) {
		this.pago = pago;
	}
	public double getDoctorado() {
		return doctorado;
	}
	public void setDoctorado(double doctorado) {
		this.doctorado = doctorado;
	}
	public double getMaestria() {
		return maestria;
	}
	public void setMaestria(double maestria) {
		this.maestria = maestria;
	}
	public double getEspecializacion() {
		return especializacion;
	}
	public void setEspecializacion(double especializacion) {
		this.especializacion = especializacion;
	}
	public double getSinPostGrado() {
		return sinPostGrado;
	}
	public void setSinPostGrado(double sinpostgrado) {
		this.sinPostGrado = sinpostgrado;
	}
	public int getEstudios() {
		return estudios;
	}
	public void setEstudios(int estudios) {
		this.estudios = estudios;
	}
	//Metodo que limpia los arraylist de los datos
	public void limpiar() {
		nombres.clear();
		apellidos.clear();
		pago.clear();
		nivel.clear();
	}

}
