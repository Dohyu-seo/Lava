package day19;

import java.util.Arrays;

public class Test01 {

	/*
	 * 참고 ] 키보드 역시 외부 장치이다. 자주 쓰이는 외부장치 이기떄문에 이미 스트림으로 준비한 변수가 존재한다.
	 * 
	 * SYstem.in
	 * 
	 */
	public Test01() {
		System.out.print("한 글자를 입력해 주세요!");
		// 변수 선언
		// InPutStream : static 이며, new 시킬 수 없고 하나의 객체만을 갖는다.

		int ch = 0;

		try {
			/*
			 * //1. ch = System.in.read(); // --> 원칙적이면 문자는 Char로 받아야 하지만, char는 Ascii로
			 * 반환해준다는 말.. 고로 SYstem.in의 반환값이 int인 것은 ASCII로 반환해 주겠다는 말이다.
			 * System.out.println("입력한 문자 : " + (char)ch);
			 */
			/*
			 * // 2. ***(중요) // String은 바이트와 문자단위의 처리단위가 존재한다. // 지금 우리는 String의 byte단위 처리를
			 * 하고 있따... // byte단위를 처리 하는 방법은 ←
			 * 
			 * byte[] buff = new byte[256]; // 256의 숫자에 따라서 한번에 읽는 데이터의 양이 정해진다. int len =
			 * System.in.read(buff); // byte[] 넣어주면 int 반환 : 읽은 데이터의 갯수를 반환 해준다.
			 * 
			 * // 읽은 결과를 문자로 변환해서 출력하자. String str = new String(buff, 0, len);
			 * System.out.println("읽은 문자 : " + str); //public String(byte bytes[], int
			 * offset, int length) {
			 */

			/*
			 * buff의 모든 배열에 'A'를 ASCii로 채운다. Arrays.fill(buff, (byte) 'A');
			 * System.out.println(Arrays.toString(buff));
			 */

			/*
			 */
			// 3. 주로 네트워크 처리를 할 때 많이 사용되는 방법.
			byte[] buff = new byte[256];
			Arrays.fill(buff, (byte) 'A'); // 배열의 모든 데이터를 'A'로 채워준다.
//			System.out.println(Arrays.toString(buff));
			int len = System.in.read(buff, 10, 100); // 준비된 배열 buff에 10번째 방부터
			// 최대 100까지만 읽으세요... ( --> 100글자만 입력받을 수 있따.)
			String str = new String(buff, 0, len + 20);
			// \n을 지워보자
			str = str.replaceAll("\r\n", "*"); // \r : 줄바꿈 , \n : 줄바꾸고 커서를 맨 앞으로 옮긴..
			System.out.print("입력한 문자열 : " + str);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test01();

	}

}