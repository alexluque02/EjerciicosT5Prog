package ejercicio6;

import java.util.Iterator;
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
	
	public Trabajador findByDni(String dni) {
		boolean encontrado=false;
		int i=0;
		while(i<listado.size() && !encontrado && listado.get(i) != null) {
			if(listado.get(i).getDni().equalsIgnoreCase(dni)) {
				encontrado=true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return listado.get(i);
		}else {
			return null;
		}
	}
	
	public void mostrarSueldoUnEmpleado(Trabajador t) {
		if(t!=null) {
			System.out.printf("El sueldo de %s es: %.2f€\n",t.getNombre(), t.getSueldoFinal());
		}else {
			System.out.println("No se ha encontrado ese empleado");
		}
	}
	
	public void calcularSueldos(double cant) {
		for (Trabajador t: listado) {
			t.calcularSueldo(cant);
		}
	}
	
	public void mostrarLista() {
		for (Trabajador t : listado) {
			System.out.printf("Nombre: %s, DNI: %s, Horas Trabajadas: %dh, Sueldo Final: %.2f€\n", 
					t.getNombre(), t.getDni(), t.getHorasTrabajadas(), t.getSueldoFinal());
		}
	}
	
	public void mostrarLinea(Trabajador t) {
		System.out.printf("Nombre: %s, DNI: %s, Horas Trabajadas: %dh, Sueldo Final: %.2f€\n", 
				t.getNombre(), t.getDni(), t.getHorasTrabajadas(), t.getSueldoFinal());
	}
	
	public boolean editHoras(Trabajador t, int nNuevo) {
		if(t!=null) {
			t.setHorasTrabajadas(nNuevo);
			return true;
		}else {
			return false;
		}
	}
	
	public void comprobarEditado(boolean t) {
		if(t) {
			System.out.println("Editado con éxito");
		}else {
			System.out.println("No se ha encontrado");
		}
	}
}
