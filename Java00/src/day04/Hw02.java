package day04;

/*
	�� ���� �Է¹��� ��
	�� ���� �ּҰ������ ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	�ּҰ���� : �� ���� ������ �������� ���� ���� ��
		
 */
import java.util.*;
public class Hw02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ���:");
		int no1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���:");
		int no2 = sc.nextInt();
		// no1, no2�� ���� �ڱ��ڽſ��� *�� �� �� �� ���� �°ԵǴ� �� .
		// no1�� 3 �̸� 3 6 9 12 15 ...
		// no2�� 4 �̸� 4 8 12 16 ... �� ������ 12�� �Ǵ� �� 
		// �׷� no1 * no1 % no2 ==0, no2 * no2 %no1 == 0 
		if(no2 > no1) { // �޿� �� no2�� ũ�ٸ� no1���� �ڸ��� �ٲ��ش�
			int tmp = no1;
				no1 = no2;
				no2 = tmp;
		}
		for(int i = 1; i>0; i++) {
			if((no1*i)% no2 == 0 && (no2 *i)% no1 == 0) {
				System.out.println("�����ϱ�"+no1+"��"+no2+" �� �ּ� ������� " + i + "�Դϴ�.");
				break; 
			}
		}
	
	}

}
