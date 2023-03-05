package ejercicio4repetido;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		Map<Contacto, Integer> listaContactos=new HashMap <Contacto, Integer>();
		Map<Contacto, Integer> tree;
		Agenda a=new Agenda(listaContactos);
		int menu, id;
		String nombre, email;
		Integer numero;
		a.add(new Contacto(1, "Alex", "a@g.com"), 111111111);
		a.add(new Contacto(2, "Pedro", "a@g.com"), 222222222);
		a.add(new Contacto(3, "Martín", "a@g.com"), 333333333);
		a.add(new Contacto(4, "Alex", "a@g.com"), 444444444);
		a.add(new Contacto(5, "María", "a@g.com"), 555555555);
		a.add(new Contacto(6, "Elena", "a@g.com"), 666666666);
		a.add(new Contacto(7, "Pepe", "a@g.com"), 777777777);
		a.add(new Contacto(8, "Alex", "a@g.com"), 888888888);
		
		System.out.println("Bienvenido a la Agenda de Contactos");
		
		do {
			System.out.println("1. Mostrar Lista de Contactos\n"
					+ "2. Añadir Contacto\n"
					+ "3. Editar un Contacto\n"
					+ "4. Buscar un Contacto por nombre\n"
					+ "5. Borrar un Contacto\n"
					+ "6. Ordenar por Orden Alfabético\n"
					+ "0. Salir");
			menu=Leer.datoInt();
			switch(menu) {
			case 1:
				a.mostrarLista();
				break;
			case 2:
				System.out.println("Diga el id");
				id=Leer.datoInt();
				System.out.println("Diga el nombre");
				nombre=Leer.dato();
				System.out.println("Diga el mail");
				email=Leer.dato();
				System.out.println("Diga el número");
				numero=Leer.datoInt();
				a.add(new Contacto(id, nombre, email), numero);
				break;
			case 3:
				System.out.println("Diga el id");
				id=Leer.datoInt();
				System.out.println("Diga el nombre nuevo que quiere ponerle");
				nombre=Leer.dato();
				a.editName(a.findById(id), nombre);
				break;
			case 4:
				System.out.println("Diga el nombre");
				nombre=Leer.dato();
				a.mostrarListaNombre(a.findByName(nombre));
				break;
			case 5:
				System.out.println("Diga id");
				id=Leer.datoInt();
				a.delete(a.findById(id));
				break;
			case 6:
				tree=new TreeMap <Contacto, Integer> ();
				tree.putAll(listaContactos);
				for(Contacto c: tree.keySet()) {
					System.out.println("Contacto: "+c+" Teléfono: "+tree.get(c));
				}
				break;
			case 0:
				break;
			}
		}while(menu!=0);

	}

}
