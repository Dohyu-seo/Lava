package day19;
/*
  	예제 2] FileInputStream
  		etc 패키지에 있는
  		day19.sample.txt 파일을 읽어보자
 */

import java.io.*;
import java.util.Arrays;

import javax.swing.*;

public class Test02 {

	public Test02() {
		// 먼저 파일에 연결할 타겟스트림(기본스트림)을 준비한다.
		FileInputStream fin = null; // 예외처리를 위해서 null값.

		try {
			fin = new FileInputStream("D:\\class\\Java\\git\\Lava\\Java00\\src\\day19\\etc\\sample.txt");

			/*
			 * // 1.한글자만 읽어보자. int ch = fin.read(); // byte코드 하나만 읽는다.
			 * System.out.println("읽은 문자 : " + (char)ch);
			 */
			/*
			 * 
			 * 
			 * // 2. 여러글자를 읽어보자 // 이 스트림은 바이트 기반의 스트림이고 데이터 처리를 바이트로 처리한다. // 따라서 한 문자는
			 * 바이트데이터 한개이고 여러문자는 바이트 데이터 여러개가 될것이다. // 이것을 하나의 변수에서 관리하려면 바이트 배열이 필요하겠다.
			 * byte[] buff = new byte[1024]; // 1kByte // 읽은 갯수 알려주기.. int len =
			 * fin.read(buff);
			 * 
			 * //읽은 buff를 문자열로 변환해서 .. String str = new String(buff, 0, len);
			 * 
			 * // 문자열을 출력한다. System.out.println("########일긍ㄴ 결과##############");
			 * System.out.println("읽은 문자열 : " + str);
			 * 
			 * 
			 */

			/*
			 * 
			 * 
			 * // 3. 문서 전체를 읽어보자. // byte[] buff = new byte[1024]; // 이렇게 하면 1kByte만 읽을 것이고
			 * 파일에는 그 이상의 데이터가 존재할 수 있다.
			 * 
			 * // 따라서 반복해서 꺼내는 방법으로 처리 해보자. while(true) { // 읽는 작업이 언제 끝날지 모르기 때문에 조건은 true로
			 * 한다. byte[] buff = new byte[1024]; int len = fin.read(buff);
			 * 
			 * if(len == -1) { // 더이상 읽을 데이터가 없으면 반복을 종료한다. // 이 때 read()는 읽을 데이터가 없으면 -1을
			 * 반환하게 된다.. break; } // 읽은데이터를 문자열로 변환 시킨다. String str = new String(buff, 0,
			 * len); System.out.print(str); }
			 */

			byte[] buff = new byte[1024];
			while (true) {
				 // 반복 할 때마다 기본 초기화값 0 으로 초기화 시켜도 된다.
				Arrays.fill(buff, (byte) 0);
				int len = fin.read(buff);
				if (len == -1) {
					break;
				}
				String str = new String(buff, 0, len);
				System.out.print(str);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "파일 위치 오류입니다.");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Test02();

	}

}
