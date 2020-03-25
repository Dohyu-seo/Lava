package day06;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		String[] name = {"서동혁", "읭의읭", "믬믜믬", "늰늬늰", "싓싀싓"};
		String[] tel = {"010-9823-5579", "010-0000-0000", "010-4444-4444", "010-2222-2222","010-9999-9999"};
		String[] email = {"502flclqlf@naver.com", "ing@naver.com", "ming@naver.com","ning@naver.com","sing@naver.com"};
		
		String[][] team = new String[3][5];
		team[0] = name;
		team[1] = tel;
		team[2] = email;
		
		 //입력 받을 준비
		Scanner sc = new Scanner(System.in);
		//입력 유도 문구 출력
		 System.out.println("이름을 입력하세요.");
		 //입력 받은 데이터담기
		 String cha = sc.next();
		 //데이터의 크기를 체크할 숫자형 변수
		 //이름
		/*
		for(int i = 0 ; i < team[0].length ; i++ ) {
			String irum = team[0][i];
			System.out.println("[ " + (i + 1) + " ] : " + irum);
		}
		
		// 전화번호
		System.out.println("### 전화번호");
		for(int i = 0 ; i < team[1].length ; i++ ) {
			String hp = team[1][i];
			System.out.println("[ " + (i + 1) + " ] : " + hp);
		}
		// 메일
		System.out.println("### 메일");
		for(int i = 0 ; i < team[2].length ; i++ ) {
			String mail = team[2][i];
			System.out.println("[ " + (i + 1) + " ] : " + mail);
		}
		*/
		for(int i = 0 ; i < team[0].length ; i++ ) {
			String irum = team[0][i];
			System.out.println("[ " + (i + 1) + " ] : " + irum);
			
		}
		
		// 전화번호
		System.out.println("### 전화번호");
		for(int i = 0 ; i < team[1].length ; i++ ) {
			String hp = team[1][i];
			System.out.println("[ " + (i + 1) + " ] : " + hp);
		}
		// 메일
		System.out.println("### 메일");
		for(int i = 0 ; i < team[2].length ; i++ ) {
			String mail = team[2][i];
			System.out.println("[ " + (i + 1) + " ] : " + mail);
		}
		
	}	
}
