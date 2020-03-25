package day06;

import java.util.*;
import javax.swing.*;
public class Solv01 {

	public static void main(String[] args) {
		
		String tmp = "";
		char ch = ' ';
		for(;;) {
			tmp = JOptionPane.showInputDialog("문자를 입력하세요!");
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
		
		System.out.println("### 대문자 ###");
		for(char munja : arr1) {
			System.out.printf("%3c", munja);
		}
		System.out.println();
		System.out.println("### 소문자 ###");
		for(char munja : arr2) {
			System.out.printf("%3c", munja);
		}		
		System.out.println(ch);
		
		JOptionPane.showMessageDialog(null, "입력한 문자는 [ " + ch + " ] 입니다.");
		
		JOptionPane.showMessageDialog(null, "입력한 문자로 시작하는 배열은  * " + Arrays.toString(arr1) + " * 입니다.");
		JOptionPane.showMessageDialog(null, "변환된 문자로 시작하는 배열은  * " + Arrays.toString(arr2) + " * 입니다.");
	}

}
