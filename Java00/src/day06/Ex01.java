package day06;


/*	���� 1]
'A' ~ 'J' ������ ���ڸ� ���������� ���� �迭�� �ְ� �� ���ڸ� �ϳ��� ������ �ҹ��ڷ� �����ϰ�
����ϼ���. 

�迭�� ��� ������ ���ڿ��� Ȯ���ؼ� ����ϼ���.
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
