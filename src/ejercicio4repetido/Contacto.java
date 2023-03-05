package ejercicio4repetido;

public class Contacto implements Comparable<Contacto>{

	private int id;
	private String nombre;
	private String email;
	
	public Contacto(int id, String nombre, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", email=" + email + "]";
	}

	
	@Override
	public int compareTo(Contacto o) {
		String nombre1=this.nombre;
		String nombre2=o.getNombre();
		return nombre1.toLowerCase().compareTo(nombre2.toLowerCase());
	}
	
	
}
