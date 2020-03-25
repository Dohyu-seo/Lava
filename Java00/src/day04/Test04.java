package day04;

/*
 	반복문
 		향상된 for 명령( forEach 구문 ) 
 			==> 시퀀스 자료형에 들어있는 데이터를 하나씩 꺼내서 변수에 담아주는 반복문 
 			형식]
 				
 				for(데이터타입 변수이름 : 시퀀스자료형 ){ // 시퀀스자료형 : 배열.ArrayList나 index가 있는 데이터들을 말한다.
					실행문 ...
 				}
 				
 				참고]
 					데이터 타입은 시퀀스자료형에 들어있는 데이터의 타입을 써준다.
 					향상된 for 명령은 시퀀스 자료형에서
 					index가 0부터 시작해서 마지막까지
 					자동으로 데이터를 꺼내서 변수에 담아 준다. 
 */
public class Test04 {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5}; // 변수 arr하나로 각 방에 정수 1,2,3,4,5를 넣어둔 것이다.
		
		for(int no : arr) {// 데이터 타입은 각 방에 들어있는 데이터의 타입을 써주어야한다.
			// index값을 하나씩 꺼내서 int no의 방에 담아준다는 뜻.
			System.out.print(no+ " | ");
		}
	}
}
