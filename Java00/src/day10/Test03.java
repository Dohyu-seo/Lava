package day10;
/*
 	Nemo Ŭ������ 5�� ������ �迭�� �����
 	���� ���δ� 1 ~ 29 ���� �����ϰ� ���� �迭�� �ϼ��ϰ�
 	
 	 �׸��� �� Nemo�� ���� ���� ���̸� ������ּ���.
 */
public class Test03 {
	// Nemo �迭������ �����
	Nemo[] nemo;
//	Nemo[] nemo = new Nemo[5];
	// Nemo�� �ʱ�ȭ�ϴ� �Լ��� ������.
	public void setNemo() {
		// ���� �迭�� �ʱ�ȭ ���ش�.
		nemo = new Nemo[5];
		
		// ���� nemo�� �����ʹ� ä���� ���� �ʰ� �����Ͱ� �� �游 ����� ����  ���´�.
		// �� �濡 �����͸� �־�����.
		for(int i=0; i<nemo.length; i++) {
			// �ݺ����� �� �� �ݺ��� �� ����
			// NemoŬ������ �ν��Ͻ��� ���� �� �濡 �־���� �Ѵ�.
			//1��
			nemo[i] = new Nemo();
			
			// Nemo �ν��Ͻ��� ����� �״µ� ���� ����, ����, ���̴� �Է������� �ʾҴ�.
			// ���� ���� ���� ���� ���̴� 0���� ������ �Ǿ� �ִ�.
			// ���� ���� ���� ���̸� ����������. �츮�� �װ��� ����� ����� �ξ����Ƿ� �� ����� ����غ���.
			
			// ���� ���� �ΰ��� �����.
			int garo = (int)(Math.random()*(29-1+1)+1);
			int sero = (int)(Math.random()*(29-1+1)+1);
			
			//�ϴ� �׸�濡 �ִ� �ָ� ������. garo sero�� �־��ָ� ������
			nemo[i].setVal(garo, sero);
			// ���� class ������ Nemo()�� ���Ǿ��ֵ�.
			
		}
	}
	public static void main(String[] args) {
		// nemo�� ������Ѽ� t��  ��Ҵ�.
		Test03 t = new Test03(); // ���� ������� nemo�� ���õǾ����� �ʴ�.
		Test03 t1 = new Test03(); 
		
		// ���� �Լ� �غ�� ������ �Լ��� ȣ�����ָ� ����� �� �ִ�.
		t.setNemo(); // ���⼭ nemo�� �������ش�.
		t1.setNemo();
		
		//������ش�, �츮�� ��Ӻ����� ������ ������ִ� �Լ��� ����� �ξ��� ������ �װ��� ȣ������.
		for(int i =0; i< t.nemo.length; i ++) { 
			t.nemo[i].toPrint();  
		}
		System.out.println(); 
		System.out.println("###############"); 
		for(int i =0; i< t.nemo.length; i ++) {// null�� ����, ����// ������ �ȵž� �ִ� ( t1.setNemo();)��� ���ο� �������� �� ����Ѵ�.
			t1.nemo[i].toPrint();  
		}
		System.out.println("###########");
	}

}