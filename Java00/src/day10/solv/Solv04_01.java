package day10.solv;

public class Solv04_01 {
	public static void main(String[] args) {
		String[] name = {"박광호", "박기윤", "안홍주", "김소영", "이진수"	};
		Solv04[] ban = new Solv04[5];
		for(int i = 0; i < ban.length; i++) {
			ban[i] = new Solv04(name[i]);
		}
		
		//출력 역시 반복해서 출력하는 기능의 함수를 호출해주면된다.
		for(int i =0; i<ban.length; i++) {
			ban[i].toPrint();
		}
	
	}
}
