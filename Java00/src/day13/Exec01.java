package day13;
/*
 	
 */

import java.util.*;

public class Exec01 {
	/*
	 	quiz ]
	 		배열의 단점 ]
	 			1. 한가지 타입의 데이터만 입력을 할 수 있다.
	 			2. 배열의 길이를 수정 할 수 없다.
	 			
	 	따라서 이런 단점을 보완하고자 만들어진 클래스가 
	 	ArrayList 이다.
	 	
	 	지금부터는 배열을 모두 잊으시고
	 	ArrayList를 사용하면 되겠습니다.
	 
	 	ArrayList 사용하는 방법  ]
	 		
	 		ArrayList = new ArrayList(); // ArrayList 객체를 만든다.
	 		List.add(데이터); 로 데이터를 채운다.
	 		
	 		꺼낼 때는 
	 			List.get(index);	로 index를 사용해서 꺼내면 된다.
	 			
	 		인덱스는 입력해주는 순서대로 자동으로 붙여지게 된다.
	 */
	public Exec01() {
		ArrayList list =  new ArrayList();
			list.add(new Class01());
			list.add(new Class02());
			list.add(new Class03());
			
			ArrayList list2 = new ArrayList();
			list2.add(new int[]{10, 5});
			list2.add(new int[]{5, 20});
			list2.add(new int[]{15});
			
			for(int i = 0; i<list.size(); i++) {
				// Collection 에서는 length 대신 size()를 사용해서 길이를 가져온다.
				Test01 t =(Test01)list.get(i);
//				(Test01)List.get(i); 
				//Collection은 데이터에 담길 때 Object 타입으로 자동 형변환이 일어난다.
				// 꺼낼 때도 맞는 타입으로 형변환을 시켜주어야 한다.
				// 이렇게 매번 형 변환을 시켜주게 된다면 번거롭다. 그렇게 제너릭스라는 게 생겨났다. - 제너릭스는 나중에..
				t.calcArea((int[])list2.get(i));
				//calcArea의 list2.get(i)를 꺼내면 Object 타입, int[] 배열로 강제 형변환을 해서 꺼내게 된다.
				// 강제로 하는 이유 : Object라는 타입은 넓고 그 하위클래스는 좁은 타입이다. 넓은타입에서 좁은타입으로 변경할 때는 강제형변환을 써야하기 때문에...
				
				System.out.println(t.calcArea((int[])list2.get(i)));
			}
			System.out.println("-------------------------------------");
			abc();
			
	}
	
	//부연 설명
	public void abc() {
		Test01 t = new Class01();
		// ==> Class01 클래스는 Test01클래스를 상속을 받아서 만든 클래스 이므로
		//     Class01 내	부에 Test01의 멤버는 모두 포함되어있고
		//	       따라서 멤버가 있으면 해당 클래스로 볼 수 있으므로
		//		Test01 클래스로 볼 수 있다.
		
		Test01 t2 = new Class02();
		Test01 t3 = new Class03();
		
		ArrayList list2 = new ArrayList();
		list2.add(new int[]{10, 5});
		list2.add(new int[]{5, 20});
		list2.add(new int[]{15});
		
		//면적 출력하기
		System.out.println(t.calcArea((int[])list2.get(0)));
		System.out.println(t2.calcArea((int[])list2.get(1)));
		System.out.println(t3.calcArea((int[])list2.get(2)));
		
		ArrayList list = new ArrayList();
		list.add(t);
		list.add(t2);
		list.add(t3);
		// 그런데 ArrayList는 데이터를 입력하면 입력된 데이터를 Object타입으로
		// 자동 형변환해서 기억하므로
		// 우리가 Test01 타입으로 입력을 했더라도
		// Object 타입으로 자동 형변환이 되서 저장 된다.
		// 따라서 꺼내어 쓸 때는 해당 타입에 맞는 형태로 강제 형변환을 시켜서 사용하면 된다.

		// 따라서 원칙은 아래의 형태처럼 사용해야 되지만,
		Class01 c1 = (Class01)list.get(0);
		Class02 c2 = (Class02)list.get(1);
		Class03 c3 = (Class03)list.get(2);
		
		// 그런데 이것을 반복문 처럼 반복해서 사용해야 되는 경우라면
		// 위의 방식은 적합하지 않다.
		// 따라서 반복문으로 처리를 하려면 공통타입으로 꺼낸 데이터를 강제 형변환 시켜야 될 것이다.
		
		// 1. Object로 모두 꺼낼 순 있지만, 원하는 기능을 쓸 수 없다. 

		// 2. 우리가 처리해준 함수를 쓰려면 그 함수를 갖고있는 최상위 클래스로 강제 형변환을 실행시켜주면 될 것이다.
		// 3. Test01은 Class의 최상위 타입이면서 함수까지 갖고있다.(그 함수까지 쓸 수 있는 클래스이다.)
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		new Exec01();
	}
}
