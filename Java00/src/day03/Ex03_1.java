package day03;

/*
 ���� 2]
 	���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
 	
 			�ڵ�		�⺻���		�����
 	������	(1)		3,800		245
 	�����	(2)		2,400		157
 	������	(3)		2,900		169
 	�����	(4)		3,200		174
 	
 	������ = �⺻��� + ��뷮*�����
 	���û�����  a + �ΰ���ġ��(a �� 10%) + ���»����ݱ��(a �� 3.7%)
 	����� �ڵ�� ��뷮�� �Է¹޾Ƽ�
 	�������� ������ִ� ���α׷��� �ۼ��ϼ���.
*/
import java.util.*;
public class Ex03_1 {

	public static void main(String[] args) {
		//1. �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// 2. �޼��� ����ϰ� �Է°� ������ ���..(�ڵ�, ��뷮)
		
		// 2-1. �ڵ� �Է¹ް�
		System.out.print("1�� ~ 4���� �����ڵ带 �Է��ϼ���! : ");
		int code = sc.nextInt();
		
		if(!(code >= 1 && code <=4)) {
			System.out.println("�ڵ尡 �߸��Ǿ����ϴ�. ��� �����մϴ�.");
			return;
		}
		
		// 2-2. ��뷮 �Է¹ް�
		System.out.print("��뷮�� �Է��ϼ���! : ");
		int used = sc.nextInt();
		
		// 3. �ڵ忡 ���� �뵵 �����ؼ� ������ ����ϰ�
		int calc = 0; // ������ ����
		String yongdo = "������"; 
		
		int gibon = 3800; //�⺻��� - ������ �⺻������� �ʱ�ȭ
		int yogm = 245; // ����� - ������ ��������� �ʱ�ȭ
		
		
		
		/*if(code == 1) {
			// ����� ������ ==> �뵵�� �⺻���� ���������� �ʱ�ȭ �Ǿ������Ƿ� ������ �ʿ䰡 ����.
			calc = 3800 + used*245;
		}else  */
		if(code == 2) { //�뵵�� �����
			
			// �뵵 ����
			yongdo = "�����";
			gibon = 2400;
			yogm = 157;
			// ������ ���
			//calc = 2400 + used*157;
		}else if(code == 3) { //�뵵�� ������
			yongdo = "������";
			gibon = 2500;
			yogm = 169;
			//calc = 2500 +used*169;
		}else if(code == 4){ //�뵵��  �����
			yongdo = "�����";
			gibon = 3200;
			yogm = 174;
			//calc = 3200 + used*174;
		}
		//if ~ else ��
		
		calc = gibon + used*yogm;
		// 4. ��� ����ϰ�
		System.out.println("****************");
		System.out.println("����� �ڵ� : "+code+
							"\n�뵵 : " + yongdo+
							"\n��뷮 : " + used+
							"\n������ : "+ calc);
		System.out.println("****************");
	}

}
