package day09;

public class Ex02_01 {
	double bal = 0; 
	double ral = 0;
	public Ex02_01() {
		syso();
	}
	//����ϴ� �Լ� �����
	public void syso() {
		area();
		round();
		System.out.println("������ �� : "+arr());
		System.out.println("�������� ���� : "+bal);
		System.out.println("�������� �ѷ� : "+ral);
		
	}
	// �����ϰ� �߻��ϴ� �� �����
	public int arr() {
		int random = (int)(Math.random()*(100-1+1)+1);
//		return random;// return�� ����� ������ �߻��� ���� �ٸ� �Լ����� �� �� �ְԵȴ�.
		return random;
	}
	// ������ �Է��ϸ� ���� ���̸� �����ִ� �Լ�. r*r*3.14
	public void area() {
		double area = arr()*arr()*3.14;
		bal = area;
	}
	// ������ �Է��ϸ� ���� �ѷ��� �����ִ� �Լ�. r*2*3.14
	public void round() {
		double round = arr()*2*3.14;
		ral = round;
	}
	public static void main(String[] args) {
		new Ex02_01();
	}

}
