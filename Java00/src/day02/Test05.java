package day02;

/**
 *  이 클래스는 삼항 조건 연산자 연습용 클래스
 * @author 서동혁
 * @since 2020.03.10
 * @version v.1.0
 * @see
 * 
 * 			변경 이력
 * 			2020.03.10	-	클래스제작	-	 담당자 : 서동혁
 */
public class Test05 {
/*
 	랜덤한 수 발생 시키는 방법
 		
 		Math 클래스에 random() 함수는 0 보다 크거나 같고  1보다 작은 실수를 반환해주는 함수.
 		- static에 double타입
 		이 때 범위에 해당하는 랜덤한 정수를 발생 시키는 방법은
 		
 		(int) (Math.random() * (최대값 - 최소값 + 1)) + (최소값) ; 
 		0<= (Math.random())<1  = 0.99999...까지 구한다는 함수.
 		
 */
	public Test05() {
		test1();
	}
	
	public void test1() {
		// 1 ~ 10 까지의 랜덤한 숫자룰 발생시켜서 그 숫자가 짝수인지 홀수 인지 판별하세요.
		// 짝수의 정의는 수를 2로 나눠서  나머지가 0인 수.
		
		// 1. 랜덤한 정수를 만든다
		int num = (int)(Math.random()* (10 - 1 +1)) +1 ;
		// 2. 삼항 연산자로 조건을 정의한다.
		// 2-1. 잠일 때 반환겂을 정의한다.
		// 2-2. 거짓일 때 반환겂을 정의한다.
	String msg = (num %2 == 0) ? ("[ "+num + " ] 은 짝수입니다."
							) : ("[ " +num + " ] 은 홀수입니다.");	 
		// 출력한다
		System.out.println(msg);
	}
	public static void main(String[] args) {
		new Test05(); // 함수는 클래스 블럭 내에만 만들면 된다.
	}

}
