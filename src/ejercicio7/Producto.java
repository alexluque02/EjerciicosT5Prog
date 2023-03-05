package ejercicio7;

import java.util.Objects;

public class Producto {

	private int id;
	private String nombre;
	private double precioUnitario;
	
	public Producto(int id, String nombre, double precioUnitario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
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

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {
		return "Ropa [id=" + id + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, precioUnitario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return id == other.id && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precioUnitario) == Double.doubleToLongBits(other.precioUnitario);
	}

	public double calcularPrecio(double porc) {
		return this.precioUnitario;
	}
}
