package day06;

/*
	���� 4]
		
		������ 5���� ����� �迭�� �����						- �����迭 1��
		�����ϰ� 2 ~ 30 ������ 5���� �������� ���� �Է��ϰ�	- Math.random()
		������ �������� ���� ���� ���̸� ����ؼ� ������ �迭�� ����� - �Ǽ� �迭 1��
		�� ���� �ѷ��� ����ؼ� ������ �迭�� ����			- �Ǽ� �迭 1��
		
		����� ����ϴ� ���α׷��� �ۼ��ϼ���.					- �ݺ������� ������ ���
		��, ��� ���´� 
		
			��]
				������ : 10, ���� �ѷ� : 62.8, ���� ���� : 314
				
		�� ���·� ��µǰ� �ϼ���.
*/
public class Ex04 {

	public static void main(String[] args) {
		int rad[] = new int[5];//���� �迭
		for(int i = 0; i < 5; i++) {
		int random = (int)(Math.random()*(30-2+1)+2);
		rad[i] = random;
		double area = rad[i]*2*3.14;
		double round = rad[i]*rad[i]*3.14;
		System.out.print("������ : " +rad[i]+", ");
		System.out.print("���� �ѷ� : " +area+", ");
		System.out.print("���� ���� : " +round+" \n");
		}
	}
}
