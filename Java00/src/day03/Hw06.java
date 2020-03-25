package day03;

	/* 문제 6]
	임의의 년도를 입력받아서
	해당 년도가 윤년인지 평년인지 판별해서 출력해주는 프로그램을 작성하세요.
	
	 단, 삼항연산자를 사용해서 처리하세요.
	 
	 윤년의 정의]
	 	4로 나눠 떨어지고 100으로 나눠 떨어지지 않고 400으로 나눠 떨어지는 수
	 	/임의의 년도 받을 준비하기
	 	  
	 	/년도 받기
	 	 
	 	/평년인지 윤년인지 조건식 만들기   
	 	  
	
	 
*/

import java.util.*;
public class Hw06 {
	public Hw06() {
		 solv();
	}
	//윤년 판별하는 함수
	public void solv() {
		//입력 받을 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("년도를 입력하세요! : ");
		// 입력한 숫자 변수에 담고
		int year = sc.nextInt();
		//윤년인지 평년인지 말하고
		String result = (year % 4 != 0)? ("평년"):
			((year % 100 != 0) ? ("윤년") : ("평년"));
		//5. 출력하고
		
			System.out.println(result);
		
	}
	public static void main(String[] args) {
		new Hw06();

	}

}
