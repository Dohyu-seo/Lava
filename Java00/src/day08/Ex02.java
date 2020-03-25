package day08;

import java.util.Arrays;

/*
	국어, 수학, 영어, 물리, 역사 점수를 관리하려고 합니다 (점수는 랜덤하게 추출하세요.)
	학생은 다섯명이고 2차원 배열로 만들어서 5명의 점수를 저장할 배열을 만드세욥!
	
 */
public class Ex02 {

	public static void main(String[] args) {
		//과목 5개 넣을 배열 만들기
		String[] gwamok = new String[5];
		String[] stu = new String[5]; 
		
		

		for(int i =0; i<gwamok.length; i++) {
			
			gwamok[i] +=i;
			for(int j = 0; j<stu.length; j++) {
				int random = (int)(Math.random()*(100 - 0 +1));
				String jeomsu = random+"";
				
				stu[j] = jeomsu;
//				System.out.println(Arrays.deepToString(stu));
			}
			System.out.println("--------"+(i+1)+"번 학생 점수");
			System.out.println(Arrays.deepToString(stu));
		}
	}

}
