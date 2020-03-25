package day11;

public class Dongl extends Dohyung {
	/*
	 	 달라진 점 . 
	 	 1. extends 클래스 이름 ( 상속 클래스를 적용 시켰다는것.)
	 	 2. 상속된 변수를 기입하지 않았다는 것.
	 */
	
	int rad;
	double arround;
	// area는 상속되있는 변수기 때문에 안쓴다~!
	
	public Dongl() {
		this(1);
	}
		//기본값. 아무것도 입력된게 없을 때.
	
	public Dongl(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	// 원의 둘레 계산해주는 함수
	public void setArround() {
		arround = 2 * rad * 3.14;
	}
	// 원의 넓이 계산해주는 함수
	public void setArea() {
		area = rad * rad* 3.14;
	}
	// 출력함수 - Dohyung의 toPrint() Overriding
	public void toPrint() {
		System.out.printf("반지름 : %3d\n원의 둘레 : %5.2f\n원의 넓이 : %5.2f\n",rad, arround, area);
	}
}

