package day18;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Test03 {
	public Test03() {
		// Properties 준비하고
		Properties prop = new Properties();
		// 데이터 채우고
		// Properties 는 Map 의 일종이므로 데이터를 채울 때에도 Map처럼 채우면 된다.
		prop.put("name","김소영");
		prop.put("age","30");
		prop.put("tel","010-8888-8888");
		prop.put("addr","서울시 신림동");

		// 파일로 데이터를 보관하자.
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day18/pengsoon.txt");
			// 파일에 위에서 작업한 내용을 기록한다.
			prop.store(fout, "###영구보관###"); // (스트림 , 코멘트)
			JOptionPane.showMessageDialog(null, "영구보관완료");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
			e.printStackTrace();
		}
		
		}

	public static void main(String[] args) {
		new Test03();
	}

}
