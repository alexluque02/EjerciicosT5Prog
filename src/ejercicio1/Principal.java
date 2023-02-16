package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Nota> lista = new ArrayList <Nota>();
		String titulo, texto;
		int menu, contador=0, i;
		Agenda a=new Agenda(lista);
		lista.add(new Nota("Hola", "Esta es mi primera nota"));
		contador++;
		lista.add(new Nota("Hola", "Esta es mi segunda nota"));
		contador++;
		lista.add(new Nota("Hola", "Esta es mi tercera nota"));
		contador++;
		
		System.out.println("Bienvenido al programa de agenda de notas");
		
		do {
			System.out.println("1. Añadir Nota\n"
					+ "2. Mostrar Nota\n"
					+ "3. Ver total de notas guardadas\n"
					+ "4. Borrar una nota\n"
					+ "0. Salir");
			menu=Leer.datoInt();
			switch(menu) {
			case 1:
				System.out.println("Escribe el título");
				titulo=Leer.dato();
				System.out.println("Escribe la nota");
				texto=Leer.dato();
				lista.add(contador, new Nota(titulo, texto));
				contador++;
				break;
			case 2:
				a.mostrarLista();
				System.out.println("Diga el número en el que se encuentra la nota");
				i=Leer.datoInt();
				if(i<=lista.size())
					System.out.println(lista.get(i-1));
				else
					System.out.println("No se ha encontrado esta nota");
				break;
			case 3:
				System.out.println("El número de notas guardadas son: "+lista.size());
				break;
			case 4:
				a.mostrarLista();
				System.out.println("Diga el número de la nota que desea borrar");
				i=Leer.datoInt();
				if(i<=lista.size()) {
					lista.remove(i-1);
					System.out.println("Nota borrada con éxito");
				}else
					System.out.println("No se ha encontrado esta nota");
				
				break;
			case 0:
				break;
			default:
				break;
			}
		}while(menu!=0);

		System.out.println("Gracias por utilizar nuestro programa");
	}

}
