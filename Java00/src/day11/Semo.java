package day11;

public class Semo extends Dohyung {
	int width;
	int height;


	public Semo() {
		this(1,1);
	}
	public Semo(int width, int heigth) {
		this.width = width;
		this.height = heigth;
		setArea();
	}
	public void setArea() {
		area = width*height*0.5;
	}
	public void toPrint() {
		System.out.printf("�ﰢ���� ���� : %3d\n���� : %3d\n�ﰢ���� ���� : %5.2f\n",width, height, area );
	}
}
