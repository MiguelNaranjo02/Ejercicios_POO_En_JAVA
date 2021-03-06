/*
	 * Programa: Clase que escribe el fichero
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  25 de enero de 2021.
*/
package ejemploSerializacion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write {
	public static void main(String[] args) {

		// Se inicializan las variables que contendran el fichero en el cual se
		// guardaran los datos
		FileOutputStream fos = null;
		ObjectOutputStream salida = null;
		Usuario us = new Usuario();

		try {
			fos = new FileOutputStream("src\\ficheros\\personas.txt");// Se localiza el fichero en el cual se guardaran los
																	// datos
			
			salida = new ObjectOutputStream(fos);// Los datos se pasaran al archivo en formato de bytes
			us = new Usuario("Miguel", "Naranjo", 18, 1000159445, "miguelanjoya@gmail.com", 300303544);// Se escriben
																										// datos de
																										// ejemplo
			salida.writeObject(us);// Los datos del objeto se escriben en el fichero
			us = new Usuario("Luis", "Rodriguez", 18, 1000409245, "luisrog02@gmail.com", 310363524);
			salida.writeObject(us);
			us = new Usuario("Andr?s", "Martinez", 22, 1034409455, "andmar08@hotmail.com", 310363524);
			salida.writeObject(us);

		} catch (FileNotFoundException e) {// Excepcion si no se encuentra el archivo
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fos != null)
					fos.close();// Se cierra el fichero
				if (salida != null)
					salida.close();// Se cierra el fichero a la entrada de datos en bytes
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
