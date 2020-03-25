package day01;

public class Ex01 {
/*
 	1. 1, 2, 5, 10, 20 을 제외한 숫자 하나를 가정하고 (양수, 음수 모두)
 		이것을 2진수로 바꿔보고
 		실제 프로그램의 결과와 일치하는지 확인하세요.
-----------------------------------------------------------------------------
	2. 반지름이 7인 원의 넓이, 둘레를 계산해서 출력하세요.
		원의 둘레 :  2*반지름*3.14
		원의 넓이 :  반지름*반지름*3.14
		
		단, 반지름, 둘레, 넓이는 변수를 만들어서 처리하세요.
		그리고 둘레는 float타입의 변수로 만드세요.
-----------------------------------------------------------------------------
	3. 두개의 숫자(정수)를 변수에 담고
		두수를 가로, 세로로 하는 사각형의 넓이를 구하세요.
-----------------------------------------------------------------------------
	4. 3번 문제의 두수를 밑변과 높이로 가지는 삼각형의 넓이를 구하세요.
-----------------------------------------------------------------------------
	5. 54,232원을 지불해야한다.
		우리나라 화폐로 각 단위가 몇개나 필요한지 계산해서 출력하세요.
		5만워권 - 1장
		1만원권 - 0장
		5천원권 - 0장
		1천원권 - 4장
숙제]
	1년은 365.2426일이다.
	이 날짜는 과연 며칠 몇시간, 몇분, 몇초인지 계산해서 출력하세요.
	
	
 */
	public static void main(String[] args) {
		
		// 0 <= no1 <= 20; ==> 비교연산자는 한번에 하나만 처리할 수 있다.
		// 0 <= no1 % no1 <= 20;
	/*//1번
		int num = 11;
		String a1 = Integer.toBinaryString(num);  // 10진수 -> 2진수
		
		System.out.println(a1);
		
		int no = 8;
		String a2 = Integer.toBinaryString(no);  // 10진수 -> 2진수
		
		System.out.println(a2);
	//2번
		/*2. 반지름이 7인 원의 넓이, 둘레를 계산해서 출력하세요.
		원의 둘레 :  2*반지름*3.14
		원의 넓이 :  반지름*반지름*3.14
		
		단, 반지름, 둘레, 넓이는 변수를 만들어서 처리하세요.
		그리고 둘레는 float타입의 변수로 만드세요.*/
	/*	double pi = 3.14F;
		int rad = 7;
		
		
		System.out.println("반지름이 " + rad + "인 원의 둘레는 " + (2*rad*pi) + " 이다.");
		System.out.println("반지름이 " + rad + "인 원의 넓이는 " + (rad*rad*pi) + " 이다.");
	//3번
		/*3. 두개의 숫자(정수)를 변수에 담고
		두수를 가로, 세로로 하는 사각형의 넓이를 구하세요.*/
		
	/*int garo = 300;
		int sero = 325;
		
		System.out.println("가로가 " + garo + "이고 세로가  "+ sero + "인 사각형의 넓이는 " + (garo*sero) + " 이다.");
	//4번
		/*4. 3번 문제의 두수를 밑변과 높이로 가지는 삼각형의 넓이를 구하세요.*/
/*System.out.println("밑변이 " + garo + "이고 높이가  "+ sero + "인 삼각형의 넓이는 " + (garo*sero/2) + " 이다.");
	//5번
		/*	5. 54,232원을 지불해야한다.
		우리나라 화폐로 각 단위가 몇개나 필요한지 계산해서 출력하세요.
		5만워권 - 1장
		1만원권 - 0장
		5천원권 - 0장
		1천원권 - 4장*/
	/*	int won = 54232;
		int oman = 0;
		int man = 0;
		int ochun = 0;
		int chun = 0;
		int obaek = 0;
		int baek = 0;
		int osip = 0;
		int sip = 0;
		int il = 0;
		// 이 값들의 카운트를 구해야함.
		int tmp = won;
		
		oman = tmp / 50000;
		tmp %= 50000;	// 남은 데이터값 저장.
		man = tmp / 10000;
		tmp %= 10000;
		ochun = tmp / 5000;
		tmp %= 5000;
		chun = tmp / 1000;
		tmp %= 1000;
		obaek = tmp / 500;
		tmp %= 500;
		baek = tmp / 100;
		tmp %= 100;
		osip = tmp / 50;
		tmp %= 50;
		sip = tmp / 10;
		tmp %= 10;
		il = tmp / 1;

		System.out.println("5만원권 : " + oman);
		System.out.println("1만원권 : "+man);
		System.out.println("5천원권 : "+ochun);
		System.out.println("1천원권 : "+chun);
		System.out.println("500원 :"+obaek);
		System.out.println("100원 :"+baek);
		System.out.println("50원 : "+osip);
		System.out.println("10원 : "+sip);
		System.out.println("1원 :"+il);

		
		
		/*숙제]
				1년은 365.2426일이다.
				이 날짜는 과연 며칠 몇시간, 몇분, 몇초인지 계산해서 출력하세요.
				*/
	/*	double year = 365.2426;
		
		double ddp = year;
		
		double date = 0;
		double hour = 0;
		double min = 0;
		double seoc = 0;
		
		date = (int)365.2426%ddp;
		System.out.println ("일  수 : " + year);	
		
		ddp = ddp-365;
		System.out.println ("일수 뺀 값: " + ddp);	
		hour = ddp*24;
		ddp = hour-5;
		System.out.println ("시간  : " + hour);	
		System.out.println ("시간 뺀 값 : " + ddp);
		min = ddp *60;
		System.out.println ("분  : " + min);	
		ddp = min - 49;
		System.out.println ("분 뺀 값 : " + ddp);
		seoc = ddp *60;
		System.out.println ("초  : " + seoc);	
		ddp = seoc-20;
		System.out.println ("초 뺀 값 : " + ddp);
		

	System.out.print((int)date+"일 ");
	System.out.print((int)hour+"시간 ");
	System.out.print((int)min+"분 ");
	System.out.print((int)seoc+"초");
	*/

	
	
	}//main
}
