package day03;

	/* ���� 6]
	������ �⵵�� �Է¹޾Ƽ�
	�ش� �⵵�� �������� ������� �Ǻ��ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	 ��, ���׿����ڸ� ����ؼ� ó���ϼ���.
	 
	 ������ ����]
	 	4�� ���� �������� 100���� ���� �������� �ʰ� 400���� ���� �������� ��
	 	/������ �⵵ ���� �غ��ϱ�
	 	  
	 	/�⵵ �ޱ�
	 	 
	 	/������� �������� ���ǽ� �����   
	 	  
	
	 
*/

import java.util.*;
public class Hw06 {
	public Hw06() {
		 solv();
	}
	//���� �Ǻ��ϴ� �Լ�
	public void solv() {
		//�Է� ���� �غ�
		Scanner sc = new Scanner(System.in);
		// �޼��� ���
		System.out.print("�⵵�� �Է��ϼ���! : ");
		// �Է��� ���� ������ ���
		int year = sc.nextInt();
		//�������� ������� ���ϰ�
		String result = (year % 4 != 0)? ("���"):
			((year % 100 != 0) ? ("����") : ("���"));
		//5. ����ϰ�
		
			System.out.println(result);
		
	}
	public static void main(String[] args) {
		new Hw06();

	}

}
