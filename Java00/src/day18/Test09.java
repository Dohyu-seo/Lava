package day18;

import java.io.*;
import java.util.*;
import javax.swing.*;
public class Test09 {
	/*
	 * ���� 1] 1. Ex01.txt �� ����� �����͸� Properties�� ��� 2. Ű���� ��� ������ 3. �����͸� �����ϰ� 4. ������
	 * �����ּ���. 5. �޼���â�� ����� ������ ������ּ���.
	 */
	public Test09() {
		Properties prop = new Properties();
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day18/Ex01.txt");
			prop.load(fin);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "### ���� �б� ���� ###");
		} finally {
			try {
				fin.close();
			} catch (Exception e) {
			}
		}

		// �����͸� Ű�� ������ �ѽ����� �̾Ƴ�����.
		Set set = prop.entrySet();
		ArrayList<Map.Entry<String, String>> eList = new ArrayList<Map.Entry<String, String>>(set);
		int sum = 0;
		for (int i = 0; i < eList.size(); i++) {
			sum += Integer.parseInt(eList.get(i).getValue());
		}

		StringBuffer buff = new StringBuffer("     ### ���� ��� ###");
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

	// Properties�� ������ �Է��ϸ� ���Ͽ� �������ִ� �Լ�
	public void toFile(Properties prop, int sum) {
		prop.put("total", sum + "");

		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day18/Ex01.txt");
			prop.store(fout, " Edit Complete");
			JOptionPane.showMessageDialog(null, "* ���� ���� �Ϸ� *");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "* ���� ���� ���� *");
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
