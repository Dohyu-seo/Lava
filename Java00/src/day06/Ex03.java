package day06;

/*
     ���� 3]
		
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1}
		�̶�� �迭�� �غ��ϰ� 
		
		79456���� �غ�� ȭ������� ����� �� ������ ȭ������� ��� �ʿ�����
		������ ������ �迭�� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
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
			num[0] = tmp /=coin[0]; // num[0]�� 7�� �ٲ�.
			tmp = total %= coin[0]; // tmp �ʱ�ȭ
//			System.out.println("[0]"+tmp);
			num[1] = tmp /=coin[1]; // num[0]�� 7�� �ٲ�.
			tmp = total %= coin[1]; // tmp �ʱ�ȭ
//			System.out.println("[1]"+tmp);
		    num[2] = tmp /=coin[2];
		    tmp = total %= coin[2];
//		    System.out.println("[2]"+tmp);
		 num[3] = tmp /=coin[3];
		 tmp = total %= coin[3];
//		 System.out.println("[3]"+tmp);
		 num[4] = tmp /=coin[4];
		 tmp = total %= coin[4]; // tmp �ʱ�ȭ
//		 System.out.println("[4]"+tmp);
		 num[5] = tmp /=coin[5];
		 tmp = total %= coin[5]; // tmp �ʱ�ȭ
//		 System.out.println("[5]"+tmp);
		 num[6] = tmp /=coin[6];
		 tmp = total %= coin[6]; // tmp �ʱ�ȭ
//		 System.out.println("[6]"+tmp);
		 
		 num[7] = tmp /=coin[7];
		 tmp = total %= coin[7]; // tmp �ʱ�ȭ

		
			
			for(int i =0; i<num.length; i++) {
				int no = num[i];
				
				
				System.out.println(coin[i]+"����: "+no+"��  ");
			}
		}
}
