package day07;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		//배열의 복사 입니다
		int[] num1 = {1, 2, 3, 4, 5};
		
		int[] num2 = num1; // 배열의 복사중, 얕은 복사이다.
		
//		float[] no = num1;// 이 변수는 Heap 에 만들어졌기 때문에 참조형 타입이므로
						// 더 큰 사이즈인 float 타입이라도  대입 할 수 없다.
		// 데이터타입을 바꾸려면 다른 데이터타입의 배열을 만들고, 데이터를 따로 꺼내서 다시 넣어줘야한다.
		
		// 이 복사의 의미는 
		num1[2] = 30;
		System.out.println("num1 : "+ Arrays.toString(num1));
		System.out.println("num2 : "+ Arrays.toString(num2));
		// 출력 하기 
		// num1 : [1, 2, 30, 4, 5]
		// num2 : [1, 2, 30, 4, 5]
		// 이런식으로 주소만 바꾸었기 때문에 원본의 데이터가 바뀌면 복사본도 바뀐다.

	}

}
