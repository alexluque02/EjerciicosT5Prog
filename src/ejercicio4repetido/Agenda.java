package ejercicio4repetido;

import java.util.HashMap;
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
	
	public void add(Contacto c, Integer tlf) {
		listaContactos.put(c, tlf);
	}
	
	public void delete(Contacto c) {
		listaContactos.remove(c);
	}
	
	public void mostrarLista() {
		for(Contacto c:listaContactos.keySet()) {
			System.out.println("Contacto: "+c+" Tlf: "+listaContactos.get(c));
		}
	}
	
	public Map<Contacto, Integer> findByName(String nombre) {
		Map<Contacto, Integer> lista = new HashMap<Contacto, Integer>();
		for(Contacto c : listaContactos.keySet()) {
			if(c.getNombre().equalsIgnoreCase(nombre)) {
				lista.put(c, listaContactos.get(c));
			}
		}
		return lista;
	}
	
	public Contacto findById(int id) {
		for(Contacto c: listaContactos.keySet()) {
			if(c.getId()==id) {
				return c;
			}
		}
		return null;
	}
	
	public void editName(Contacto c, String nombreN) {
		if(c!=null)
			c.setNombre(nombreN);
	}
	
	public void mostrarListaNombre(Map<Contacto, Integer>lista) {
		for(Contacto c: lista.keySet()) {
			System.out.println("Contacto: "+c+" Teléfono: "+lista.get(c));
		}
	}
}
