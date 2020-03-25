package day06;

import java.util.Arrays;
import java.util.Scanner;

/*
문제 8]
	
	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고 -- 문자열 배열 3개 [5]
	데이터를 입력해서
	
	회원의 이름을 입력하면
	회원의 이름과 전화번호, 이메일을 출력해주는 프로그램을 작성하세요.		
 */
public class Ex08 {

	private static String eno;

	public static void main(String[] args) {
		//회원의 이름, 전화번호, 이메일 배열 만들기
		String[] name;
		String tel[];
		String email[];
		// 배열에 데이터 넣기
		name = new String[] {"서동혁", "읭의읭", "믬믜믬", "늰늬늰", "싓싀싓"};
		tel = new String[] {"010-9823-5579", "010-0000-0000", "010-4444-4444", "010-2222-2222","010-9999-9999"};
		email = new String[] {"502flclqlf@naver.com", "ing@naver.com", "ming@naver.com","ning@naver.com","sing@naver.com"};
		// 입력받을 준비하기
		Scanner sc = new Scanner(System.in);
		//문구 출력하기
		System.out.println("이름을 입력하세요.");
		String eno = sc.nextLine();
		
//	//	입력받은 이름에 대한 전화번호와 이메일 출력하기
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(tel));
		System.out.println(Arrays.toString(email));
//  //	데이터 찾아주는 for문 만들기
		for(int i = 0; i<5; i++) {
			//데이터 비교하기 5까지
				if(name.equals(eno));{
					System.out.println("확인 되었습니다.");
					System.out.println("전화번호 :"+ tel[i]+"이메일 : "+email[i]);
				}
				 
				//입력받은 내용이 있을 때 시작
			
				//이름을 입력했을 때 추출해주는 값 찾기
//				eno = name[i];
//				System.out.println(tel[i]+email[i]);
//			}
		}
	}
}
