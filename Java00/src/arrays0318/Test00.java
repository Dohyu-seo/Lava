package arrays0318;

import java.util.Scanner;

public class Test00 {
/*
 	���� �̸��� �Է¹޾� �ش� ���� ������ ������ִ� ���α׷��� �ۼ��غ���,
 	���� �ݺ��ϴٰ� �׸� �̶�� �Է��ϸ� ���α׷��� ����ȴ�.
 */
	public static void main(String[] args) {
		String[] sub = {"java", "python", "android", "jsp", "html"};
		int[] score = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("������� �Է��ϼ���");
			String name = sc.next();
			
			for(int i = 0; i < sub.length; i++){
				if(sub[i].equals(name)) {
					System.out.println(sub[i]+"�� ����"+score[i]);
				}
			}
			if(name.equals("�׸�")) {
				break;
			}
		}
		sc.close();
	}
}
