package day10;

public class Test01 {

	public int plus(int no1, int no2) {
		int sum = no1+ no2;
		return sum + 10;
	}
	public static void main(String[] args) {
		Test01 t1 = new Test01();
//		System.out.println(t1.plus(2, 3).sum);
		// Java의 기본데이터 타입은 객체 아니다.
		// 그 뜻은 기본 데이터타입엔 클래스가 없어서 함수와 변수자체가 없다는 말이다.
	}

}
