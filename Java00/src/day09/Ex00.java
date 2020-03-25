package day09;
/*
//String str = "GitHub is built for collaboration.
 Set up an organization to improve the way your team works together, and get access to more features.";
문제 1]
		 str문장을 두 문장으로 분리해서 배열하세요.
		 String[] str1 = new String ['.' 갯수만큼...]
	
	2.	단어수만큼의 크기를 가지는 배열을 만들고
		배열의 단어를 입력하세요
		toChararray안쓰고..
		 */
public class Ex00 {
	public static void main(String[] args) {
		//추출할 문자열
		String str = "GitHub is built for collaboration.Set up an organization to improve the way your team works together, and get access to more features.";
		
		// 문자열에서 .을 빼낼 카운트 변수 만들기
		int cnt = 0;
		//카운트 변수를 이용해서 문자열에서 . 빼내기
		for(int i = 0; i <str.length(); i++) {
			if(str.charAt(i) == '.')++cnt;//만약에 str길이만큼 돌아가는 중  str안에 .이 있다면 cnt가 +1 된다
		}
		System.out.println(cnt); // 카운트 변수 뽑았따!
		
		// 나눠 담을 배열 만들기
		
		String[] str1;
		String[] str2;
		//데이터 나눠담기 
		//카운트를 이용해서 문자배열 나누기
//		for(int i=0; i<cnt;i++) { // i가1이 될 대 까지 반복
			
			
			
		}
	}
//}
