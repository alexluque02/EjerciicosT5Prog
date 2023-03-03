package ejercicio7;

import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		Map<Integer, LineaVenta> tree;
		
		//Después
		
		tree=new TreeMap<Integer,LineaVenta>(new ComparaPorInteger);
		tree.putAll(listaProd);//Anteriormente definida

	}

}
