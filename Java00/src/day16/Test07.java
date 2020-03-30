package day16;

import java.util.*;

public class Test07 {
	
	//	Vector의 사용예시를 표현한 클래스
	 
	public Test07() {
		Vector vec = new Vector();
		System.out.println(vec.capacity());// (방이 만들어 져 있는 수가 표시된다.)

		// 방에 11개의 데이터를 채워보자
		for (int i = 0; i < 11; i++) {
			vec.add(i);
		}

		for (Object obj : vec) {
			System.out.println((int) obj);
		}
		// 중복데이터 허용, 인덱스 순서 허용
		System.out.println("vec.cap : "+ vec.capacity());
		for(int i = 0 ; i < 10 ; i++) {
			vec.add(i);
		}
		System.out.println("vec.cap : "+ vec.capacity());
	}

	public static void main(String[] args) {
		new Test07();
	}

}

