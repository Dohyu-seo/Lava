package day17;

import java.util.*;
public class Test08 {
/*
 	예제 ]
 		랜덤한 숫자를 10개 를 발생하고
 		그 숫자를 학생의 성적이라고 가정한다
 		이중에 80 ~ 100 사이의 점수만 따로 뽑아서 관리하고자 한다.
 		단, 중복점수는 없는 것으로 한다.
 		
 		TreeSet
 		
 */
	public Test08() {
		// TreeSet을 만들고
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random rnd = new Random();
		
		// 랜덤하게 점수 10개 입력하고
		while(true) {
			set.add(rnd.nextInt(101));
			if(set.size() == 20) break;
		}
		// 80 ~ 100 사이의 점수 따로 뽑아서 저장하고
		TreeSet<Integer> tScore = (TreeSet<Integer>) set.subSet(80, 100); // subSet() 는 반환값이 SortedSet이기 때문에 강제형변환해준다. 
		
		//ArrayList로 변환해서 출력하자
		ArrayList<Integer> list = new ArrayList<Integer>(tScore);
		
		for( int s : list) {
			System.out.print(s + " | ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
new Test08();

	}

}
