/*
	 * Programa: Plantilla funciones trigonométricas
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 23 oct de 2020.
*/
package calculoTrigo;

public class FuncionTrigo {

	public double fTrigo(int opc, double ang) {// Método que realiza una operación trigonométrica según la opción y el
												// ángulo recibido por el main
		double aux = 0;
		if (opc == 1) {
			ang = Math.sin(ang); // Cálculo del seno
		} else if (opc == 2) {
			ang = Math.cos(ang);// Cálculo del coseno
		} else if (opc == 3) {
			aux = Math.cos(ang);// Verifica el valor del coseno
			if (aux > -00000000000000000000.1 && aux < 0.0000000000000001) {
				ang = 2; // Si el coseno es demasiado pequeño significa que la tangente tiende a
							// infinito, y por tanto no se puede definir
			} else {
				ang = Math.tan(ang);// Cálculo de la tangente
			}
		}
		return ang;// Retorno del ángulo
	}

}
