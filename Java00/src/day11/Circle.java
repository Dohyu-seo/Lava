package day11;
/*
	���� 1]
		�� Ŭ������ ���� ������ ������ Ŭ�����Դϴ�
		�� Ŭ������ ��ü�� �� �� �������� �Է¹޾Ƽ� ���� ���� ������ �Է��� �ǰ�
		Ŭ������ �����ϼ���.
		
		�������� �Է��� �ȵ� ���� 10���� �Էµǰ� �ϼ���. 
 */
public class Circle {
	// �� Ŭ������ ���� ���� ������ ����ϴ� Ŭ�����̹Ƿ�
	// ������, �ѷ�, ���̸� ����ϸ� �� ���̴�.
	int rad;
	double arround, area;
	// Ŭ���� ���� : �� Ŭ���� new �ϸ�  ���ϳ��� ����ڴ�! ��� Ŭ�����̴� .
	
	//�⺻ ������ �Լ�
	public Circle() {
		this(10);
//		this.rad = 10;
//		this.arround = getArround(10);
//		this.area = getArea(10);
	
	}
	
	// �������Լ� �����ε�, int �������� �Է��ϸ� �� ���� ��������� �Լ�.
	public Circle(int rad) {
		this.rad = rad;
		// �ؿ� �Լ��� �����ϴ� ���: ���������� �Լ� �����س���
		// ���⼭ �������ִ°� ������ �Լ��̴� <<<
		this.arround = getArround(rad);
		this.area = getArea(rad);
	}
	
	// ���� �ѷ� �����ִ� �Լ�
	public double getArround(int rad) {
		// ������ �Է����ָ� ��ȯ���ִ� �Լ�!! int rad<
		return 2 * rad * 3.14;		
	}
	
	// ���� ���� �����ִ� �Լ�
	public double getArea(int rad){
		return rad*rad*3.14;
	}
	// ����ϱ�
	public void toPrint() {
		System.out.printf("������ : %5d | ���� �ѷ� : %7.2f | ���� ���� | % 7.2f\n", rad, arround, area);
	}
	
}
