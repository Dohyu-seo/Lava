package day10.solv;

/*
  	���� 1]
	
	���� ������, �ѷ�, ���̸� ������ Ŭ������ �����
	�� Ŭ���� ��ü 10���� �迭�� ������ �迭�� ����
	�� ����� �ʱ�ȭ�ϰ� ����ϼ���.
	��, ����� �Լ��� ����ؼ� ����ϼ���.
	������ 29~33����
	�ѷ� : ������ * 2* 3.14
	���� : ������ * ������ * 3.14
 */
public class Solv01 {
	//�������� ����
	 double radi; // ������ ����
	 double round; // ���� ����
	 double area; // �ѷ�����
	 //�迭 ����
	 Solv01[] solv;
	 
	public void setVal(double radius) {
		
		
		radi=radius;
		
		
		
		area = radius*radius*3.14;
		round = radius*2*3.14;
		
	}
	public void setPrint() {
		System.out.println();
		System.out.println("-----------------");
		System.out.printf("���� ������ = %10f,\n���� ���� = %10f,\n���� �ѷ� = %10f",radi,area,round);
		System.out.println();
		System.out.println("-----------------");
	}
	public void setSolv01() {
		//�迭�� �ʱ�ȭ ��Ű��.
		solv = new Solv01[10];
		// �� �濡 �湮�� �� ���� ������ ������ �Է�������
		for(int i =0; i<solv.length; i++) {
			solv[i] = new Solv01();
			
			//������ ���� �ϳ� �����
			int radius = (int)(Math.random()*(100-(-100)+1)-100);
			//�� �������� ������ ���
			solv[i].setVal(radius);
		}
		
	}
	public static void main(String[] args) {
	// �Լ��غ�
	 
	Solv01 rou = new Solv01();
	// �Լ� ȣ��
	rou.setSolv01();
	//����غ���
	//round �ѷ�
	for(int i = 0; i<rou.solv.length;i++) {
			rou.solv[i].setPrint();
		}
	}
}
