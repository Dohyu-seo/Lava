package day17;

import java.util.*;

public class HwSort02 implements Comparator {
		// �����ϱ� ���� Ŭ����
	
	@Override
	public int compare(Object o1, Object o2) {
			// 1. �ﰢ�� Ÿ������ ��������ȯ �ϰ�
		Semo s1 = (Semo) o1;
		Semo s2 = (Semo) o2;
			// 2. ���� ���ؼ� ����� ����
		int result = (int)(s1.getArea()-s2.getArea());
			// 3. ��ȯ���ְ�
		return result;
	}

}
