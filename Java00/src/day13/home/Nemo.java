package day13.home;

public class Nemo extends Figure {
	// �簢�� ���� ���ϱ�~
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
		System.out.printf("���ΰ�   %3d�̰�\n ���ΰ� %3d�� **�簢��**�� \n���̴� %.2f�̴�.\n",width,height,area);
	}
}
