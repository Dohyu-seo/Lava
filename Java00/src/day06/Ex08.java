package day06;

import java.util.Arrays;
import java.util.Scanner;

/*
���� 8]
	
	ȸ���� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� ����� -- ���ڿ� �迭 3�� [5]
	�����͸� �Է��ؼ�
	
	ȸ���� �̸��� �Է��ϸ�
	ȸ���� �̸��� ��ȭ��ȣ, �̸����� ������ִ� ���α׷��� �ۼ��ϼ���.		
 */
public class Ex08 {

	private static String eno;

	public static void main(String[] args) {
		//ȸ���� �̸�, ��ȭ��ȣ, �̸��� �迭 �����
		String[] name;
		String tel[];
		String email[];
		// �迭�� ������ �ֱ�
		name = new String[] {"������", "���ǟ�", "��ޒ�", "�ʹ̴�", "�֚Ú�"};
		tel = new String[] {"010-9823-5579", "010-0000-0000", "010-4444-4444", "010-2222-2222","010-9999-9999"};
		email = new String[] {"502flclqlf@naver.com", "ing@naver.com", "ming@naver.com","ning@naver.com","sing@naver.com"};
		// �Է¹��� �غ��ϱ�
		Scanner sc = new Scanner(System.in);
		//���� ����ϱ�
		System.out.println("�̸��� �Է��ϼ���.");
		String eno = sc.nextLine();
		
//	//	�Է¹��� �̸��� ���� ��ȭ��ȣ�� �̸��� ����ϱ�
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(tel));
		System.out.println(Arrays.toString(email));
//  //	������ ã���ִ� for�� �����
		for(int i = 0; i<5; i++) {
			//������ ���ϱ� 5����
				if(name.equals(eno));{
					System.out.println("Ȯ�� �Ǿ����ϴ�.");
					System.out.println("��ȭ��ȣ :"+ tel[i]+"�̸��� : "+email[i]);
				}
				 
				//�Է¹��� ������ ���� �� ����
			
				//�̸��� �Է����� �� �������ִ� �� ã��
//				eno = name[i];
//				System.out.println(tel[i]+email[i]);
//			}
		}
	}
}
