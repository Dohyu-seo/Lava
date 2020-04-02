package day19;

/*

 	예제 3] FileOutputStream
 		파일에 내용을 저장하는 프로그램을 작성하세요.

 */
import java.io.*;
import javax.swing.*;

public class Test03 {

	public Test03() {
		// 파일에 데이터를 저장하기 위해서는 파일로 연결되는 타겟스트림이 필요하다.
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day19/etc/increpas.euns");
			// 이 경우 파일이 없어도 파일을 자동으로 파일을 만들어 줍니다.
			// 파일이 존재한다면 존재하는 파일에 기록하게 될 것이다. ( 덮어씌기)
			
			/*
			// 1. 한글자만 입력한다.
			fout.write('A');
			*/
			
			
			// 2. 한 문장을 내보내자.
			String str = "하늘을 우러러 한점 부끄러움이 없기를 ...";
			// 문자열을 byte로 변경시켜주는 함수 getBytes()
			byte[] buff = str.getBytes();
			fout.write(buff);
			
			JOptionPane.showMessageDialog(null, "###파일 저장 완료###");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				fout.close();
				// Stream은 열어주면 finally불러내서 닫아주는게 원칙- 이다.
				// 한마디로 외부장치의 연결을 하고 다사용한 다음에 반드시 닫아주는 것이 원칙이다.
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test03();

	}

}
