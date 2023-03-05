package ejercicio8;

import java.util.Map;

public class Oficina {

	Map<Integer, Cuenta> listaCuentas;

	public Oficina(Map<Integer, Cuenta> listaCuentas) {
		super();
		this.listaCuentas = listaCuentas;
	}

	public Map<Integer, Cuenta> getListaCuentas() {
		return listaCuentas;
	}

	public void setListaCuentas(Map<Integer, Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}

	@Override
	public String toString() {
		return "Oficina [listaCuentas=" + listaCuentas + "]";
	}
	
	public void add(Integer num, Cuenta c) {
		listaCuentas.put(num, c);
	}
	
	public void mostrarCuentas() {
		for(Integer i : listaCuentas.keySet()) {
			System.out.println("Clave: "+i+" Valor: "+listaCuentas.get(i));
		}
	}
	
	public Cuenta findById(int id) {
		for(Cuenta c : listaCuentas.values()) {
			if(c.getId()==id)
				return c;
		}
		return null;
	}
	
	public Integer findByIdV2(Integer id) {
		for (Integer i : listaCuentas.keySet()) {
			if(i==id)
				return i;
		}
		return -1;
	}
	
	public void edit(int id, double saldoN) {
		Cuenta c=findById(id);
		if(c!=null)
			c.setSaldo(saldoN);
	}
	
	public void delete(Integer id) {
		Integer i=findByIdV2(id);
		if(i>-1) {
			listaCuentas.remove(i);
		}
	}
	
	public void ingresarAUnaCuenta(int id, double cant) {
		Cuenta c=findById(id);
		if(c!=null)
			c.ingresar(cant);
	}
	
	public void retirarAUnaCuenta(int id, double cant) {
		Cuenta c=findById(id);
		if(c!=null)
			c.retirar(cant);
	}
	
	public double calcularTotalSaldos() {
		double total=0;
		for(Cuenta c : listaCuentas.values()) {
			total+=c.getSaldo();
		}
		return total;
	}
	
	public double calcularTotalComision() {
		double total=0;
		for(Cuenta c : listaCuentas.values()) {
			if(c instanceof CuentaEmpresa) {
				total+=((CuentaEmpresa) c).getComision();
			}
		}
		return total;
	}
	
	public double calcularTotalBonificacion() {
		double total=0;
		for(Cuenta c : listaCuentas.values()) {
			if(c instanceof CuentaJoven) {
				total+=((CuentaJoven) c).getBonificacion();
			}
		}
		return total;
	}
}
