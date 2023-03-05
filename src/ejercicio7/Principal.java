package ejercicio7;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Map<Integer, LineaVenta> lineas = new HashMap <Integer, LineaVenta>();
		Map<Integer, LineaVenta> tree;
		int menu, cant, id; double porc, precioN;
		Integer num;
		Venta v=new Venta(lineas);
		
		v.add(10, new LineaVenta(new Alimentacion(0000, "Pipas", 0.50, 2), 3));
		v.add(4, new LineaVenta(new Producto(1111, "Coca", 2.50), 1));
		v.add(2, new LineaVenta(new Ropa(2222, "Pantalones", 20.00), 2));
		v.add(8, new LineaVenta(new Alimentacion(3333, "Coca-Cola", 2.50, 6), 3));
		v.add(5, new LineaVenta(new Electronica(4444, "iPhone", 600, true), 1));
		v.add(3, new LineaVenta(new Electronica(5555, "Cargador", 10.50, false), 3));
		v.add(9, new LineaVenta(new Producto(6666, "Bocina", 5.50), 1));
		v.add(6, new LineaVenta(new Alimentacion(7777, "Paquete Papas", 0.50, 4), 5));
		v.add(7, new LineaVenta(new Alimentacion(8888, "Pipas", 0.50, 2), 3));
		v.add(1, new LineaVenta(new Alimentacion(9999, "Pipas", 0.50, 2), 3));

		
		System.out.println("Bienvenidos al programa de la caja");
		System.out.println("Diga el porcentaje que se le aplica y que se le descuenta a los productos (el mismo)");
		porc=Leer.datoDouble();
		
		do {
			System.out.println("1. Mostrar Ticket\n"
					+ "2. Mostrar Linea de Venta\n"
					+ "3. Mostrar Ticket Ordenada\\n\n"
					+ "4. Editar Precio del producto\n"
					+ "5. Eliminar Producto\n"
					+ "0. Salir");
			menu=Leer.datoInt();
			
			switch(menu) {
			case 1:
				v.mostrarTicket(porc);
				break;
			case 2:
				System.out.println("Diga el id del producto");
				id=Leer.datoInt();
				v.mostrarUnaLinea(id, porc);
				break;
			case 3:
				tree=new TreeMap <Integer, LineaVenta>(new ComparaPorInteger());
				tree.putAll(lineas);
				for(LineaVenta lv : tree.values()) {
					lv.mostrarLinea(porc);
				}
				break;
			case 4:
				System.out.println("Diga el id del producto");
				id=Leer.datoInt();
				System.out.println("Diga su precio nuevo");
				precioN=Leer.datoDouble();
				v.editPrecio(precioN, id);
				break;
			case 5:
				System.out.println("Diga el id del producto");
				num=Leer.datoInt();
				v.eliminar(num);
			case 0:
				System.out.println("Saliendo");
				break;
			}
		
			}while(menu!=0);
		
		/*tree=new TreeMap<Integer,LineaVenta>(new ComparaPorInteger);
		tree.putAll(listaProd);//Anteriormente definida*/

	}

}
