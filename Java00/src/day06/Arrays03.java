package day06;

import java.util.Arrays;

/*
 	�迭�� �ڵ� �ʱ�ȭ
 */
public class Arrays03 {

	public static void main(String[] args) {
		int[] arr = new int[10]; // Heap�� ���� Heap������ �ڵ� �ʱ�ȭ�� �Ѵ�. �⺻�� ������ Ÿ��
		
		String[] str = new String[10];
		
		boolean[] bool = new boolean[10];
		
		System.out.println(Arrays.toString(arr));//�⺻�� Ÿ���� �ʱ�ȭ�� �Ǿ��ֽ��ϴ�.
		//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0] 
		System.out.println(Arrays.toString(str));//������ Ÿ���� �ʱ�ȭ�� �Ǿ����� �ʽ��ϴ�.
		// [null, null, null, null, null, null, null, null, null, null]
		
		System.out.println(Arrays.toString(bool));//�⺻�� Ÿ���� �ʱ�ȭ�� �˴ϴ�.
		//[false, false, false, false, false, false, false, false, false, false]
	}

}
