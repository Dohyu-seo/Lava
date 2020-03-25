package day06;

/*
     문제 3]
		
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1}
		이라는 배열을 준비하고 
		
		79456원을 준비된 화폐단위로 계산할 때 각각의 화폐단위가 몇개씩 필요한지
		갯수를 저장할 배열을 만들고 출력하는 프로그램을 작성하세요.
*/
public class Ex03 {

		public static void main(String[] args) {
			//				0	   1	2	  3	   4   5   6   7
			int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
						//	7	   1	 4	  0	   4	1	0  6
			int[] num;
			num = new int[8];
			int tmp = 79456;
			int total = tmp;
			num[0] = tmp /=coin[0]; // num[0]은 7로 바뀜.
			tmp = total %= coin[0]; // tmp 초기화
//			System.out.println("[0]"+tmp);
			num[1] = tmp /=coin[1]; // num[0]은 7로 바뀜.
			tmp = total %= coin[1]; // tmp 초기화
//			System.out.println("[1]"+tmp);
		    num[2] = tmp /=coin[2];
		    tmp = total %= coin[2];
//		    System.out.println("[2]"+tmp);
		 num[3] = tmp /=coin[3];
		 tmp = total %= coin[3];
//		 System.out.println("[3]"+tmp);
		 num[4] = tmp /=coin[4];
		 tmp = total %= coin[4]; // tmp 초기화
//		 System.out.println("[4]"+tmp);
		 num[5] = tmp /=coin[5];
		 tmp = total %= coin[5]; // tmp 초기화
//		 System.out.println("[5]"+tmp);
		 num[6] = tmp /=coin[6];
		 tmp = total %= coin[6]; // tmp 초기화
//		 System.out.println("[6]"+tmp);
		 
		 num[7] = tmp /=coin[7];
		 tmp = total %= coin[7]; // tmp 초기화

		
			
			for(int i =0; i<num.length; i++) {
				int no = num[i];
				
				
				System.out.println(coin[i]+"원권: "+no+"개  ");
			}
		}
}
