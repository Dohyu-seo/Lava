package day13;
/*
 	이 클래스는 원의 면적을 구하는 클래스
 */
public class Class03 extends Test01 {
	private int banjirm;
	@Override
	public double calcArea(int... a) {
		banjirm = a[0];
		return 3.14*banjirm*banjirm;
	}

}
