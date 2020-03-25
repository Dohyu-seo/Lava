package day13;
/*
문제 1]
	
	Figure 클래스를 상속 받아서 Nemo, Semo, Won 클래스를 작성하세요.
	Figure 클래스는 면적을 구해주는 추상함수만 멤버로 가지고 있습니다.
	
	ArrayList에 각 도형의 인스턴스를 10개 랜덤하게 담고
	꺼내서 출력하는 프로그램을 작성하세요.
	
*/
public abstract class Figure { // 추상 클래스
	/*
	  	면적을 구하는 추상 클래스 입니댜-
	 */
	public abstract double calcArea(int...a); // 추상함수
}
