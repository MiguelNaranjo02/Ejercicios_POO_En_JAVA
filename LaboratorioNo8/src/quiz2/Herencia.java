package quiz2;

public class Herencia {
	public static void main( String args[]) {
		Escritor e = new Escritor();
		EscritorAmpliado eAmp = new EscritorAmpliado();
		EscritorMayusculas eMays = new EscritorMayusculas();
		e.escribe("El primer escritor sabe escribir");
		eAmp.escribe("El segundo escritor tambien");
		eAmp.escribeConAsteriscos("y rodear con asteriscos");
		eMays.escribe("El tercero solo escribe en mayusculas");
	}

}
