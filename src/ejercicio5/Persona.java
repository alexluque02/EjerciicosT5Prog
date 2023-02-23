package ejercicio5;


public class Persona implements Comparable <Persona>{

	private String dni;
	private String nombre;
	private int edad;
	private double estatura;
	
	public Persona(String dni, String nombre, int edad, double estatura) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + "]";
	}

	@Override
	public int compareTo(Persona o) {
		String nombrep1=this.nombre;
		String nombrep2=o.nombre;
		return (nombrep1.toLowerCase().compareTo(nombrep2.toLowerCase()));

	}

	
	
	
}
