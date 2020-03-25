package day13.home;

public class Semo extends Figure {
	// 삼각형 넓이 구하기~
	int width;
	int height;
	public Semo() {
		this(10,10);
	}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		toPrint();
	}
	public void setArea() {
		area = width * height * 0.5;
	}
	public void toPrint() {
		System.out.printf("밑변이   %3d이고\n 높이가 %3d인 **삼각형**의 \n넓이는 %.2f이다.\n",width,height,area);
	}
}
