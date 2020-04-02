package day19;

import java.io.*;
import javax.swing.*;

public class Test19 {

	public Test19() {
		// 타겟스트림 준비하고
		FileReader fr = null;
		// 필터스트림 준비하고
		BufferedReader br = null;
		try {
			// 스트림 초기화하고
			fr = new FileReader("src/day19/Test11.java");
			br = new BufferedReader(fr);
			// 몇번을 읽어야 할지 모르므로 반복해서 처리한다.
			String msg = "";

			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				msg +=str + "\n";
			}
			// 읽은내용 출력하고
			JOptionPane.showMessageDialog(null, msg);	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {
			}
		}

	}

	public static void main(String[] args) {
		new Test19();

	}

}
