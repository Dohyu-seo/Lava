package day00;

public class Test00 {

	
	public static void main(String[] args) {
		// �迭 �����
		int[] num = new int[5];
		
		years:
		for(int i = 0; i < 5; i++) {
			int tmp = (int)(Math.random() * 9) +1;
			for(int j = 0; j < i; j++) { // �ݺ����� �迭�� �Բ� ó��.
				if(tmp == num[j]) {
					i--;
					continue years;
				}
			}
			num[i] = tmp;
		}
		for(int no : num) {
			System.out.println(no);
		}
		

	}

}


//
/////* �����ϰ� 4�ڸ� ���ڸ� �߻��ؼ� ������� �������� Ȯ���ϼ���
//// 4�� ������������ 100���� ���� ���������ʰ� 400���� ������������ �� ���ѷ��� ����.
// */
//
//package day05;
//
///*
// 	1 ~ 9���� ���ڸ� �����ϰ� 5���� �߻����Ѽ� �迭�� �־ ����ϼ���.
// */
//public class Test09 {
//	
//	public static void main(String[] args) {
//		// �迭 �����   
//		int[] num = new int[5]; 
//		
//		lotto: // label�� ���� for ��� // continue�� break�� �����ų �ݺ����� ���������� �� �ֽ��ϴ�.
//		for(int i = 0; i < 5; i++) {
//			int tmp = (int)(Math.random() * 9) +1;	
//			for(int j = 0; j < i; j++) { //�ݺ����� �迭�� �Բ� ó���ϴ°� �߿��ϰ� ����� �κ�.
//				if(tmp == num[j]) {
//					i--;
//					continue lotto; // ���� continue�� ���� �ݺ���, �� ��° for �ε� ���� ���̸� �� ���� ���� �ݺ����� continue�� �����ϰԵ�.
//				}
//			}
//			num[i] = tmp; 
//		} 
//		
//		// ���
//		for(int no : num) { // ���� for ��ɾ� //[]�迭�� �������� �����͸� ����ִµ� �̷��� �ϸ� ���������� ������ �����͸� ����.
//	//  �迭�� ���������� no��� ������ �����
//			System.out.println(no);
//		}
//	}
//}
