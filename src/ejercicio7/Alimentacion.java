package ejercicio7;

public class Alimentacion extends Producto{

	private int caducidad;

	public Alimentacion(int id, String nombre, double precioUnitario, int caducidad) {
		super(id, nombre, precioUnitario);
		this.caducidad = caducidad;
	}

	public int getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(int caducidad) {
		this.caducidad = caducidad;
	}

	@Override
	public String toString() {
		return super.toString()+"Alimentacion [caducidad=" + caducidad + "]";
	}

	public double calcularPrecio(double precio, double porc) {
		if(caducidad<=2)
			return super.calcularPrecio(precio, porc)*(1-porc);
		else
			return super.calcularPrecio(precio, porc);
	}
	
	public void avisarCaducidad() {
		if(caducidad<=2) {
			System.out.println("Al producto le quedan menos de dos días para caducar");
		}
	}
}
