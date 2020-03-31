package day17;

import java.util.*;

public class Test01 {

	public Test01() {
		ArrayList<Sagak> list = new ArrayList<Sagak>();
		for(int i= 0; i < 10; i++) {
			int no1 = (int)(Math.random()*16+5);
			int no2 = (int)(Math.random()*16+5);
			list.add(new Sagak(no1, no2));
		}
		for(Sagak s : list) {
			System.out.print(s.getArea()+" | ");
		}
		System.out.println();
		// 이제 이 ArrayList를 정렬해보자.
		// 정렬하는 방법은 Collections 클래스에 소속된 sort()함수를 호출하면 오름차순정렬이 될 것이다.
		Collections.sort(list);// sort 가 갖고있는 함수중에 컴페어2라는 함수를 이용해서 자동으로 정렬하게 된다.
		for(Sagak s : list) {
			System.out.print(s.getArea() + " | ");
		}
		System.out.println();
		// 이미 정렬기준을 갖고있을 때. 새로운 정렬기준을 정하고싶다면 컴퍼레이터를 사용한다.
		// 이제 가로를 기준으로 정렬하려고 한다.
		Collections.sort(list, new HwSort());
		// Comparator구현하고있는 클래스를 넣어주면 된다. 다형성이다.
								// Comparator은 인터페이스이므로 .. 를
		for(Sagak s : list) {
			System.out.print(s.getWidth() + " | ");
		}
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
