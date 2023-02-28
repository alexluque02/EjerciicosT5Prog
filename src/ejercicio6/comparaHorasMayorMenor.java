package ejercicio6;

import java.util.Comparator;

public class comparaHorasMayorMenor implements Comparator <Trabajador>{

	public int compare(Trabajador t, Trabajador t2) {
		int horast1=t.getHorasTrabajadas();
		int horast2=t2.getHorasTrabajadas();
		if(horast1>horast2) {
			return -1;
		}else
			if(horast1<horast2)
				return 1;
		return 0;
	}
}
