/*
	 * Programa: Calculadora de la variable de una ecuación de primer grado
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha: 23 oct de 2020.
*/
package ecuacionPrimerGrado;

public class CalculoDespeje {
	double res;
public double despeje(double A, double B, double C) {
	if (A!=0) {//Si A es diferente de 0 se hará el calculo
		res=(C-B)/A;//Despeje correspondiente a la variable x
	}
	return res;//Retorno del valor de x
}
}

