package ejercicio6;

import java.util.Comparator;

public class comparaSueldoMenorMayor implements Comparator <Trabajador>{

	@Override
	public int compare(Trabajador t, Trabajador t2) {
		double sueldot1=t.getSueldoFinal();
		double sueldot2=t2.getSueldoFinal();
		if(sueldot1>sueldot2) {
			return 1;
		}else {
			if(sueldot1<sueldot2) {
				return -1;
			}
		}
		return 0;
	}

}
