package ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		List<Trabajador> listado= new ArrayList <Trabajador>();
		Oficina o=new Oficina(listado);
		double cant;
		int menu, horas;
		String dni;
		Trabajador t=new Trabajador ("Pedro", "777777777Q", 128);
		
		o.add(new Trabajador("Alex", "111111111Q", 123));
		o.add(new Trabajador("Roberto", "222222222Q", 167));
		o.add(new Trabajador("Raúl", "333333333Q", 100));
		o.add(new Trabajador("María", "444444444Q", 190));
		o.add(new Trabajador("Lucía", "555555555Q", 120));
		o.add(new Trabajador("Lorena", "666666666Q", 118));
		o.add(t);
		
		System.out.println("Diga cuánto cobran la hora los empleados");
		cant=Leer.datoDouble();
		
		do {
			o.calcularSueldoTotal(cant);
			System.out.println("1. Ver Sueldo de un empleado\n"
					+ "2. Cambiar número de horas trabajadas\n"
					+ "3. Ordenar trabajadores por número de horas (de menor a mayor)\n"
					+ "4. Ordenar trabajadores por número de horas (de mayor a menor)\n"
					+ "5. Ordenar trabajadores por sueldo de menor a mayor\n"
					+ "6. Ordenar trabajadores por sueldo de mayor a menor\n"
					+ "7. Mostrar Lista\n"//Eliminar tb
					+ "0. Salir");
			menu=Leer.datoInt();
			switch(menu) {
			case 1:
				System.out.println("Diga el dni del empleado");
				dni=Leer.dato();
				o.mostrarSueldoUnEmpleado(o.findByDni(dni));
				break;
			case 2:
				System.out.println("Diga el dni del empleado");
				dni=Leer.dato();
				System.out.println("Diga la cantidad de horas nueva");
				horas=Leer.datoInt();
				o.comprobarEditado(o.editHoras(o.findByDni(dni), horas));
				break;
			case 3:
				Collections.sort(listado);
				for (Trabajador t1 : listado) {
					o.mostrarLinea(t1);
				}
				break;
			case 4:
				Collections.sort(listado, new comparaHorasMayorMenor());
				for (Trabajador t1 : listado) {
					o.mostrarLinea(t1);
				}
				break;
			case 5:
				Collections.sort(listado, new comparaSueldoMenorMayor());
				for (Trabajador t1 : listado) {
					o.mostrarLinea(t1);
				}
				break;
			case 6:
				Collections.sort(listado, new comparaSueldoMayorMenor());
				for (Trabajador t1 : listado) {
					o.mostrarLinea(t1);
				}
				break;
			case 7:
				o.mostrarLista();
				break;
			}
		}while(menu!=0);
		
	}

}
