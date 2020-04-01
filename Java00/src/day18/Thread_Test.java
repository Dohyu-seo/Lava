package day18;

public class Thread_Test {

	public Thread_Test() {
		Thread01 t1 = new Thread01();
		Thread01 t2 = new Thread01();
		Thread01 t3 = new Thread01();
		Thread01 t4 = new Thread01();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		// t1이 끝나면 t2를 실행해야 한느게 원칙인데..
		// t1~ t4까지 동시에 실행되는 프로그램을 만든 것 이다
	}
	
	public static void main(String[] args) {
		new Thread_Test();
	}
}
