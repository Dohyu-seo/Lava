package day13;

public class Test03 {
	int no = 100;
	
	public static class Cls01{ // Top Level Inner Class
		String name ="우현우";
	}
	
	public class Cls02{
			int num = no; 
	}
	
	public Test03() {
		 hw(new Inter01() { // 무명 내부 클래스 <<= 실행하고 바로 사라지는 객체이니 접근지정자를 붙일 수 없다.
			 public void toPrint() {
				 System.out.println("###여기는 익명 내부 클래스 ###");
			 }
		 });
		 
	 abc();
	}
	
	public void abc() {
		int b = 10;
		
		Cls02 c2 = new Cls02();
		
		class Cls03{ // 지역 내부 클래스 
			int c = 100;
			public void xyz() {
				System.out.println("&&^^^^^^^^^^^^^^&&");
			}
		}
		
		Cls03 c3 = new Cls03(); // 객체만들기
		
		c3.xyz();
	}
	
	public static void main(String[] args) {
		new Test03();
	}
	// 클래스 블럭 내부에 만들어지는 클래스를 내부클래스라 한다.
	
	
	//무명 Inner Class의 이해를 위한 설명
	public void hw(Inter01 i) {
		i.toPrint();
	}
	
}

class Test03_01{ // 외부클래스
	// 컴파일한다면 .class파일이 생성된다.
	// 이 파일을 컴파일하면 .Test03과 .Test03_01이 만들어진다.
	
	// 내부클래스는 ?? 
	// 클래스 블록 내부에 만들어지는 클래스를 칭한다.
	public Test03_01() {
		Test03.Cls01 t1 = new Test03.Cls01();
		
		Test03 t2 = new Test03();
//		test03.Cls02 t3 = new Test03.Cls02(); // 왜 안되는지 : 지역 Inner class이기 때문이다.
	}
	
}