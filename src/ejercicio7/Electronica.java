package ejercicio7;

public class Electronica extends Producto{

	private boolean lujo;

	public Electronica(int id, String nombre, double precioUnitario, boolean lujo) {
		super(id, nombre, precioUnitario);
		this.lujo = lujo;
	}

	public boolean isLujo() {
		return lujo;
	}

	public void setLujo(boolean lujo) {
		this.lujo = lujo;
	}

	@Override
	public String toString() {
		return super.toString()+"Electronica [lujo=" + lujo + "]";
	}
	
	public double calcularPrecio(double precio, double porc) {
		if(lujo)
			return super.calcularPrecio(precio, porc)*(1-porc);
		else
			return super.calcularPrecio(precio, porc);
	}
}
