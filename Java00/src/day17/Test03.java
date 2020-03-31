package day17;

import java.util.*;
public class Test03 {

	public Test03() {
		// 1. 리스트에 삼각형 채워주고
		ArrayList<Semo> list = new ArrayList<Semo>();
		for( int i = 0 ; i < 10; i ++ ) {
			int no1 = (int)(Math.random()*16+5);
			int no2 = (int)(Math.random()*16+5);
			list.add(new Semo(no1, no2));
		}
		// 2. 리스트 내용중 면적을 한개씩 꺼내서 보고
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i).getArea() + " | ");
		}
		System.out.println();
		
		// 3. 정렬해보자. 오름차순
		// 현재 리스트에 있는 객체는 서로 크기를 비교할 수 없는 상태이므로
		// 비교자를 만들어서 입력해주고 비교해 보자
		Collections.sort(list, new HwSort02());
		for(int i = 0 ; i < list.size(); i ++) {
			System.out.print(list.get(i).getArea()+" | ");
		}
		System.out.println();
		
		// 무명 내부 클래스 , 내림차순 정렬
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return (int)((Semo)o2).getHeight() - ((Semo)o1).getHeight();
			}

			
		});
			for(int i = 0 ; i < list. size() ; i ++) {
					System.out.print(list.get(i).getHeight()+" | "); // Semo 타입 
			}
			System.out.println();
		
	
		
	}
	

	public static void main(String[] args) {
		new Test03();
	}

}
