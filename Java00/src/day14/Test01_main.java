package day14;

public class Test01_main {
	String name;
	int age;
	Test01_01 t;

//	public Test01_main() {
//		t = new Test01_01();
//		Test01 t1 = t.t1;
//		t1.age = 24;
//		t1.name = "ȫ�浿";
//		System.out.println(t1.toString());
//
//	}
	public Test01_main(int age, String name) {
		this.name = name;
		this.age = age;
		// Test01_01���� �Լ��� �Ű���������Ʈ�� �־��� ������ ���� ����.
		t = new Test01_01(this);  
		//���⼭ �����ڸ� ȣ�� �� �� Test01_01(new Test01_main(24, "ȫ�浿")); �̶�� �ϰԵǸ� �ȵȴ�.
		// this�ϰ� �� �Լ��ϰ�� ���� �ٸ� ��ü�̴�. new ������...������ ������ ���� ������ �Լ�
		
	}
	public static void main(String[] args) {
		// �Էµ� �� ���� ���� ó��������� Test01���� �����Ϸ��� .. Test01_main �� ��ü�� �����ؼ� ����ϵ��� ���� ���̴�.
		Test01_main m1 = new Test01_main(24,"ȫ�浿");
		// ������ ������ ������ �Լ��� ȣ���ؾ� �Ѵ�.
		Test01_main m2 = new Test01_main(18, "��û��");
		// Test01_01�� Test01������� ���ÿ� �Ѱ��� ���̴�
		// �� �ٸ� ȣ���ڸ� ������ t1���� ������ ���̰� �߰��� �ִ� �Լ��鵵 �ǵ帮�� 
		System.out.println(m1.t.t1.toString());
		System.out.println(m2.t.t1.toString());
	}

}
// ����� Test01�� �ִ� �Լ��� ���� ��Ų��. << Evt�� this�� ������ �Ѿ�Դ� �Ѵ�.
