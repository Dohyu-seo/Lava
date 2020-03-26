package day14;

public class Samgak {
	// private �����Լ�����
	// �غ�, ����
	// �ѷ� , ����
	private int base, height;
	private double arround, area;

	public Samgak(int base, int height) {
this.base = base;
this.height = height;
setArround();
setArea();
	}

	// �ѷ� �����ִ� �Լ� �����
	public void setArround() {
		arround = base * base * base;
	}

	// ���� �����ִ� �Լ� �����
	public void setArea() {
		area = base * height * 0.5;
	}
	
/*	// ���� ������ִ� �Լ� �����
	public double getArea() {
		return area;
		
	}*/
	//toString �������̵� �ϱ�~
	public String toString() {
		  return "�غ��� "+base+"�̰� ���̰� "+height+"�� �ﰢ�� �� ������ " + area+"�Դϴ�,\n";
	}
	
	
	// �Լ��� ������ ������ ä equals�� �Լ� �������̵� �ϱ�~
	public boolean equals(Object obj) {
		// ��ȯ�� ���� ���� ���� �� �ʱ�ȭ!
		boolean bool = false;
		
		// Object Ÿ�Կ��� Samgak�� Ÿ������ �ٲپ� �ֱ�
		Samgak s1 = (Samgak) obj;
		
		// s1�� �Ű������� ��������� �񱳴���� ��������� 
		bool = (this.base == s1.base) ? (true) : (false);
		
		return bool;
	}

}
