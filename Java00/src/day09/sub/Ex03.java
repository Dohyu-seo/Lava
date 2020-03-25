package day09.sub;

/*반복문
 	문제 3]
 		
 		1	2	99	4	5
 		2	99	4	5	99
 		99	4	5	99	7	
 */
public class Ex03 {

	public static void main(String[] args) {
		int sero = 0;
		int garo = 0;
		for(int i = 0 ; i<3; i++) { 
			sero = i+1;		
			for(int j = 0; j<5; j++) {
				garo = j+sero; // garo : i+j+1;
				if(garo%3 == 0) {
					garo = 99;
				}
				System.out.printf("%4d",garo);
			}
			System.out.println();
		}
	}

}
