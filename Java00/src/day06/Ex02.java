package day06;
/*
���� 2]
		'A' ~ 'J' ���ڸ� �����ϰ� 100�� �߻���Ų �� �� ������ ī��Ʈ�� ���ؼ�(����) ����ϼ���.
		�� ���ڰ� ���� ���� ī��Ʈ
		
		�߰��� ���ڸ�ŭ ��ǥ��* �� ����ϼ���.
		ī��Ʈ �� ��ŭ *�� ��´�.
*/
public class Ex02 {

	public static void main(String[] args) {
		 
		char cha[] = new char[100];
		
		int[] cnt = new int[10];
		
		for(int i = 0; i < 100; i ++) {
		char random = (char)(Math.random()*('J'-'A'+1)+'A');
		cha[i] = random;
		}
		
		for(int i = 0; i < 100; i++) {// 100���� ���� �� Ȯ���Ѵٴ� ���ǽ�
			int idx = cha[i]-'A';
			cnt[idx] += 1;
		}
		for(int i = 0; i < 10; i++) {
			System.out.printf("%3s : ", (char)('A'+i));
			for(int j = 0; j < cnt[i]; j++) {
				System.out.print("*");//�����
				}
			System.out.println();//����
		}
		}
}

