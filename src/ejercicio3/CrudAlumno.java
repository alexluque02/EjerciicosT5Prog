package ejercicio3;

import java.util.Iterator;
import java.util.Set;

public class CrudAlumno {

	Set<Alumno> listaAlumnos;

	public CrudAlumno(Set<Alumno> listaAlumnos) {
		super();
		this.listaAlumnos = listaAlumnos;
	}

	public Set<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(Set<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "CrudAlumno [listaAlumnos=" + listaAlumnos + "]";
	}

	public void mostrarAlumnos() {
		for (Alumno a : listaAlumnos) {
			System.out.println("id: "+a.getId()+" | nombre: "+a.getNombre()+" | edad: "+a.getEdad()+" | nota media: "+a.getNotaMedia());
		}
	}
	
	public void mostrarAlumnosV2() {
		for (Iterator <Alumno> it = listaAlumnos.iterator(); it.hasNext();) {
			Alumno a = (Alumno) it.next();
			System.out.println("id: "+a.getId()+" | nombre: "+a.getNombre()+" | edad: "+a.getEdad()+" | nota media: "+a.getNotaMedia());
		}
	}
	
	public void mostrarAlumnosV3() {
		Iterator <Alumno> it= listaAlumnos.iterator();
		while(it.hasNext()) {
			Alumno a = (Alumno) it.next();
			System.out.println("id: "+a.getId()+" | nombre: "+a.getNombre()+" | edad: "+a.getEdad()+" | nota media: "+a.getNotaMedia());
		}
	}
	
	public void add(Alumno a) {
		listaAlumnos.add(a);
	}

	public void findAlumno(Alumno a) {
		if (listaAlumnos.contains(a)) {
			System.out.println("si");
		}else {
			System.out.println("no");
		}
	}
	
	public double calcularNotaMediaTotal() {
		double suma=0;
		/*Iterator <Alumno> it= listaAlumnos.iterator();
		while(it.hasNext()) {
			Alumno a = (Alumno) it.next();
			suma+=a.getNotaMedia();
		}*/
		if(listaAlumnos.size()!=0) {
			for (Alumno a : listaAlumnos) {
				suma+=a.getNotaMedia();
			}
			return suma/listaAlumnos.size();
		}
		else
			return 0;
	}
	
	public int contarAlumnosSuspensos() {
		int cont=0;
		for(Alumno a: listaAlumnos) {
			if(a.getNotaMedia()<5)
				cont++;
		}
		return cont;
	}
}
