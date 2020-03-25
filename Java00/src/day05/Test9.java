package day05;

public class Test9 {

	public static void main(String[] args) {
//		1 2 3 4 5 6 7 8 9
//		1 2 3 5 8 13 ..
		int tmp = 0;
		for(int i=0;i<100;i++) {
			for(int j=0; j>i; j++) {
					tmp = i;
					i = j;
					j = tmp;
					System.out.printf("%2d",i+tmp);
			}
		}

	}

}
