package ejercicio8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu, id;
		Integer num;
		double cant, saldoN;
		Map<Integer, Cuenta> listaCuentas=new HashMap<Integer, Cuenta>();
		Map<Integer, Cuenta> tree;
		Oficina o=new Oficina(listaCuentas);
		o.add(2, new CuentaJoven(2222, new Cliente("11111111Q", "Indira"), 2200, 0));
		o.add(7, new CuentaEmpresa(7777, new Cliente("66666666Q", "María"), 2200, 0));
		o.add(4, new CuentaCorriente(4444, new Cliente("33333333Q", "David"), 2200, 20.0, 0));
		o.add(1, new CuentaJoven(1111, new Cliente("00000000Q", "Alex"), 2200, 0));
		o.add(9, new CuentaJoven(9999, new Cliente("88888888Q", "Rocío"), 2200, 0));
		o.add(5, new CuentaJoven(5555, new Cliente("44444444Q", "Fernando"), 2200, 0));
		o.add(6, new CuentaCorriente(6666, new Cliente("55555555Q", "Javier"), 2200, 18.0, 0));
		o.add(8, new CuentaEmpresa(8888, new Cliente("77777777Q", "Natalia"), 2200, 0));
		o.add(3, new CuentaEmpresa(3333, new Cliente("22222222Q", "Roberto"), 2200, 0));
		o.add(10, new Cuenta(1000, new Cliente("99999999Q", "Raúl"), 2200));
		
		System.out.println("Bienvenidos al programa de gestión del banco");
		
		do {
			System.out.println("1. Mostrar Lista de Cuentas\n"
					+ "2. Ingresar\n"
					+ "3. Retirar\n"
					+ "4. Editar Saldo de una Cuenta\n"
					+ "5. Borrar una Cuenta\n"
					+ "6. Calcular Total entre todos los Saldos\n"
					+ "7. Comision Total cobrada\n"
					+ "8. Bonificación Total pagada\n"
					+ "9. Ordenar Lista del revés\n"
					+ "0. Salir");
			menu=Leer.datoInt();
			
			switch(menu) {
			case 1: 
				o.mostrarCuentas();
				break;
			case 2:
				System.out.println("Diga el id de la cuenta");
				id=Leer.datoInt();
				System.out.println("Diga la cantidad");
				cant=Leer.datoDouble();
				o.ingresarAUnaCuenta(id, cant);
				break;
			case 3:
				System.out.println("Diga el id de la cuenta");
				id=Leer.datoInt();
				System.out.println("Diga la cantidad");
				cant=Leer.datoDouble();
				o.retirarAUnaCuenta(id, cant);
				break;
			case 4:
				System.out.println("Diga el id de la cuenta");
				id=Leer.datoInt();
				System.out.println("Diga el saldo nuevo");
				saldoN=Leer.datoDouble();
				o.edit(id, saldoN);
				break;
			case 5:
				System.out.println("Diga el valor de la clave");
				num=Leer.datoInt();
				o.delete(num);
				break;
			case 6:
				System.out.printf("La suma de todos los saldos es: %.2f€\n", o.calcularTotalSaldos());
				break;
			case 7:
				System.out.printf("El total ganado en comisiones es: %.2f€\n", o.calcularTotalComision());
				break;
			case 8:
				System.out.printf("El total gastado en bonificaciones es: %.2f€\n", o.calcularTotalBonificacion());
				break;
			case 9:
				tree=new TreeMap<Integer, Cuenta>(new ComparaPorInteger());
				tree.putAll(listaCuentas);
				for(Integer i : tree.keySet()) {
					System.out.println("Clave: "+i+" Valor: "+tree.get(i));
				}
				break;
			case 0: 
				System.out.println("Saliendo");
				break;
			}
		}while(menu!=0);
		
		System.out.println("Gracias por utilizar nuestro programa");
	}

}
