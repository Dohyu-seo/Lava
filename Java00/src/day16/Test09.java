package day16;

import java.util.*;
public class Test09 {

	public Test09() {
	/*	ArrayList list = new ArrayList();
		//list에 데이터 챙고
		list.add("한철");
		list.add("은진");
		list.add("성현");
		list.add("진수");
		list.add("대장");
*/
			//list계열은 get함수가 있어서 꺼내올 수 있지만.
		//Set계열이 문제가 된다. 그때는 Iterator 로 변환후 꺼내줘야한다.
		HashSet list = new HashSet(); // Set 계열은 입력순서를 보장하지 않아서 꺼낼 때 입력 순서대로 나오지 않고
										// 나름의 정렬 규칙을 갖고 정렬해서 나온다.
		list.add("한철");
		list.add("은진");
		list.add("성현");
		list.add("진수");
		list.add("대장");
		
		//Map에 있는 Key값 만을 꺼낼 때 Set을 쓴다. == Map은 index대신에 key값을 써서 데이터를 꺼냅니다.
		
		//Map treeSet
		
		/*
		// list 계열은 꺼내는 함수가 있어서 그 함수를 사용하는 것이 편하다.
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();
		*/
		
		// 2. Iterator준으로 사용할 클래스의 compare()를로 꺼내보자. ArrayList 소속의 Iterator() 를 호출해주면 된다.
		// ArrayList를 Iterator로 반환하는 함수가 있다.

		//타입은 Iterator로 반환한다.
		Iterator itor = list.iterator();
		
		//Iterator를 하나씩 꺼내보자
		while(itor.hasNext()) {// boolean 타입으로 반환해준다...
			// hasNext() ==> 버퍼에 꺼낼 데이터가 있으면 true, 없으면 false를 반환해준다.
			String tmp = (String)itor.next();
			
			//순차적으로 하나씩 꺼내야 하는데
			// 꺼내는 함수는 next()인데 반환값 타입이 Object 이므로 강제형변환해서 사용해야 한다.
			
			System.out.print(tmp + " | ");
		}
		System.out.println();
//		StringTokenizer와 비슷하다.
		
	}

	public static void main(String[] args) {
		new Test09();

	}

}
