package day17;

import java.util.*;

public class Test07 {

	public Test07() {
		TreeSet<String> set = new TreeSet<String>();
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elevator");
		set.add("elephant");
		set.add("fan");
		set.add("flower");
		set.add("jfla");

		// 이 중에서 b로 시작하는 데이터부터
		// d로 시작하는 데이터 까지만 꺼내서
		// 새로운 Set을 만들어 보자.
		TreeSet<String> tmpSet = (TreeSet<String>) set.subSet("b", "dzzzzzzzzzzzzzzzzzzzzzz"); // 소문자 z가 가장 큰 알파벳 순이기에 d
																								// 뒤에 zz를 넣어주면 dzzzzzz까진
																								// 포함 한다는 의미다.
		// 출력한다.
		Iterator<String> itor = tmpSet.iterator();
		while(itor.hasNext()) { // ? 
			System.out.print(itor.next()+" | ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test07();
	}

}
