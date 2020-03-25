package day10;

public class Test02 {
	int sum;
	
	public void setSum(int no1, int no2) {
		sum = no1 + no2;
	}
	public static void main(String[] args) {
		Test02 t1 = new Test02(); // 별개의 물건이다
		Test02 t2 = new Test02();// 별개의 물건이다.
			// - > 이름은 같지만, 변수(사용자)가 다르니 따로 작용한다고 생각하면 편하다.
		// 전체 사용가능한 변수를 클래스에 지정해두고, 그 것을 사용할지 말지는 메인안에 클래스변수를 만드는것에 따라 달라진다.
		
		t1.setSum(2, 3);
		
//		 각 레퍼런스 변수에 멤버중 sum에 데이터를 비교
		
		System.out.println("t1.sum : "+ t1.sum);
		System.out.println("t2.sum : "+ t2.sum);
	}

}
