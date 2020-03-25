package day01;

public class Test02 {
	public static void main(String[] args) {
		/*
		 	변수 만드는 형식
		 		
		 		1.
		 		[접근지정자] [속성] 테이터타입 변수이름; <= 변수선언
		 		변수이름 = 데이터; 				    <= 데이터대입
		 		
		 		2.
		 		[접근지정자] [속성] 데이터타입 변수이름 = 데이터; <= 변수선언 & 데이터초기화 (초기화 : 기본적으로 가져야할 값의 세팅)
		 */
		
		double no1 = 3.14;
		
		float no2 = (float)3.14; // 1. 강제형변환 double타입을 강제로 float타입에 집어 넣은 것.
		float no3 = 3.14F; // 2. 리터럴형변환 float타입으로 수정한 뒤 float에 넣는 것.
		
		double no4 = 123.456f; // 3. 자동형변환
		 
		 String str1 = "가나다";
		 String str2 = "가나다";
		 String str3 = new String("가나다");
		 
		 System.out.println(str1 == str2);
		 
		 System.out.println(str1 == str3);
		 
		
		 
		 System.out.println(str3.equals(str1));
		 //equals -> 문자열끼리 비교, 문자열은 동등비교를 쓰지 말고 equals함수로 비교를해야한다.
		 
		 //기본형변수 : 기존 8가지 데이터타입을 사용 , 참조형변수 : 기본타입 이외의 타입사용
		 
	}
}
