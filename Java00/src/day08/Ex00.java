package day08;

import java.util.Arrays;

/*
 * ���� 0]
	
	�������� ����ϴµ�
	�ܰ� ���� �迭�� ���� ó���ϰ� ����ϼ���.
	----------------------------------
	|��				|				��| �迭
	----------------------------------
	int[] dan = {2, 3, ...9};
	int[] gop = {1, 2, ...9};
	-- �ʱ�ȭ�� �ݺ�������
	
	int[][] gugudan = {dan,gop};
	
	������´�
		2 x 1 = 2
		...
		2 x 9 = 18
		-----------
		3 x 1 = 3
		....
 */
public class Ex00 {

	public static void main(String[] args) {
		int[] dan = new int[10];
		int[] gop = new int[10];
		
		int[][] gugudan = {dan,gop};
		
		for(int i = 2; i<=9; i++) {
			dan[i] = i;
			for(int j = 1; j<=9; j++) {
				gop[j]= i*j;
//				System.out.println("["+dan[i]+"x"+gop[i]+"] = "+gugudan[i][j]);
//				System.out.println(Arrays.toString(gop));
				System.out.println("\t\t"+dan[i]+" x "+j+" = "+gop[j]);
			}
			System.out.println();
			System.out.println("---------------------");
		}
	}

}
