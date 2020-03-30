package day15;

import javax.swing.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Test05 {
	
	public Test05() {
		// ��ȭ��ȣ�� �Է¹޾Ƽ� �Է��� ��ȣ�� �´� �������� �˻��غ�����
		String val = JOptionPane.showInputDialog("��ȭ��ȣ�� �Է����ּ���!");
		// 1. pattern Ŭ������ �̿��ؼ� �˻��ϰ� ���� ���Խ� ������ �����.
		//	�׷��� pattern Ŭ������ ������ �Լ��� ȣ���� �� ������ ���߾� ���� Ŭ�����̹Ƿ�
		//	�� Ŭ������ ��ü�� ������� �Լ��� �Ӽ��� static�̸鼭 ��ȯ���� Pattern(�ڱ��ڽ�)�� �Լ��� ����ϸ� �� ���̴�.
		// api������ �������ϱ� �׷� �Լ��� compile(String regex) �̹Ƿ� �� �Լ��� ����ϸ� �ǰڴ�.
		
		Pattern pattern = Pattern.compile("0[0-9]{1,2}-[0-9]{3,4}-[0-9]{4}");
		/*
		 	2. Pattern�� ����� ����
		 	 	�� Ŭ�������� ���Խ� ������ �˻��� �޶�� ��û�Ѵ�.
		 	 	������ �˻��ϴ� �Լ��� Matcher() �̴�.
		 	 	 �� �Լ��� �˻����� Matcher ��� Ŭ���� Ÿ������ ��ȯ�� ���ش�.
		 	 	 
		 	 	 ���� ����� ���� ��� ������ Matcher Ŭ�������� ó���� �ؾ� �� ���̴�.
		 	 	 
		 	 	����� �˾Ƴ��� ���
		 	 		
		 	 		matches()    <== boolean Ÿ������ ��ȯ.
		 */
		Matcher match = pattern.matcher(val); // ���Ͽ��� ����ó�� �Է��ϸ� MatcherŸ������ ��ȯ�Ѵ�.
		
		// ���� �˻� ����� match�� ������ �Ǿ� ������ ������ ����ϸ� �ȴ�.
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "�ùٸ� ��ȭ��ȣ �Դϴ�.");
		}else {
			JOptionPane.showMessageDialog(null, "�߸��� ��ȭ��ȣ �Դϴ�.");
		}
		
	}
	
	public static void main(String[] args) {
		new Test05();
	}

}
