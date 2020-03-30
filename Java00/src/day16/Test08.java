package day16;

import java.util.Arrays;
import java.util.Vector;
public class Test08 {
		// Vector은 Object Type 으로 저장된다.
	

	public Test08() {
		// Vector 만들고
		Vector vec = new Vector();
		// 데이터 채우자
		vec.add("abcd");
		vec.add(new String("abcd"));
		vec.add(10);						// <== int 	  ---Boxing--->Integer ---------> Object 
		vec.add(3.14);						// <== double ---Boxing ---> Double -------> Object
		vec.add(new int[] {1,2,3});
		
		
		//capacity 배열의 공간, size는 갯수를 반환.
		
		// 데이터 꺼내고
		//*** 컬렉션 안에는 모든 데아터를 동시에 보관할 수 있다. 배열은 한가지 타입만 저장할 수 있다.
		/*
			 instanceof 연산자는 생성자의 prototype 속성이
			 객체의 프로토타입 체인 어딘가 존재하는지 판별합니다.
		 */
		for(int i = 0 ; i < vec.size() ; i++) {
			Object o = vec.get(i);
			if(o instanceof String) { // o가 String이냐
				System.out.println((String)o);
			}else if(o instanceof Integer) {
				System.out.println((int)o); // <== Object  ---> Integer ---UnBoxing--->int
			}else if(o instanceof Double) {
				System.out.println((double)o);
			}else if(o instanceof int[]) {
				System.out.println(Arrays.toString((int[]) o)); // 
				
			}
			System.out.print("그냥 출력 : ");
			System.out.println(o);		
			}
		
	
	}

	public static void main(String[] args) {
		new Test08();
	}

}
