package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// String을 정렬해보자.

public class Test05 {

	public Test05() {
		ArrayList<String> list = new ArrayList<String>();
		//list에 데이터를 채워주자.
		list.add("진로");
		list.add("큰손");
		list.add("회장");
		list.add("반장");
		list.add("광호");
		
		// 출력먼저 해본다.
		for(String s : list) {
			System.out.print(s+" | ");
		}
		System.out.println();
		
		// 오름 차순 정렬 해본다.
		Collections.sort(list); // list를 오름차순으로 정렬한다- 한다.
		for(String s : list) {
			System.out.print(s+" | ");
		}
		System.out.println();
		
		// 내림 차순 정렬 해본다.
		Collections.sort(list, new Comparator(){
			// 문자열의 기본 정렬 방식은 오름차순이고
			// 다른 방식으로 정렬을 하려면 Comparator 인터페이스를 구현한 클래스를 만들어줘야한다.
					// String ComparaTo()를 확인한다.
			@Override
			public int compare(Object o1, Object o2) {
				// 이 함수 안에서 반환값이 음수이면 교체하고 양수이면 교체하지 않는다.
				
				// 문자열로 강제 형변환 해주고
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
