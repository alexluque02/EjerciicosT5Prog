package ejercicio2;

public class Socio {

	private int id;
	private String nombre;
	private String apellidos;
	private boolean socioVip;
	
	public Socio(int id, String nombre, String apellidos, boolean socioVip) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.socioVip = socioVip;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean isSocioVip() {
		return socioVip;
	}

	public void setSocioVip(boolean socioVip) {
		this.socioVip = socioVip;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", socioVip=" + socioVip + "]";
	}
	
	
}
