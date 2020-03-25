package day03;

/*	문제4]
	실수를 입력한 후 
	소수점 이하 세째 자리에서 반올림 한 결과를 출력하세요.
	
	원리]
		+ 0.005<자동 반올림 
		여기에 x 100 해주면 두째 자리 까지 정수부에 들어갈 것이고
		정수로 변환 하고  셋째자리를 버리면 다시 /100으로 소수점 형태로 	  */	

// 라이브러리 가져오고
import java.util.*;
public class Hw04 { 
	
	public Hw04() { // 메모리 올릴 때 실행해 주어야 하는 함수
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 메세지  출력하고
		System.out.print("실수를 입력하세요! : ");
		// 실수 입력받아 변수에 담고
		double num = sc.nextDouble();
		// 함수 변수데이터 넘겨주면서 실행하고 데이터 받고 (반환값이 있기 때문에 데이터 받음)
		double result = banolim(num);
		// 데이터 출력하고
		System.out.println("입력받은 실수 : "+ num + "\n 반올림한 실수 : "+ result);
		
	}
	// 실수를 소수 두째자리에서 반올림 해주는 함수 // 정수형태로 반환 int , 실수 double, float
	public double banolim(double no) { 		//  TO_CHAR 처럼 문자열이 나오는데 실행하는 곳에 반환해주는 것이면, String 반환값.
		 // 반환값을 담을 변수를 만들고
			double result = 0.;
			
			
			//입력받은 데이터 반올림하고(소수 세째다리에서...)
			/*
			 	double no = 123.4567
			 	int no1 = (int)(no * 1000); ==> 123456
			 	no1 = no1 + 5;(오차 없음)
			 	no1 = (no1 /10) /100.; 
			 */
			int no1 = (int)(no * 1000);
			no1 += 5;
			
			result = (no1 / 10) / 100.;
			
			// 데이터 반환하고 
			return result;
	}
 
	public static void main(String[] args) {
		new Hw04();

	}

} 
