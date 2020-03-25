package day11;

public class Test02 {
	public static void main(String[] args) {
//		int no1 = getRandom();  //=> static 멤버 안에서는 static 멤버와 메모리에올려진 애들만 사용 할 수 있습니다.
		// 따라서 지금 위 함수는 사용할 수 없습니다.
		
		//	꼭 사용해야 겠다면
		//	1. 사용할 함수를 멤버로 가지는 클래스의 객체를 만들어준다.
		// 		객체(Object) = 참조변수 + 인스턴스  < 인스턴스 : 힙에 올려진 애.
		Test02 t1 = new Test02(); // 여기서 메모리에 올렸으니 사용할 수 있게 되었다-.
		int no1 = t1.getRandom();
		
		// static 멤버호출
		int no2 = getTen(); // 이 함수는 static멤버이니 메모리에 올리지 않아도 호출이 가-능 하다.
		// 또한 this로는 접근할 수 없는 함수라는 것. 기억해야한다.
	}
	public int getRandom() {
		int result = (int)(Math.random()*7+1);
		return result;
	}
	
	public static int getTen() {
		return 10;
	}
}
