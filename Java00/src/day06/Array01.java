package day06;

/*
 	1 부터 5까지 기억할 배열을 만들고 내용을 출력하세요.
 	
 	
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
		//변수를 선언한다.
		int[] num;
		
		// 변수에 배열을 만들고 기억시킨다.
		num = new int[]{1, 2, 3, 4, 5}; //**[]에 숫자 쓰지 않는 이유, 입력해놓은 데이터에 따라서 자동으로 크기가 정해짐
		
		int[] num2 = {1, 2, 3, 4, 5}; 
		 
		for(int i = 0; i < num.length;/*배열이 만들어지는 순간 length에 값이 입력이 되는 처리가 이루어짐 */ i++) {
			int no = num[i]; // < 위치를 불러서 호출한다고 했을 때 i 를 적어서 위치를 지정한다.
			// 배열의 각 방에 기억된 데이터를 꺼내는 방법은 "배열변수[위치]"
			System.out.print(no + ", ");
		}
		System.out.println();
		String str = Arrays.toString(num);
		System.out.println(" Arrays.toString(): " + str);
		// 호출 데이터는 문자형태 입니다, 배열안에 어떤 데이터가 있는지 확인하기 위해 쓰는 변수이기때문에,
		// 혹여나 이 변수를 확인용도가 아닌 데이터로 사용하려고 하면 안됩니다.
		
		System.out.println("num : " + num); // 해시코드로 된 주소값을 기억하고있는 변수.
		// 데이터를 직접 꺼내오려면 index에 직접 접근해서 꺼내와야하고
		// 데이터를 '확인만' 하려면 Arrays.toString()을 사용해서 확인한다.
		// java.util.*; 을 하는 이유는 Arrays의 함수때문이다.
		
	}

}
