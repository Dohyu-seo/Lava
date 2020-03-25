package day02;

import java.util.*;
public class Ex01 {
	/*			2. 반지름이 7인 원의 넓이, 둘레를 계산해서 출력하세요.
	원의 둘레 :  2*반지름*3.14
	원의 넓이 :  반지름*반지름*3.14
	
	단, 반지름, 둘레, 넓이는 변수를 만들어서 처리하세요.
	그리고 둘레는 float타입의 변수로 만드세요.
-----------------------------------------------------------------------------
3. 두개의 숫자(정수)를 변수에 담고
	두수를 가로, 세로로 하는 사각형의 넓이를 구하세요.
-----------------------------------------------------------------------------
4. 3번 문제의 두수를 밑변과 높이로 가지는 삼각형의 넓이를 구하세요.*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("넓이를 구할 원의 반지름을 입력하세요.");
		int sum = sc.nextInt();
		float ra = (sum*2*3.14F);
		System.out.print("둘레를 구할 원의 반지름을 입력하세요.");
		int uum = sc.nextInt();
		float da = (uum*uum*3.14F);
		System.out.println("반지름이 7인 원의 넓이는 " + ra + " 입니다.");
		System.out.println("반지름이 7인 원의 둘레는 " + da + " 입니다.");
		System.out.println(" ");
		System.out.println(" ");
		
		
		System.out.print("둘레를 구할 사각형의 가로를 입력하세요.");
		int garo = sc.nextInt();
		System.out.print("둘레를 구할 사각형의 세로를 입력하세요.");
		int sero = sc.nextInt();
		System.out.print("이 사각형의 넓이는 " + (garo*sero) + " 입니다.");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.print("넓이를 구할 삼각형의 밑변을 입력하세요.");
		double mit = sc.nextDouble();
		System.out.print("넓이를 구할 삼각형의 높이을 입력하세요.");
		double hor = sc.nextDouble();
		sc.close();
		System.out.print("이 삼각형의 넓이는 " + (mit*hor/2) + " 입니다.");
	}

}
