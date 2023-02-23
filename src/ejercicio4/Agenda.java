package ejercicio4;

import java.util.Iterator;
import java.util.Map;

public class Agenda {

	private Map<Contacto, Integer> listaContactos;

	public Agenda(Map<Contacto, Integer> listaContactos) {
		super();
		this.listaContactos = listaContactos;
	}

	public Map<Contacto, Integer> getListaContactos() {
		return listaContactos;
	}

	public void setListaContactos(Map<Contacto, Integer> listaContactos) {
		this.listaContactos = listaContactos;
	}

	@Override
	public String toString() {
		return "Agenda [listaContactos=" + listaContactos + "]";
	}
	
	public void add(Contacto c, Integer num) {
		listaContactos.put(c, num);//new Integer(num)
	}
	
	public void mostrarTodos() {
		for(Contacto c : listaContactos.keySet()) {
			System.out.println(c+" "+listaContactos.get(c));
		}
	}
	
	public Contacto buscarPorID(int id) {
		Contacto c;
		Iterator <Contacto> it = listaContactos.keySet().iterator();
		while(it.hasNext()) {
			c=it.next();
			if(c.getId()==id) {
				return c;
			}
		}
		return null;
	} 
	
	public void eliminarContacto(int id) {
		listaContactos.remove(buscarPorID(id));
	}
}
