package day04;

/*
 	4�ڸ� ���ڷ� �� �⵵�� �Է¹޾Ƽ�
 	�������� ������� �Ǵ��ؼ� ����ϼ���.
 	��, switch ~ case �������� ó���ϼ���.
 */
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		//��������
		Scanner sc;
		int year;
		
		
		//1. �Է¹��� �غ�
		sc = new Scanner(System.in);
		//�޼������
		for(;;){
		System.out.println("�˻��� 4�ڸ� �⵵�� �������� : ");
		// �⵵������ ����
		year = sc.nextInt(); // �ԷµǴ°� ��ٸ��� �Լ��� ���ŷ�Լ������.
		//����ó�� �Ǵ� switch ~case ( 4�ζ������� ��  -1, 100 -2, 400 -3 )
		if(year == 9) {
			System.out.println("���α׷��� ����˴ϴ�.");	
			return;
		}
		System.out.println("*** �Է��� �⵵�� " +year+"�Դϴ�.");	
		
		int code = 0;
		if(year % 400 == 0) {
			code = 3;
		}else if(year % 100 == 0) {
			code = 2;
		}else if(year % 4 == 0) {
			code = 1;
		}
		
		String hea = "���";
		switch (code) {

		case 3: 
			hea = "����";

			break;
		case 2:

//			hea = "���";
			break;
		case 1:
			hea = "����";

			break;
		}
		
		//������
		System.out.println("�Է��� �� [ "+ year + " ] �� " + hea + "�Դϴ�.");
		}
	}

}
