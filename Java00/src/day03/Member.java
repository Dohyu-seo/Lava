package day03;

public class Member {
	int mno; // 0 - ������ �Է� ��
	String mid; // null - ������ �Է� ��
	String mpw; // null - ������ �Է� ��
	String name; // null - ������ �Է� ��
	String tel;
	public Member() {
		
	}
	
	public Member(int mno, String mid, String mpw, String name, String tel) { // �ŰԺ����� �̸� �����ص���.
		this.mno = mno; // this < ���� ����ǰ��ִ� ��ü.
		this.mid = mid;
		this.mpw = mpw;
		this.name = name;
		this.tel = tel;
	}
}
	/*
	public static void abc() {	// �ŰԺ����� �̸� �������� �ʰ� ����.
		Member memb = new Member();
		memb.mno = 7000;
		memb.mid = "KING";
		memb.mpw = "12345";
		memb.name = "KING";
		
		Member m2 = new Member(7001, "sung", "12345", "�輺��"); // �̸� ������ �ŰԺ����� �����͸� �Է�������.
		
		System.out.println("7000�� �̸� : " + memb.name);
		System.out.println("7001�� �̸� : " + m2.name);
	}
	public static void main(String[] args) {
		abc();
		
	}
}
*/
