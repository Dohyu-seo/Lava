package day12;

public class Test05 {
	public Test05() {
		Emp e1= new Emp();
//		e1.sal = 10000; // 변수의 접근 지정자가 pirvate 이기 때문에 바로 접근은 불가능 하다.
		e1.setEmpno(10000);
		int eno = e1.getEmpno();
	}
	public static void main(String[] args) {
		new Test05();

	}

}
