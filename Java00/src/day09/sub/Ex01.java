package day09.sub;

/* 반복문-
 	문제 1]
 		
 		2	3	4	5	6
 		3	4	5	6	7
 		4	5	6	7	8
		5	6	7	8	9
		6	7	8	9	10
 */
public class Ex01 {

	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			int sero = 2+i;
			
			for(int j =0; j<5; j++) {
				int garo = j+sero;
				System.out.printf("%3d",garo);
				
			}
			System.out.println(); 
		}
		for(int i=0; i<5;i++) {
			for(int j = 0; j<5; j++) {
				System.out.printf("%3d",i+j+2);
			}
			System.out.println();
		}
	}

}
