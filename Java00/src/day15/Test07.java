package day15;

import java.util.*;
import java.io.*;

public class Test07 {

	public Test07() {
		File f = new File("D:\\class\\Java\\git\\Lava\\Java00\\src\\doc\\day15_src.txt");

		Scanner sc = null;
		String str = "";
		try { 
			sc = new Scanner(f);
			str = sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		StringTokenizer token = new StringTokenizer(str);

		int count = token.countTokens(); // �ڸ� ���ڿ��� ������ ��ȯ���ִ� �Լ�
		System.out.println("�ڸ� ���� : " +count);
		/*
		// ������ �ȴ�.
		for(int i = 0 ; i < count; i ++) {
			String tmp = token.nextToken();
			System.out.println("�и��� ���ڿ� : " + tmp);
		}
		// �ٽ� ������
		for(int i = 0 ; i < count; i ++) {
			String tmp = token.nextToken();
			System.out.println("�ٽ� ���� ���ڿ� : " + tmp);
		}
		// ��ĳ������ Ư¡ : ���ۿ� �ø�, ���� ���ڴ� �ٽ� ���� �� ����.
		*/
		
		
		// ���� StringTokenizer�� ����ϴ� ��� ****
		while(token.hasMoreTokens()) { //���� ��ū�� �ִ�? ��� ���ǽ�
			String tmp = token.nextToken(); // �ӽù��ۿ��� ������ ������ �Լ�.
			System.out.println("�ٽ� ���� ���ڿ� : " + tmp);
		} // �� �̻� ������ ���� �� ���� �ݺ��Ѵ�.
	}

	public static void main(String[] args) {
		new Test07();
	}

}
