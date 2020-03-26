package day14;

import javax.swing.JOptionPane;

public class Test04 extends Test03 {

	// getNum()의 기능을 수정해보자 @Override
	// 입력받은 숫자레 10을 곱한 정수를 반호나해주도록 오버라이드 해보자
	/*
	 * 오버라이드 규칙] 0. 상속 받아야한다.
	 * 1. 함수의 원형은 유지한다. 
	 * 2. 접근지정자는 같거나 넓은방향이어야 한다. 
	 * 3. 예외처리는 같거나 좁은방향으로 한다.
	 */
	public int getNum() throws NumberFormatException {
		// 반환값 담을 변수 선언 및 초기화
		int num = 0;
		// 숫자 입력 받아서 문자열로 담고
		String sno = JOptionPane.showInputDialog("정수 입력");

		// 문자열를 정수로 반환해주기
		num = Integer.parseInt(sno);

		// 음수일경우 강제로 예외를 발생시킨다.
		if (num < 0) {
			throw new NumberFormatException();
//			throw new IllegalThreadStateException();
		}

		return num * 10;
	}

	public Test04() {

	}

	public static void main(String[] args) {
		new Test04();
	}

}
