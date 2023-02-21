package ejercicio4;

import java.util.Comparator;

public class ComparaPorAltura implements Comparator <Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		double estatura1=o1.getEstatura();
		double estatura2=o2.getEstatura();
		if(estatura1<estatura2) {
			return 1;
		}else
			if(estatura1>estatura2)
				return -1;
		return 0;
	}

}
