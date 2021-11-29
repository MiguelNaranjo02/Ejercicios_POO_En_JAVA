/*
	 * Programa: Programa que muestra las medidas tanque agua
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  28 de oct de 2020.
*/
package medidasTanqueAgua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class medidasTanqueAgua {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Inicialización de variables
		int reint = 0;
		double alt = 0;
		double rad = 0;
		// Creación de nuevos objetos
		VolumenTanqueAgua volume = new VolumenTanqueAgua();
		SuperficieTanqueAgua sup = new SuperficieTanqueAgua();
		System.out.println(
				"Este programa calcula la medida de la superficie y el volumen de un tanque de agua de forma cilíndrica");
		do {
			System.out.print("Ingrese la medida de la altura del tanque de agua: ");
			alt = Double.parseDouble(in.readLine());// El usuario ingresa la altura del tanque agua
			while (alt <= 0) {// Verificación de que la medida de la altura no sea menor o igual a 0
				System.out.println("La altura no puede ser menor o igual a 0");
				System.out.print("Ingrese la medida de la altura del tanque de agua: ");
				alt = Double.parseDouble(in.readLine());
			}
			System.out.print("Ingrese la medida del radio del tanque de agua: ");
			rad = Double.parseDouble(in.readLine());// El usuario ingresa el radio del tanque de agua
			while (rad <= 0) {// Verificación de que el radio no sea menor o igual a 0
				System.out.println("El radio no puede ser menor o igual a 0");
				System.out.print("Ingrese la medida del radio del tanque de agua: ");
				rad = Double.parseDouble(in.readLine());
			}
			volume.setAlt(alt);// La altura del tanque de agua se envía a la clase que calcula el volumen
			volume.setRad(rad);// El radio del tanque de agua se envía a la clase que calcula el volumen
			sup.setAlt(alt);// La altura del tanque de agua se envía a la clase que calcula la superficie
			sup.setRad(rad);// El radio del tanque de agua se envía a la clase que calcula la superficie
			System.out.println("El volumen del tanque de agua con altura " + volume.getAlt() + " y radio "
					+ volume.getRad() + " es " + volume.vol() + " unidades cubicas");// Se imprime en pantalla el
																						// volumen del tanque de agua
			System.out.println("La superficie del tanque de agua con altura " + sup.getAlt() + " y radio "
					+ sup.getRad() + " es " + sup.superf() + " unidades cuadradas");// Se imprime en pantalla la
																					// superficie del tanque de agua

			System.out.println("Si quiere salir presione 1\nSi quiere hacer otro calculo presione 0.");
			reint = Integer.parseInt(in.readLine());// El usuario ingresa una opción del menú
			while (reint != 0 && reint != 1) {// Verificación de que el número corresponda a las opciones del menú
				System.out.println("Opción inválida.");
				System.out.println("Si quiere salir presione 1\nSi quiere hacer otro calculo presione 0.");
				reint = Integer.parseInt(in.readLine());
			}
		} while (reint == 0);
		System.out.println("Muchas gracias.");
	}

}
