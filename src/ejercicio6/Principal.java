package ejercicio6;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		List<Trabajador> listado= new ArrayList <Trabajador>();
		Oficina o=new Oficina(listado);
		double cant;
		Trabajador t=new Trabajador ("Alex", "111111111Q", 123);
		
		o.add(new Trabajador("Alex", "111111111Q", 123));
		o.add(new Trabajador("Alex", "111111111Q", 167));
		o.add(new Trabajador("Alex", "111111111Q", 100));
		o.add(new Trabajador("Alex", "111111111Q", 190));
		o.add(new Trabajador("Alex", "111111111Q", 120));
		o.add(new Trabajador("Alex", "111111111Q", 118));
		o.add(t);
		
		System.out.println("Diga cuánto cobran la hora los empleados");
		cant=Leer.datoDouble();
		
	}

}
