package day04;

/*
 	문제 2]
 		두 개의 주사위를 던져서 합이 6이 되는 경우의 수를 출력하세요.
 		1, 2, 3, 4, 5, 6
 		5, 4, 3, 2, 1, 0
 */
public class Ex02 {

	public static void main(String[] args) {
		
		
	 	for(int i = 1; i <= 6; i++){
	 		
		 		for(int j = 1; j < 6; j++){
		 			int num = i+j;
		 			if(num==6) {
		 				System.out.println("i는"+i+"j는"+j+"합은"+num);	
		 			}
		 			
		 			
		 		 
		 		 }
		 	}
		 		


	}

}
