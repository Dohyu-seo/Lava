package day01;

public class Test02 {
	public static void main(String[] args) {
		/*
		 	���� ����� ����
		 		
		 		1.
		 		[����������] [�Ӽ�] ������Ÿ�� �����̸�; <= ��������
		 		�����̸� = ������; 				    <= �����ʹ���
		 		
		 		2.
		 		[����������] [�Ӽ�] ������Ÿ�� �����̸� = ������; <= �������� & �������ʱ�ȭ (�ʱ�ȭ : �⺻������ �������� ���� ����)
		 */
		
		double no1 = 3.14;
		
		float no2 = (float)3.14; // 1. ��������ȯ doubleŸ���� ������ floatŸ�Կ� ���� ���� ��.
		float no3 = 3.14F; // 2. ���ͷ�����ȯ floatŸ������ ������ �� float�� �ִ� ��.
		
		double no4 = 123.456f; // 3. �ڵ�����ȯ
		 
		 String str1 = "������";
		 String str2 = "������";
		 String str3 = new String("������");
		 
		 System.out.println(str1 == str2);
		 
		 System.out.println(str1 == str3);
		 
		
		 
		 System.out.println(str3.equals(str1));
		 //equals -> ���ڿ����� ��, ���ڿ��� ����񱳸� ���� ���� equals�Լ��� �񱳸��ؾ��Ѵ�.
		 
		 //�⺻������ : ���� 8���� ������Ÿ���� ��� , ���������� : �⺻Ÿ�� �̿��� Ÿ�Ի��
		 
	}
}
