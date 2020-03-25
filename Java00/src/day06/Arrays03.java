package day06;

import java.util.Arrays;

/*
 	배열의 자동 초기화
 */
public class Arrays03 {

	public static void main(String[] args) {
		int[] arr = new int[10]; // Heap에 들어가고 Heap에서는 자동 초기화를 한다. 기본형 데이터 타입
		
		String[] str = new String[10];
		
		boolean[] bool = new boolean[10];
		
		System.out.println(Arrays.toString(arr));//기본형 타입은 초기화가 되어있습니다.
		//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0] 
		System.out.println(Arrays.toString(str));//참조형 타입은 초기화가 되어있지 않습니다.
		// [null, null, null, null, null, null, null, null, null, null]
		
		System.out.println(Arrays.toString(bool));//기본형 타입은 초기화가 됩니다.
		//[false, false, false, false, false, false, false, false, false, false]
	}

}
