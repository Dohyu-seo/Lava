package day17;

import java.util.*;
import javax.swing.*;

public class Test09 {

	public Test09() {
		// HashTable - HashMap �� ������..
		// ���� �����
		Hashtable<String, String> table = new Hashtable<String, String>();
		// ������ ä���
		table.put("�̸�", "ū��");
		table.put("tel", "010-9999-9999");
		table.put("���", "�ǹ���");
		table.put("�ξ�", "���");
		/*
		 * for (;;) { // ;;�� ������ ���� �ݺ� // ������ ������ // Key ����� String key =
		 * JOptionPane.showInputDialog("�˰���� ������ �Է��ϼ���"); // �ݺ��� �����ϱ� ��, ���� ������ ����� if
		 * (key.equals("q") | key.equals("Q")) break; // ������ ������ �����ְ�
		 * JOptionPane.showMessageDialog(null, table.get(key)); } //Map �迭�� Ű ���� �˾ƾ�
		 * �����͸� ���� �� �ִ�.
		 */

		Collection<String> con = table.values(); // table.���� StringŸ���� values�� �� ������ String���� ���ʸ��� ���ش�.
		// Iterator�� ��ȯ�� ���
		Iterator<String> itor = con.iterator();

//		// �ϳ��� ���������� ������ ���
//		while (itor.hasNext()) {
////			System.out.print(itor.next() + " | ");
//			// �̷��ԵǸ� ������� ������ ������, �׻� Key���� values�� ���� ����ؾ��մϴ�.
//		}
		System.out.println();

		// Ű ���� �̾ƺ���. �Լ��� keys() / keySet()
		Enumeration<String> en = table.keys();

//		Iterator ó�� ��������.
		while (en.hasMoreElements()) { // ���̻� ���� ���� �ִ��� ?
			// ���ڿ������� ����
			String key = en.nextElement();
			// ���������
//			System.out.print(key+ " | ");
			System.out.print("key : " + key+ "\n\t ");
			//Enumeration�� ���ۿ� ����Ǵ� �������̹Ƿ� ������ ���� ������� �����ʹ�.
			// ���� ������ ��� ����ϴ��� ���� �����ϴ��� �ؾ� �Ѵ�.
			System.out.println(key +" : "+ table.get(key));
		}
		System.out.println();
		
//		String key = en.nextElement();
//		while(en.hasMoreElements()){
//		}
			System.out.println(" ------------------------------ ");

	}

	public static void main(String[] args) {
		new Test09();
	}

}
