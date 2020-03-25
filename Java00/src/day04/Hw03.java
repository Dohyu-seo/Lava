package day04;

/*
	(중첩된 반복문으로 처리)
	2 ~ 100 까지 사이의 수중 소수만 출력해주는 프로그램을 작성하세요.
	
	소수 : 1과 자기 자신으로만 나눌 수 있는 수.
	정확히 2개의 약수를 가진 수를 소수라고 합니다.
	
 */
public class Hw03 {

	public static void main(String[] args) {

		
 
			int num = 0;
		 	for(int i = 2; i <= 100; i++){
		 		for(int j = 2; j <= i; j++){
		 			if(i%j == 0) {
		 				
		 				num ++;
		 				
		 			}// if - 1
		 		 }// for-2
		 		if(num == 1) {
		 			System.out.println(i);
		 		}// if -1
		 		num =0; // 초기화 
		 	}// for-1
	}

	/*
	 * 
	 * 
	 * int cnt = 0;
	 * hyunwoo:
	 * 
	 * 나눌 수 있는수가 있는지 검사
	 * for(int i=2; i<=100; i++){
	 * 	if(i % j ==0){
	 * 	countinue hyunwoo;
	 * 	}
	 * }
	  
		위의 반복문이 정상적으로 끝까지 반복처리가 됬다면 이 행을 실행할
	  	그 말은 나눌 수 있는 수(j)가 없다는 말이므로
	  	이 수 (i)는 소수일 것이다.
	 	
	 	 cnt를 1 올려주고
	 	 
	 	 ++cnt;
	 	
	 	  그러면 소수를 출력만 하면 될것이다.
	 	String mk = ", ";
	 	if(i == 2){
	 	 mk ="";
	 	 }
	 	 System.out.print(mk+i);
	 	 
	 	 }
	 	 System.out.prtin(); 줄바꿈 할라고..
	 	 System.out.print("2 ~ 100까지 소수 갯수 : " + cnt);
	 	 }
	 */
}
