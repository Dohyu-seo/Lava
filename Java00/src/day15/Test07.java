package day15;

import java.util.*;
import java.io.*;

public class Test07 {

	public Test07() {
		File f = new File("D:\\class\\Java\\git\\Lava\\Java00\\src\\doc\\day15_src.txt");

		Scanner sc = null;
		String str = "";
		try { 
			sc = new Scanner(f);
			str = sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		StringTokenizer token = new StringTokenizer(str);

		int count = token.countTokens(); // 자른 문자열의 갯수를 반환해주는 함수
		System.out.println("자른 갯수 : " +count);
		/*
		// 꺼내면 된다.
		for(int i = 0 ; i < count; i ++) {
			String tmp = token.nextToken();
			System.out.println("분리된 문자열 : " + tmp);
		}
		// 다시 꺼내기
		for(int i = 0 ; i < count; i ++) {
			String tmp = token.nextToken();
			System.out.println("다시 꺼낸 문자열 : " + tmp);
		}
		// 스캐나이저 특징 : 버퍼에 올림, 꺼낸 문자는 다시 꺼낼 수 없다.
		*/
		
		
		// 실제 StringTokenizer를 사용하는 방법 ****
		while(token.hasMoreTokens()) { //꺼낼 토큰이 있니? 라는 조건식
			String tmp = token.nextToken(); // 임시버퍼에서 데이터 꺼내는 함수.
			System.out.println("다시 꺼낸 문자열 : " + tmp);
		} // 더 이상 꺼낼게 없을 때 까지 반복한다.
	}

	public static void main(String[] args) {
		new Test07();
	}

}
