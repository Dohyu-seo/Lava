package day09;

public class Ex02 {
	//출력
	public Ex02() {
		string();
	}
	
	//출력하는 함수 만들기
	public void string() {
		System.out.println(area());
		System.out.println(arr());
		System.out.println(round());

	}
	
	//랜덤하게 발생하는 수 만들기
	public int arr() {
		int random = (int)(Math.random()*(100-1+1)+1);
		return random;
	}
	
	//반지름을 입력하면 원의 넓이를 구해주는 함수. 반지름 * 반지름 * 3.14
	public double area() {
		double area = arr()*arr()*3.14;
		return area;
	}
	
	//반지름을 입력하면 원의 둘레를 구해주는 함수. 반지름 *2 * 3.14
	public double round() {
		double round = arr()*2*3.14;
		return round;
	}
	
	public static void main(String[] agrs) {
		new Ex02();
	}
}
