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
public class Ex03 {

	public static void main(String[] args) {
		int won = 0;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("1 ~ 4�� ����� �ڵ带 �Է��ϼ��� : ");
		int code = sc.nextInt();
		if(!(code >=1 && code <=4)) {
			String str = "����� �ڵ带 �ٽ� �Է��ϼ���.";
			System.out.println(str) ; 
			 
		}else {
			System.out.println("��뷮�� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			
			
			if(code == 1) {
				//������
					won = num *245+ 3800;
			}else {
				if(code == 2) {
					//�����
					won = num *157+ 2400;
				} else {
					if(code == 3) {
						// ������
						won = num *169+ 2900;
					}else {
						if(code == 4) {
							//�����
							won = num *174+ 3200;
							
						}
						//������if��
					}//else3��
				}//else2 ��
			}//else1��
			
			System.out.println("����� �������� : "+ won+ "�� �Դϴ�.");
		
		}
		
		
		
	}//main

}
