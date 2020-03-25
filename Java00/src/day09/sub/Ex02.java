package day09.sub;

/* 반복문 -
 	문제]
 		
 		2	4	6	8	10
 		3	5	7	9	11
 		4	6	8	10	12
 */
public class Ex02 {

	public static void main(String[] args) {
		/*for(int i = 0; i<3; i++) {
			int sero = 2+i;
			for(int j = 0; j<5; j++) {
				int garo = sero+j*2;
				System.out.printf("%3d",garo);
			}
			System.out.println();
		}*/
		for(int i=0; i<3;i++) {
			for(int j = 0; j<5; j++) {
				System.out.printf("%3d",i+j*2+2);
			}
			System.out.println();
		}
	}

}
