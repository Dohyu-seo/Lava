package day06;

/*
 	1 ���� 5���� ����� �迭�� ����� ������ ����ϼ���.
 	
 	
 */
import java.util.*;
public class Array01 {

	/*
	 static String
toString(boolean[] a) 
Returns a string representation of the contents of the specified array.
static String
toString(byte[] a) 
Returns a string representation of the contents of the specified array.
static String
toString(char[] a) 
Returns a string representation of the contents of the specified array.
static String
toString(double[] a) 
Returns a string representation of the contents of the specified array.
static String
toString(float[] a) 
Returns a string representation of the contents of the specified array.
static String
toString(int[] a) 
Returns a string representation of the contents of the specified array.
static String
toString(long[] a) 
Returns a string representation of the contents of the specified array.
static String
toString(Object[] a) 
Returns a string representation of the contents of the specified array.
static String
toString(short[] a) 
Returns a string representation of the contents of the specified array.
	 */
	public static void main(String[] args) {
		//������ �����Ѵ�.
		int[] num;
		
		// ������ �迭�� ����� ����Ų��.
		num = new int[]{1, 2, 3, 4, 5}; //**[]�� ���� ���� �ʴ� ����, �Է��س��� �����Ϳ� ���� �ڵ����� ũ�Ⱑ ������
		
		int[] num2 = {1, 2, 3, 4, 5}; 
		 
		for(int i = 0; i < num.length;/*�迭�� ��������� ���� length�� ���� �Է��� �Ǵ� ó���� �̷���� */ i++) {
			int no = num[i]; // < ��ġ�� �ҷ��� ȣ���Ѵٰ� ���� �� i �� ��� ��ġ�� �����Ѵ�.
			// �迭�� �� �濡 ���� �����͸� ������ ����� "�迭����[��ġ]"
			System.out.print(no + ", ");
		}
		System.out.println();
		String str = Arrays.toString(num);
		System.out.println(" Arrays.toString(): " + str);
		// ȣ�� �����ʹ� �������� �Դϴ�, �迭�ȿ� � �����Ͱ� �ִ��� Ȯ���ϱ� ���� ���� �����̱⶧����,
		// Ȥ���� �� ������ Ȯ�ο뵵�� �ƴ� �����ͷ� ����Ϸ��� �ϸ� �ȵ˴ϴ�.
		
		System.out.println("num : " + num); // �ؽ��ڵ�� �� �ּҰ��� ����ϰ��ִ� ����.
		// �����͸� ���� ���������� index�� ���� �����ؼ� �����;��ϰ�
		// �����͸� 'Ȯ�θ�' �Ϸ��� Arrays.toString()�� ����ؼ� Ȯ���Ѵ�.
		// java.util.*; �� �ϴ� ������ Arrays�� �Լ������̴�.
		
	}

}
