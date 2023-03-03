package ejercicio7;


import java.util.Map;

public class Venta {

	private Map<Integer, LineaVenta> listaProd;

	public Map<Integer, LineaVenta> getListaProd() {
		return listaProd;
	}

	public void setListaProd(Map<Integer, LineaVenta> listaProd) {
		this.listaProd = listaProd;
	}

	@Override
	public String toString() {
		return "Venta [listaProd=" + listaProd + "]";
	}
	
	public void add(Integer num, LineaVenta lv) {
		listaProd.put(num, lv);
	}
	
	public LineaVenta findById(int i) {
		for (LineaVenta lv : listaProd.values()) {
			if(lv.getP().getId()==i)
				return lv;
		}
		return null;
	}
	
	public void mostrarUnaLinea(int i) {
		LineaVenta lv=findById(i);
		lv.mostrarLinea();
	}
	
	public void editPrecio(double precioN, int i) {
		LineaVenta lv=findById(i);
		lv.getP().setPrecioUnitario(precioN);;
	}
	
	public void mostrarTicket() {
		for (LineaVenta lv : listaProd.values()) {
			lv.mostrarLinea();
		}
	}
	
	public void eliminar(int i) {
		LineaVenta lv=findById(i);
		listaProd.remove(lv);//Cambiar findById a retorno Integer
	}
	
	public double calcularTotal() {
		double total=0;
		for(Integer i: listaProd.keySet()) {
			total+=listaProd.get(i).calcularSumaPrecio();
		}
		return total;
	}
}

