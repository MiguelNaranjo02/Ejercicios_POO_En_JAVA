/*
	 * Programa: Subclase de la clase contratacion que se centra en los docentes con vinculacion especial a la universidad
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  25 de nov de 2020.
*/
package contratacionDocentes;

public class VincEspecial extends Contratacion {

	public void pagoEspecial() {
		switch (estudios) {
		// Se guarda el pago en el arraylist del pago calculando el 85% del pago a un
		// docente de planta con el mismo nivel de estudio
		case 1:
			pago.add((doctorado * 85) / 100);
			break;
		case 2:
			pago.add((maestria * 85) / 100);
			break;
		case 3:
			pago.add((especializacion * 85) / 100);
			break;
		case 4:
			pago.add((sinPostGrado * 85) / 100);
			break;
		}
	}
}
