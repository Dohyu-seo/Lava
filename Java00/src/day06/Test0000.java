package day06;

import java.util.Scanner;

public class Test0000 {

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
	}

}
