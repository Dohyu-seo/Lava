package day14;

public class Samgak {
	// private 전역함수선언
	// 밑변, 높이
	// 둘레 , 면적
	private int base, height;
	private double arround, area;

	public Samgak(int base, int height) {
this.base = base;
this.height = height;
setArround();
setArea();
	}

	// 둘레 구해주는 함수 만들긔
	public void setArround() {
		arround = base * base * base;
	}

	// 면적 구해주는 함수 만들긔
	public void setArea() {
		area = base * height * 0.5;
	}
	
/*	// 면적 출력해주는 함수 만들긔
	public double getArea() {
		return area;
		
	}*/
	//toString 오버라이드 하기~
	public String toString() {
		  return "밑변이 "+base+"이고 높이가 "+height+"인 삼각형 의 면적은 " + area+"입니다,\n";
	}
	
	
	// 함수의 원형을 유지한 채 equals의 함수 오버라이딩 하기~
	public boolean equals(Object obj) {
		// 반환값 담을 변수 선언 및 초기화!
		boolean bool = false;
		
		// Object 타입에서 Samgak의 타입으로 바꾸어 주기
		Samgak s1 = (Samgak) obj;
		
		// s1의 매개변수는 만들었지만 비교대상을 만들어주자 
		bool = (this.base == s1.base) ? (true) : (false);
		
		return bool;
	}

}
