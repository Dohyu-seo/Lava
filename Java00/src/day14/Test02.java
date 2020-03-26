package day14;
import javax.swing.*;
public class Test02 {

	public static void main(String[] args) {
		
		// 숫자 형태의 문자열을 입력받고
		String sno = JOptionPane.showInputDialog("숫자를 입력하세요.");
		// 정수 변수를 만들고 
		int no = 0;
		
		try {
			System.out.println("*** 숫자 변환 전 ***");
			no = Integer.parseInt(sno);
			System.out.println("### 숫자 변환 후 ###");
			
		} catch(Exception e) { // JVM이 예외가 생기면 자동으로 객체를 넣어준다.
			System.out.println(e);
			// e.printStackTrace(); 를 쓰게되면 에러가 생긴 line을 알려준다.
			e.printStackTrace();
		} finally{ // 이 블럭은 예외 발생 여부와 상관없이 반드시 실행되어야 할 명령이 기술되는 부분
			System.out.println("no : " + no);
			
		}
	}

}
