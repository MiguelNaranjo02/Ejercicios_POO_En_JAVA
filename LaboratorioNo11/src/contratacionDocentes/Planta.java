/*
	 * Programa: Subclase de la clase contratacion que se centra en los docentes de planta
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  25 de nov de 2020.
*/
package contratacionDocentes;

public class Planta extends Contratacion{
	
	public void pagoPlanta() {//Metodo que calcula el pago del docente segun si nivel de estudio
	switch(estudios) {
	case 1:
		pago.add(doctorado);//El apago se a?ade al arraylist del pago
		break;
	case 2:
		pago.add(maestria);
		break;
	case 3:
		pago.add(especializacion);
		break;
	case 4:
		pago.add(sinPostGrado);
		break;
	}
	}
	

}