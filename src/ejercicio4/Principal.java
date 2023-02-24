package ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Principal {

	public static void main(String[] args) {
		Map <Contacto, Integer> listaContactos=new HashMap <Contacto, Integer>();
		Map<Contacto, Integer> ordenado;
		Agenda a=new Agenda(listaContactos);
		
		a.add(new Contacto(1, "Alex", "a@a.com"), 664845326);
		a.add(new Contacto(2, "Zablo", "b@b.com"), 664845328);
		a.add(new Contacto(3, "Eabsfdsdlo", "c@b.com"), 664845325);
		
		a.mostrarTodos();
		
		System.out.println(a.buscarPorID(1));
		
		/*a.eliminarContacto(1);
		
		a.mostrarTodos();*/
		
		/*Hacer menu que el primero sea mostrar agenda sin treemap*/
		
		ordenado = new TreeMap<Contacto, Integer>();
		ordenado.putAll(listaContactos);
		
		System.out.println("Lista Ordenada");
		for (Contacto c : ordenado.keySet()) {
			System.out.println("Clave: "+c+" Valor: "+ordenado.get(c));
		}
		
		/*ordenado = new TreeMap<Contacto, Integer>(new ComparaPorID());*/ //Así en cada case
		//Mé6todo replace para editar
	}

}
