package day06;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		String[] name = {"������", "���ǟ�", "��ޒ�", "�ʹ̴�", "�֚Ú�"};
		String[] tel = {"010-9823-5579", "010-0000-0000", "010-4444-4444", "010-2222-2222","010-9999-9999"};
		String[] email = {"502flclqlf@naver.com", "ing@naver.com", "ming@naver.com","ning@naver.com","sing@naver.com"};
		
		String[][] team = new String[3][5];
		team[0] = name;
		team[1] = tel;
		team[2] = email;
		
		 //�Է� ���� �غ�
		Scanner sc = new Scanner(System.in);
		//�Է� ���� ���� ���
		 System.out.println("�̸��� �Է��ϼ���.");
		 //�Է� ���� �����ʹ��
		 String cha = sc.next();
		 //�������� ũ�⸦ üũ�� ������ ����
		 //�̸�
		/*
		for(int i = 0 ; i < team[0].length ; i++ ) {
			String irum = team[0][i];
			System.out.println("[ " + (i + 1) + " ] : " + irum);
		}
		
		// ��ȭ��ȣ
		System.out.println("### ��ȭ��ȣ");
		for(int i = 0 ; i < team[1].length ; i++ ) {
			String hp = team[1][i];
			System.out.println("[ " + (i + 1) + " ] : " + hp);
		}
		// ����
		System.out.println("### ����");
		for(int i = 0 ; i < team[2].length ; i++ ) {
			String mail = team[2][i];
			System.out.println("[ " + (i + 1) + " ] : " + mail);
		}
		*/
		for(int i = 0 ; i < team[0].length ; i++ ) {
			String irum = team[0][i];
			System.out.println("[ " + (i + 1) + " ] : " + irum);
			
		}
		
		// ��ȭ��ȣ
		System.out.println("### ��ȭ��ȣ");
		for(int i = 0 ; i < team[1].length ; i++ ) {
			String hp = team[1][i];
			System.out.println("[ " + (i + 1) + " ] : " + hp);
		}
		// ����
		System.out.println("### ����");
		for(int i = 0 ; i < team[2].length ; i++ ) {
			String mail = team[2][i];
			System.out.println("[ " + (i + 1) + " ] : " + mail);
		}
		
	}	
}
