package day16;

import java.util.*;

public class Test07 {
	
	//	Vector�� ��뿹�ø� ǥ���� Ŭ����
	 
	public Test07() {
		Vector vec = new Vector();
		System.out.println(vec.capacity());// (���� ����� �� �ִ� ���� ǥ�õȴ�.)

		// �濡 11���� �����͸� ä������
		for (int i = 0; i < 11; i++) {
			vec.add(i);
		}

		for (Object obj : vec) {
			System.out.println((int) obj);
		}
		// �ߺ������� ���, �ε��� ���� ���
		System.out.println("vec.cap : "+ vec.capacity());
		for(int i = 0 ; i < 10 ; i++) {
			vec.add(i);
		}
		System.out.println("vec.cap : "+ vec.capacity());
	}

	public static void main(String[] args) {
		new Test07();
	}

}

