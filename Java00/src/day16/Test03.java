package day16;

/*
 	ChoiceFormat
 	
 		
 		�л��� ������ �Է¹޾�
 		������ ����ϴ� ���α׷��� �ۼ�����.
 */
 
import java.text.*;

import javax.swing.JOptionPane;
public class Test03 {

	public Test03() {
			// ���� limits�� ����� �ش�.
		double[] limits = {0, 60, 70, 80, 90};
		// limits�� ���鶧 ���ǻ���
		//			�ݵ�� ������������ ���ĵǾ�� �Ѵ�.
		//			�̰��� �ǹ̴� 60 ~ 69 ���̴� �ϳ��� ���ڷ� �ٲٰ�
		//			70 ~ 79 ���̴� �ٸ� �ϳ��� ���ڷ� �ٲ��. ... �� �ݺ�.
		
		
		// ��ü�� ���ڸ� �����
		String[] formats = {"F", "D", "C", "B", "A"};
		// �̶� �ݵ�� limits�� ������ ��ġ���Ѿ� �մϴ�. �� �� ��~!
		
		ChoiceFormat cForm = new ChoiceFormat(limits, formats);	
		
		//���� ������ �Է¹޾Ƽ� ������ ó���غ���.
		while(true) {
			String str = JOptionPane.showInputDialog("������ �Է��ϼ���\n ����� Q�� �Է��ϼ���.");
			if(str.equals("Q")||str.equals("q")) {
				break;
			}
			
			// ���� �����
		int score = 0;
			
			try {
					score = Integer.parseInt(str);
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "�ٽ� �Է� ���ּ���.");
				continue;
			}
			
			String grade = cForm.format(score);
			JOptionPane.showMessageDialog(null, "���� : " + score + "\n���� : "+ grade
					);
		}
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
