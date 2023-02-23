package ejercicio5;

import java.util.List;

public class GestionPersonas {

	private List <Persona> listaPersonas;

	public GestionPersonas(List<Persona> listaPersonas) {
		super();
		this.listaPersonas = listaPersonas;
	}

	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	@Override
	public String toString() {
		return "GestionPersonas [listaPersonas=" + listaPersonas + "]";
	}
	
	public void mostrarLinea(Persona p) {
		System.out.println("DNI: "+p.getDni()+" | Nombre: "+p.getNombre()+" | Edad: "+p.getEdad()+" | Estatura: "+p.getEstatura());
	}
}
