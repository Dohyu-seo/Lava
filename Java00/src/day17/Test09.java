package day17;

import java.util.*;
import javax.swing.*;

public class Test09 {

	public Test09() {
		// HashTable - HashMap 의 구버젼..
		// 변수 만들고
		Hashtable<String, String> table = new Hashtable<String, String>();
		// 데이터 채우고
		table.put("이름", "큰손");
		table.put("tel", "010-9999-9999");
		table.put("재산", "건물주");
		table.put("부업", "재벌");
		/*
		 * for (;;) { // ;;을 넣으면 무한 반복 // 데이터 꺼내기 // Key 만들기 String key =
		 * JOptionPane.showInputDialog("알고싶은 정보를 입력하세요"); // 반복문 생성하기 전, 종료 조건절 만들기 if
		 * (key.equals("q") | key.equals("Q")) break; // 데이터 꺼내서 보여주고
		 * JOptionPane.showMessageDialog(null, table.get(key)); } //Map 계열은 키 값을 알아야
		 * 데이터를 꺼낼 수 있다.
		 */

		Collection<String> con = table.values(); // table.에는 String타입의 values가 들어가 있으니 String으로 제너릭스 해준다.
		// Iterator로 변환후 출력
		Iterator<String> itor = con.iterator();

//		// 하나씩 순차적으로 꺼내서 출력
//		while (itor.hasNext()) {
////			System.out.print(itor.next() + " | ");
//			// 이렇게되면 결과값만 나오기 때문에, 항상 Key값과 values를 같이 사용해야합니다.
//		}
		System.out.println();

		// 키 값만 뽑아보자. 함수는 keys() / keySet()
		Enumeration<String> en = table.keys();

//		Iterator 처럼 꺼내주자.
		while (en.hasMoreElements()) { // 더이상 꺼낼 것이 있는지 ?
			// 문자열변수에 담자
			String key = en.nextElement();
			// 출력해주자
//			System.out.print(key+ " | ");
			System.out.print("key : " + key+ "\n\t ");
			//Enumeration도 버퍼에 저장되는 데이터이므로 꺼내는 순간 사라지는 데이터다.
			// 따라서 꺼내면 즉시 사용하던지 따로 보관하던지 해야 한다.
			System.out.println(key +" : "+ table.get(key));
		}
		System.out.println();
		
//		String key = en.nextElement();
//		while(en.hasMoreElements()){
//		}
			System.out.println(" ------------------------------ ");

	}

	public static void main(String[] args) {
		new Test09();
	}

}
