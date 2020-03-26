package day14;

public class Dongl {
	private int rad;
	private double arround, area;

	public Dongl(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}

	// �ѷ� �����ִ� �Լ�
	public void setArround() {
		arround = 2 * 3.14 * rad;
	}

	// ���� �����ִ� �Լ�
	public void setArea() {
		area = 3.14 * rad * rad;
	}

	// area�� ���������ڰ� private �̰� �̰��� Ŭ���� �������� ������ �����ϹǷ� �Լ��� ���� �����͸� ��ȯ���ֵ��� ����.
	public double getArea() {
		return area; // ��ġ�°� ������ this�� �� �ʿ䰡 ����~ JVM�� �ڵ����� ��ȯ���ش� :)
	}
	
	// ���� ������ ������ ���� ������ �Ǵ� �ǵ��� equals�Լ��� Override �غ���
	// ��� �޴´�, 1. �Լ� ������ �����ؾ��Ѵ�. : API���� �����´�
	public boolean equals(Object obj) {
		// ��ȯ�� ���� ���� ���� �� �ʱ�ȭ
		boolean bool = false;
		
		
		// ���� ó���� ������ ���⿡ �ۼ��Ѵ�. ( Object�� �Է��϶�� �ϴ�, �����͸� ��������� Object�� ��ȯ�ȴ�.)
		// �ԷµǴ� Dongl �ν��Ͻ��� ������Ʈ Ÿ������ �ڵ�����ȯ�� �Ǽ� ����� �� ���̹Ƿ�
		// DonglŸ������ ���� ����ȯ�� ���Ѽ� ����� ����ؾ� �ڴ�.
		Dongl d1 = (Dongl) obj;
		
		// Ÿ���� ��ȯ�� �Ǿ��� ���� ������ ������ ���� ����
		// �񱳴� ����� �ΰ��� �ʿ��ϴ�, �ϳ��� �Ű������� �Է��� �޾Ҵ�. �׷� �ٸ� �ϳ���??
		bool = (this.area == d1.area) ? (true) : (false);
		
		//��� ��ȯ���ְ�
		return bool;
	}
}
