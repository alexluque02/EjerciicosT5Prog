package ejercicio8;

import java.util.Objects;

public class Cuenta {

	private int id;
	private Cliente c;
	private double saldo;
	
	public Cuenta(int id, Cliente c, double saldo) {
		super();
		this.id = id;
		this.c = c;
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", c=" + c + ", saldo=" + saldo + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(c, id, saldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return Objects.equals(c, other.c) && id == other.id
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}

	public void ingresar(double cant) {
		setSaldo(getSaldo()+cant);
	}
	
	public void retirar(double cant) {
		setSaldo(getSaldo()-cant);
	}
}
