package day02;

import java.util.*;

import day03.Hw05;
public class Ex02 {
	
	/*
	 	
	 	문제 1]
	 	3자리로 구성된 숫자 하나를 입력을 받은 후 또는 랜덤하게 만든 후
	 	백자리 이하를 버린 숫자를 만들어서 출력하세요.
	 		예]
	 			456 -- 400*/

	/*public void sov1() {
		int num = (int)(Math.random()*(999-100+1)) + 100;
		
		int result = num - (num %100);
	}
	*/
	
		
	 
	
	/*	문제 2]
	 		0 ~ 255 사이의 숫자를 랜덤하게 만들고
	 		그 숫자를 코드값으로 하는 문자를 만들어서
	 		해당 문자가 영문자인지 아닌지 판별해서 출력하세요
	 		단 , 삼항 연산자를 사용해서 처리하세요.*/

	 	/*public void Ex002() {
		int num = (int)(Math.random() * (255 - 0 + 1))+0;
		System.out.println("랜덤한 코드값 : " + num);
		char str = (char)num;
		System.out.println(str);
		
		String result = (str <= 'A') ? ("영문자입니다 : " + str) :
										( str <= 'Z' ? ("영문자입니다 : " + str) :
										( str <= 'a' ? ("영문자입니다 : " + str) :
										( str <= 'z' ? ("영문자입니다 : " + str) : ("영문자가 아닙니다."))));
		System.out.print(result);
		
	 		

	 	} */
	 	
	 	
	 	
	 	
	 	
	 	/*문제3]
	 		화씨(Fahrenheit) 온도 100도는  섭씨(Celcius)온도 몇도인지 알아보는 프로그램을 작성하세요.
	 		수학계산X 프로그램.
	 		
	 		공식]
	 			섭씨 온도 = 5 / 9 * (화씨온도 - 32)*/
	
	 /*	public void Ex03() {
	 		Scanner sc = new Scanner(System.in);
	 		System.out.println("섭씨로 바꿀 화씨온도를 입력하세요 :");
	 		double fehr = sc.nextDouble();
	 		double cel = (fehr-32.0)*5.0/9.0;
	 		
	 		
	 		System.out.println("화씨온도 "+fehr+"을(를) 섭씨온도로 바꾸면 "+ cel +"입니다.");
	 		
	 		
	 	} */
	 		
	 /*	문제4]
	 		실수를 입력한 후 
	 		소수점 이하 세째 자리에서 반올림 한 결과를 출력하세요.
	 		
	 		원리]
	 			+ 0.005<자동 반올림 
	 			여기에 x 100 해주면 두째 자리 까지 정수부에 들어갈 것이고
	 			정수로 변환 하고  셋째자리를 버리면 다시 /100으로 소수점 형태로 	  */	
	 	 /*public void Ex04() {
	 		 Scanner sc = new Scanner(System.in);
	 		System.out.println("실수를 입력하세요 : ");
	 		double num = sc.nextDouble();
	 		double sosu = 0.005;
	 		int go = 100;
	 		double no = 100.;
	 		System.out.print((num+sosu) * go / no);
	 				
	 		 
	 		 
	 		 
	 	 }*/
	 	 
	 	 
	 	 
////	package day03;
//
//	/* 문제 5]
//	랜덤한 숫자를 10~99 사이의 숫자를 발생시킨 후 -
//1	그 숫자가 가까운 10의 배수(2)의 차(3)를 출력(4)하는 프로그램을 작성하세요.
//	
//	출력 예]
//		45는 50과의 차가 5가 난다.
//		
//		53은 50과 차가 3이 난다.	*/
//
//public class Hw05 {
//
//	public Hw05() { 
//		solv();
//	}
//	public void solv() {
//		//1. 10 ~ 99 사이의 랜덤한 숫자 만들기
//		int num = (int)(Math.random()*(99-10 +1))+10;
//		
//		//2.  가까운 10의 배수 만들기
//		// 먼저 10으로 나눈 나머지 구하고
//		int nmj = num % 10;
//		
//		// 나머지가 5보다 크거나 같으면 십의 단위를 10 올려주고 작으면 10의단위로 그냥쓰고
////		int sip = (nmj >= 5) ? ((num / 10 +1)*10) : ();
//		int sip = (nmj >= 5) ? (num /10 * 10 +10) : (num/10 *10);
//		
//		//차를 구한다.그런데 나머지가 5보다 크거나 같은 경우는 sip에서 숫자를 빼줘야겠고
//		// 5보다 작으면 숫자에서 sip을 빼주면 된다.
//		int cha = (nmj >= 5) ? (sip - num) : (num - sip);
//		
//		//출력하고
//		System.out.println("랜덤하게 발생한 숫자  : "+ num + "\n 가까운 십의 배수 : "+ sip +
//							"\n 가까운 십의 배수와의 차"+cha
//				);
//		}
//		
//
//	public static void main(String[] args) { 
//		new Hw05(); 
//	}
//}

	 	 
	 	 
	 	 
	 	 
	 	/* 문제 6]
	 	 	임의의 년도를 입력받아서
	 	 	해당 년도가 윤년인지 평년인지 판별해서 출력해주는 프로그램을 작성하세요.
	 	 	
	 	 	 단, 삼항연산자를 사용해서 처리하세요.
	 	 	 
	 	 	 윤년의 정의]
	 	 	 	4로 나눠 떨어지고 100으로 나눠 떨어지지 않고 400으로 나눠 떨어지는 수
	 	 	 	/임의의 년도 받을 준비하기
	 	 	 	  
	 	 	 	/년도 받기
	 	 	 	 
	 	 	 	/평년인지 윤년인지 조건식 만들기   
	 	 	 	  
	 	 	
	 		 
	 */
	
	
	
	//기본 생성자 함수 정의
	public Ex02() {
		//Ex002();
		//Ex03();
		//Ex04();
//		Ex05();
		
		/*Scanner sc = new Scanner(System.in);	
		System.out.println("숫자를 입력하세요.");

		int code = sc.nextInt();
		int sum = (code /100) * 100;
		System.out.print(sum);*/
	}
	
	public static void main(String[] args) {
		new Ex02();

	}

}
