package day11;

/*
  	����1]
	�������� �����ϰ� �߻��ؼ� - �Լ���.
	�� �������� �Է��ϸ� ���� ���̸� �����ִ� �Լ���
	���� �ѷ��� �����ִ� �Լ��� �����ϰ�
	�����ؼ� ����ϼ���.
	������ִ� �Լ��� �ۼ��ϼ���.
	
 */
public class Test01 {

	static double random;
	public Test01() {
		
		setRan();
	}
	
//	//	������ �������� ���� �迭���� �����
//	double[] no;
	
	//	�������� �����ϰ� �߻���Ű�� �Լ�
	public static  double setRan() {
	random = (double)(Math.random()*41+60);
		return random;
	}
	
	//	�������� ���̸� �����ִ� �Լ�
	public static double setArea() {
		return random*2.*3.14;
	}
	
	// �������� �ѷ��� �����ִ� �Լ�
	public static double setRound() {
		return random*random*3.14;
	}
	
	// ����ϴ� �Լ�
	public static void toPrint() {
		System.out.printf("���� �ѷ� : %3f \n","���� ���� : %3f\n","������ : ",setArea(),setRound(),setRan());
		
	}
}
