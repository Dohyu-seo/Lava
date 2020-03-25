package day04;

/*
 	 문제3]
 	 	2x +4y = 10의 방정식의 결과를 출력하세요.
 	 	단, x, y는 모두 0부터 10 사이의 정수입니다
 */
public class Ex03 {
 
	public static void main(String[] args) {
		
	 	for(int i = 1; i <= 10; i++){
	 		
		 		for(int j = 0; j <= 10; j++){
		 			int num = i*2+j*4;
		 			if(num==10) {
		 				System.out.println("2의 x는 ["+i+"] 4의 y는 ["+j+"] 합은 "+num);	
		 			}
		 			
		 			
		 		 
		 		 }
		 	}
//	 	for(int x = 0; x < 11; x++) {
//			for(int y =0; y < 11; y++) {
//				if(2 * x + 4* y == 10) {
//					System.out.println("x가" + x +" 이고 y가"+y+" 일 때 합은 "+ (2*x+4*y)+"입니다.");
//				}
//			}
//		}
	}	
}
		
