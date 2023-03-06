package ejercicioRepaso1;

public class Nota {

	private int cod_asign;
	private String nombre;
	private double nota;
	
	public Nota(int cod_asign, String nombre, double nota) {
		super();
		this.cod_asign = cod_asign;
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public int getCod_asign() {
		return cod_asign;
	}
	public void setCod_asign(int cod_asign) {
		this.cod_asign = cod_asign;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "Nota [cod_asign=" + cod_asign + ", nombre=" + nombre + ", nota=" + nota + "]";
	}
	
	
	
}
