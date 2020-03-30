package day16;

// ChoiceFormat
import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Test04 {

	public Test04() {
			// ChoiceFormat �� ���鶧 limits, formats�� �ϳ��� ���� ���� �ִ�.
			/*
			  	����� ����
			  		60#D		( <=	�� �ǹ�)
			  		70<C		( < 	�� �ǹ�)
			 		
			 		�̰��� | �� �̿��ؼ� �����ؼ� ����ϸ� �ȴ�.
			 */
		String pattren = "0#F | 60#D | 70#C | 80<B | 90#A";
		// 60#D �� �ǹ̴� 60���� ũ�ų� ���� �� ���� ���ں��ٴ� ���� ���� D�� ó���Ѵ�.
		
		ChoiceFormat form = new ChoiceFormat(pattren);
		 
		while(true) {
			String sno =JOptionPane.showInputDialog("������ �Է��ϼ���. \n����� Q"); 
			
			if(sno.equals("q") || sno.equals("Q")) {
				break;
			}
			
			int score = 0;
			
			try {
				score = Integer.parseInt(sno);
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "�߸� �� �����Դϴ�.");
				continue;
			}
			
			// ���� ��� ���ϰ�
			String grade = form.format(score);
			
			// ���� ��� ����ϰ�
			JOptionPane.showMessageDialog(null, "������ : "+score +"\n���� : "+grade);
		}	
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
