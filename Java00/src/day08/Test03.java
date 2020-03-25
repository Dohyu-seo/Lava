package day08;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		// 2차원 배열을 만든다. 배열을 관리할 갯수는 3개로 하고, 배열에 담길 숫자의 갯수는 7개로 한다.
		int[][] num;
		
		num = new int[3][7];
		
		for (int[] no1 : num) { // <<= **데이터가 있는 것 만큼 접근해서 순차적으로 꺼내오는 반복문 입니다.**
			// num에 담긴 데이터를 정수배열일 것이고 하나를 꺼내게되면 정수배열일 것이다.
			for(int val : no1) {
				System.out.print(val + ", ");
			}
			System.out.println( );
		}
		  for(int i = 0; i<num.length; i++) {
			  for(int j = 0; j<num[i].length; j++) {
				  num[i][j] = i+3;
		  		}
			  
		  }
		  System.out.print(Arrays.deepToString(num));
		  //데이터를 3, 6, 9로 채워주자
		  // 1차원배열의 각 방에 하나씩 차례로 접근해야 된다.
		  for(int i = 0; i<num.length; i++) {
			  for(int j = 0; j < num[i].length; j++) {
				  num[i][j] = 3+3*i;
			  }
		  }
		  //하나씩 꺼내서 출력하기~
		  System.out.println();
		  for (int[] no1 : num) { // <<= **데이터가 있는 것 만큼 접근해서 순차적으로 꺼내오는 반복문 입니다.**
			  // num에 담긴 데이터를 정수배열일 것이고 하나를 꺼내게되면 정수배열일 것이다.
			  for(int val : no1) {
				  System.out.print(val + ", ");
			  }
			  System.out.println( );
		  }
		  /*
			  3, 4, 5, 6, 7, 8, 9, 
			  6, 7, 8, 9, 10, 11, 12, 
			  9, 10, 11, 12, 13, 14, 15,
			  로 변경하자
		  */
		  //이미 배열에 3, 6, 9로 채워져 있으므로 이 상태에서 더해준다.
		  for(int i= 0; i<num.length; i++) {
			  for(int j=0; j<num[i].length; j++) {
				  // num의 i번째 인덱스의 데이터를 꺼내면 배열일 것이기 때문에...
				  
				  // 각방에 들어가서 각 데이터를 꺼내고 데이터를 인덱스 만큼 더해준다.
				  num[i][j] += j; // <== num[i][j] = num[i][j] +j;
				  
			  }
		  }
		 /*
		  System.out.println();
		  for(int[] no1 : num) {
			  for(int val : no1) {
				  System.out.print(val + ", ");
			  }
		  }
		  */
		  for(int i = 0; i<num.length; i++) {
			  for(int j = 0; j<num[i].length; j ++) {
				  System.out.printf("%-2d, ", num[i][j]);
				  
			  }
			  System.out.println();
		  }
	}
}
