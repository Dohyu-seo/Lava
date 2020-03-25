package day03;

public class Member {
	int mno; // 0 - 데이터 입력 전
	String mid; // null - 데이터 입력 전
	String mpw; // null - 데이터 입력 전
	String name; // null - 데이터 입력 전
	String tel;
	public Member() {
		
	}
	
	public Member(int mno, String mid, String mpw, String name, String tel) { // 매게변수를 미리 지정해두자.
		this.mno = mno; // this < 현재 실행되고있는 객체.
		this.mid = mid;
		this.mpw = mpw;
		this.name = name;
		this.tel = tel;
	}
}
	/*
	public static void abc() {	// 매게변수를 미리 지정하지 않고 하자.
		Member memb = new Member();
		memb.mno = 7000;
		memb.mid = "KING";
		memb.mpw = "12345";
		memb.name = "KING";
		
		Member m2 = new Member(7001, "sung", "12345", "김성현"); // 미리 지정한 매게변수에 데이터를 입력해주자.
		
		System.out.println("7000번 이름 : " + memb.name);
		System.out.println("7001번 이름 : " + m2.name);
	}
	public static void main(String[] args) {
		abc();
		
	}
}
*/
