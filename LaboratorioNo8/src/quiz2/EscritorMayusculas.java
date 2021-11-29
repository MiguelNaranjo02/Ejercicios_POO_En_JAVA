package quiz2;

 class EscritorMayusculas extends Escritor{
	 public static void escribe(String texto) {
		 Escritor.escribe(texto.toUpperCase());
	 }

}
