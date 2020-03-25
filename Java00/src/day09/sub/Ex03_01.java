package day09.sub;

/*반복문
	문제 3]
		
		1	2	99	4	5
		2	99	4	5	99
		99	4	5	99	7	
*/
public class Ex03_01 {

	public static void main(String[] args) {
		for(int i=0; i<3;i++) {
			for(int j = 0; j<5; j++) {
				int sum = i+j+1;
				if(sum%3 ==0) {
					sum = 99;
				}
				System.out.printf("%3d",sum);
			}
			System.out.println();
		}

	}

}
