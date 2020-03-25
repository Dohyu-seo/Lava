package day11;
/*
	문제1]
반지름을 랜덤하게 발생해서 - 함수로.
그 반지름을 입력하면 원의 넓이를 구해주는 함수와
원의 둘레를 구해주는 함수를 제작하고
실행해서 출력하세요.
출력해주는 함수도 작성하세요.

*/

public class Test01_01 {
	
	
	//출력하자
	public Test01_01() {
		double set = Test01.setRan();
		double are = Test01.setArea();
		double ron = Test01.setRound();
//		System.out.println(Test01.toPrint());
		System.out.println(set);
		System.out.println(are);
		System.out.println(ron);
		
	} // 생성자함수



	public static void main(String[] args) {
		new Test01_01();
	
	}

}
