package day15;

public class Test01 {

	public Test01() {
		Member hw = new Member();
		setMembData(hw);
		System.out.println(hw); // toString�� �ּҰ� ������ �ִ� ������ ȣ�����شٴ� �����̴�. hw�� �ڵ����� toString�Լ��� ä������.
	}
	// get�Լ��� ȣ���ϴ� �� ���� toString���� ȣ���ϴ� ���� �� ���ϰ� ���� �� �ֵ�.
	
	
	// Member�� ������ ä���ִ� �Լ�
	public void setMembData(Member m) {
		m.setMno(1242);
		m.setName("������");
		m.setId("whw");
		m.setMail("whw@increpas.com");
		
	}
	public static void main(String[] args) {
		new Test01();
	}

}
