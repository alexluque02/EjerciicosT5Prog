package ejercicio8;

public class CuentaJoven extends Cuenta{

	private double bonificacion;

	public CuentaJoven(int id, Cliente c, double saldo, double bonificacion) {
		super(id, c, saldo);
		this.bonificacion = bonificacion;
	}

	public double getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}

	@Override
	public String toString() {
		return super.toString()+"CuentaJoven [bonificacion=" + bonificacion + "]";
	}
	
	public void ingresar(double cant) {
		super.ingresar(cant);
		setSaldo(getSaldo()+1);
		bonificacion+=1;
	}
}
