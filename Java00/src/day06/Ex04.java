package day06;

/*
	문제 4]
		
		반지름 5개를 기억할 배열을 만들고						- 정수배열 1개
		랜덤하게 2 ~ 30 까지의 5개의 반지름을 만들어서 입력하고	- Math.random()
		각각의 반지름을 가진 원의 넓이를 계산해서 저장할 배열을 만들고 - 실수 배열 1개
		각 원의 둘레를 계산해서 저장할 배열도 만들어서			- 실수 배열 1개
		
		결과를 출력하는 프로그램을 작성하세요.					- 반복문으로 꺼내서 출력
		단, 출력 형태는 
		
			예]
				반지름 : 10, 원의 둘레 : 62.8, 원의 넓이 : 314
				
		의 형태로 출력되게 하세요.
*/
public class Ex04 {

	public static void main(String[] args) {
		int rad[] = new int[5];//정수 배열
		for(int i = 0; i < 5; i++) {
		int random = (int)(Math.random()*(30-2+1)+2);
		rad[i] = random;
		double area = rad[i]*2*3.14;
		double round = rad[i]*rad[i]*3.14;
		System.out.print("반지름 : " +rad[i]+", ");
		System.out.print("원의 둘레 : " +area+", ");
		System.out.print("원의 넓이 : " +round+" \n");
		}
	}
}
