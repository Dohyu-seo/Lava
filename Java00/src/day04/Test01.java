package day04;

/*
  	4�ڸ� ���ڷ� �� �⵵�� �Է¹޾Ƽ�
  	�� �ذ� �������� �ƴ��� �Ǵ��ϼ���.
 */

// ���̺귯�� ��������
import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		//�۾�����
		//0. �ʿ��� ���� �����ϰ�
		Scanner sc;
		int year;
		String hea = "���";
		
		//1. �Է¹��� �غ��ϰ�
		sc = new Scanner(System.in);
		//2. �޼��� ����ϰ�
		System.out.print("### ��⵵?? : ");
		//3. �⵵ ������ ������ ���
		year = sc.nextInt();
		//4. ����ó���ؼ� �Ǵ��ϰ�
		if(year % 400 == 0) {
			/*
			 	400���� ���� �������� ���� �߻����� ��� ����Ǵ� �κ�
			 	�� ���� �� ���� �����Ű�� ��ü ���ǹ� ��ü�� �����Ѵ�.
			 */
			System.out.println("4�� ���� �������� ��"); 
			hea = "����";
		}else if(year % 100 == 0 ) {
			/*
			 	�� ���� �����ϴ� ���� 400���� ������ �������� �ʴ� �� �߿�
			 	100���� ������ �������� ���� ����Ǵ� �κ��̴�.
			 */
			 
			System.out.println("100���� ���� �������� ��");
			//hea = "���";
		}else if(year % 4 == 0) {
			// year % 400 != 0 && year % 100 != 0
			System.out.println("400���� ���� �������� ��");
			hea = "����";
		}/*else {
			System.out.println("������ �� ");
			hea = "���";
		}*/
		//5. ��� ����ϰ�
		System.out.println("�Է��� �� [ "+ year + " ] �� " + hea + "�Դϴ�.");

	}

}
