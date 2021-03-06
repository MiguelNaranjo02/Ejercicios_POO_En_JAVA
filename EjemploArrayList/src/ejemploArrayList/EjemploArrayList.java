package ejemploArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploArrayList {
	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> listaInvt = new ArrayList<String>();
		int nuevoDato = 1;
		int opc = 0;
		System.out.println("Este programa organiza una lista de invitados");
		System.out.println("Ingrese la lista de invitados");
		do {
			listaInvt.add(in.readLine());
			System.out.println("Si quiere ingresar otro invitado presione 1, si quiere dejar la lista asi presione 0");
			nuevoDato = Integer.parseInt(in.readLine());
		} while (nuevoDato == 1);
		System.out.println("La lista de invitados es:");
		for (int i = 0; i < listaInvt.size(); i++) {
			System.out.println((i + 1) + "." + listaInvt.get(i));
		}
		do {
			System.out.println("Seleccione la opcion que quiera hacer con la lista");
			System.out.println("1. A?adir otro invitado");
			System.out.println("2. Revisar si hay un invitado");
			System.out.println("3. Revisar cuantos invitados hay");
			System.out.println("4. Borrar un invitado de la lista de invitados");
			System.out.println("5. Imprimir lista y salir");
			opc = Integer.parseInt(in.readLine());
			switch (opc) {
			case 1:
				System.out.print("Ingrese el nombre del invitado: ");
				listaInvt.add(in.readLine());
				break;
			case 2:
				System.out.print("Ingrese el nombre de la persona a buscar: ");
				String nombre = (in.readLine());
				if (listaInvt.contains(nombre)) {
					System.out.println(nombre + " si esta en la lista");
				} else {
					System.out.println(nombre + " no esta en la lista");
				}
				break;
			case 3:
				System.out.println("El numero de invitados es: " + listaInvt.size());
				break;
			case 4:
				System.out.print("Ingrese el nombre de la persona a eliminar de la lista de invitados: ");
				listaInvt.remove((in.readLine()));
				break;
			case 5:
				Iterator<String> listIterator = listaInvt.iterator();
				listIterator= listaInvt.iterator();
				int i=1;
				while(listIterator.hasNext()){
					String elemento = listIterator.next();
					System.out.println(i+"."+elemento);
					i=i+1;
				}
				opc = 5;
			}
		} while (opc != 5);

	}
}
