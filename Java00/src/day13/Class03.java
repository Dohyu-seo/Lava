package day13;
/*
 	�� Ŭ������ ���� ������ ���ϴ� Ŭ����
 */
public class Class03 extends Test01 {
	private int banjirm;
	@Override
	public double calcArea(int... a) {
		banjirm = a[0];
		return 3.14*banjirm*banjirm;
	}

}
