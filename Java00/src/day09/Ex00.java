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
public class Ex00 {
	public static void main(String[] args) {
		//������ ���ڿ�
		String str = "GitHub is built for collaboration.Set up an organization to improve the way your team works together, and get access to more features.";
		
		// ���ڿ����� .�� ���� ī��Ʈ ���� �����
		int cnt = 0;
		//ī��Ʈ ������ �̿��ؼ� ���ڿ����� . ������
		for(int i = 0; i <str.length(); i++) {
			if(str.charAt(i) == '.')++cnt;//���࿡ str���̸�ŭ ���ư��� ��  str�ȿ� .�� �ִٸ� cnt�� +1 �ȴ�
		}
		System.out.println(cnt); // ī��Ʈ ���� �̾ҵ�!
		
		// ���� ���� �迭 �����
		
		String[] str1;
		String[] str2;
		//������ ������� 
		//ī��Ʈ�� �̿��ؼ� ���ڹ迭 ������
//		for(int i=0; i<cnt;i++) { // i��1�� �� �� ���� �ݺ�
			
			
			
		}
	}
//}
