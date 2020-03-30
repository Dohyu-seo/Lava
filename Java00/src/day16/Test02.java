package day16;

// SimpleDateFormat
import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;

/*
 	 �����Ϳ��� DATEŸ���� DATA�� ������ ��, java���� ������ �Լ��� : ��¥�� �ð��� �и��ؼ� ���β������Ѵ�..
 	 �����ö� ��¥���� ����� �ð����� ���� (����ȭ & ĸ��ȭ)voŬ�������� ó���� �Ǿ�� �Ѵ�.
 	 �Լ� ���� ���� ó���ϴ� ��....
 	 
 	 JAVA�� DATEŸ�� : 1900.01.01. 00:00
 	 ORACLE�� DATEŸ�� : 1970.01.01. 00:00
 	 
 	 
 */
public class Test02 {
	
	public Test02() {
		// Calendar Ŭ������ ���� �ð��� ����� ������ ������
		Calendar cal = Calendar.getInstance();
		
		//Calendar  �����ʹ� Date Ÿ������ ��ȯ ��ų ��
		Date date = cal.getTime();
		
		// ��� ���ڞ� ��ȯ�ް�
			
		String sTime = getStr(date);
		
		// JOptionPane���� ����ϰ�
		JOptionPane.showMessageDialog(null, date);
		JOptionPane.showMessageDialog(null, sTime);
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	// date Ÿ���� �����͸� �Է��ϸ� ���Ŀ� �µ��� ���ڿ��� ���� ��ȯ���ִ� �Լ�
	public String getStr(Date date) {
		// ���� �����
		SimpleDateFormat form = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm�� ss��");
		// ������� �������� ���ڿ� ������ �����
		String result =form.format(date);
		
		// ������ ��������� �Ѱ��ְ�..
		return result;
	}

}

