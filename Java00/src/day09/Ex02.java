package day09;

public class Ex02 {
	//���
	public Ex02() {
		string();
	}
	
	//����ϴ� �Լ� �����
	public void string() {
		System.out.println(area());
		System.out.println(arr());
		System.out.println(round());

	}
	
	//�����ϰ� �߻��ϴ� �� �����
	public int arr() {
		int random = (int)(Math.random()*(100-1+1)+1);
		return random;
	}
	
	//�������� �Է��ϸ� ���� ���̸� �����ִ� �Լ�. ������ * ������ * 3.14
	public double area() {
		double area = arr()*arr()*3.14;
		return area;
	}
	
	//�������� �Է��ϸ� ���� �ѷ��� �����ִ� �Լ�. ������ *2 * 3.14
	public double round() {
		double round = arr()*2*3.14;
		return round;
	}
	
	public static void main(String[] agrs) {
		new Ex02();
	}
}
