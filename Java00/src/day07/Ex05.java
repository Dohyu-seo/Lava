package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	extra]
	영문 문자열을 입력받아서
	해당 알파벳이 출현하는 빈도를 저장하고
	빈도를 *로 표현하세요.	
 */
public class Ex05 {
	public static void main(String[] args) {
		//입력받기
		String input = JOptionPane.showInputDialog("문자열을 입력해 주세요");
		//문자열 변수에 입력받은 문자 담기
		char[] str = input.toCharArray();
		//받은 문자열만큼의 열려있는 배열
		char[] no = new char[str.length];
		System.out.println(str.length);
		int[] cnt = new int[27];
//		for(int i=0; i<no.length; i++) {
//			no[i] = toCharArray(str);
//		}
//										System.out.println(Arrays.toString(no));
//		char a = input.charAt(2);//위치 반환값 인덱스값으로 반환함.
//		System.out.println(a);
//		char[] rpa = new char[10];//배열정의
//		input.getChars(0, 7, rpa, 0);
//		System.out.println(rpa);
		// 입력받은 수 체크하기
		for(int i=0;i<no.length; i++) {
			int idx = str[i]-'A';
			cnt[idx] +=1;
		}
		for(int i = 0; i < str.length; i++) {
//								System.out.printf("%3s : ", (char)('A'+i));
			System.out.printf(Arrays.toString(no));
			for(int j = 0; j < cnt[i]; j++) {
				System.out.print("*");//별찍기 
				}
	}

//	private static char toCharArray(char[] str) {
//		return 0;
//	}
	}
}
