package day11;

public class Dongl extends Dohyung {
	/*
	 	 �޶��� �� . 
	 	 1. extends Ŭ���� �̸� ( ��� Ŭ������ ���� ���״ٴ°�.)
	 	 2. ��ӵ� ������ �������� �ʾҴٴ� ��.
	 */
	
	int rad;
	double arround;
	// area�� ��ӵ��ִ� ������ ������ �Ⱦ���~!
	
	public Dongl() {
		this(1);
	}
		//�⺻��. �ƹ��͵� �ԷµȰ� ���� ��.
	
	public Dongl(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	// ���� �ѷ� ������ִ� �Լ�
	public void setArround() {
		arround = 2 * rad * 3.14;
	}
	// ���� ���� ������ִ� �Լ�
	public void setArea() {
		area = rad * rad* 3.14;
	}
	// ����Լ� - Dohyung�� toPrint() Overriding
	public void toPrint() {
		System.out.printf("������ : %3d\n���� �ѷ� : %5.2f\n���� ���� : %5.2f\n",rad, arround, area);
	}
}

