package day09;

/*
//String str = "GitHub is built for collaboration.
   Set up an organization to improve the way your team works together, and get access to more features.";
 ���� 1]
		 str������ �� �������� �и��ؼ� �迭�ϼ���.
		 String[] str1 = new String ['.' ������ŭ...]
	
	2.	�ܾ����ŭ�� ũ�⸦ ������ �迭�� �����
		�迭�� �ܾ �Է��ϼ���
		toChararray�Ⱦ���..
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
		
		//���ڿ� ���� ī���� ����
		int cnt = 0;
		// . ���� �� ���� ī���� �ø��� .
		char ch = str[0].charAt(1);
		System.out.println(str);
//		for(int i = 0; i<str.length; i++) {
//			if(str.charAt(i)=='.');
//		}
	}
}
