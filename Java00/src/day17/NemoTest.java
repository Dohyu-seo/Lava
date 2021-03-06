package day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class NemoTest {

	public NemoTest() {  
		TreeSet<Nemo> set = new TreeSet(new Nemo_Comp());
		Random rnd = new Random();

		for (;;) {
			int width = rnd.nextInt(16) + 1;
			int height = rnd.nextInt(16) + 1;

			set.add(new Nemo(width, height));
			if (set.size() == 10)
				break;
		}
		// 꺼내서 출력하자.
		Iterator<Nemo> itor = set.iterator(); // 제너릭스 네모
		while (itor.hasNext()) {
			System.out.print(itor.next().getArea() + " | "); // 네모타입의 getArea 호출~
		}
		System.out.println();

		/*
		 * TreeSet set1 = new TreeSet();
		 * 
		 * for (int i = 0; i < 5; i++) { int width = rnd.nextInt(16) + 5; int height =
		 * rnd.nextInt(16) + 5;
		 * 
		 * set1.add(new Nemo(width, height)); }
		 * 
		 * // Set to ArrayList ArrayList list = new ArrayList(set1); for(int i = 0 ; i <
		 * list.size(); i++) { System.out.print(((Nemo)list.get(i)).getArea()+" | "); }
		 * System.out.println(); // 이 경우 TreeSet은 정렬할 수 있는 데이터를 입력해야 저장이 되는데 // Nemo
		 * 클래스는 정렬할 수 없는 상태이므로 입력을 하면 에러가난다.
		 */

	}

	public static void main(String[] args) {
		new NemoTest();

	}

}
