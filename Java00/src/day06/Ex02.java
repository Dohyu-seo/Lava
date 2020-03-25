package day06;
/*
문제 2]
		'A' ~ 'J' 문자를 랜덤하게 100개 발생시킨 후 각 문자의 카운트를 구해서(숫자) 출력하세요.
		각 문자가 나온 갯수 카운트
		
		추가로 숫자만큼 별표를* 찍어서 출력하세요.
		카운트 수 만큼 *을 찍는다.
*/
public class Ex02 {

	public static void main(String[] args) {
		 
		char cha[] = new char[100];
		
		int[] cnt = new int[10];
		
		for(int i = 0; i < 100; i ++) {
		char random = (char)(Math.random()*('J'-'A'+1)+'A');
		cha[i] = random;
		}
		
		for(int i = 0; i < 100; i++) {// 100개의 방을 다 확인한다는 조건식
			int idx = cha[i]-'A';
			cnt[idx] += 1;
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

