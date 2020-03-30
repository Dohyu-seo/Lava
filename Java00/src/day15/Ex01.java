package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/*
 	���� 1]
 		�̸����� �Է¹޾Ƽ�
 		�Է¹��� ���ڿ��� �̸������Ŀ� �´��� �ƴ��� �˻��ϼ���.
 		
 		�̸��� ������
 		 	���ĺ��� ���ڷ� 8�����̻����� �ϰ� @ �������ּ� (co.kr���̴°� ��)
 		�� ó���ϼ���.
 		���� ]
 			�ѱ� ó�� : [��-�R] - �ѱ��� ���̵� ����������.
 			
 */
public class Ex01 {
	
	public Ex01() {
		// �̸��� �Է¹��� ���� �����~
		String val = JOptionPane.showInputDialog("�̸����� �Է��ϼ���. ex)8���� �̻�@������ �ּ�");
		
		// �̸��� ���Ŀ� �°� ������ �˻��ϱ�~
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,}+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]{2,3}\\.*[a-zA-Z]{2}+$");//
		
		Matcher match = pattern.matcher(val);
		//���� �˻����� ;;
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "�ùٸ� �̸��� �Դϴ�.");
		}else {
			JOptionPane.showMessageDialog(null, "�߸��� �̸��� �Դϴ�.");
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
