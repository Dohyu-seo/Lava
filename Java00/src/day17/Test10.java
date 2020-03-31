package day17;

import java.util.*;

public class Test10 {

	public Test10() {
		// HashMap
		// 친구 이름을 키값으로 하고 전화번호를 데이터로 하는 맵을 만들어서 사용해보자.
		HashMap<String, String> map = new HashMap();
		map.put("큰손", "010-9999-9999");
		map.put("작은손", "010-3333-3333");
		map.put("진로", "010-5555-5555");
		map.put("늘보", "010-2222-2222");

		// 키 값만 추출하자 . keySet()
		Set<String> key = map.keySet();

		// ArrayList로 변환해서 뽑아보자.Iterator로변환해서 사용해도 된다.
		ArrayList<String> kList = new ArrayList<String>(key);
		System.out.println("----------------------------");
		for (String k : kList) { // klist에서 뽑아온 문자열.. 을 출력하자
			// 출력
			System.out.println(k + " : " + map.get(k));
		}
		System.out.println("----------------------------");
		// 결론 : Map 은 key값을 알아야 사용 가능하다.
		System.out.println();
		
		
		//Map.Entry를 사용해서 키와 벨류를 출력해보자.
		Set<Map.Entry<String, String>> set = map.entrySet(); // 은닉화 시켜놓고 Map에 있는 키와 벨류를 한 꺼번에 꺼내서 사용할 수 있는 함수 ==> 저장 되는 곳 ...?
		// 나중에 꺼낼 때 쉽게 쓰기 위해 제너릭스 안에 제너릭스를 넣었다.
			// 이제 데이턴느 모두 변환이 되었으니 꺼내서 출력해보자.
		// set에 있는 걸 꺼내면 map.entry타입이다 . == 은닉화
		Iterator<Map.Entry<String,	String>> itor = set.iterator(); // iterator 변환 ~
		
		// 이제  하나씩 꺼낸다
		while(itor.hasNext()) {
			Map.Entry<String, String> ent = itor.next(); // k와 val 에 각각 next를 쓰지 않기위해서 초기화 시키기.
			String k = ent.getKey();
			String val = ent.getValue();
			
			// 출력하고...
			System.out.println(k + " : " + val);
		}
		

	}

	public static void main(String[] args) {
		new Test10();

	}

}
