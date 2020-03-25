package day04;


/*
  	while 명령
  		
  		for명령문 처럼 반복실행할 수 있는 명령문.
  		for 명령문과의 차이점은 반복을 할 횟수를 지정하는  카운터변수와 증감식이
  		명령 내부에 없는 것이 차이점이다.
  		
  		 형식]
  		 	
  		 	(1)
  		 	while(조건식 - (2)){
  		 	 	- (3)
  		 	}
  		 	- (4)
  		 	
  		 	순서 : 1 -> 2 -> 참이면 3 -> 2 -> 3 ->... 조건식이 true인 경우에만
  		 			조건식이 false인 순간 -> 4으로 마침.
 
 */
public class Test05 {
	/*
	 	구구단을 출력하세요.
	 */
	public static void main(String[] args) {
		int dan = 2;
		int gop = 1;
		 
		while(dan < 10) {
			System.out.println("-------------");
			
			gop=1; // gop을 매번 초기화 시켜줘야 +1로 반복한다.
			while(gop < 10) {
				System.out.println(dan+"x"+gop+"="+(dan*gop));
				gop++; // 처리 후 gop이 매번 증감해야 무한반복하지 않는다.
				
			}
			dan++; // 처리 후 dan이 매번 증감해야 무한반복하지 않는다.
			
		}
			System.out.println("---------");
	}

}
