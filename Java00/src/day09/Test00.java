package day09;

import java.util.Arrays;

public class Test00 {

	public static void main(String[] args) {
		char[][] ch = new char[3][10];//숫자,대문자,한글
		
/*		
		char[][] ch1 = new char[2][10];// 숫자,대문자
		char[][] ch2 = new char[2][10];//숫자한글
		char[][] ch3 = new char[10][3];// 숫자 대문자 한글 ( 세로) 
		char[][] ch4 = new char[10][2];//숫자대문자
		char[][] ch5 = new char[10][2];//숫자 한글
	*/	
		
		// 배열을 만들고
		// 0의 방에 숫자넣기, 1의방에 여어 대문자 넣기~
		// 숫자는 i , 대문자는 i+'A', 형변환! char<
			for(int i=0; i<10; i++) {
				ch[0][i] += '0'+i;
//				System.out.println(ch[0][i]+"");
				ch[1][i] += (char)i+'A';
		}
			ch[2][0] = '가';
			ch[2][1] = '나';
			ch[2][2] = '다';
			ch[2][3] = '라';
			ch[2][4] = '마';
			ch[2][5] = '바';
			ch[2][6] = '사';
			ch[2][7] = '아';
			ch[2][8] = '자';
			ch[2][9] = '차';
			
//			System.out.println(Arrays.toString(ch[2]));
//			System.out.println(Arrays.toString(ch[1]));
//			System.out.println(Arrays.toString(ch[0]));
			for(int i = 0; i<1; i++) {
				System.out.println("------------");
				for(int j = 0; j<10;j++) {
				System.out.print(ch[0][j])	;
				System.out.print(ch[1][j])	;
				System.out.print(ch[2][j])	;
				System.out.println();
				
				}
				
			}
	}
}
