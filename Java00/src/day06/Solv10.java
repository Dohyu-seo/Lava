package day06;

/*10.
		1
		2  3
		4  5  6
		7  8  9  10
		11 12 13 14 15
*/
public class Solv10 {
	public Solv10() {
		solv2();
	}
	public static void main(String[] args) {
		Solv10 s10 = new Solv10(); // 변수를 만들어도 주소를 저장해두지 않으면 사용할 수 없더라.
		s10.solv1();
	}

	/*
	 * // // int no =1; // // int i = 0; // while(i < 5) { // // int j = 0; //
	 * while( j <= i) { // System.out.printf("%3d",no++); // j++; // } //
	 * System.out.println(); // // ***while문에에서는 카운터 변수 증감식을 별도로 처리해줘야 한다. i++; j++;
	 * 실행이 끝난 뒤 j, i를 증가시킨다는 증감식. // i++; // } // } // //
	 */	
	public void solv1() {
		System.out.println("####### solv1() ########");
		int no =1;
		
		int i = 0;
		while(i < 5) {
			
			int j = 0;
			while( j <= i) {
				System.out.printf("%3d",no++);
				j++;
			}
			System.out.println();
			// ***while문에에서는 카운터 변수 증감식을 별도로 처리해줘야 한다. i++; j++; 실행이 끝난 뒤 j, i를 증가시킨다는 증감식.
			i++;
		}
	}
	public void solv2() {
		for(int i=0; i < 5; i ++) {
			
			// 각 행의 시작 숫자 만들기.
			int no =1;
			for(int j = 0 ; j <= i; j ++) no += j;
			
			// 각 행의 각 셀의 숫자 출력하기
			for(int j = 0; j <= i ; j ++) {
				System.out.printf("%3d", no + j); // j는 0부터 시작.
			} // 열을 1, 2, 4, 7, 11 을 만들고 각행에 1씩 더한 값 출력하기.
			System.out.println();
		}
	}
	

}
