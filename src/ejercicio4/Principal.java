package ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Principal {

	public static void main(String[] args) {
		Map <Contacto, Integer> listaContactos=new HashMap <Contacto, Integer>();
		Agenda a=new Agenda(listaContactos);
		
		a.add(new Contacto(1, "Alex", "a@a.com"), 664845326);
		a.add(new Contacto(2, "Zablo", "b@b.com"), 664845328);
		a.add(new Contacto(3, "Eabsfdsdlo", "c@b.com"), 664845325);
		
		a.mostrarTodos();
		
		System.out.println(a.buscarPorID(1));
		
		/*a.eliminarContacto(1);
		
		a.mostrarTodos();*/
		
		TreeMap<Contacto, Integer> ordenado = new TreeMap<>(listaContactos);
		
		System.out.println(ordenado);
		
	}

}
