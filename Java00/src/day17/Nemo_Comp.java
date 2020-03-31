package day17;

import java.util.*;
public class Nemo_Comp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Nemo n1 = (Nemo) o1;
		Nemo n2 = (Nemo) o2;
		return n1.getArea() - n2.getArea();
	}
}
