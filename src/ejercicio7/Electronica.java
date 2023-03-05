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
	
	public double calcularPrecio(double porc) {
		if(lujo)
			return super.calcularPrecio(porc)*(1+porc/100);
		else
			return super.calcularPrecio(porc);
	}
}
