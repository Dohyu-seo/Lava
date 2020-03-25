package day02;

public class Test07 {
/*
   콘솔창에 출력하는 기능을 가진 함수
   	1. println(내용)	- 내용을 출력해준 후 줄바꿈을 해주는 함수
   	2. print(낸용)	- 내용을 출력하고 줄바꿈을 하지 않는 함수
   	3. printf(형식, 내용, 내용, ...)	- 내용을 현식에 맞게 출력해주는 함수
 */
	public Test07() {
		System.out.println("#################");
		System.out.println("#################");
		 
		
		System.out.print("#################");
		System.out.print("#################\n"); // \n : 줄바꿈을 해준다.
		System.out.println("\t****************"); // \t : 탭키의 속성을 가진다
		System.out.println("-----------------------------------------------------------------------------------------------");
		
	System.out.printf("------ %5d------",10); // 10이라는 숫자를 표현하는데 5d > 5칸의 자리를 차지하겠다.
	System.out.printf("*****%7.2f*****", 3.141592); // .은 소숫점 이하 몇자리까지 표현할 것인지 선택한다.
	System.out.printf("%n%5s","홍깅동" );
	}
	public static void main(String[] args) {
		new Test07();

	}

}
