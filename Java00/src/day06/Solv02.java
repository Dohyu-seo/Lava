package day06;

public class Solv02 {

	public static void main(String[] args) {
		//문자 배열 
		char ch[] = new char[100];
		// 카운트 수를 지정할 정수 배열
		int[] cnt = new int[10];
		
		for(int i = 0; i<100; i++) { 
		//'A'~'J'까지 문자 100개를 랜덤하게 만들고
			char tmp = (char)(Math.random()*('J'-'A'+1)+'A');
		//ch배열에 데이터 넣고
			ch[i] = tmp; 
		}
		
		//만들어진 문자 배열에서 각 문자가 저장된 카운트를 올려준다.
		for(int i = 0; i < 100; i++) {// 100개의 방을 다 확인한다는 조건식
			int idx = ch[i] - 'A'; // 'A'의 위칫값은 0이고 i에서 A를 뺀 위치값을 카운트해준다.
			
			cnt[idx] += 1;// idx :전체 방이다. cnt는 찾아낸 값에 +1씩 해주며 카운트를 올려준다.
		}
			for(int i = 0; i < 10; i++) {
				System.out.printf("%3s : ", (char)('A'+i));
				for(int j = 0; j < cnt[i]; j++) {
					System.out.print("*");//별찍기
					}
				System.out.println();//띄어쓰기 
			}
	}

}
