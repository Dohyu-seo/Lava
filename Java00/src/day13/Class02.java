package day13;

/*
 	이 클래스는 삼각형을 구하는 클래스
 */
public class Class02 extends Test01 {
	private int mitbyun;
	private int nopee;
	@Override
	public double calcArea(int... a) {
		mitbyun = a[0];
		nopee = a[1];
		return mitbyun * nopee * 0.5;
	}

}
