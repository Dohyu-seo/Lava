package day07;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		//���� 10���� ������ �迭�� �����
		int[] no1 = new int[10];
			//������ �� �߻� ��Ű��
//			int random = (int)(Math.random()*(50-1+1)+1);
			//�迭�� ��� -> �������� ������ for���� �ִ´�
			for(int i=0; i<no1.length; i++) {
				int random = (int)(Math.random()*(50-1+1)+1);
				// �߻��� ������ ���� �迭�� ��´�.
				no1[i] = random;
			}
			//��������� ���� ���� Ÿ���� �迭�� �����.
			int[] no2 = new int[no1.length];
				//���� �����ϱ�
				System.arraycopy(no1,0,no2,0,5);
				System.out.println("----------------------------");
					//����ϱ�
					for(int i=0; i<no1.length; i++) {
					System.out.print(no1[i]+", ");
					}
				System.out.println("���� �迭 ����� �������ϴ�");
				System.out.println("----------------------------");
					for(int i=0; i<no2.length; i++) {
					System.out.print(no2[i]+", ");
					}
				System.out.println("���� ���� ����� �������ϴ�");
				System.out.println("----------------------------");
		}
}
