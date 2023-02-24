package ejercicio4;

import java.util.Objects;

public class Contacto implements Comparable <Contacto>{

	private int id;
	private String nombre;
	private String correo;
	
	public Contacto(int id, String nombre, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", correo=" + correo + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(correo, id, nombre); //Si vamos a utilizar una colección tipo hash
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(correo, other.correo) && id == other.id && Objects.equals(nombre, other.nombre);
	}
	
	public int compareTo(Contacto c) {
		String nombrec1=this.nombre;
		String nombrec2=c.getNombre();
        return (nombrec1.toLowerCase().compareTo(nombrec2.toLowerCase()));
    }
	
	
}
