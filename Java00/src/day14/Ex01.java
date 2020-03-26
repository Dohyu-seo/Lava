package day14;

import javax.swing.JOptionPane;

/*
 	문제 2]
	
	if - else if 구문을 사용해서
	
	나이를 입력하면 십대, 이십대,... 
	판별해주는 프로그램을 작성하세요.
	
	
 */
public class Ex01 {

	public static void main(String[] args) {
		 loop:

		for (int i = 0;; i++) {

			String jo = JOptionPane.showInputDialog("나이를 입력해 주세요.");
			int age = Integer.parseInt(jo);

			if (age <= 0) {
				JOptionPane.showMessageDialog(null, "0과 음수가 아닌 값을 입력 하세요");
				continue loop;
			} else if (age <= 9) {
				System.out.print(age + "살 입니다.");
			} else if (age >= 10) {
				JOptionPane.showMessageDialog(null, (age / 10) * 10 + "대 입니다.");
			}
			break;
		}

	}

}
