package day13.home;

public class Won extends Figure {
	// ���� ���� ���ϱ�~
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
		System.out.printf("��������   %3d��\n**����**�� \n���̴� %.2f�̴�.\n",radius,area);
	}
}
