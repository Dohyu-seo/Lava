package day11;

/*
  	문제1]
	반지름을 랜덤하게 발생해서 - 함수로.
	그 반지름을 입력하면 원의 넓이를 구해주는 함수와
	원의 둘레를 구해주는 함수를 제작하고
	실행해서 출력하세요.
	출력해주는 함수도 작성하세요.
	
 */
public class Test01 {

	static double random;
	public Test01() {
		
		setRan();
	}
	
//	//	랜덤한 반지름을 넣을 배열부터 만들기
//	double[] no;
	
	//	반지름을 랜덤하게 발생시키는 함수
	public static  double setRan() {
	random = (double)(Math.random()*41+60);
		return random;
	}
	
	//	반지름의 넓이를 구해주는 함수
	public static double setArea() {
		return random*2.*3.14;
	}
	
	// 반지름의 둘레를 구해주는 함수
	public static double setRound() {
		return random*random*3.14;
	}
	
	// 출력하는 함수
	public static void toPrint() {
		System.out.printf("원의 둘레 : %3f \n","원의 넓이 : %3f\n","반지름 : ",setArea(),setRound(),setRan());
		
	}
}
