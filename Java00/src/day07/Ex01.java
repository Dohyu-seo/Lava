package day07;

public class Ex01 {

	public static void main(String[] args) {
		//�迭 �����
		char[] rpa1 = new char[10];
		char cha = 'A' +10;
		char cha2 = 'a'-'A';
		char[] rpa2;
		//�迭�� ���ĺ� ���
		for(int i=0 ; i<rpa1.length; i++) {
			//������ ���ĺ������
			int random = (int)(Math.random()*(cha-'A'+1)+'A');
			//�����迭�� ������ ���ĺ� ���
			rpa1[i] = (char)random;
			//�����迭 ����غ���
			System.out.print(rpa1[i]);
			// ��������
			rpa2 = rpa1;
			// �����迭�� �����迭 ��� ��  �����迭 �ҹ��ڷ� �ٲٱ�
			if(i==9) {
				System.out.println();
				System.out.println("�����迭 ����� �������ϴ�.");
				System.out.println(rpa2);
				System.out.println("�������簡 �Ϸ�Ǿ����ϴ�.");
				// �����迭 �ҹ��ڷ� �ٲ�ֱ�
				for(int j=0; j<rpa1.length; j++) {
				//�ҹ��ڷ� �ٲٴ� ����.
					rpa1[j] +=(char)cha2;
				//����ϱ�
				}
				System.out.println("***���� �ҹ��ڷ� ����� �����迭�� ����մϴ�.***");
				System.out.println(rpa1);
				System.out.println("������ �����迭 ����� �������ϴ�.");
				// ��������� �迭 �ٽ� ����ϱ�
				System.out.println(rpa2);
				System.out.println("��������� �迭�� �ٽ� ����߽��ϴ�.");

			}
			
		}
		
	}

}
