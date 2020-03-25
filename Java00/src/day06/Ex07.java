package day06;

import java.util.Arrays;
import java.util.Scanner;

/*
문제 7]
		
		문자열을 입력받아서
		문자배열에 문자열을 이루는 문자를 순차적으로 저장하세요.
			"hong"
			-----------------
			|'h'|'o'|'n'|'g'|
			-----------------
		
		참고]
			문자열의 특정위치의 문자를 추출해주는 함수
			
				문자열.charAt(위치값);
		
			문자열의 길이를 반환해주는 함수
			
				문자열.length();
			변환값이 정수입니다.
			
				Arrays.toSting(); 배열에 담긴 데이터를 문자열로 반환
*/
public class Ex07 {

	public static void main(String[] args) {
		//문자 입력 받을 준비하기
		Scanner sc = new Scanner(System.in);
		//콘솔에 입력 문구 출력하기
		System.out.println("문자를 입력하세요. : ");
		//문자열 받을 변수 만들기
		String cha = sc.nextLine();
//		-------------------------------- 1번 문자 받기, 입력받기
		//문자 담을 배열 만들기
		String str[];
		// 문자열 배열안에 입력받은 문자 넣기
		str = new String[] {cha};  
		//문자열의 특정위치의 문자를 추출해주는 함수 만들기
		System.out.println("배열에 담긴 데이터 : "+Arrays.toString(str)); 
		System.out.println("문자열의 길이 : "+cha.length());
		// 문자열의 길이만큼 반복하는 for문
		System.out.println("--------------------");
		for(int i = 0; i<cha.length(); i++) { 
			//입력받은 문자열의 배열을 순차적으로 출력하기
			System.out.print("|'"+cha.charAt(i)+"'|");
				
		}	System.out.println();
		System.out.println("--------------------");
		
	}
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//콘솔에 입력 문구 출력하기
		System.out.println("문자를 입력하세요. : ");
		//문자열 받을 변수 만들기
		String word = sc.nextLine();
		char[] array_word = new char[word.length()]; // 스트링을 담을 배열

		for(int i=0;i<array_word.length;i++){ 
			array_word[i]=(word.charAt(i));//스트링을 한글자씩 끊어 배열에 저장
			System.out.print("|"+array_word[i]+"|"); //출력
		}
	}*/

}
