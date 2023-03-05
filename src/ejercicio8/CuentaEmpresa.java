package ejercicio8;

public class CuentaEmpresa extends Cuenta{

	private double comision;

	public CuentaEmpresa(int id, Cliente c, double saldo, double comision) {
		super(id, c, saldo);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return super.toString()+"CuentaEmpresa [comision=" + comision + "]";
	}
	
	public void retirar(double cant) {
		super.retirar(cant);
		setSaldo(getSaldo()-1);
		comision+=1;
	}
	
}
