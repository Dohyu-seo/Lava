package day15;

import java.io.*;
import java.util.*;
public class Test06 {

	public Test06() {
		//java.io.*; ���̺귯��
		File f = new File("D:\\class\\Java\\git\\Lava\\Java00\\src\\doc\\ScannerTest.txt"); 
		
		// java.util.*; ���̺귯��
		Scanner scan = null;
		
		try {
			
			scan = new Scanner(f);
			String str = scan.nextLine();
			System.out.println("�� ���� ���� : "+str);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
