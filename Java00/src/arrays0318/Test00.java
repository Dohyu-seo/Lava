package arrays0318;

import java.util.Scanner;

public class Test00 {
/*
 	과목 이름을 입력받아 해당 과목 점수를 출력해주는 프로그램을 작성해보자,
 	무한 반복하다가 그만 이라고 입력하면 프로그램이 종료된다.
 */
	public static void main(String[] args) {
		String[] sub = {"java", "python", "android", "jsp", "html"};
		int[] score = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("과목명을 입력하세요");
			String name = sc.next();
			
			for(int i = 0; i < sub.length; i++){
				if(sub[i].equals(name)) {
					System.out.println(sub[i]+"의 점수"+score[i]);
				}
			}
			if(name.equals("그만")) {
				break;
			}
		}
		sc.close();
	}
}
