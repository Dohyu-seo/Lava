package day02;

import java.util.*;
public class Test01 {
/*
 	�ڹ� ���α׷��� ��ū ����
 		
 		==> �����Ϸ��� ��ū ������ ������ �õ��Ѵ�.
 			���� �����ڴ� �����Ϸ��� ������ �ϴ� ��ū�� ������ �־�� �Ѵ�.
 			�̶� ����ϴ� ��ȣ�� " ; " ��ȣ�� ����ؼ� �����Ѵ�.
	
 		�츮�� ���������� int a = 20;
 		�� ������ ��ū�� �������ֱ� ���� ��ȣ �̴�.
 		
 			��������� ��ū�̶� �ϳ��� ������ ����Ǿ����� �˷��ִ� ��ȣ�̴�.
 			���� �����ڰ� ��ū ������ ���� ������ ������ �� �� �ִ�.
 			
 			��]
 				int a = 10
 				int b = 10 ;
 					==> �� ������ �����Ϸ��� �ϳ��� �������� �����ؼ� ó���� ���̰�
 						�̷� ������ ������ �ڹٿ��� �������� �����Ƿ� ������ �߻��ϰ� �ȴ�.
 				
 			��]
 				int 1 = 20; int b = 20;
 				 ===> ���ٷ� �Է�������
 				 		�� ���� ������ ��ū���� ��������� ������ ������ �ν��ؼ� ������ �� ���� �ִ�.
 				����]
 				 			; ��� } ��ȣ�� �� ������ ��� �� ���ִ�.
 				 		
 				 		��]
 				 			if(���ǽ�){
 				 			
 				 			}	// �� �κп��� ��ū�� �߻��ϰԵȴ�.
 		-------------------------------------------------------------------------------------
 	Ű����� �����͸� �Է¹޾Ƽ�  ����ϴ� ���
 		1. Ŭ���� ���� ��������
 			import java.util.*;
 			�� java.util ��Ű���� ��� Ŭ������ ����� �غ� �صд�.
 			import java.util.Scanner;
 			==> �� ����� java.util ��Ű�� ���� Scanner Ŭ������ ����� �غ� �ȴ�.
  		2. ���α׷��� ����
  			
  			Scanner sc = new Scanner(System.in); < = ����� System.out
  			
  			�̶�� ������ �̿��ؼ� Ű���带 ���ؼ� �Է� ���� ������ �غ��Ѵ�.
  			
  		3. Ű���带 ���ؼ� �Է¹���  �ʿ䰡 ������ ��
  		
  			���� = sc.nextXXX();
  			������ �̿��ؼ� �����͸� �Է¹����� �ȴ�.  -> ���۸޸𸮿� �����. �� �� �����ߴٰ� �������� ����Ȱ� ������
  			
  			�� ��  XXX�� �Է¹��� �������� ������ ���� �޶�����.
  			
  			���ڿ�	-sc.nextLine();
  			����		-sc.nextInt();
  			�Ǽ�		-sc.nextFloat();
  			
  		â��]
  			���������� ���ڿ��� ������ ��ȯ ��Ű�� ���
  			Integer.parseInt(������ ���ڿ�);
 */
		public static void main(String[] args) {
	//����] ���ڸ� �Է¹޾Ƽ� �Է¹��� ������ 50�� �� ���� �������.
			
			//1. �Է¹��� �غ��Ѵ�. 
			Scanner sc = new Scanner(System.in);
			// 2. �޼����� ����Ѵ�.
			System.out.print("������ �Է��ϼ��� : "); 
			// 3. �Է¹��� �����͸� ���ڿ� ������ ��´�.
			String str = sc.nextLine();
			// �Է¹��� �� �ʿ������ �ݾ��ش�.
			sc.close();
			// 4. ���ڿ� �����͸� ������ ��ȯ�Ѵ�.
			int num =  Integer.parseInt(str);
			// 5. ��ȯ�� ������ ����Ѵ�.
			int result = num - 50;
			// 6. ��� ����� ����Ѵ�.
			System.out.println("�Է��� �� "+ num + "���� 50�� ����" + result + "�Դϴ�.");
			 
			

			
		}//mian
}