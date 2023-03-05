package ejercicio7;


import java.util.Map;

public class Venta {

	private Map<Integer, LineaVenta> listaProd;
	
	

	public Venta(Map<Integer, LineaVenta> listaProd) {
		super();
		this.listaProd = listaProd;
	}

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
	
	public Integer findByIdV2(Integer id) {
		for (Integer i : listaProd.keySet()) {
			if(i==id) {
				return i;
			}
		}
		return -1;
	}
	
	public void mostrarUnaLinea(int i, double porc) {
		LineaVenta lv=findById(i);
		if(lv!=null)
			lv.mostrarLinea(porc);
		else
			System.out.println("No se ha encontrado la linea de venta");
	}
	
	public void editPrecio(double precioN, int i) {
		LineaVenta lv=findById(i);
		lv.getP().setPrecioUnitario(precioN);;
	}
	
	public void mostrarTodo(double porc) {
		for (LineaVenta lv : listaProd.values()) {
			lv.mostrarLinea(porc);
		}
	}
	
	public void eliminar(Integer id) {
		Integer i=findByIdV2(id);
		listaProd.remove(i);//Cambiar findById a retorno Integer
	}
	
	public double calcularTotal(double porc) {
		double total=0;
		for(Integer i: listaProd.keySet()) {
			total+=listaProd.get(i).calcularSumaPrecio(porc);
		}
		return total;
	}
	
	public void mostrarTicket(double porc) {
		mostrarTodo(porc);
		System.out.println("-------------------");
		System.out.printf("Total: %.2f€\n", calcularTotal(porc));
	}
}

