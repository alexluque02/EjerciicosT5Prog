package ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class CrudAlumno {

	Set<Alumno> listaAlumnos = new HashSet<Alumno>();

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

	public void add(Alumno a) {
		listaAlumnos.add(a);
	}

	public Alumno findAlumno(Alumno a) {
		if (listaAlumnos.contains(a)) {
			return a;
		}else {
			return null;
		}
	}
}
