package day14;

import javax.swing.*;

public class Test03 {

	public Test03() {
//		getNum(); 
//		getNum() 는 예외를 전이하는 함수이므로
		// 이런 예외전이함순느 반드시 예외처리를 해줘야 한다

		int num = 0;
		try {
			num = getNum();
		} catch (NumberFormatException e) {
			// 예외클래스의 기술은 최하위 부터 기술하는게 원칙이다.
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 숫자를 입력받아서 정수로 반환해주는 getNum() 함수
	public int getNum() throws NumberFormatException{
		// 반환값 담을 변수 선언 및 초기화
		int num = 0;
		// 숫자 입력 받아서 문자열로 담고
		String sno = JOptionPane.showInputDialog("정수 입력");

		// 문자열를 정수로 반환해주기
		num = Integer.parseInt(sno);

		if (num < 0) {
			// 강제 예외 발생시키기 ...
			//	 형식]
			//		 throw new 예외클래스생성자();
			throw new NumberFormatException();
			
			//예외를 전이한 함수를 호출할 때는 예외를 호출한 함수에서 예외처리를 꼭 해줘야 한다.
		}
		/*
		 * 원칙적으로는 num변수에 데이터를 담을 경우 예외가 발생할 수 있다. 따라서 원칙은 윗 부분을 예외처리를 해야하지만 이번엔 이 함수를
		 * 호출한 곳으로 예외처리를 떠넘긴다.
		 */

		// 데이터 넘겨주고
		return num;
	}

	public static void main(String[] args) {
		new Test03();
	}
}
