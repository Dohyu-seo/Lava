package day10.solv;
/*

���� 2]
	
	10���� ������ ������ �Է��� �迭�� ����� (�迭�� ���̴� 10���� �Ѵ�.)
	�� �迭�� ��� ������
	����, ����� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	��, �Է�, �������, ��հ��, ����� �Լ��� �����ؼ� ó���ϼ���.


*/
public class Solv03 {
	
	// Ŭ������ �迭 ����~
	int[] stuList = new int [10];
	
	//�ʱ�ȭ ���� ���� �����!
	int toSum;
	int toAvg;
	
	//������ �Լ� �� ����� �ֱ�****
	public Solv03(){
		
	}
	//�������ϴ� �Լ�
	public void sum() {
		
		for(int i= 0; i<stuList.length; i++) {
			stuList[i] = (int)(Math.random()*(100-0+1));
			
		}
	}
	//��� ���ϴ� �Լ�
	public void avg() {
		
	}
	//������ִ� �Լ�
	public void toPrint() {
		
	}
	//�����Լ�
	public static void main(String[] args) {
		new Solv03();
	}
}
