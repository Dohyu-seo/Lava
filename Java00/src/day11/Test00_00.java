package day11;

public class Test00_00 {

	public static void main(String[] args) {
		Test00 t0 = new Test00();
		Test00 t1 = new Test00();
		Test00 t2 = new Test00();
		// new �� ���� ���� �ٸ� �ּ������� �������� ������� �ʴ� �ּҶ�� �Ѵٸ� ����0�̶�� �ʱⰪ�� �����ִ�.
		
		t0.num = 10;
		System.out.println(t0.num);
		// �㳪 static�̶�� �Ӽ��� �ο��� num�� - �ٸ� ������ new�� �ν��Ͻ��� ���� ���� �����Ͱ��� ���´�
		System.out.println(t1.num);
		
		System.out.println(t2.num);
		
		System.out.println(Test00.num);
		// <== �̹� �޸𸮿� �ö��ֱ� ������ ��ü�� ��������� �ʾƵ� ����� �����ϴ�.
	}

}
