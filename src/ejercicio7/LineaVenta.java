package ejercicio7;


public class LineaVenta {

	private Producto p;
	private int cantidad;
	
	public LineaVenta(Producto p, int cantidad) {
		super();
		this.p = p;
		this.cantidad = cantidad;
	}

	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "LineaVenta [p=" + p + ", cantidad=" + cantidad + "]";
	}
	
	public double calcularSumaPrecio() {
		return p.getPrecioUnitario()*cantidad;
	}
	
	public void mostrarLinea() {
		if(p instanceof Alimentacion) {
			((Alimentacion) p).avisarCaducidad();
		}
		System.out.printf("Cod.:%d  %s x %d %.2f€\n", p.getId(), p.getNombre(), getCantidad(), p.getPrecioUnitario());

	}
}
