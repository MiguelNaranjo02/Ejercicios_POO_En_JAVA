/*
	 * Programa: Plantilla funciones trigonom�tricas
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 23 oct de 2020.
*/
package calculoTrigo;

public class FuncionTrigo {

	public double fTrigo(int opc, double ang) {// M�todo que realiza una operaci�n trigonom�trica seg�n la opci�n y el
												// �ngulo recibido por el main
		double aux = 0;
		if (opc == 1) {
			ang = Math.sin(ang); // C�lculo del seno
		} else if (opc == 2) {
			ang = Math.cos(ang);// C�lculo del coseno
		} else if (opc == 3) {
			aux = Math.cos(ang);// Verifica el valor del coseno
			if (aux > -00000000000000000000.1 && aux < 0.0000000000000001) {
				ang = 2; // Si el coseno es demasiado peque�o significa que la tangente tiende a
							// infinito, y por tanto no se puede definir
			} else {
				ang = Math.tan(ang);// C�lculo de la tangente
			}
		}
		return ang;// Retorno del �ngulo
	}

}
