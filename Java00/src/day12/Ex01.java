package day12;

import java.util.Arrays;

/*
 	�迭����!
 		���� 1]
 			�л��� java, db, html, javascript, spring, sum, avg
 			������ ������ �迭�� �����
 			������ ����� ���ؼ� ����ϼ���.
 			��, ���� ������ ��յ� ���� �迭���� �����ϼ���.(5�������..)
 			
 				java, db, html, javascript, spring, sum, avg
 				--------------------------------------------
 				100	  95   100    100         90     xxxx.xxx.xx
 				....
 		��������	450		480
 		�������	 90.00	 96.00
 		
 			�� ���·� ���� �迭�� �����͸� ä��� ����ϼ���.
 			
 			�迭��
 				double[][] score = new double[7][7];
 */
public class Ex01 {
	//���� �ʱ�ȭ
	double[][] score = new double[7][7];
	
	//������ ���� ����
	
	public Ex01() {
		setRandom();
	
	}
	
	//�迭�� �����ֱ�
	public void setRandom() {
		toPrint();
	
		for(int i=0; i<score.length; i++) {
			double sum = 0;
			for(int j=0; j<score[i].length; j++) {
				//������ ���� ����
			score[i][j] = (int)(Math.random()*61+40);
			sum=sum+score[i][j];
			//���� ����
			 if(j==5) {
				 score[i][j] =sum;
				 //��� ����
			 }else if(j==6){
				 score[i][j] =sum/5;
			 }
		
				System.out.printf("%5.2f",score[i][j]);
				 System.out.println();
			}
			System.out.println("_------------_");

		}

	}
	//����ϱ�
	public void toPrint() {
		System.out.println("java, db, html, javascript, spring, sum, avg");
		System.out.println("---------------------------------------------");
	
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
