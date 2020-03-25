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
public class Ex01 {

	public static void main(String[] args) {
//		String[] str =  {"GitHub is built for collaboration.Set up an organization to improve the way your team works together, and get access to more features."};
////		System.out.println(str[0].indexOf("."));
//		int idx = str[0].indexOf(".");
////		System.out.println(idx);
////		System.out.println(str[0].indexOf(".",idx+1));
//		
//		String str1 = str[0].substring(0,idx+1); 
//		System.out.println(str1);
//		idx += 1;
//		String str2 = str[0].substring(idx);
//		System.out.println(str2);
		String[] str = {"GitHub is built for collaboration.Set up an organization to improve the way your team works together, and get access to more features."};
		
		//문자열 나눌 카운터 변수
		int cnt = 0;
		// . 나올 때 마다 카운터 올리기 .
		char ch = str[0].charAt(1);
		System.out.println(str);
//		for(int i = 0; i<str.length; i++) {
//			if(str.charAt(i)=='.');
//		}
	}
}
