package day07;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		//�迭�� ���� �Դϴ�
		int[] num1 = {1, 2, 3, 4, 5};
		
		int[] num2 = num1; // �迭�� ������, ���� �����̴�.
		
//		float[] no = num1;// �� ������ Heap �� ��������� ������ ������ Ÿ���̹Ƿ�
						// �� ū �������� float Ÿ���̶�  ���� �� �� ����.
		// ������Ÿ���� �ٲٷ��� �ٸ� ������Ÿ���� �迭�� �����, �����͸� ���� ������ �ٽ� �־�����Ѵ�.
		
		// �� ������ �ǹ̴� 
		num1[2] = 30;
		System.out.println("num1 : "+ Arrays.toString(num1));
		System.out.println("num2 : "+ Arrays.toString(num2));
		// ��� �ϱ� 
		// num1 : [1, 2, 30, 4, 5]
		// num2 : [1, 2, 30, 4, 5]
		// �̷������� �ּҸ� �ٲپ��� ������ ������ �����Ͱ� �ٲ�� ���纻�� �ٲ��.

	}

}
