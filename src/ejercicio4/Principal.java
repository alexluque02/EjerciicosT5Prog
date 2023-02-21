package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		List <Persona> listaPersonas = new ArrayList <Persona> ();
		int menu;

		listaPersonas.add(new Persona("54435772Q", "Alex", 20, 1.85));
		listaPersonas.add(new Persona("54435771Q", "Carlos", 34, 1.55));
		listaPersonas.add(new Persona("54435773Q", "Alberto", 76, 1.65));
		listaPersonas.add(new Persona("54435777Q", "Alejandra", 23, 1.45));
		listaPersonas.add(new Persona("54435775Q", "Indira", 78, 1.75));
		listaPersonas.add(new Persona("54435779Q", "Carla", 12, 1.95));
		listaPersonas.add(new Persona("54435778Q", "Raúl", 29, 1.32));
		listaPersonas.add(new Persona("54435770Q", "Roberto", 30, 1.25));
		listaPersonas.add(new Persona("54435774Q", "Eugenio", 41, 1.65));
		listaPersonas.add(new Persona("54435776Q", "Santiago", 66, 1.75));
		
		for (Persona p : listaPersonas) {
			System.out.println(p);
		}
		
		do {
			System.out.println("1. Mostrar orden alfabético (A-Z)\n"
					+ "2. Mostrar orden por edad (de menor a mayor)\n"
					+ "3. Mostrar por orden de altura (de mayor a menor)\n"
					+ "0. Salir");
			menu=Leer.datoInt();
			
			switch(menu) {
			case 1:
				Collections.sort(listaPersonas);
				for (Persona p : listaPersonas) {
					System.out.println(p);
				}
				break;
			case 2:
				Collections.sort(listaPersonas, new ComparaPorEdad());
				for (Persona p : listaPersonas) {
					System.out.println(p);
				}
				break;
			case 3:
				Collections.sort(listaPersonas, new ComparaPorAltura());
				for (Persona p : listaPersonas) {
					System.out.println(p);
				}
			}
		}while(menu!=0);
	}

}
