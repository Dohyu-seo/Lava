package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// String�� �����غ���.

public class Test05 {

	public Test05() {
		ArrayList<String> list = new ArrayList<String>();
		//list�� �����͸� ä������.
		list.add("����");
		list.add("ū��");
		list.add("ȸ��");
		list.add("����");
		list.add("��ȣ");
		
		// ��¸��� �غ���.
		for(String s : list) {
			System.out.print(s+" | ");
		}
		System.out.println();
		
		// ���� ���� ���� �غ���.
		Collections.sort(list); // list�� ������������ �����Ѵ�- �Ѵ�.
		for(String s : list) {
			System.out.print(s+" | ");
		}
		System.out.println();
		
		// ���� ���� ���� �غ���.
		Collections.sort(list, new Comparator(){
			// ���ڿ��� �⺻ ���� ����� ���������̰�
			// �ٸ� ������� ������ �Ϸ��� Comparator �������̽��� ������ Ŭ������ ���������Ѵ�.
					// String ComparaTo()�� Ȯ���Ѵ�.
			@Override
			public int compare(Object o1, Object o2) {
				// �� �Լ� �ȿ��� ��ȯ���� �����̸� ��ü�ϰ� ����̸� ��ü���� �ʴ´�.
				
				// ���ڿ��� ���� ����ȯ ���ְ�
				String s1 = (String)o1;
				String s2 = (String)o2;
				int result = s2.compareTo(s1);
//				int result = s1.compareTo(s2);
				return result; // or -result;
			}
		});
		for(String s : list) {
			System.out.print(s+" | ");
		}
		System.out.println();
	
	}
	public static void main(String[] args) {
		new Test05();
	}

}
