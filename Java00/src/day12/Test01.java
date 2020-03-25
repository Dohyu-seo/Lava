package day12;

public class Test01 {

	public static void main(String[] args) {
		Object[] obj = {'A', 10, true};
		// 기본 데이터 타입이지만, 객체 타입의 변수에서 담고있다.
		// ==> 이렇게 써야할 경우가 있기 떄문에 별도로 class를 만들어서 자바에서  Wrapper class로 지원해주고있다.
		// 기본데이터타입들을 객체처럼 다루려고 만들어둔 클래스이다.
		// 객체타입으로 강제형변환이 되어 배열에 담기게 된다. 이 때 이 객체들은 Object타입으로 들어가게 되었고
		// 이 안에 있는 데이터는 Object가 되었고, Object는 최상위 클래스이면서 모든 타입을 다루기 때문이다.
		
//		System.out.println(obj[1]+5);		// --> Object는 연산자의 정의가 없기 때문에 쓰지 못한다..
		System.out.println((int)obj[1]+5); // --> Object 타입에서 강제로 형변환을 하면 사용이 가능하다
		// 하지만, Object의 배열에 몇번쨰에 어떤 타입이 들어있는지 모를 때 instanceof 를 사용한다.
		
		for(int i = 0 ; i<obj.length; i++) {
			//instanceof 라는 연산자는 객체의 소속을 밝혀줄 때 사용하는 연산자 입니다. 
			if(obj[i] instanceof Character) { //Character의 인스턴스인지- 물어본다.
				System.out.println((char)obj[i] + 5); //Character에 맞으면 char로 강제 형변환 후 정수 더해서 int로 반환
				System.out.println((char)((char)obj[i] + 5)); //Character에 맞으면 char로 강제 형변환 후 다시 char타입으로 변경 할 때
			}else if(obj[i] instanceof Integer) { // Integer의 인스턴스인지 물어본다.
				System.out.println((int)obj[i] + 10); //Integer가 맞으면 int로 강제 형변환
			}else if(obj[i] instanceof Boolean) { // Boolean의 인스턴스인지 물어본다.
				System.out.println(obj[i]); // 나머지는 Boolean이라는 판단하에 강제형변환 없이 출력한다.
				
			}
		}
		
	}

}
