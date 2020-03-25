package day13.sub;

// �ﰢ�� Ŭ����, ���߿� �簢��, ������ ���弼��
public class Samgak implements Moyang {
	private int width;
	private int height;
	private double area;
	
	public Samgak() {
		
	}
	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		toPrint();
	}
	@Override // �����Ϸ����� �� �Լ��� � �Լ����� �˷��ִ� ��, ������̼�(Annotation)
	public void setArea() {
		area = width*height * 0.5;
	}

	@Override
	public void toPrint() {
		
		System.out.printf("�ﰢ�� �Դϴ� \n���� : %3d\n���� : %3d\n���� : %.2f\n",width, height, area);
		System.out.println("---------------------");
	}

}
