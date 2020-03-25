package day13.home;

public class Won extends Figure {
	// 원의 넓이 구하기~
		int radius;
	public Won() {
		this(10);
	}
	public Won(int radius) {
		this.radius = radius;
		setArea();
		toPrint();
	}
	public void setArea() {
		area = radius * radius * 3.14;
	}
	public void toPrint() {
		System.out.printf("반지름이   %3d인\n**원형**의 \n넓이는 %.2f이다.\n",radius,area);
	}
}
