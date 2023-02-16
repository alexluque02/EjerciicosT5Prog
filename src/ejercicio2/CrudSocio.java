package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class CrudSocio {

	List <Socio> lista = new ArrayList <Socio>();

	public CrudSocio(List<Socio> lista) {
		super();
		this.lista = lista;
	}

	public List<Socio> getLista() {
		return lista;
	}

	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudSocio [lista=" + lista + "]";
	}
	
	public void agregar(int contador, Socio s) {
		lista.add(contador, s);
	}
	
	public void mostrarSocios() {
		String clientVip="No";
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).isSocioVip()) {
				clientVip="Sí";
			}
			System.out.println("ID:"+lista.get(i).getId()+" Nombre y apellidos: "
					+ ""+lista.get(i).getNombre()+" "+lista.get(i).getApellidos()+" Cliente VIP: "
							+ ""+clientVip);
		}
	}
	
	public Socio findSocio (int id) {
		boolean encontrado=false;
		int i=0;
		while(i<lista.size() && !encontrado) {
			if(lista.get(i).getId()==id) {
				encontrado=true;
			}else {
				i++;
			}
		}
		
		if(encontrado) {
			return lista.get(i);
		}else {
			return null;
		}
	}
	
	public void mostrarSocio(Socio s) {
		String clientVip="No";
		if(s!=null) {
			if(s.isSocioVip()) {
				clientVip="Sí";
			}
			System.out.println("ID:"+s.getId()+" Nombre y apellidos: "
					+ ""+s.getNombre()+" "+s.getApellidos()+" Cliente VIP: "
							+ ""+clientVip);
		}
	}
	
	public void cambiarNombre(Socio s, String nombreN) {
		if(s!=null) {
			s.setNombre(nombreN);
		}
	}
	
	public void borrarCliente(int i) {
		if(i<=lista.size()) {
			lista.remove(i);
		}
	}
}
