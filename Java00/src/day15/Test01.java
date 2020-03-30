package day15;

public class Test01 {

	public Test01() {
		Member hw = new Member();
		setMembData(hw);
		System.out.println(hw); // toString의 주소가 가지고 있는 내용을 호출해준다는 내용이다. hw의 자동으로 toString함수가 채워진다.
	}
	// get함수를 호출하는 것 보다 toString으로 호출하는 것이 더 편리하게 느낄 수 있따.
	
	
	// Member의 데이터 채워주는 함수
	public void setMembData(Member m) {
		m.setMno(1242);
		m.setName("우현우");
		m.setId("whw");
		m.setMail("whw@increpas.com");
		
	}
	public static void main(String[] args) {
		new Test01();
	}

}
