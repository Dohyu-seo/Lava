package day12;

/**
 * 	�� Ŭ������ ����� ������ ������ Ŭ�����̴�.
 * @author ������
 * @since 2020.03.24
 * @version	v.1.0
 *
 */
public class People {
	// �� Ŭ������ �ּҷϿ� ����� ����� ������ ����� �뵵�� Ŭ�����̴�.
	// ���� ����� �������� ����� �������� ��������� �Ѵ�.
	String name, addr, tel, mail, birthday, gen, cop;
	
	// �׷��� �� Ŭ������ ��ü�� �� ����
	// ��� ������ ��� �غ�Ǽ� �ԷµǸ� ���ҳ������� ���� ���̴�.
	// �׷��� ������� �⺻������ ������ �Ǿ�� �� ������ ������ ���̴�.
	
	// ������ �Լ� ����
	
	// �⺻������ �Լ� default
	//1. Ŭ�����̸��� ������ �̸��� ����Ѵ�, 2. ��ȯ���� �Է����� �ʴ´�.(void���� ������� ����)
	public People() {
	}
	
	// �⺻ ������ �Լ��� �����ε� �ϰڴ�.
	// 1. �Լ��� �̸��� �����ϰ� �Ѵ�. 2. �Ű���������Ʈ�� �޶���Ѵ�. 3.��ȯ���ϰ�� ����̾���.
	public People(String name, String tel, String mail, String gen, String birthday, String addr) {
		//���������� �Ű������� ������ �̸��� �� ����ϴ� ���� �������� ��ü �ڱ��ڽ�
//		People("increpas", name, tel, mail, gen, birthday, addr);
		this("increpas", name, tel, mail, gen, birthday, addr);

	}
	public People(String cop, String name, String tel, String mail, String gen, String birthday, String addr) {
		//���������� �Ű������� ������ �̸��� �� ����ϴ� ���� �������� ��ü �ڱ��ڽ�
		this.cop = cop;
		this.name = name;
		this.tel = tel;
		this.mail = mail;
		this.addr = addr;
		this.birthday = birthday;
		this.gen = gen;
	}
}
