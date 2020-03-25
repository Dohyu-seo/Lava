package day13.home;

public class Nemo extends Figure {
	// 사각형 넓이 구하기~
	int width;
	int height;
	public Nemo() {
		this(10,10);
	}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		toPrint();
	}
	public void setArea() {
		area = width * height;
	}
	public void toPrint() {
		System.out.printf("가로가   %3d이고\n 세로가 %3d인 **사각형**의 \n넓이는 %.2f이다.\n",width,height,area);
	}
}
