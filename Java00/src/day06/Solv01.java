package day06;

import java.util.*;
import javax.swing.*;
public class Solv01 {

	public static void main(String[] args) {
		
		String tmp = "";
		char ch = ' ';
		for(;;) {
			tmp = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���!");
			ch = tmp.charAt(0);
			
			if(ch != 'A') continue;
			else break;
		}
		
		char[] arr1 = new char[10];
		char[] arr2 = new char[10];
		
		for(int i = 0 ; i < 10 ; i++ ) {
			arr1[i] = (char) (ch + i);
		}
		
		for(int i = 0 ; i < 10 ; i++ ) {
			arr2[i] = (char) (ch + i + 'a' - 'A');
		}
		
		System.out.println("### �빮�� ###");
		for(char munja : arr1) {
			System.out.printf("%3c", munja);
		}
		System.out.println();
		System.out.println("### �ҹ��� ###");
		for(char munja : arr2) {
			System.out.printf("%3c", munja);
		}		
		System.out.println(ch);
		
		JOptionPane.showMessageDialog(null, "�Է��� ���ڴ� [ " + ch + " ] �Դϴ�.");
		
		JOptionPane.showMessageDialog(null, "�Է��� ���ڷ� �����ϴ� �迭��  * " + Arrays.toString(arr1) + " * �Դϴ�.");
		JOptionPane.showMessageDialog(null, "��ȯ�� ���ڷ� �����ϴ� �迭��  * " + Arrays.toString(arr2) + " * �Դϴ�.");
	}

}
