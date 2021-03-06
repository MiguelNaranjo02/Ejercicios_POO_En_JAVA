/*
	 * Programa: Plantilla que calcula la serie de Fibonacci
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  20 de nov de 2020.
*/
package fibonacci;

public class FibonacciMet {
	//Se inicializan las variables privadas
	private int pos;
	private int opc;
	private String suces;
	//Metodos getters y setters
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public int getOpc() {
		return opc;
	}
	public void setOpc(int opc) {
		this.opc = opc;
		//Segun la opcion enviada por el menu
		if(opc==0) {//Si es igual a 0 se llamara a la funcion recursiva que calcula la sucesion
			System.out.println(FiboRec(pos));
		}
		if(opc==1) {//Si es igual a 1 se llamara a la funcion iterativa que calcula la sucesion
			System.out.println(SucesIter(pos));
		}
	}
	public String SucesIter(int num) {//Metodo que calcula la sucesion de fibonacci y la retorna en un string
		int j=1;
		int k=1;
		suces="";
		for (int i=1;i<num-1;i++) {//Se recorren las posiciones de la serie de fibonacci desde 1 hasta el numero en cuestion -1
			int aux;
			if (i==1) {//Si i=1, se le a?adiran al string los primeros numeros de la serie, 1 1
				suces=suces+j+" "+k+" ";
			}
			aux=j+k; //Se suman los numeros anteriores y se guardan en un auxiliar
			j=k;//Se iguala el numero antecesor al numero sucesor
			k=aux; //Se iguala el numero sucesor a la suma de los dos anteriores
			
			suces=suces+aux+" "; //Se guarda la suma de los numeros anteriores en un string junto con los demas numeros de la serie
		}
		if (num==1) {//Si num==1 no entrara al for, se fuerza, que el string sea 1
			suces= suces+1;
		}
		if ( num==2) {//Si el num==2 no entrara en el for, se fuerza que el string sea 1 1
			suces=suces+1+" "+1;
		}
		
		return  suces;//Se retorna el string con la serie
	}
	
	public int sucesRec(int num) {//Metodo que encuentra el valor de la posicion de fibonacci ingresada
		if((num==0)||num==1) {
			return num;
		}else {
			return sucesRec(num-1)+sucesRec(num-2);//Se retorna y se llama al mismo metodo con la sucesion num-1 y la sucesion num-2
		}
	}
	

	public String FiboRec(int num) {
		suces="";
		for(int i=1;i<num+1;i++) {//Se recorre los numeros desde el 1 hasta la posicion ingresada
			suces=suces+sucesRec(i)+" "; //Se llama al metodo iterativo y y se guarda en un string con todos los numeros de la sucesion
		}
		return suces;
		
		
	}
	

}

