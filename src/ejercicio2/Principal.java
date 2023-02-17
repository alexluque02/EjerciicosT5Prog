package ejercicio2;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int id, menu, op;
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
				c.getCs().agregar(new Socio(id, nombre, apellidos, clienteVip));
				break;
			case 2:
				c.getCs().mostrarSocios();
				System.out.println("Diga el id de Socio");
				id=Leer.datoInt();
				c.getCs().mostrarSocio(cs.findSocio(id));
				break;
			case 3:
				System.out.println("Diga el id del cliente que desea modificar");
				id=Leer.datoInt();
				System.out.println("Diga el nombre nuevo que desea ponerle");
				nombre=Leer.dato();
				c.getCs().cambiarNombre(cs.findSocio(id), nombre);
				break;
			case 4:
				c.getCs().mostrarSocios();
				System.out.println("Diga que número de socio es");
				id=Leer.datoInt();
				c.getCs().borrarCliente(cs.findSocio(id));
				break;
			case 0:
				break;
			}
		}while(menu!=0);
	}

}
