package day03;
/*
 	����3]
 		�μ� ��ȣ�� �Է��ϸ�
 		�μ� �̸��� ������ִ� ���α׷��� �ۼ��ϼ���.
 		
 			10 - �ѹ���
 			20 - ȸ���
 			30 - ������
 			40 - �����
 			������ - ������ȸ��...
 */
import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" 10~ 40�� ���� �μ� ��ȣ�� �Է��ϼ��� : ");
		int dno = sc.nextInt();
		String num = "";
		if(dno == 10) {
			num = "�ѹ���";
		}else {
			if (dno == 20) {
				num = "ȸ���";
			}else {
				if(dno == 30) {
					num = "������";
				}else {
					if(dno == 40) {
						num = "�����";
					}else {
						num = "������ȸ��..";
					}
				}
			}
		}
			System.out.println("��ȸ�Ͻ� �μ��� : "+num);
	}

}
