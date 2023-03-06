package ejercicioRepaso1;

import java.util.Iterator;
import java.util.Map;

public class Colegio {

	private String nombre;
	private Map<Alumno, Integer> /*Cod_matrícula*/ listaAlumnos;
	
	public Colegio(String nombre, Map<Alumno, Integer> listaAlumnos) {
		super();
		this.nombre = nombre;
		this.listaAlumnos = listaAlumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<Alumno, Integer> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(Map<Alumno, Integer> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "Colegio [nombre=" + nombre + ", listaAlumnos=" + listaAlumnos + "]";
	}
	
	public void add(Alumno a, Integer cod_mat) {
		listaAlumnos.put(a, cod_mat);
	}
	
	public void mostrarLista() {
		for(Alumno a:listaAlumnos.keySet()) {
			GestionNotas gn=new GestionNotas(a.getListaNotas());
			System.out.println("Alumno");
			System.out.println("-----------");
			System.out.println(a.getApellidos()+", "+a.getNombre()+" | DNI: "+a.getDni()+" | Curso: "+a.getCurso());
			gn.mostrarNotas();
			System.out.println();
		}
	}
	
	public Alumno findByDni(String dni) {
		Iterator <Alumno> it = listaAlumnos.keySet().iterator();
		Alumno a;
		while(it.hasNext()) {
			a=it.next();
			if(a.getDni().equalsIgnoreCase(dni)) {
				return a;
			}
		}
		return null;
	}
	
	public boolean editNota(double notaN, int cod_asign, String dni) {
		Alumno a=findByDni(dni);
		GestionNotas gn;
		if(a!=null) {
			gn=new GestionNotas(a.getListaNotas());
			if(gn.editNotas(cod_asign, notaN)) {
				gn.editNotas(cod_asign, notaN);
				return true;	
			}
		}
		return false;
	}
	
	public double calcularUnaNotaMedia(String dni) {
		Alumno a=findByDni(dni);
		GestionNotas gn;
		if(a!=null) {
			gn=new GestionNotas(a.getListaNotas());
			return gn.calcularNotaMedia();
		}
		return -1;
	}
	
	public double calcularNotaMediaTotal(Map<Alumno, Integer> lista) {
		GestionNotas gn;
		Iterator <Alumno> it = lista.keySet().iterator();
		double suma=0;
		Alumno a;
		while(it.hasNext()) {
			a=it.next();
			gn=new GestionNotas(a.getListaNotas());
			suma+=gn.calcularNotaMedia();
		}
		return suma/lista.size();
	}
	
	public boolean remove(String dni) {
		Alumno a=findByDni(dni);
		if(a!=null) {
			listaAlumnos.remove(a);
			return true;
		}
		return false;
	}
	
	public void mostrarAlumno(Alumno a) {
		GestionNotas gn=new GestionNotas(a.getListaNotas());
		System.out.println("Alumno");
		System.out.println("-----------");
		System.out.println(a.getApellidos()+", "+a.getNombre()+" | DNI: "+a.getDni()+" | Curso: "+a.getCurso());
		gn.mostrarNotas();
		System.out.println();
	}
}
