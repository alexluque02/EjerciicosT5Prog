package ejercicio8;

public class CuentaCorriente extends Cuenta{

	private double mantenimientoFijo;
	private int puntos;
	
	public CuentaCorriente(int id, Cliente c, double saldo, double mantenimientoFijo, int puntos) {
		super(id, c, saldo);
		this.mantenimientoFijo = mantenimientoFijo;
		this.puntos = puntos;
	}

	public double getMantenimientoFijo() {
		return mantenimientoFijo;
	}

	public void setMantenimientoFijo(double mantenimientoFijo) {
		this.mantenimientoFijo = mantenimientoFijo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return super.toString()+"CuentaCorriente [mantenimientoFijo=" + mantenimientoFijo + ", puntos=" + puntos + "]";
	}
	
	public void ingresar(double cant) {
		super.ingresar(cant);
		puntos++;
	}

	@Override
	public void retirar(double cant) {
		super.retirar(cant);
		puntos++;
	}
	
}
