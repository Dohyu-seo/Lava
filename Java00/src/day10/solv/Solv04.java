package day10.solv;

/**
 * 
 *	�� Ŭ������ �л� �Ѹ��� �̸�, ����, ����, ����, ����, �ڵ�  ������ ������ �뵵�� Ŭ����
 *@author ������
 *@since 2020.03.20
 *@version v.1.0
 *
 */
public class Solv04 {
	
	// this.���� �̸� �ϸ� ���������� ���� ������.
	
	// ������� ����
	String name;
	int kor, eng, math, phys, cod;
	
	public Solv04() {}
		
	public Solv04(String name) {
		this.name = name;
		this.kor = (int)(Math.random()*41+60);
		this.eng = (int)(Math.random()*41+60);
		this.math = (int)(Math.random()*41+60);
		this.phys = (int)(Math.random()*41+60);
		this.cod = (int)(Math.random()*41+60);
		}
		
			// ���� ���ϴ� �Լ�
			public int getSum() {
				return kor+eng+math+phys+cod;
			}
				// ��� �����ִ� �Լ�
				public double getAvg() {
					return getSum() / 5.;
				}
			public void toPrint() {
			
				System.out.printf("%5s : %5s\n","�� ��",name);
				System.out.printf("%5s : %5d\n","�� ��",kor);
				System.out.printf("%5s : %5d\n","�� ��",eng);
				System.out.printf("%5s : %5d\n","�� ��",math);
				System.out.printf("%5s : %5d\n","��  ��",phys);
				System.out.printf("%5s : %5d\n","�� ��",cod);
				System.out.printf("%5s : %5d\n","�� ��",getSum());
				System.out.printf("%5s : %5.2f\n","�� ��",getAvg());
//				System.out.println("--------------");
			for(int i=0; i <18;i++) System.out.print("--------------");	
			System.out.println();
			
	}
}
