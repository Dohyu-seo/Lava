package day04;

/*
	(��ø�� �ݺ������� ó��)
	2 ~ 100 ���� ������ ���� �Ҽ��� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	�Ҽ� : 1�� �ڱ� �ڽ����θ� ���� �� �ִ� ��.
	��Ȯ�� 2���� ����� ���� ���� �Ҽ���� �մϴ�.
	
 */
public class Hw03 {

	public static void main(String[] args) {

		
 
			int num = 0;
		 	for(int i = 2; i <= 100; i++){
		 		for(int j = 2; j <= i; j++){
		 			if(i%j == 0) {
		 				
		 				num ++;
		 				
		 			}// if - 1
		 		 }// for-2
		 		if(num == 1) {
		 			System.out.println(i);
		 		}// if -1
		 		num =0; // �ʱ�ȭ 
		 	}// for-1
	}

	/*
	 * 
	 * 
	 * int cnt = 0;
	 * hyunwoo:
	 * 
	 * ���� �� �ִ¼��� �ִ��� �˻�
	 * for(int i=2; i<=100; i++){
	 * 	if(i % j ==0){
	 * 	countinue hyunwoo;
	 * 	}
	 * }
	  
		���� �ݺ����� ���������� ������ �ݺ�ó���� ��ٸ� �� ���� ������
	  	�� ���� ���� �� �ִ� ��(j)�� ���ٴ� ���̹Ƿ�
	  	�� �� (i)�� �Ҽ��� ���̴�.
	 	
	 	 cnt�� 1 �÷��ְ�
	 	 
	 	 ++cnt;
	 	
	 	  �׷��� �Ҽ��� ��¸� �ϸ� �ɰ��̴�.
	 	String mk = ", ";
	 	if(i == 2){
	 	 mk ="";
	 	 }
	 	 System.out.print(mk+i);
	 	 
	 	 }
	 	 System.out.prtin(); �ٹٲ� �Ҷ��..
	 	 System.out.print("2 ~ 100���� �Ҽ� ���� : " + cnt);
	 	 }
	 */
}
