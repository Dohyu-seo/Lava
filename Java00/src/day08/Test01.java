package day08;

import java.util.Arrays;

/*
 	�迭�� ������� �Ѵ�
 	�迭�� ���´� 2�� �迭�̰�
 	�����ʹ� �Ʒ� ���·� �Է��Ϸ��� �Ѵ�.
 	
 	[[1, 1, 1, 1, 1], [2, 2, 2, 2, 2], [3, 3, 3, 3, 3]]

 */
public class Test01 {

	public static void main(String[] args) {
		//�迭�� �����.
		int[][] num = new int[3][5];
		
		//1�� �迭�� �ʱ�ȭ�Ѵ�.
		//���� 2�� �迭�� ����ִ� �迭�� ���� �������� ������.
		for(int i=0; i<num.length; i++) {
			// 2�� �迭�� �� �濡 ����ִ� �迭�� �ٽ� ������.
			for(int j= 0; j<num[i].length; j++) {
				
				//1�� �迭�� �� ���� �����͸� �ʱ�ȭ �Ѵ�.
				num[i][j] = i+1;
//				System.out.print("["+i+"] ["+j+"] : "+num[i][j]);
			}
//			System.out.println();
			
		}
		System.out.println(Arrays.deepToString(num));
	}

}

