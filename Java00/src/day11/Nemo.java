package day11;

public class Nemo extends Dohyung {
	// ���� ����!
	int width;
	int height;
	double arround;
	
	public Nemo() {
		this(1,1);
	}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		setArround();
	}
	//�簢���� ���� ���ϱ� ���� x ����
	public void setArea() {
		area = width * height;
	}
	//�簢���� �ѷ� ���ϱ� : (���� + ����) X2
	public void setArround() {
		arround = (width + height)*2;
	}
	
	//����Լ�
	public void toPrint() {
		System.out.printf("�簢�� ���� : %3d\n�簢�� ���� : %3d\n�簢���� �ѷ� : %5.2f\n�簢���� ���� : %5.2f",width, height, arround, area );
	}
	
}
