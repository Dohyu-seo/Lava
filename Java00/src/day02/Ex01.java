package day02;

import java.util.*;
public class Ex01 {
	/*			2. �������� 7�� ���� ����, �ѷ��� ����ؼ� ����ϼ���.
	���� �ѷ� :  2*������*3.14
	���� ���� :  ������*������*3.14
	
	��, ������, �ѷ�, ���̴� ������ ���� ó���ϼ���.
	�׸��� �ѷ��� floatŸ���� ������ ���弼��.
-----------------------------------------------------------------------------
3. �ΰ��� ����(����)�� ������ ���
	�μ��� ����, ���η� �ϴ� �簢���� ���̸� ���ϼ���.
-----------------------------------------------------------------------------
4. 3�� ������ �μ��� �غ��� ���̷� ������ �ﰢ���� ���̸� ���ϼ���.*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� ���� ���� �������� �Է��ϼ���.");
		int sum = sc.nextInt();
		float ra = (sum*2*3.14F);
		System.out.print("�ѷ��� ���� ���� �������� �Է��ϼ���.");
		int uum = sc.nextInt();
		float da = (uum*uum*3.14F);
		System.out.println("�������� 7�� ���� ���̴� " + ra + " �Դϴ�.");
		System.out.println("�������� 7�� ���� �ѷ��� " + da + " �Դϴ�.");
		System.out.println(" ");
		System.out.println(" ");
		
		
		System.out.print("�ѷ��� ���� �簢���� ���θ� �Է��ϼ���.");
		int garo = sc.nextInt();
		System.out.print("�ѷ��� ���� �簢���� ���θ� �Է��ϼ���.");
		int sero = sc.nextInt();
		System.out.print("�� �簢���� ���̴� " + (garo*sero) + " �Դϴ�.");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.print("���̸� ���� �ﰢ���� �غ��� �Է��ϼ���.");
		double mit = sc.nextDouble();
		System.out.print("���̸� ���� �ﰢ���� ������ �Է��ϼ���.");
		double hor = sc.nextDouble();
		sc.close();
		System.out.print("�� �ﰢ���� ���̴� " + (mit*hor/2) + " �Դϴ�.");
	}

}
