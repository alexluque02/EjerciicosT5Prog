package ejercicio4;

import java.util.Comparator;

public class ComparaPorNombre implements Comparator<Contacto>{

	@Override
	public int compare(Contacto o1, Contacto o2) {
		String nombrec1=o2.getNombre();
		String nombrec2=o2.getNombre();
        return (nombrec1.toLowerCase().compareTo(nombrec2.toLowerCase()));
	}

	
}
