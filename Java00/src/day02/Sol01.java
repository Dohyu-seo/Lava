package day02;
/*
 ����]
	1���� 365.2426���̴�.
	�� ��¥�� ���� ��ĥ ��ð�, ���, �������� ����ؼ� ����ϼ���.
*/
public class Sol01 {

	public static void main(String[] args) {
		double data = 365.2426;
		//1. ��¥�� ����Ѵ�
		int day = (int)data; // data -(date % 1);
		// 2. �������� ��¥ �̿��� �����͸� �ʷ� ȯ���Ѵ�.
		int sec = (int)((data % 1 )* 24 * 60 * 60); // (data% 1) *
		// 0.2426�� => 0.2426*24(�ð�)
		// 		   => 0.2426 * 24 * 60 (��)
		//         => 0.2426 * 24 * 60 * 60(��)
		
		int hour = sec / 3600;
		
		sec %= 3600; // sec = sec % 3600;
		
		int min = sec / 60;
		sec = sec % 60;
		
		System.out.print("�ϳ���  " + day + " ��, " + hour + " �ð� ");
		System.out.print(min + " �� "+ sec + "�� �Դϴ�.");
	}

}
