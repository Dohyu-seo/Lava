package day17;

import java.util.*;
public class Test03 {

	public Test03() {
		// 1. ����Ʈ�� �ﰢ�� ä���ְ�
		ArrayList<Semo> list = new ArrayList<Semo>();
		for( int i = 0 ; i < 10; i ++ ) {
			int no1 = (int)(Math.random()*16+5);
			int no2 = (int)(Math.random()*16+5);
			list.add(new Semo(no1, no2));
		}
		// 2. ����Ʈ ������ ������ �Ѱ��� ������ ����
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i).getArea() + " | ");
		}
		System.out.println();
		
		// 3. �����غ���. ��������
		// ���� ����Ʈ�� �ִ� ��ü�� ���� ũ�⸦ ���� �� ���� �����̹Ƿ�
		// ���ڸ� ���� �Է����ְ� ���� ����
		Collections.sort(list, new HwSort02());
		for(int i = 0 ; i < list.size(); i ++) {
			System.out.print(list.get(i).getArea()+" | ");
		}
		System.out.println();
		
		// ���� ���� Ŭ���� , �������� ����
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return (int)((Semo)o2).getHeight() - ((Semo)o1).getHeight();
			}

			
		});
			for(int i = 0 ; i < list. size() ; i ++) {
					System.out.print(list.get(i).getHeight()+" | "); // Semo Ÿ�� 
			}
			System.out.println();
		
	
		
	}
	

	public static void main(String[] args) {
		new Test03();
	}

}
