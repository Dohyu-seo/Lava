package day18;

import java.io.*;
import java.util.*;

import javax.swing.*;

public class Ex01 {
	/*
	 * ���� 1] 1. Ex01.txt�� ����� �����͸� Properties�� ��� 2. Ű���� ��� ������ 3. �����͸� �����ϰ� 4. ������
	 * �����ּ���. 5. �޼���â�� ����� ������ ������ּ���.
	 */
	public Ex01() {
		// Properties ���� �����
		Properties prop = new Properties();
		// �ҷ��� ���� ���� ���� �����
		FileInputStream fin = null;
		// ���� �ҷ����µ� ����ó�� ���� �־��ֱ�
		try {
			// ���� �ҷ��ͼ� fin�� ���
			fin = new FileInputStream("D:\\class\\Java\\git\\Lava\\Java00\\src\\day18\\Ex01.txt");
			// Properties�� ������ ������ ���~
			prop.load(fin);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "���� ��ġ ����");
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (Exception e) {}
		}

		Set<Object> key = prop.keySet();
		ArrayList<String> list = new ArrayList(key);
		Collections.sort(list);// ����
		int sum = 0;

		for (String s : list) {
//			System.out.println(s + " : " + prop.get(s));
			sum += Integer.parseInt((String) prop.get(s));
			
		}
		JOptionPane.showMessageDialog(null, ("���� :" + sum));
		JOptionPane.showMessageDialog(null, ("���� :" + sum / list.size()));
		/*
		 * 
		 * Set<Map.Entry<Object, Object>> set = prop.entrySet(); // ����ȭ ���ѳ��� Map�� �ִ� Ű��
		 * ������ �� ������ ������ ����� �� �ִ� �Լ� ==> ���� �Ǵ� �� ...?
		 * 
		 * Iterator<Map.Entry<Object, Object>> itor = set.iterator(); // iterator ��ȯ ~
		 * sum = 0; // ���� �ϳ��� ������ while(itor.hasNext()) { Map.Entry<Object, Object> ent
		 * = itor.next(); // k�� val �� ���� next�� ���� �ʱ����ؼ� �ʱ�ȭ ��Ű��. String k = (String)
		 * ent.getKey(); String val = (String) ent.getValue();
		 * 
		 * // ����ϰ�... System.out.println(k + " : " + val); sum += Integer.parseInt(val);
		 * // JOptionPane.showMessageDialog(null, k+" : "+val); }
		 * 
		 * JOptionPane.showMessageDialog(null, "���� :" +sum); }
		 */
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
