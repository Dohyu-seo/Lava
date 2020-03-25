package day11;

import java.util.Arrays;

public class Ex02 {
// 상속, 다형성.
	public static void main(String[] args) {
		Dohyung[] d1 = new Dohyung[3];
		d1[0] = new Dongl(10);
		d1[1] = new Semo(5, 10);
		d1[2] = new Nemo(2, 5);
		
		for(int i = 0 ; i < d1.length; i++) {
			d1[i].toPrint();
		}
	}

}
