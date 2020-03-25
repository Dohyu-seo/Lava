package day04;

/*
 	문제 4]
 		5자리 정수를 입력받아서
 		그 숫자가 회문수인지 아닌지 판별해서 출력하세요.
 		
 		회문수란?
 			앞에서 읽으나 뒤에서 읽으나 똑같은 수를 회문수라고 한다.
 			예]
 				12321 - 회문수
 				
 				12312 - 회문수 아니다
 	참고]
 		문자열.charAt(위치값) - 문자열의 특정 위치의 문자를 반환해주는 함수
 		
 		문자열.toCharArray()[] - 문자열을 문자배열로 반환해주는 함수
 		
 	반복문 제어 명령]
 		1.	break		- 반복문 또는 switch문을 종료시키는 명령입니다.(함수자체를 종료시키는 명령문이 아닙니다.)
 		
 		2. continue		- 반복문을 다시 반복하는(다음 회차로) 명령문입니다.
 				
 				for( (1); (2); (3)){
 					(4)
 					continue;
 					(5)
 				}
 				
 				실행 순서 :
 						1 -> 2-> 4-> 3-> 2-> 4-> ... 조건식에 채워지면 끝남
 						
 				while( 1) {
 					2
 					continue;
 					3
 				}	
 				
 				실행 순서 :
 						1 -> 2-> 1-> 2-> 1-> 2->... 1의 조건이 거짓일 때 까지 반복
 						
 						
//		System.out.println("abc".charAt(0));

//		System.out.println("tocharArray() : " + "abc".toCharArray()[]);
 */

import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		
		for(;;){ // <== 질의명령을 반복하기 위한것.
		// 메세지 출력하고
		
		System.out.print("다섯자리 숫자를 입력하세요! : ");
		
		// 결과값을 담을 변수를 만든다.
		String msg = "회문수 ] "; // 초기값 회문수로 지정. 
		// 문자열로 입력받고 변수에 담고
		String str = sc.nextLine();
		
		if(str.equals("q")) break;//문자열 데이터 비교할 땐 equals를 써야함, q를 쓰면 반복문 종료.
		
		/* 
		 	참고] if의 {}<<
		 		블럭 안의 내용이 명령문 하나일 경우는 블럭기호({})를 생략하고 명령문을 바로 기술 할 수도 있다.
		 */
		
		
		// 반복해서 비교하고( 12321 ) -> 1, 2 까지만 비교하면 된다 ( 맨 앞 두자리, 맨 뒤 두자리만 비교)
//		for(int i = 0; i < str.length() / 2; i++ ) {
//			//문자열 중 문자를 첫 문자부터 꺼내서 뒤에서 부터의 문자와 비교한다.
//			if(str.charAt(i) == str.charAt((str.length() - 1) - i)) {
//				//이 경우는 맨 앞과 맨 뒷 문자가 같은 경우 이므로 다음 문자를 꺼내서 비교해야한다.
//				continue; //for문으로 올라가는 continue;
//			}
//			//이 경우는 두 문자가 다른 경우이므로 회문수가 아니다.
//			msg = "회문수가 아니다.";
//			break; // 다른경우는 반복문 종료
//		}	
//		// 결과 출력하고
		for(int i = 0; i < str.length() / 2; i++ ) {
			//문자열 중 문자를 첫 문자부터 꺼내서 뒤에서 부터의 문자와 비교한다.
			if(str.charAt(i) != str.charAt((str.length() - 1) - i)) {
				//이 경우는 두 문자가 다른 경우이므로 회문수가 아닌 경우다.
				msg = "회문수] 가 아니";
				break; // 다른경우는 반복문 종료
			}
		}	
		// 결과 출력하고
		System.out.println("입력한 숫자 [" + str + " ] 는 [ "+msg+"다.");
	}
	}// <-- for(;;)의 반복문을 위한 블럭
}
