package day11;

public class Ex01 {
/*
 	���� 3]
 		���� 1, 2������ ���� Ŭ������ ��ü�� ����
 		�� �������Լ��� �ùٸ��� �۵��ϴ��� �����ϼ���.
 		  
 */
	
	// ��ü�� ���� �� �ִ� ����� �����ϴ� �� . �������Լ��̴�.
	
		public Ex01() {
			//2.
			// �� 10���� ���� ��������. �迭.
			Circle[] won = new Circle[10];
			//3.
			//�迭�� ������ �������� �ֱ�
			for(int i = 0 ; i<won.length; i++) {
				if(i < 5 ) {
				won[i] = new Circle((int)(Math.random()*16+5));
				//4
				// ������ ���� 5 ���ϸ� Circle���� �����ص� �������Լ� �⺻�� ȣ���ϴ� ����
				}else {
					// �⺻�� 
					won[i] = new Circle();
				}
			} 
			//5
			// �� ����ϱ�.
			for(int i = 0 ; i < won. length; i ++) {
				won[i].toPrint();
			}
			
			// ���� Ŭ���� �����
			
			Score[] score = new Score[3];
			score[0] = new Score();
			score[1] = new Score("������");
			score[2] = new Score("�ؼ���", 100, 100, 100, 100 , 95 ,40);
			
			//����ϱ� 
			for(int i = 0 ; i<score.length; i ++) {
				score[i].toPrint();
			}
			
		}
		public static void main(String[] args) {
			//�������Լ� �ҷ����� .1.
			new Ex01();
			
		}
}
