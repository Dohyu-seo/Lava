package day08;

import java.util.Arrays;

public class EchaArray01 {

	public static void main(String[] args) {
		//2�� �迭�� ������  ������ �����ϰ�
		int[][] num;
		
		//������ �迭�� ���� ����Ű��
		num = new int[3][];
		
		num[0] = new int[3];
		num[1] = new int[5];
		num[2] = new int[7];
		
		//����ϱ�
		System.out.println(Arrays.deepToString(num));
		
	}

}