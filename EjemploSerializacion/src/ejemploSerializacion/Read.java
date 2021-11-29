/*
	 * Programa: Clase que lee el fichero
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  25 de enero de 2021.
*/
package ejemploSerializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {
	public static void main(String[] args) {

		// Se inicializan las variables que daran acceso al fichero
		FileInputStream fis = null;
		ObjectInputStream entrada = null;
		Usuario p;

		try {
			fis = new FileInputStream("src\\ficheros\\personas.txt");// Se localiza el fichero a leer
			entrada = new ObjectInputStream(fis);// En la entrada se localizara el fichero para ser deserializado
			p = (Usuario) entrada.readObject(); // Se leera el fichero deserializado en formato de la clase
			// Se imprimira en consola los datos del fichero
			System.out.println("Datos del cuestionario WEB");
			System.out.println("--------------------------");
			System.out.println("Apellido    Nombre    Edad    ID            Correo              Celular");
			System.out.println(p.getApel() + "     " + p.getNombre() + "     " + p.getEdad() + "  " + p.getId() + " "
					+ p.getCor() + "   " + p.getTel());
			p = (Usuario) entrada.readObject();
			System.out.println(p.getApel() + "   " + p.getNombre() + "       " + p.getEdad() + "  " + p.getId() + " "
					+ p.getCor() + "      " + p.getTel());
			p = (Usuario) entrada.readObject();
			System.out.println(p.getApel() + "    " + p.getNombre() + "     " + p.getEdad() + "  " + p.getId() + " "
					+ p.getCor() + "     " + p.getTel());

		} catch (FileNotFoundException e) {// Excepcion sino se encuentra el archivo
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {// Excepcion sino encuentra la clase usuario para hacer el casting de datos
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null) {
					fis.close();// Se cierra el fichero
				}
				if (entrada != null) {
					entrada.close();// Se cierra la entrada de datos
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
