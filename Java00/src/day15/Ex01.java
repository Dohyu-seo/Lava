package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/*
 	문제 1]
 		이메일을 입력받아서
 		입력받은 문자열이 이메일형식에 맞는지 아닌지 검사하세요.
 		
 		이메일 형식은
 		 	알파벳과 숫자로 8글자이상으로 하고 @ 도메인주소 (co.kr보이는거 다)
 		로 처리하세요.
 		참고 ]
 			한글 처리 : [가-힣] - 한글은 아이디에 쓰지마세요.
 			
 */
public class Ex01 {
	
	public Ex01() {
		// 이메일 입력받을 변수 만들기~
		String val = JOptionPane.showInputDialog("이메일을 입력하세요. ex)8글자 이상@도메인 주소");
		
		// 이메일 형식에 맞게 썻는지 검사하기~
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,}+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]{2,3}\\.*[a-zA-Z]{2}+$");//
		
		Matcher match = pattern.matcher(val);
		//이제 검사결과는 ;;
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "올바른 이메일 입니다.");
		}else {
			JOptionPane.showMessageDialog(null, "잘못된 이메일 입니다.");
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
