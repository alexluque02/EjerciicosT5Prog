package ejercicio6;

public class Trabajador implements Comparable <Trabajador>{

	private String nombre;
	private String dni;
	private int horasTrabajadas;
	private double sueldoFinal;
	
	public Trabajador(String nombre, String dni, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.horasTrabajadas = horasTrabajadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoFinal() {
		return sueldoFinal;
	}

	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", horasTrabajadas=" + horasTrabajadas
				+ ", sueldoFinal=" + sueldoFinal + "]";
	}
	
	public void calcularSueldo(double cant) {
		this.sueldoFinal=cant*this.horasTrabajadas;
	}

	@Override
	public int compareTo(Trabajador t) {
		int horast1=this.horasTrabajadas;
		int horast2=t.getHorasTrabajadas();
		if(horast1>horast2) {
			return 1;
		}else
			if(horast1<horast2)
				return -1;
		return 0;
	}
	
	
}
