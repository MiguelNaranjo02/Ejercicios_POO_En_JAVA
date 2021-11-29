/*
	 * Plantila: Verifica si un número es primo.
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 21 oct de 2020.
*/
package numeroPrimo;

public class EsPrimo {
	//Inicialización de variables
	int cont = 0;
	boolean valor = true;

	boolean verificaPrimo(int num) {//Método que verifica si un número es primo a partir de un número parámetro enviado desde el main
		cont = 0;
		for (int i = 1; i <= num; i++) {//Bucle que verifica si un número es primo
			if (num % i == 0) {//Si el módulo entre el número y la variable de control es igual a 0, se le sumara uno al contador 
				cont = cont + 1;
			}
		}
		if (num == 1 || num == 0) {//Excepción de números 
			cont = 3;
		}
		if (cont > 2) {//Si el contador es mayor que dos implica que no es primo, si es menor o igual implica que si lo es
			return false;//Retorna una bandera falsa al main si no es primo
		} else
			return true;//Retorna una bandera verdadera al main si es primo

	}

}
