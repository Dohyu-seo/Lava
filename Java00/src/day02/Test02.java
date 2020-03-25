package day02;

public class Test02 {
	/*
	 	모든 클래스는 생성자 함수를 가지고있다.
	 	생성자 함수는 해당 클래스가 객체가 될 때
	 	멤버가 가져야 할 초기값을 세팅해주는 역할을 한다.
	 	
	 	클래스에는 멤버가 변수와 함수가 있는데
	 	멤버 변수중 기본형멤버변수들은 자동으로 초기화가 이루어진다. 
	 		int ==> 0
	 		char ==> ' '
	 		boolean ==> false
	 		float ==> 0.0f
	 		double ==> 0.0
	 */
	 
	int no;  
	
	public static void main(String[] args) {
		//int num = no +1; // 메모리에 올려진 상태가 아니라서 사용될 수 없음.  생성자 함수 : 0으로 되는 데이터를 갖고있는 함수.
		Test02 t2 = new Test02(); // <-- Test02 라는 생성자 함수를 만들지 않았는데 실행되는 이유는 JVM에서 자동으로 클래스이름으로 생성자 함수를 만들어준다.
		// heap에 Test02라는 데이터를 초기화시킴 (메모리에 올리는 것 )
		t2.abc();
		System.out.println("Test02.no : " + t2.no);
//		abc();
	}//main
	
	public void abc() {
		System.out.println("***************");
	}
}
