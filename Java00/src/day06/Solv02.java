package day06;

public class Solv02 {

	public static void main(String[] args) {
		//���� �迭 
		char ch[] = new char[100];
		// ī��Ʈ ���� ������ ���� �迭
		int[] cnt = new int[10];
		
		for(int i = 0; i<100; i++) { 
		//'A'~'J'���� ���� 100���� �����ϰ� �����
			char tmp = (char)(Math.random()*('J'-'A'+1)+'A');
		//ch�迭�� ������ �ְ�
			ch[i] = tmp; 
		}
		
		//������� ���� �迭���� �� ���ڰ� ����� ī��Ʈ�� �÷��ش�.
		for(int i = 0; i < 100; i++) {// 100���� ���� �� Ȯ���Ѵٴ� ���ǽ�
			int idx = ch[i] - 'A'; // 'A'�� ��ĩ���� 0�̰� i���� A�� �� ��ġ���� ī��Ʈ���ش�.
			
			cnt[idx] += 1;// idx :��ü ���̴�. cnt�� ã�Ƴ� ���� +1�� ���ָ� ī��Ʈ�� �÷��ش�.
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
