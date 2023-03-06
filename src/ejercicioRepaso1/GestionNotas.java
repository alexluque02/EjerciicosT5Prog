package ejercicioRepaso1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionNotas {

	List <Nota> listaNotas = new ArrayList <Nota> ();

	public GestionNotas(List<Nota> listaNotas) {
		super();
		this.listaNotas = listaNotas;
	}

	public List<Nota> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(List<Nota> listaNotas) {
		this.listaNotas = listaNotas;
	}

	@Override
	public String toString() {
		return "GestionNotas [listaNotas=" + listaNotas + "]";
	}
	
	public void add(int cod_asign, double nota, String nombre) {
		listaNotas.add(new Nota(cod_asign, nombre, nota));
	}
	
	public Nota findById(int cod_asign) {
		Iterator<Nota>it=listaNotas.iterator();
		Nota n;
		while(it.hasNext()) {
			n=it.next();
			if(n.getCod_asign()==cod_asign) {
				return n;
			}
		}
		return null;
	}
	
	public boolean editNotas(int cod_asign, double notaN) {
		Nota n=findById(cod_asign);
		if(n!=null) {
			n.setNota(notaN);
			return true;
		}
		return false;
	}
	
	public double calcularNotaMedia() {
		double suma=0;
		Iterator <Nota> it= listaNotas.iterator();
		Nota n;
		while(it.hasNext()) {
			n=it.next();
			suma+=n.getNota();
		}
		return suma/listaNotas.size();
	}
	
	public void mostrarNotas() {
		for (Nota nota : listaNotas) {
			System.out.println("Cod. Asign: "+nota.getCod_asign()+" | Asignatura: "+nota.getNombre()+""
					+ " | Nota: "+nota.getNota());
		}
	}
}
