package day06;


/*
	���� 6]
		���丮�� 10���� ������ �迭�� �����
		1���� ���������� 10���� ���丮���� ���� �迭�� ���
		������ ����ϼ���.
 */
public class Ex06 {

	public static void main(String[] args) {
		 // ���丮�� �迭�����
		int factorial[] = new int[10];
		// ���������� ������ ���� ���� ���� �����
		int no = 1;
		// �迭�� ���丮�� ����� �ݺ��� �����
		for(int i = 1; i < 10; i++) {
			// �ݺ��ؼ� ���� ������Ű��
			no *= i;
			//�ݺ��ؼ� ������Ų ���� �迭�� ���
			factorial[i] = no;
			//����ϱ�
			System.out.print(factorial[i]);
			// ������ ���� , ���ּ� ����ϴ� ���ǹ�
			if(i!=9) {
			System.out.print(",");	
			}
		}
		
	}

}
