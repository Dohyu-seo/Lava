package day04;


/*
  	while ���
  		
  		for��ɹ� ó�� �ݺ������� �� �ִ� ��ɹ�.
  		for ��ɹ����� �������� �ݺ��� �� Ƚ���� �����ϴ�  ī���ͺ����� ��������
  		��� ���ο� ���� ���� �������̴�.
  		
  		 ����]
  		 	
  		 	(1)
  		 	while(���ǽ� - (2)){
  		 	 	- (3)
  		 	}
  		 	- (4)
  		 	
  		 	���� : 1 -> 2 -> ���̸� 3 -> 2 -> 3 ->... ���ǽ��� true�� ��쿡��
  		 			���ǽ��� false�� ���� -> 4���� ��ħ.
 
 */
public class Test05 {
	/*
	 	�������� ����ϼ���.
	 */
	public static void main(String[] args) {
		int dan = 2;
		int gop = 1;
		 
		while(dan < 10) {
			System.out.println("-------------");
			
			gop=1; // gop�� �Ź� �ʱ�ȭ ������� +1�� �ݺ��Ѵ�.
			while(gop < 10) {
				System.out.println(dan+"x"+gop+"="+(dan*gop));
				gop++; // ó�� �� gop�� �Ź� �����ؾ� ���ѹݺ����� �ʴ´�.
				
			}
			dan++; // ó�� �� dan�� �Ź� �����ؾ� ���ѹݺ����� �ʴ´�.
			
		}
			System.out.println("---------");
	}

}
