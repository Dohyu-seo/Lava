package day03;

/*	����4]
	�Ǽ��� �Է��� �� 
	�Ҽ��� ���� ��° �ڸ����� �ݿø� �� ����� ����ϼ���.
	
	����]
		+ 0.005<�ڵ� �ݿø� 
		���⿡ x 100 ���ָ� ��° �ڸ� ���� �����ο� �� ���̰�
		������ ��ȯ �ϰ�  ��°�ڸ��� ������ �ٽ� /100���� �Ҽ��� ���·� 	  */	

// ���̺귯�� ��������
import java.util.*;
public class Hw04 { 
	
	public Hw04() { // �޸� �ø� �� ������ �־�� �ϴ� �Լ�
		// �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// �޼���  ����ϰ�
		System.out.print("�Ǽ��� �Է��ϼ���! : ");
		// �Ǽ� �Է¹޾� ������ ���
		double num = sc.nextDouble();
		// �Լ� ���������� �Ѱ��ָ鼭 �����ϰ� ������ �ް� (��ȯ���� �ֱ� ������ ������ ����)
		double result = banolim(num);
		// ������ ����ϰ�
		System.out.println("�Է¹��� �Ǽ� : "+ num + "\n �ݿø��� �Ǽ� : "+ result);
		
	}
	// �Ǽ��� �Ҽ� ��°�ڸ����� �ݿø� ���ִ� �Լ� // �������·� ��ȯ int , �Ǽ� double, float
	public double banolim(double no) { 		//  TO_CHAR ó�� ���ڿ��� �����µ� �����ϴ� ���� ��ȯ���ִ� ���̸�, String ��ȯ��.
		 // ��ȯ���� ���� ������ �����
			double result = 0.;
			
			
			//�Է¹��� ������ �ݿø��ϰ�(�Ҽ� ��°�ٸ�����...)
			/*
			 	double no = 123.4567
			 	int no1 = (int)(no * 1000); ==> 123456
			 	no1 = no1 + 5;(���� ����)
			 	no1 = (no1 /10) /100.; 
			 */
			int no1 = (int)(no * 1000);
			no1 += 5;
			
			result = (no1 / 10) / 100.;
			
			// ������ ��ȯ�ϰ� 
			return result;
	}
 
	public static void main(String[] args) {
		new Hw04();

	}

} 
