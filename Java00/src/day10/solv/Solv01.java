package day10.solv;

/*
  	문제 1]
	
	원의 반지름, 둘레, 넓이를 저장할 클래스를 만들고
	그 클래스 객체 10개를 배열로 관리할 배열로 만들어서
	각 멤버를 초기화하고 출력하세요.
	단, 출력은 함수를 사용해서 출력하세요.
	반지름 29~33까지
	둘레 : 반지름 * 2* 3.14
	넓이 : 반지름 * 반지름 * 3.14
 */
public class Solv01 {
	//전역변수 선언
	 double radi; // 반지름 변수
	 double round; // 넓이 변수
	 double area; // 둘레변수
	 //배열 선언
	 Solv01[] solv;
	 
	public void setVal(double radius) {
		
		
		radi=radius;
		
		
		
		area = radius*radius*3.14;
		round = radius*2*3.14;
		
	}
	public void setPrint() {
		System.out.println();
		System.out.println("-----------------");
		System.out.printf("원의 반지름 = %10f,\n원의 넓이 = %10f,\n원의 둘레 = %10f",radi,area,round);
		System.out.println();
		System.out.println("-----------------");
	}
	public void setSolv01() {
		//배열을 초기화 시키자.
		solv = new Solv01[10];
		// 각 방에 방문할 때 마다 랜덤한 반지름 입력해주자
		for(int i =0; i<solv.length; i++) {
			solv[i] = new Solv01();
			
			//랜덤한 숫자 하나 만들기
			int radius = (int)(Math.random()*(100-(-100)+1)-100);
			//이 랜덤값을 변수에 담기
			solv[i].setVal(radius);
		}
		
	}
	public static void main(String[] args) {
	// 함수준비
	 
	Solv01 rou = new Solv01();
	// 함수 호출
	rou.setSolv01();
	//출력해보자
	//round 둘레
	for(int i = 0; i<rou.solv.length;i++) {
			rou.solv[i].setPrint();
		}
	}
}
