package day06;

/*
 	����00]
  		1, 2, ... �� �����ϴ� ���丮���� 10����  ���ϼ���.
  		
  		���丮�� : 
  			1���� �ڱ��ڽű��� ���� ��
  			
  			1! = 1
  			2! = 1*2
  			3! = 1*2*3
  			
 */
public class Ex00 {

	public static void main(String[] args) {
		/*
		 * long up = 1; long down = 2; System.out.print(up+", "+ down+", "); for(long i
		 * = 0; i <8; i++) { System.out.print(); }
		 */
		//�� ���� �ݺ��ؼ� ������ִ� �ݺ���
		for(int i =1 ; i <=10 ; i ++) {
			int result = 1;
			// ������� ���ڱ��� ���� ����� ������ִ� �ݺ���
			for( int j =1; j<=i; j++) {
				result = result *j;
				
			}
			
			System.out.print(result+", ");
		}

	}

}
