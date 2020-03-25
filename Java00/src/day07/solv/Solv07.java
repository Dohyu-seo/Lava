package day07.solv;

import java.util.Arrays;

/*
문제 7]
		
		문자열을 입력받아서
		문자배열에 문자열을 이루는 문자를 순차적으로 저장하세요.
			"hong"
			-----------------
			|'h'|'o'|'n'|'g'|
			-----------------
		
		참고]
			문자열의 특정위치의 문자를 추출해주는 함수
			
				문자열.charAt(위치값);
		
			문자열의 길이를 반환해주는 함수
			
				문자열.length();
			변환값이 정수입니다.
			
				Arrays.toSting(); 배열에 담긴 데이터를 문자열로 반환
*/
import javax.swing.JOptionPane;
public class Solv07 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("문자열을 아무거나 넣어주세요");
		//		static이라서 프로그램 실행시 데이터입력이 바로됨.
		//String<<문자열로 이용하고
		//showInputDialog(Object message<<오브젝트 클래스를 이용하라고 합니다. 
		
		// 참고]
			//오브젝트클래스가 아닌 문자열을 썼는데- 사용이 가능한 이유!
		// 자바의 클래스중에 최 상위 클래스틑 Object클래스입니다, API에서 확인가능
		// Object에서 상속시켜 다른 클래스들에게 권한을 부여하여 사용가능합니다.
		
		// ***따라서 Object로 정의가 된 함수는 모든 타입을 사용할 수 있따.***
		
		
		
		
		//문자 배열의 길이만큼 문자 배열을 만들어준다.
		char[] ch = new char[str.length()];
		// 문자열 뒤집는 문자배열
		char[] ch1 = new char[str.length()];
		
		//문자열에 길이만큼 반복해서 문자를 꺼내고, 꺼낸 문자를 위의 문자배열에 차곡차곡 넣어준다.
		for(int i = 0; i <str.length(); i++ ) {
			ch[i] = str.charAt(i);
			ch1[i] = str.charAt(str.length()-1 -i);
//			ch1[0] = str.charAt(str.length()-1 -0); 맨 끝자리 인덱스
//			ch1[1] = str.charAt(str.length()-1 -1); 뒤에서 두번째 ...
		}
		/*
		 * System.out.println("문자열 : " + str); System.out.println("ch : "+
		 * Arrays.toString(ch)); System.out.println("ch : "+ Arrays.toString(ch1));
		 */
		
		String msg = "문자열 : " + str +"\nch : " + Arrays.toString(ch)+
				"\nch : "+ Arrays.toString(ch1);
		JOptionPane.showMessageDialog(null, msg);
	}

}
