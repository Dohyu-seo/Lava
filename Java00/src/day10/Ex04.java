package day10;

/*
   ���� 4]
	 
	 �л��� ������ �Է��ϸ� ������ ������ִ� ���α׷��� �����ϼ���.
	 
	 ��ȭ]
	 	�����ϰ� �μ��� �����
	 	�� �ο��� ��ŭ ������ �����ϰ� ����
	 	�Լ��� �����ϰ� �ϼ���.
	 
 */
import javax.swing.*;
public class Ex04 {
	int peo;

	//�л��� ������ �Է��ϸ� ������ ���
	public Ex04() {
		peolpe();
		score();
System.out.println(peo);
	}
	// ������ ����ϴ� ���α׷� �����!
	/*	public void getsum() {
			int[] arr;
			int ran = (int)(Math.random()*31 -10)+10;*/
//			for(int i = 1; i<ran; i++) {
//				arr[i] = ran;
//			}
			/*	
		for(int i = 0; i<ran; i++) {
			String inScore =(JOptionPane.showInputDialog("�л��� ������ �Է��ϼ���"));
			arr[i] = inScore;
		}
		*/
	//�����ϰ� �μ��� ������ 
	public int peolpe(int ... num) {
		
		return peo = (int)(Math.random()*(10-1+1)+1);
	}
	//�����ϰ� ������ ����!
	public void score(int...num) {
		peolpe();
		for(int i = 0; i<peo; i++) {
			peo = (int)(Math.random()*100-0+1);
//			score = peo;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new Ex04();
	}

}
