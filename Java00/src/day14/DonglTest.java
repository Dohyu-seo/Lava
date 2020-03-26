package day14;

public class DonglTest {
	
	public DonglTest() {
//		Dongl 객체 두개를 만들고  비교해보자.
		Dongl d1 = new Dongl(5);
		Dongl d2 = new Dongl(5);
		
		//private으로 설정되어있기 때문에 그 변수의 값은 함수를 통해서 꺼내와야 합니다.		
		System.out.println("d1.area : "+ d1.getArea());
		System.out.println("d1.area : "+ d2.getArea());

		
		// 두 원이 같은지 비교해보자.
		System.out.println("d1과 d2는 : "+
							((d1.equals(d2))?("같은 원 입니다"):("다른 원 입니다.")));
	}
	public static void main(String[] args) {
		new DonglTest();
	}

}
