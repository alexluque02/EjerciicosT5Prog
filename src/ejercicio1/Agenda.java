package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	List <Nota> lista = new ArrayList <Nota>();

	public Agenda(List<Nota> lista) {
		super();
		this.lista = lista;
	}

	public List<Nota> getLista() {
		return lista;
	}

	public void setLista(List<Nota> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Agenda [lista=" + lista + "]";
	}
	
	public void mostrarLista() {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Nota "+(i+1));
			System.out.println("--------------");
			System.out.println("Título: "+lista.get(i).getTitulo());
			System.out.println("Cuerpo: "+lista.get(i).getTexto());
			System.out.println("***************************");
		}
	}
}
