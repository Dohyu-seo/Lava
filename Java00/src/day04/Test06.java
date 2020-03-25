package day04;

/*
	 do ~ while 명령
	 	 : for와 while 명령은 '선조건' 처리 명령이고 조건에 따라서 한 번도 실행되지 않을 수 있지만.
	 	 	do ~ while 명령은 '후조건' 처리 명령이고 조건에 관계없이 무조건 한 번 이상은 실행한다.
	 	 	
	 	 	형식]
	 	 		(1)
	 	 		do {
	 	 			(2)
	 	 		} while(조건식 - (3) );
	 	 		
	 	 		- (4)
	 	 		
	 	 		실행 순서 :
	 	 			1 -> 2 -> 3 -> 2-> 3(참일 경우) -> 2 -> 3(거짓일 경우) -> 4(종료)
*/
public class Test06 {

	public static void main(String[] args) {
		int no = 10;
		
		do {
			System.out.println("no :"+ no);
		}while(no++ < 10) ;
		// for명령일 경우 이미 no가 10이면 실행하지 않고 종료하지만, do while명령은 1회 실행을 한 뒤 종료한다.
		
	}

}
