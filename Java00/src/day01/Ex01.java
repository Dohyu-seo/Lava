package day01;

public class Ex01 {
/*
 	1. 1, 2, 5, 10, 20 �� ������ ���� �ϳ��� �����ϰ� (���, ���� ���)
 		�̰��� 2������ �ٲ㺸��
 		���� ���α׷��� ����� ��ġ�ϴ��� Ȯ���ϼ���.
-----------------------------------------------------------------------------
	2. �������� 7�� ���� ����, �ѷ��� ����ؼ� ����ϼ���.
		���� �ѷ� :  2*������*3.14
		���� ���� :  ������*������*3.14
		
		��, ������, �ѷ�, ���̴� ������ ���� ó���ϼ���.
		�׸��� �ѷ��� floatŸ���� ������ ���弼��.
-----------------------------------------------------------------------------
	3. �ΰ��� ����(����)�� ������ ���
		�μ��� ����, ���η� �ϴ� �簢���� ���̸� ���ϼ���.
-----------------------------------------------------------------------------
	4. 3�� ������ �μ��� �غ��� ���̷� ������ �ﰢ���� ���̸� ���ϼ���.
-----------------------------------------------------------------------------
	5. 54,232���� �����ؾ��Ѵ�.
		�츮���� ȭ��� �� ������ ��� �ʿ����� ����ؼ� ����ϼ���.
		5������ - 1��
		1������ - 0��
		5õ���� - 0��
		1õ���� - 4��
����]
	1���� 365.2426���̴�.
	�� ��¥�� ���� ��ĥ ��ð�, ���, �������� ����ؼ� ����ϼ���.
	
	
 */
	public static void main(String[] args) {
		
		// 0 <= no1 <= 20; ==> �񱳿����ڴ� �ѹ��� �ϳ��� ó���� �� �ִ�.
		// 0 <= no1 % no1 <= 20;
	/*//1��
		int num = 11;
		String a1 = Integer.toBinaryString(num);  // 10���� -> 2����
		
		System.out.println(a1);
		
		int no = 8;
		String a2 = Integer.toBinaryString(no);  // 10���� -> 2����
		
		System.out.println(a2);
	//2��
		/*2. �������� 7�� ���� ����, �ѷ��� ����ؼ� ����ϼ���.
		���� �ѷ� :  2*������*3.14
		���� ���� :  ������*������*3.14
		
		��, ������, �ѷ�, ���̴� ������ ���� ó���ϼ���.
		�׸��� �ѷ��� floatŸ���� ������ ���弼��.*/
	/*	double pi = 3.14F;
		int rad = 7;
		
		
		System.out.println("�������� " + rad + "�� ���� �ѷ��� " + (2*rad*pi) + " �̴�.");
		System.out.println("�������� " + rad + "�� ���� ���̴� " + (rad*rad*pi) + " �̴�.");
	//3��
		/*3. �ΰ��� ����(����)�� ������ ���
		�μ��� ����, ���η� �ϴ� �簢���� ���̸� ���ϼ���.*/
		
	/*int garo = 300;
		int sero = 325;
		
		System.out.println("���ΰ� " + garo + "�̰� ���ΰ�  "+ sero + "�� �簢���� ���̴� " + (garo*sero) + " �̴�.");
	//4��
		/*4. 3�� ������ �μ��� �غ��� ���̷� ������ �ﰢ���� ���̸� ���ϼ���.*/
/*System.out.println("�غ��� " + garo + "�̰� ���̰�  "+ sero + "�� �ﰢ���� ���̴� " + (garo*sero/2) + " �̴�.");
	//5��
		/*	5. 54,232���� �����ؾ��Ѵ�.
		�츮���� ȭ��� �� ������ ��� �ʿ����� ����ؼ� ����ϼ���.
		5������ - 1��
		1������ - 0��
		5õ���� - 0��
		1õ���� - 4��*/
	/*	int won = 54232;
		int oman = 0;
		int man = 0;
		int ochun = 0;
		int chun = 0;
		int obaek = 0;
		int baek = 0;
		int osip = 0;
		int sip = 0;
		int il = 0;
		// �� ������ ī��Ʈ�� ���ؾ���.
		int tmp = won;
		
		oman = tmp / 50000;
		tmp %= 50000;	// ���� �����Ͱ� ����.
		man = tmp / 10000;
		tmp %= 10000;
		ochun = tmp / 5000;
		tmp %= 5000;
		chun = tmp / 1000;
		tmp %= 1000;
		obaek = tmp / 500;
		tmp %= 500;
		baek = tmp / 100;
		tmp %= 100;
		osip = tmp / 50;
		tmp %= 50;
		sip = tmp / 10;
		tmp %= 10;
		il = tmp / 1;

		System.out.println("5������ : " + oman);
		System.out.println("1������ : "+man);
		System.out.println("5õ���� : "+ochun);
		System.out.println("1õ���� : "+chun);
		System.out.println("500�� :"+obaek);
		System.out.println("100�� :"+baek);
		System.out.println("50�� : "+osip);
		System.out.println("10�� : "+sip);
		System.out.println("1�� :"+il);

		
		
		/*����]
				1���� 365.2426���̴�.
				�� ��¥�� ���� ��ĥ ��ð�, ���, �������� ����ؼ� ����ϼ���.
				*/
	/*	double year = 365.2426;
		
		double ddp = year;
		
		double date = 0;
		double hour = 0;
		double min = 0;
		double seoc = 0;
		
		date = (int)365.2426%ddp;
		System.out.println ("��  �� : " + year);	
		
		ddp = ddp-365;
		System.out.println ("�ϼ� �� ��: " + ddp);	
		hour = ddp*24;
		ddp = hour-5;
		System.out.println ("�ð�  : " + hour);	
		System.out.println ("�ð� �� �� : " + ddp);
		min = ddp *60;
		System.out.println ("��  : " + min);	
		ddp = min - 49;
		System.out.println ("�� �� �� : " + ddp);
		seoc = ddp *60;
		System.out.println ("��  : " + seoc);	
		ddp = seoc-20;
		System.out.println ("�� �� �� : " + ddp);
		

	System.out.print((int)date+"�� ");
	System.out.print((int)hour+"�ð� ");
	System.out.print((int)min+"�� ");
	System.out.print((int)seoc+"��");
	*/

	
	
	}//main
}
