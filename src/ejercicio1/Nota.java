package ejercicio1;

public class Nota {

	private String titulo;
	private String texto;
	
	public Nota(String titulo, String texto) {
		super();
		this.titulo = titulo;
		this.texto = texto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Nota [titulo=" + titulo + ", texto=" + texto + "]";
	}
	
}
