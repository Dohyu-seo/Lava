package day08;

import java.util.Arrays;

/*
	����, ����, ����, ����, ���� ������ �����Ϸ��� �մϴ� (������ �����ϰ� �����ϼ���.)
	�л��� �ټ����̰� 2���� �迭�� ���� 5���� ������ ������ �迭�� ���弼��!
	
 */
public class Ex02 {

	public static void main(String[] args) {
		//���� 5�� ���� �迭 �����
		String[] gwamok = new String[5];
		String[] stu = new String[5]; 
		
		

		for(int i =0; i<gwamok.length; i++) {
			
			gwamok[i] +=i;
			for(int j = 0; j<stu.length; j++) {
				int random = (int)(Math.random()*(100 - 0 +1));
				String jeomsu = random+"";
				
				stu[j] = jeomsu;
//				System.out.println(Arrays.deepToString(stu));
			}
			System.out.println("--------"+(i+1)+"�� �л� ����");
			System.out.println(Arrays.deepToString(stu));
		}
	}

}
