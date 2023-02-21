package ejercicio3;

import java.util.HashSet;
import java.util.Set;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*Realizar un programa que guarde Alumnos de una clase. Se deben poder mostrar, modificar
		y borrar los que se quiera de forma individual, es decir, el usuario debe decir quién quiere
		mostrar, modificar o borrar. Se puede crear otra clase con funcionalidades como sacar nota
		media del curso, dar el número de suspensos en total, media de suspensos, etc. Usa la
		interfaz Set implementada por HashSet.*/
		
		Set <Alumno> listaAlumnos = new HashSet <Alumno>(); 
		CrudAlumno ca=new CrudAlumno (listaAlumnos);
		int menu, id, edad;
		String nombre;
		double notaMedia;
		
		System.out.println("Bienvenido al programa del colegio");
		listaAlumnos.add(new Alumno(1, "Alex", 20, 4.0));
		listaAlumnos.add(new Alumno(2, "Indira", 19, 7.0));
		
		do {
			System.out.println("1. Matricular Alumno\n"
					+ "2. Mostrar un alumno\n"
					+ "3. Mostrar alumnos\n"
					+ "4. Borrar Alumno\n"
					+ "5. Calcular Nota Media de todos los Alumnos\n"
					+ "6. Ver número total de suspensos\n"
					+ "7. Media de suspensos\n"
					+ "0. Salir\n");
			menu=Leer.datoInt();
			switch(menu) {
			case 1:
				System.out.println("Diga el id del alumno");
				id=Leer.datoInt();
				System.out.println("Diga el nombre");
				nombre=Leer.dato();
				System.out.println("Diga la edad");
				edad=Leer.datoInt();
				System.out.println("Diga su nota media");
				notaMedia=Leer.datoDouble();
				ca.add(new Alumno(id, nombre, edad, notaMedia));
				break;
			case 2:
				System.out.println("Diga el id del alumno");
				id=Leer.datoInt();
				System.out.println("Diga el nombre");
				nombre=Leer.dato();
				System.out.println("Diga la edad");
				edad=Leer.datoInt();
				System.out.println("Diga su nota media");
				notaMedia=Leer.datoDouble();
				System.out.println(ca.findAlumno(new Alumno(id, nombre, edad, notaMedia)));
				break;
			case 3:
				ca.mostrarAlumnos();
				System.out.println();
				ca.mostrarAlumnosV2();
				System.out.println();
				ca.mostrarAlumnosV3();
				break;
			case 5:
				System.out.println(ca.calcularNotaMediaTotal());
				break;
			case 6:
				System.out.println(ca.contarAlumnosSuspensos());
				break;
			}
		}while(menu!=0);
		
	}

}
