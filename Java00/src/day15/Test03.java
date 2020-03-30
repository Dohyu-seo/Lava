package day15;

 import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		Random rand1 = new Random();
		
		for(int i = 0 ; i <10; i++) {
			int rnd = rand1.nextInt(100); // 0 부터 100사이의 난수를 발생해라.. => ()안에 숫자까지
			boolean bRnd = rand1.nextBoolean(); // true, false 랜덤하게 출력
			System.out.println("rnd : "+rnd + " , bRnd : "+bRnd); 
		}
		System.out.println();
		Random r1 = new Random(10);// 난수테이블 , 10번테이블
		for(int i = 0 ; i <3; i++) {
			int rnd = r1.nextInt(100); // 0 부터 100사이의 난수를 발생해라.. => ()안에 숫자까지
			boolean bRnd = r1.nextBoolean(); // true, false 랜덤하게 출력
			System.out.println("rnd : "+rnd + " , bRnd : "+bRnd); 
		}
		// seed 테이블의 번호를 랜덤하게 접근해서 뽑아오니 바뀌는 거고. 
		// 아래 랜덤객채를 만들 때 long타입 seed값을 < 선택,
		// 안넣으면 랜덤하게 접근해서 가져옴 
		// --> 랜덤객체의 매개변수에 난수테이블에 데이터를 넣으면 고정, 안넣으면 랜덤하게 접근해서 데이터를 가져옴.
		// ==> 자바는 랜덤한 수를 가져오진 못하더라. 선택되어있는 수를 무작위로 가져오는 것 이다.
	}

}
