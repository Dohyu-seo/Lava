package day17;

import java.util.*;

public class Test10 {

	public Test10() {
		// HashMap
		// ģ�� �̸��� Ű������ �ϰ� ��ȭ��ȣ�� �����ͷ� �ϴ� ���� ���� ����غ���.
		HashMap<String, String> map = new HashMap();
		map.put("ū��", "010-9999-9999");
		map.put("������", "010-3333-3333");
		map.put("����", "010-5555-5555");
		map.put("�ú�", "010-2222-2222");

		// Ű ���� �������� . keySet()
		Set<String> key = map.keySet();

		// ArrayList�� ��ȯ�ؼ� �̾ƺ���.Iterator�κ�ȯ�ؼ� ����ص� �ȴ�.
		ArrayList<String> kList = new ArrayList<String>(key);
		System.out.println("----------------------------");
		for (String k : kList) { // klist���� �̾ƿ� ���ڿ�.. �� �������
			// ���
			System.out.println(k + " : " + map.get(k));
		}
		System.out.println("----------------------------");
		// ��� : Map �� key���� �˾ƾ� ��� �����ϴ�.
		System.out.println();
		
		
		//Map.Entry�� ����ؼ� Ű�� ������ ����غ���.
		Set<Map.Entry<String, String>> set = map.entrySet(); // ����ȭ ���ѳ��� Map�� �ִ� Ű�� ������ �� ������ ������ ����� �� �ִ� �Լ� ==> ���� �Ǵ� �� ...?
		// ���߿� ���� �� ���� ���� ���� ���ʸ��� �ȿ� ���ʸ����� �־���.
			// ���� �����ϴ� ��� ��ȯ�� �Ǿ����� ������ ����غ���.
		// set�� �ִ� �� ������ map.entryŸ���̴� . == ����ȭ
		Iterator<Map.Entry<String,	String>> itor = set.iterator(); // iterator ��ȯ ~
		
		// ����  �ϳ��� ������
		while(itor.hasNext()) {
			Map.Entry<String, String> ent = itor.next(); // k�� val �� ���� next�� ���� �ʱ����ؼ� �ʱ�ȭ ��Ű��.
			String k = ent.getKey();
			String val = ent.getValue();
			
			// ����ϰ�...
			System.out.println(k + " : " + val);
		}
		

	}

	public static void main(String[] args) {
		new Test10();

	}

}
