package ejercicioRepaso1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		List <Nota> listaNotas1 = new ArrayList <Nota> ();
		List <Nota> listaNotas2 = new ArrayList <Nota> ();
		List <Nota> listaNotas3 = new ArrayList <Nota> ();
		List <Nota> listaNotas4 = new ArrayList <Nota> ();
		Map <Alumno, Integer> listaAlumnos = new HashMap <Alumno, Integer>();
		Map <Alumno, Integer> tree;
		Colegio c;
		GestionNotas gn1=new GestionNotas(listaNotas1);
		GestionNotas gn2=new GestionNotas(listaNotas2);
		GestionNotas gn3=new GestionNotas(listaNotas3);
		GestionNotas gn4=new GestionNotas(listaNotas4);
		String nombre, dni, apellidos, curso, asign, nombreCole;
		int cod_asign, menu, cant;
		double nota;
		Integer cod_mat;
		
		gn1.add(1, 8.5, "Programación");
		gn1.add(2, 7.5, "BBDD");
		gn1.add(3, 8, "Lenguajes");
		gn1.add(4, 9, "Entornos");
		
		gn2.add(1, 8.5, "Programación");
		gn2.add(2, 4.5, "BBDD");
		gn2.add(3, 3, "Lenguajes");
		gn2.add(4, 2, "Entornos");
		
		gn3.add(1, 8, "Programación");
		gn3.add(2, 6, "BBDD");
		gn3.add(3, 0, "Lenguajes");
		gn3.add(4, 5, "Entornos");
		
		gn4.add(1, 1, "Programación");
		gn4.add(2, 0, "BBDD");
		gn4.add(3, 4.9, "Lenguajes");
		gn4.add(4, 6, "Entornos");
		
		Alumno a1=new Alumno("000000000Y", "Alex", "Luque", "1º DAM", listaNotas1);
		Alumno a2=new Alumno("111111111Y", "Pepe", "Flores", "1º DAM", listaNotas2);
		Alumno a3=new Alumno("222222222Y", "Juan", "López", "1º DAM", listaNotas3);
		Alumno a4=new Alumno("333333333Y", "Indira", "Jean", "1º DAM", listaNotas4);
		
		System.out.println("Bienvenidos al programa que gestiona alumnos");
		
		System.out.println("Diga el nombre del Colegio");
		nombreCole=Leer.dato();
		c=new Colegio(nombreCole, listaAlumnos);
		
		c.add(a1, 1111);
		c.add(a2, 1112);
		c.add(a3, 1113);
		c.add(a4, 1114);
		
		do {
			System.out.println("1. Añadir Alumno\n"
					+ "2. Mostrar Alumnos\n"
					+ "3. Mostrar Notas de un Alumno\n"
					+ "4. Editar Una Nota\n"
					+ "5. Calcular Nota Media de un Alumno\n"
					+ "6. Calcular Nota Media Total\n"
					+ "7. Eliminar Alumno\n"
					+ "8. Ordenar Alumnos por Apellido\n"
					+ "0. Salir");
			menu=Leer.datoInt();
			switch(menu) {
			case 1:
				List <Nota> lista = new ArrayList <Nota>();
				GestionNotas g=new GestionNotas(lista);
				System.out.println("Diga dni");
				dni=Leer.dato();
				System.out.println("Diga nombre");
				nombre=Leer.dato();
				System.out.println("Diga apellidos");
				apellidos=Leer.dato();
				System.out.println("Diga curso");
				curso=Leer.dato();
				System.out.println("Diga cuantas notas tiene");
				cant=Leer.datoInt();
				for (int i=0; i<cant; i++) {
					System.out.println("Diga código de asignatura");
					cod_asign=Leer.datoInt();
					System.out.println("Diga asignatura");
					asign=Leer.dato();
					System.out.println("Diga nota");
					nota=Leer.datoDouble();
					g.add(cod_asign, nota, asign);
				}
				System.out.println("Diga el código de matriculación");
				cod_mat=Leer.datoInt();
				c.add(new Alumno(dni, nombre, apellidos, curso, lista), cod_mat);
				break;
			case 2:
				System.out.println(c.getNombre());
				System.out.println("---------------");
				c.mostrarLista();
				break;
			case 3:
				System.out.println("Diga el dni");
				dni=Leer.dato();
				if(c.findByDni(dni)!=null) {
					c.mostrarAlumno(c.findByDni(dni));
				}else {
					System.out.println("No se ha encontrado al alumno");
				}
				break;
			case 4:
				System.out.println("Diga el dni");
				dni=Leer.dato();
				System.out.println("Diga el código de la asignatura");
				cod_asign=Leer.datoInt();
				System.out.println("Diga la nueva nota");
				nota=Leer.datoDouble();
				if(c.editNota(nota, cod_asign, dni)) {
					c.editNota(nota, cod_asign, dni);
					System.out.println("Operación realizada con éxito");
					c.mostrarAlumno(c.findByDni(dni));
				}
				System.out.println("No se ha podido realizar la operación. Inténtalo de nuevo");
				break;
			case 5:
				System.out.println("Diga el DNI");
				dni=Leer.dato();
				System.out.println(c.calcularUnaNotaMedia(dni));
				break;
			case 6:
				System.out.println(c.calcularNotaMediaTotal(listaAlumnos));
				break;
			case 7:
				System.out.println("Diga el dni del alumno");
				dni=Leer.dato();
				c.remove(dni);
				if(c.remove(dni)) {
					System.out.println("Operación realizada con éxito");
					c.mostrarLista();
				}else {
					System.out.println("No se ha encontrado el alumno");
				}
				break;
			case 8:
				System.out.println(c.getNombre());
				System.out.println("---------------");
				tree=new TreeMap <Alumno, Integer> ();
				tree.putAll(listaAlumnos);
				for(Alumno a: tree.keySet()) {
					GestionNotas gn=new GestionNotas(a.getListaNotas());
					System.out.println("Alumno");
					System.out.println("-----------");
					System.out.println(a.getApellidos()+", "+a.getNombre()+" | DNI: "+a.getDni()+" | Curso: "+a.getCurso());
					gn.mostrarNotas();
					System.out.println();
				}
				break;
			case 0:
				break;
			}
		}while(menu!=0);
		
		System.out.println("Gracias por utilizar nuestro programa");
	}

}
