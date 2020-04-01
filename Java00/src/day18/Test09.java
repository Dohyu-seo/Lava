package day18;

import java.io.*;
import java.util.*;
import javax.swing.*;
public class Test09 {
	/*
	 * 문제 1] 1. Ex01.txt 에 저장된 데이터를 Properties에 담고 2. 키값을 모두 꺼내서 3. 데이터를 추출하고 4. 총점을
	 * 구해주세요. 5. 메세지창을 띄워서 총점을 출력해주세요.
	 */
	public Test09() {
		Properties prop = new Properties();
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day18/Ex01.txt");
			prop.load(fin);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "### 파일 읽기 에러 ###");
		} finally {
			try {
				fin.close();
			} catch (Exception e) {
			}
		}

		// 데이터를 키와 벨류를 한쌍으로 뽑아내보자.
		Set set = prop.entrySet();
		ArrayList<Map.Entry<String, String>> eList = new ArrayList<Map.Entry<String, String>>(set);
		int sum = 0;
		for (int i = 0; i < eList.size(); i++) {
			sum += Integer.parseInt(eList.get(i).getValue());
		}

		StringBuffer buff = new StringBuffer("     ### 시험 결과 ###");
		for (int i = 0; i < eList.size(); i++) {
			buff.append("\n             ");
			buff.append(eList.get(i).getKey() + " : ");
			buff.append(eList.get(i).getValue());
		}

		buff.append("\n             ");
		buff.append("total : " + sum);
		buff.append("\n             ");
		buff.append("avg : " + (sum * 1. / eList.size()));

		JOptionPane.showMessageDialog(null, buff.toString());

		toFile(prop, sum);
	}

	// Properties와 총점을 입력하면 파일에 저장해주는 함수
	public void toFile(Properties prop, int sum) {
		prop.put("total", sum + "");

		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day18/Ex01.txt");
			prop.store(fout, " Edit Complete");
			JOptionPane.showMessageDialog(null, "* 파일 저장 완료 *");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "* 파일 저장 에러 *");
		} finally {
			try {
				fout.close();
			} catch (Exception e) {
			}
		}

	}

	public static void main(String[] args) {
		new Test09();
	}

}
