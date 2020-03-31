package day17;

import java.util.*;

public class HwSort02 implements Comparator {
		// 정렬하기 위한 클래스
	
	@Override
	public int compare(Object o1, Object o2) {
			// 1. 삼각형 타입으로 강제형변환 하고
		Semo s1 = (Semo) o1;
		Semo s2 = (Semo) o2;
			// 2. 넓이 비교해서 결과값 얻어내고
		int result = (int)(s1.getArea()-s2.getArea());
			// 3. 반환해주고
		return result;
	}

}
