package ejercicioRepaso1;

import java.util.List;
import java.util.Objects;

public class Alumno implements Comparable <Alumno>{

	private String dni;
	private String nombre;
	private String apellidos;
	private String curso;
	private List <Nota> listaNotas;
	
	public Alumno(String dni, String nombre, String apellidos, String curso, List<Nota> listaNotas) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
		this.listaNotas = listaNotas;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public List<Nota> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(List<Nota> listaNotas) {
		this.listaNotas = listaNotas;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", curso=" + curso
				+ ", listaNotas=" + listaNotas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, curso, dni, listaNotas, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(curso, other.curso)
				&& Objects.equals(dni, other.dni) && Objects.equals(listaNotas, other.listaNotas)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Alumno o) {
		String apellido1=this.apellidos;
		String apellido2=o.getApellidos();
		return apellido1.toLowerCase().compareTo(apellido2.toLowerCase());
	}
	
	
}
