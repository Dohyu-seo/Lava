package day14;

public class Dongl {
	private int rad;
	private double arround, area;

	public Dongl(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}

	// 둘레 구해주는 함수
	public void setArround() {
		arround = 2 * 3.14 * rad;
	}

	// 면적 구해주는 함수
	public void setArea() {
		area = 3.14 * rad * rad;
	}

	// area는 접근지정자가 private 이고 이것은 클래스 내에서만 접근이 가능하므로 함수를 만들어서 데이터를 반환해주도록 하자.
	public double getArea() {
		return area; // 겹치는게 없으니 this를 쓸 필요가 없다~ JVM이 자동으로 반환해준다 :)
	}
	
	// 이제 면적이 같으면 같은 원으로 판단 되도록 equals함수를 Override 해보자
	// 상속 받는다, 1. 함수 원형을 유지해야한다. : API에서 가져온다
	public boolean equals(Object obj) {
		// 반환값 담을 변수 선언 및 초기화
		boolean bool = false;
		
		
		// 이제 처리할 내용을 여기에 작성한다. ( Object를 입력하라고 하니, 데이터를 집어넣으면 Object로 변환된다.)
		// 입력되는 Dongl 인스턴스는 오브젝트 타입으로 자동형변환이 되서 기억이 될 것이므로
		// Dongl타입으로 강제 형변환을 시켜서 멤버를 사용해야 겠다.
		Dongl d1 = (Dongl) obj;
		
		// 타입은 변환이 되었고 이제 면적을 꺼내서 비교해 보자
		// 비교는 대상이 두개가 필요하다, 하나는 매개변수로 입력을 받았다. 그럼 다른 하나는??
		bool = (this.area == d1.area) ? (true) : (false);
		
		//결과 반환해주고
		return bool;
	}
}
