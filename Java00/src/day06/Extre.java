package day06;

/*
 	extre]
 		1, 1,...
 		�� �����ϴ� �Ǻ���ġ ������ 10�� ����ϼ���.
 		
 		����]
 			�Ǻ���ġ ����:
 				���� �� ���� ���� ������ ����...
 				
 				1, 1, 2, 3, 5, ...
 				// ���� ���� ���������ϴ°� ����Ʈ
 				
 */
public class Extre {

	public static void main(String[] args) {
		int jagn = 1;
		int kn = 1;
		System.out.print(jagn+", "+ kn + ", ");
		for(int i = 0; i < 8; i++){
			int result = jagn + kn; // jagn�� kn���� �ٲٱ� ���� �ʱ�ȭ.
			jagn = kn;
			kn = result; // �ʱ�ȭ ���� jagn+kn�� ���� �ʱ�ȭ
//			int tmp = jagn;
//			jagn = kn;
//			kn = kn + tmp;
			System.out.print(kn + ", ");
		}
	}
}
