package day18;

import java.io.*;
import java.util.*;

public class Test01 {
	/*
	 * Sample.txt ������ �о Map���� �����غ���.
	 */
	public Test01() {
		
		// Proprerties ���� �����
		Properties prop = new Properties(); // ���ڿ��� ó�������� Mapó�� ó���ϱ� ������ ������ �� ���� Object Ÿ������ �ȴ�!
		
		// �ܺ����ϰ� ������ �����̴�.
		// �� �۾��� ���Ŀ� �� ������ IO���� ��Ȯ�� ��������.
		// �ϴ� ������ �ڵ�...
		FileInputStream fin = null; // ������ ���� ���� ���ܰ� �߻��� ���̱� ������ �ϴ� null�� �ʱ�ȭ���ְ�
		// try ������ ������ �����͸� �����Ѵ�.
		try {
			// ������Ʈ���� �����ִ� ����... ������ ��θ� �������ش�!
			fin = new FileInputStream("src/day18/Sample_ko.txt");
			// ��δ� ���� ��θ� ����ؼ� �츮�� ���� �۾��ϴ� ������
			// (d:\class\java\git\Java00\src\day18\Sample.txt)�� ���� �ι��ϴ�.
			// ��Ŭ���� �ȿ� �����͸� ����� �̰��� ��Ŭ���� �ڽ��� ��θ� ���Ӱ� ���ؼ� ó���ϹǷ�
			// ���� ���ó�� ������Ʈ ������ ��θ� ã���ָ� �ȴ�.

			// ���� �� ������ ������ Properties�� �е����Ѵ�.
			prop.load(fin);
			// load �Լ��� ����Ǵ� ���� ������ ������ �о Map���� ó���� �� ���Ҵ�.
		} catch (Exception e) {
			e.printStackTrace();
		}

		// �������ʹ� ��ġ HashMap�� �����Ͱ� ����� ��ó�� ����ϸ� �ȴ�.
		// Properties������ ���� ������ = �� �������� ������ Ű���� �ǰ� �������� �����Ͱ� �ȴ�.
		// id=increpas-cls2 ��� �ϸ� map.put("id","increpas-cls2")��� �Է��� �Ͱ� ���� �����.

		// ������ ������Ƽ��(��)�� ��Ҵ�. ���� key������ �̾ƾ� �ϴ� Ű�� �־ ����غ���.
		String name = (String) prop.get("name"); // key���� Object�� ���� ���̱� ������ ���� ����ȯ�� ���־�� �Ѵ�~!\@@
		System.out.println("������ ¦�� �̸� : " + name);
		System.out.println("������ ¦�� ���� : " + prop.get("age"));
		System.out.println("������ ¦�� �������� : " + prop.get("tel"));
		System.out.println("������ ¦�� ��°� : " + prop.get("addr"));
			// �ٹٲ����� �����ϰ� �ȴ�.
	}

	public static void main(String[] args) {
		new Test01();
	}

}
