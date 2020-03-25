package day07;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		//정수 10개를 저장할 배열을 만든다
		int[] no1 = new int[10];
			//랜덤한 수 발생 시키기
//			int random = (int)(Math.random()*(50-1+1)+1);
			//배열에 담기 -> 만들어놓은 랜덤을 for문에 넣는다
			for(int i=0; i<no1.length; i++) {
				int random = (int)(Math.random()*(50-1+1)+1);
				// 발생한 랜덤의 수를 배열에 담는다.
				no1[i] = random;
			}
			//깊은복사로 받을 같은 타입의 배열을 만든다.
			int[] no2 = new int[no1.length];
				//깊은 복사하기
				System.arraycopy(no1,0,no2,0,5);
				System.out.println("----------------------------");
					//출력하기
					for(int i=0; i<no1.length; i++) {
					System.out.print(no1[i]+", ");
					}
				System.out.println("랜덤 배열 출력이 끝났습니다");
				System.out.println("----------------------------");
					for(int i=0; i<no2.length; i++) {
					System.out.print(no2[i]+", ");
					}
				System.out.println("깊은 복사 출력이 끝났습니다");
				System.out.println("----------------------------");
		}
}
