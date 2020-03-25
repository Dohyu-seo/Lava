package day06;


/*
	문제 6]
		팩토리얼 10개를 저장할 배열을 만들고
		1부터 순차적으로 10까지 팩토리얼을 만들어서 배열에 담고
		꺼내어 출력하세요.
 */
public class Ex06 {

	public static void main(String[] args) {
		 // 팩토리얼 배열만들기
		int factorial[] = new int[10];
		// 순차적으로 증가할 수를 담을 변수 만들기
		int no = 1;
		// 배열에 팩토리얼 계산할 반복문 만들기
		for(int i = 1; i < 10; i++) {
			// 반복해서 변수 증가시키기
			no *= i;
			//반복해서 증가시킨 변수 배열에 담기
			factorial[i] = no;
			//출력하기
			System.out.print(factorial[i]);
			// 마지막 수에 , 없애서 출력하는 조건문
			if(i!=9) {
			System.out.print(",");	
			}
		}
		
	}

}
