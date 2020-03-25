package day09;

/*
 	1차원 배열에 'A'~'E'까지 초기화해주는 함수를 제작해서
 	전역변수 ch에 초기화를 해주고
 	
 	대문자를 입력하면 소문자로 반환해주는 함수를 만들어서
 	ch의 문자를 소문자로 모두 변경 하세요.
 	
 	심화학습]
 		
 		문자배열을 입력하면
 		문자배열을 'A' ~ 'E'까지 초기화해주는 기능을 가진 함수를 작성하고
 		실행해서 출력하세요.
 	 
 */
public class Test03 {
	char[] ch; // 전역변수 초기화할 배열

	public Test03() {
		setCh();//변수 초기화 시키는 방법  : 호출해주는것.
		
		for(char c : ch) { //ch배열에서 차례대로 문자를 꺼내서 char c 변수에 넣겠다는 의미이다.
			System.out.printf("%2c |",c);
		}
		System.out.println();
		// 배열에 담긴 내용을 소문자로 변경해준다.
		
		for(int i = 0; i<ch.length; i++) {
			char d = ch[i];// ch에 i번째 있는 애를 꺼내서 d에 담았다
//			char e = toSo(d);
			ch[i] = toSo(d);// 대문자 d를 toSo에서 문자반환을 해주는 함수.
		}
		//출력
		for(char c : ch) {
			System.out.printf("%2c |",c);
		}
		System.out.println();
		
		setCh();// << setCh가 있기 때문에 다시 초기화된 마지막 출력이 대문자로 출력된다
		
		//출력
		for(char c : ch) {
			System.out.printf("%2c |",c);
		}
		System.out.println();
	}
	// 문자 배열 초기화시키는 기능의 함수
	public void setCh() {
		ch = new char[5]; // << ch에 직접 초기화
//		for(int i = 'A'; i < 'E'+1; i ++) {// 문자배열 초기화 시키기
//			ch[i-'A'] = (char)i;// i - 'A'는 0, 이후 +1씩 된다는 말이다.
		for(int i = 0; i < 5; i++) {
			ch[i] = (char)('A'+i);// ch의 i엔 'A'+i한 문자가 들어가게 된다.(i++;)
		}
	}
	//대문자를 소문자로 변환시키는 기능의 함수
	public char toSo(char d){
		char result = (char)(d +('a'-'A'));
		return result;
	}
	public static void main(String[] args) {
		//Test03은 Heap에 메모리가 올라갔기 때문에 사용가능하다.
		new Test03();
		
		// static 에서는 메모리에 올려진 애들 또는 static애 올려져있는 애들만 쓸 수 있다.
//		setCh();
	}

}
