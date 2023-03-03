package ejercicio7;

import java.util.Comparator;

public class ComparaPorInteger implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		int i1=o1.intValue();
		int i2=o2.intValue();
		if(i1>i2) {
			return 1;
		}else
			if(i1<i2) {
				return -1;
			}
		return 0;
	}

}
