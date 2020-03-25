package day11;

public class Test00_00 {

	public static void main(String[] args) {
		Test00 t0 = new Test00();
		Test00 t1 = new Test00();
		Test00 t2 = new Test00();
		// new 에 만들어서 서로 다른 주소이지만 공동으로 사용하지 않는 주소라고 한다면 각자0이라는 초기값을 갖고있다.
		
		t0.num = 10;
		System.out.println(t0.num);
		// 허나 static이라는 속성이 부여된 num은 - 다른 변수에 new로 인스턴스를 만들어도 같은 데이터값이 나온다
		System.out.println(t1.num);
		
		System.out.println(t2.num);
		
		System.out.println(Test00.num);
		// <== 이미 메모리에 올라가있기 때문에 객체로 만들어주지 않아도 사용이 가능하다.
	}

}
