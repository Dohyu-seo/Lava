package day14;

public class DonglTest {
	
	public DonglTest() {
//		Dongl ��ü �ΰ��� �����  ���غ���.
		Dongl d1 = new Dongl(5);
		Dongl d2 = new Dongl(5);
		
		//private���� �����Ǿ��ֱ� ������ �� ������ ���� �Լ��� ���ؼ� �����;� �մϴ�.		
		System.out.println("d1.area : "+ d1.getArea());
		System.out.println("d1.area : "+ d2.getArea());

		
		// �� ���� ������ ���غ���.
		System.out.println("d1�� d2�� : "+
							((d1.equals(d2))?("���� �� �Դϴ�"):("�ٸ� �� �Դϴ�.")));
	}
	public static void main(String[] args) {
		new DonglTest();
	}

}