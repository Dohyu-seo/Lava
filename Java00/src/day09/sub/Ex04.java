package day09.sub;

/*
 	1	2	3	4	10
 	3	4	5	6	18
 	5	6	7	8	26
 	
 */
public class Ex04 {

	public static void main(String[] args) {
		
	int cnt = 0;
		for(int i =0; i<3; i++) {
			for(int j =0; j<5; j++) {
				int sum = i*2+1+j; // 1 + 0 = 1 // 3 4
				cnt = cnt+sum; // 1 + 0 = 1 // 2+1 = 3 //   3 6 / 6 10
				if(j==4) {
					sum = cnt-sum;
				}
				System.out.printf("%3d",sum);
			}
			cnt=0;
		System.out.println();
		}
	}
}
