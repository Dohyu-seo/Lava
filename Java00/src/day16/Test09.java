package day16;

import java.util.*;
public class Test09 {

	public Test09() {
	/*	ArrayList list = new ArrayList();
		//list�� ������ ì��
		list.add("��ö");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
*/
			//list�迭�� get�Լ��� �־ ������ �� ������.
		//Set�迭�� ������ �ȴ�. �׶��� Iterator �� ��ȯ�� ��������Ѵ�.
		HashSet list = new HashSet(); // Set �迭�� �Է¼����� �������� �ʾƼ� ���� �� �Է� ������� ������ �ʰ�
										// ������ ���� ��Ģ�� ���� �����ؼ� ���´�.
		list.add("��ö");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		//Map�� �ִ� Key�� ���� ���� �� Set�� ����. == Map�� index��ſ� key���� �Ἥ �����͸� �����ϴ�.
		
		//Map treeSet
		
		/*
		// list �迭�� ������ �Լ��� �־ �� �Լ��� ����ϴ� ���� ���ϴ�.
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();
		*/
		
		// 2. Iterator������ ����� Ŭ������ compare()���� ��������. ArrayList �Ҽ��� Iterator() �� ȣ�����ָ� �ȴ�.
		// ArrayList�� Iterator�� ��ȯ�ϴ� �Լ��� �ִ�.

		//Ÿ���� Iterator�� ��ȯ�Ѵ�.
		Iterator itor = list.iterator();
		
		//Iterator�� �ϳ��� ��������
		while(itor.hasNext()) {// boolean Ÿ������ ��ȯ���ش�...
			// hasNext() ==> ���ۿ� ���� �����Ͱ� ������ true, ������ false�� ��ȯ���ش�.
			String tmp = (String)itor.next();
			
			//���������� �ϳ��� ������ �ϴµ�
			// ������ �Լ��� next()�ε� ��ȯ�� Ÿ���� Object �̹Ƿ� ��������ȯ�ؼ� ����ؾ� �Ѵ�.
			
			System.out.print(tmp + " | ");
		}
		System.out.println();
//		StringTokenizer�� ����ϴ�.
		
	}

	public static void main(String[] args) {
		new Test09();

	}

}
