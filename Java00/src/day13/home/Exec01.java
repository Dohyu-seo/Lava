package day13.home;

import java.util.Arrays;

/*
���� 3]
	FigureŬ������ �����ϰ�
	��ӹ޾Ƽ� �ﰢ��, �簢��, ���� Ŭ������ ������ ��
	
	1 ~ 3 ������ ������ �����ϰ� 10�� ����
	1�� ��� �ﰢ��
	2�� ��� �簢��
	3�� ��� ��
	�� �迭�� �ְ�
	����ϼ���.

*/

public class Exec01{

	public Exec01() {
//		int ran = (int)(Math.random()*61+40);
		Figure[] f = new Figure[3];
		



		
		int cnt = 0;
		for(int i = 0; i<10; i++) {
			cnt++;
			int num = (int)(Math.random()*3);
			int no1 = (int)(Math.random()*61+40);
			int no2 = (int)(Math.random()*61+40);
			if(num == 0 ) {
				f[0] = new Nemo(no1, no2);
				System.out.println("-------");
			}else if(num ==1) {
				f[1] = new Semo(no1, no2);
				System.out.println("-------");
			}else {
				f[2] = new Won(no1);
				System.out.println("-------");
			}
			System.out.println(cnt+"��°�Դϴ�.");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Exec01();
	}

}
