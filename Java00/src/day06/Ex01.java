package day06;


/*	문제 1]
'A' ~ 'J' 까지의 문자를 순차적으로 만들어서 배열에 넣고 각 문자를 하나씩 꺼내서 소문자로 변경하고
출력하세요. 

배열에 담긴 내용을 문자열로 확인해서 출력하세요.
*/

public class Ex01 {

	public static void main(String[] args) {
		char[] ch1;
		/*
		num = new char[] {'A','B','C','D','E','F','G','H','I','J'};
		
		char[] num2 = {'a','b','c','d','e','f','g','h','i','j'};
//		*/
		
		//Ch = ABCDEFGHIJ
		ch1 = new char[10];
		char el = 'a'-'A';
		for(int i = 0 ; i < 10 ; i++ ) {
			ch1[i] = (char)('A' + i);
			System.out.print(ch1[i]+=el);
			}
		}
		
}
