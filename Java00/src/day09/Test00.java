package day09;

import java.util.Arrays;

public class Test00 {

	public static void main(String[] args) {
		char[][] ch = new char[3][10];//����,�빮��,�ѱ�
		
/*		
		char[][] ch1 = new char[2][10];// ����,�빮��
		char[][] ch2 = new char[2][10];//�����ѱ�
		char[][] ch3 = new char[10][3];// ���� �빮�� �ѱ� ( ����) 
		char[][] ch4 = new char[10][2];//���ڴ빮��
		char[][] ch5 = new char[10][2];//���� �ѱ�
	*/	
		
		// �迭�� �����
		// 0�� �濡 ���ڳֱ�, 1�ǹ濡 ���� �빮�� �ֱ�~
		// ���ڴ� i , �빮�ڴ� i+'A', ����ȯ! char<
			for(int i=0; i<10; i++) {
				ch[0][i] += '0'+i;
//				System.out.println(ch[0][i]+"");
				ch[1][i] += (char)i+'A';
		}
			ch[2][0] = '��';
			ch[2][1] = '��';
			ch[2][2] = '��';
			ch[2][3] = '��';
			ch[2][4] = '��';
			ch[2][5] = '��';
			ch[2][6] = '��';
			ch[2][7] = '��';
			ch[2][8] = '��';
			ch[2][9] = '��';
			
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
