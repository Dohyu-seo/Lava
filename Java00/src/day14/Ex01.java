package day14;

import javax.swing.JOptionPane;

/*
 	���� 2]
	
	if - else if ������ ����ؼ�
	
	���̸� �Է��ϸ� �ʴ�, �̽ʴ�,... 
	�Ǻ����ִ� ���α׷��� �ۼ��ϼ���.
	
	
 */
public class Ex01 {

	public static void main(String[] args) {
		 loop:

		for (int i = 0;; i++) {

			String jo = JOptionPane.showInputDialog("���̸� �Է��� �ּ���.");
			int age = Integer.parseInt(jo);

			if (age <= 0) {
				JOptionPane.showMessageDialog(null, "0�� ������ �ƴ� ���� �Է� �ϼ���");
				continue loop;
			} else if (age <= 9) {
				System.out.print(age + "�� �Դϴ�.");
			} else if (age >= 10) {
				JOptionPane.showMessageDialog(null, (age / 10) * 10 + "�� �Դϴ�.");
			}
			break;
		}

	}

}
