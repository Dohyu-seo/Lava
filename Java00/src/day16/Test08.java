package day16;

import java.util.Arrays;
import java.util.Vector;
public class Test08 {
		// Vector�� Object Type ���� ����ȴ�.
	

	public Test08() {
		// Vector �����
		Vector vec = new Vector();
		// ������ ä����
		vec.add("abcd");
		vec.add(new String("abcd"));
		vec.add(10);						// <== int 	  ---Boxing--->Integer ---------> Object 
		vec.add(3.14);						// <== double ---Boxing ---> Double -------> Object
		vec.add(new int[] {1,2,3});
		
		
		//capacity �迭�� ����, size�� ������ ��ȯ.
		
		// ������ ������
		//*** �÷��� �ȿ��� ��� �����͸� ���ÿ� ������ �� �ִ�. �迭�� �Ѱ��� Ÿ�Ը� ������ �� �ִ�.
		/*
			 instanceof �����ڴ� �������� prototype �Ӽ���
			 ��ü�� ������Ÿ�� ü�� ��� �����ϴ��� �Ǻ��մϴ�.
		 */
		for(int i = 0 ; i < vec.size() ; i++) {
			Object o = vec.get(i);
			if(o instanceof String) { // o�� String�̳�
				System.out.println((String)o);
			}else if(o instanceof Integer) {
				System.out.println((int)o); // <== Object  ---> Integer ---UnBoxing--->int
			}else if(o instanceof Double) {
				System.out.println((double)o);
			}else if(o instanceof int[]) {
				System.out.println(Arrays.toString((int[]) o)); // 
				
			}
			System.out.print("�׳� ��� : ");
			System.out.println(o);		
			}
		
	
	}

	public static void main(String[] args) {
		new Test08();
	}

}
