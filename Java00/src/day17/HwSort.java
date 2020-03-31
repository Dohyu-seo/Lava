package day17;

/**
 * 	�� Ŭ������ ���� ������ �ϴ� Ŭ����
 * 
 */
import java.util.*;
public class HwSort implements Comparator {
	// �̹� ���ı����� �ִ� Ŭ������ ������ ���ı������� ������ �ϰ��� �� ��
	// Comparator �������̽��� �����ؼ� ���ı������� ����� Ŭ������ ������ָ� �ȴ�.
	// comparator �� compare()�� �߻��Լ��� ������ �ְ�
	// ������ �ϰԵǸ� �� �Լ��� �ݵ�� �������̵� �ؾ��Ѵ�.
	// ������ �� sort()�� ȣ��Ǹ� �� �Լ��� Comparator�� ���ı������� ����� Ŭ������ compare()��
	// �ڵ� ȣ���ؼ� ������ �ϰ� �ȴ�.
	@Override
	public int compare(Object o1, Object o2) {
		// �츮�� sagak Ŭ������ width�� �������� �ٽ� �����ϰ��� �մϴ�
		// ���� �Ű������� �Էµ� Object Ÿ���� �����͸� Sagak Ŭ������
		// ��������ȯ ���־�� �Ѵ�.
		
		Sagak s1 = (Sagak) o1;
		Sagak s2 = (Sagak) o2;
		int result = (s1.getWidth() - s2.getWidth());
		// �̶� ����� ����̸� �ڸ��� �ٲ۴�.
		// 0 �̸� �ٲ��� �ʰ�
		// �����̸� �ڸ��� �ٲٰ� ..
		return result;
	}

}
