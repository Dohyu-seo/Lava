package day13.home;

import java.util.Arrays;

/*
문제 3]
	Figure클래스를 정의하고
	상속받아서 삼각형, 사각형, 원의 클래스를 정의한 후
	
	1 ~ 3 까지의 정수를 랜덤하게 10개 만들어서
	1의 경우 삼각형
	2의 경우 사각형
	3의 경우 원
	을 배열에 넣고
	출력하세요.

*/

public class Exec01{

	public Exec01() {
//		int ran = (int)(Math.random()*61+40);
		Figure[] f = new Figure[3];
		



		
		int cnt = 0;
		for(int i = 0; i<10; i++) {
			cnt++;
			int num = (int)(Math.random()*3);
			int no1 = (int)(Math.random()*61+40);
			int no2 = (int)(Math.random()*61+40);
			if(num == 0 ) {
				f[0] = new Nemo(no1, no2);
				System.out.println("-------");
			}else if(num ==1) {
				f[1] = new Semo(no1, no2);
				System.out.println("-------");
			}else {
				f[2] = new Won(no1);
				System.out.println("-------");
			}
			System.out.println(cnt+"번째입니다.");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Exec01();
	}

}
