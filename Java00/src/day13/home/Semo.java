package day13.home;

public class Semo extends Figure {
	// �ﰢ�� ���� ���ϱ�~
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
		System.out.printf("�غ���   %3d�̰�\n ���̰� %3d�� **�ﰢ��**�� \n���̴� %.2f�̴�.\n",width,height,area);
	}
}
