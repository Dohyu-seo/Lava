package day11;
/*
	문제 1]
		이 클래스는 원의 정보를 저장할 클래스입니다
		이 클래스가 객체가 될 때 반지름을 입력받아서 원의 대한 정보가 입력이 되게
		클래스를 정의하세요.
		
		반지름이 입력이 안될 경우는 10으로 입력되게 하세요. 
 */
public class Circle {
	// 이 클래스는 원의 대한 정보를 기억하는 클래스이므로
	// 반지름, 둘레, 넓이를 기억하면 될 것이다.
	int rad;
	double arround, area;
	// 클래스 목적 : 이 클래스 new 하면  원하나를 만들겠다! 라는 클래스이다 .
	
	//기본 생성자 함수
	public Circle() {
		this(10);
//		this.rad = 10;
//		this.arround = getArround(10);
//		this.area = getArea(10);
	
	}
	
	// 생성자함수 오버로딩, int 반지름을 입력하면 이 원이 만들어지는 함수.
	public Circle(int rad) {
		this.rad = rad;
		// 밑에 함수들 실행하는 방법: 전역변수에 함수 세팅해놓기
		// 여기서 세팅해주는게 생성자 함수이다 <<<
		this.arround = getArround(rad);
		this.area = getArea(rad);
	}
	
	// 원의 둘레 구해주는 함수
	public double getArround(int rad) {
		// 반지름 입력해주면 반환해주는 함수!! int rad<
		return 2 * rad * 3.14;		
	}
	
	// 원의 넓이 구해주는 함수
	public double getArea(int rad){
		return rad*rad*3.14;
	}
	// 출력하기
	public void toPrint() {
		System.out.printf("반지름 : %5d | 원의 둘레 : %7.2f | 원의 넓이 | % 7.2f\n", rad, arround, area);
	}
	
}
