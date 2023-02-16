package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int id, menu, contador=0, op, i;
		String nombre, apellidos;
		boolean clienteVip=false;
		List <Socio> lista = new ArrayList <Socio>();
		CrudSocio cs = new CrudSocio(lista);
		Club c= new Club (cs);
		
		do {
			System.out.println("1. Añadir Cliente\n"
					+ "2. Buscar Cliente\n"
					+ "3. Modificar Cliente\n"
					+ "4. Borrar Cliente");
			menu=Leer.datoInt();
			
			switch(menu) {
			case 1:
				System.out.println("Diga el id");
				id=Leer.datoInt();
				System.out.println("Diga el nombre");
				nombre=Leer.dato();
				System.out.println("Diga los apellidos");
				apellidos=Leer.dato();
				System.out.println("Pulse 1 si es cliente vip u otro número si no lo es");
				op=Leer.datoInt();
				if(op==1) {
					clienteVip=true;
				}
				cs.agregar(contador, new Socio(id, nombre, apellidos, clienteVip));
				contador++;
				break;
			case 2:
				cs.mostrarSocios();
				System.out.println("Diga el id de Socio");
				id=Leer.datoInt();
				cs.mostrarSocio(cs.findSocio(id));
				break;
			case 3:
				System.out.println("Diga el id del cliente que desea modificar");
				id=Leer.datoInt();
				System.out.println("Diga el nombre nuevo que desea ponerle");
				nombre=Leer.dato();
				cs.cambiarNombre(cs.findSocio(id), nombre);
				break;
			case 4:
				System.out.println("Diga que número de socio es");
				i=Leer.datoInt();
				cs.borrarCliente(i);
				break;
			case 0:
				break;
			}
		}while(menu!=0);
	}

}
