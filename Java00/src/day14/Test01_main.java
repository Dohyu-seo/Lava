package day14;

public class Test01_main {
	String name;
	int age;
	Test01_01 t;

//	public Test01_main() {
//		t = new Test01_01();
//		Test01 t1 = t.t1;
//		t1.age = 24;
//		t1.name = "홍길동";
//		System.out.println(t1.toString());
//
//	}
	public Test01_main(int age, String name) {
		this.name = name;
		this.age = age;
		// Test01_01에서 함수에 매개변수리스트를 넣었기 때문에 실행 가능.
		t = new Test01_01(this);  
		//여기서 생성자를 호출 할 때 Test01_01(new Test01_main(24, "홍길동")); 이라고 하게되면 안된다.
		// this하고 위 함수하고는 전혀 다른 객체이다. new 때문에...꼬리에 꼬리를 무는 오류형 함수
		
	}
	public static void main(String[] args) {
		// 입력된 이 값을 제이 처음만들어진 Test01까지 전달하려면 .. Test01_main 의 객체를 대입해서 사용하도록 해줄 것이다.
		Test01_main m1 = new Test01_main(24,"홍길동");
		// 실행할 때마다 생성자 함수를 호출해야 한다.
		Test01_main m2 = new Test01_main(18, "심청이");
		// Test01_01과 Test01멤버에게 동시에 넘겨줄 것이다
		// 이 다른 호출자를 각각의 t1으로 전달할 것이고 중간에 있는 함수들도 건드리지 
		System.out.println(m1.t.t1.toString());
		System.out.println(m2.t.t1.toString());
	}

}
// 결과값 Test01에 있는 함수를 실행 시킨다. << Evt가 this를 적용해 넘어왔다 한다.
