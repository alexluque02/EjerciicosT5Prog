package ejercicio6;

import java.util.List;

public class Oficina {

	List<Trabajador> listado;

	public Oficina(List<Trabajador> listado) {
		super();
		this.listado = listado;
	}

	public List<Trabajador> getListado() {
		return listado;
	}

	public void setListado(List<Trabajador> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Oficina [listado=" + listado + "]";
	}
	
	public void add(Trabajador t) {
		listado.add(t);
	}
}
