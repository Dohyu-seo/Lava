package day04;

/*
 	 ����3]
 	 	2x +4y = 10�� �������� ����� ����ϼ���.
 	 	��, x, y�� ��� 0���� 10 ������ �����Դϴ�
 */
public class Ex03 {
 
	public static void main(String[] args) {
		
	 	for(int i = 1; i <= 10; i++){
	 		
		 		for(int j = 0; j <= 10; j++){
		 			int num = i*2+j*4;
		 			if(num==10) {
		 				System.out.println("2�� x�� ["+i+"] 4�� y�� ["+j+"] ���� "+num);	
		 			}
		 			
		 			
		 		 
		 		 }
		 	}
//	 	for(int x = 0; x < 11; x++) {
//			for(int y =0; y < 11; y++) {
//				if(2 * x + 4* y == 10) {
//					System.out.println("x��" + x +" �̰� y��"+y+" �� �� ���� "+ (2*x+4*y)+"�Դϴ�.");
//				}
//			}
//		}
	}	
}
		
