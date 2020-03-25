package day09;

public class Ex02_01 {
	double bal = 0; 
	double ral = 0;
	public Ex02_01() {
		syso();
	}
	//출력하는 함수 만들기
	public void syso() {
		area();
		round();
		System.out.println("랜덤한 수 : "+arr());
		System.out.println("반지름의 넓이 : "+bal);
		System.out.println("반지름의 둘레 : "+ral);
		
	}
	// 랜덤하게 발생하는 수 만들기
	public int arr() {
		int random = (int)(Math.random()*(100-1+1)+1);
//		return random;// return을 써줬기 때문에 발생한 수를 다른 함수에서 쓸 수 있게된다.
		return random;
	}
	// 반지름 입력하면 원의 넓이를 구해주는 함수. r*r*3.14
	public void area() {
		double area = arr()*arr()*3.14;
		bal = area;
	}
	// 반지름 입력하면 원의 둘레를 구해주는 함수. r*2*3.14
	public void round() {
		double round = arr()*2*3.14;
		ral = round;
	}
	public static void main(String[] args) {
		new Ex02_01();
	}

}
