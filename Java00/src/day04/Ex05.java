package day04;

/*
 	문제 5]
 		
 		1 - 2 + 3 - 4 + 5 - 6......
 		홀 - 짝 + 홀 - 짝 + 홀  - 짝 
 		이렇게 계산을 할 경우 결과값이 처음 100이 넘어가는 숫자는 몇인지 결과값과 함께 출력하세요.
 */
public class Ex05 { 

	public static void main(String[] args) {
		int hol = 0;
		int giho = -1;
		for(int i = 1;  ; i++) {
			giho *= -1; // <- +1 -1 +1 -1 ... 을 반복해서 출력.
			hol += giho*i; // <- 기존값 1인 i에  giho를 곱해서 -1...  
			System.out.println(i);
			if(hol > 100) {
				System.out.println(i+"번째 이고 100이 넘는 마지막 수 "+hol);
				break;
			}
		}	
		
		}
		
	}
	


