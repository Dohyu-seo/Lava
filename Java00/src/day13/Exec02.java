package day13;

/*
���� 1]
	
	Figure Ŭ������ ��� �޾Ƽ� Nemo, Semo, Won Ŭ������ �ۼ��ϼ���.
	Figure Ŭ������ ������ �����ִ� �߻��Լ��� ����� ������ �ֽ��ϴ�.
	
	ArrayList�� �� ������ �ν��Ͻ��� 10�� �����ϰ� ���
	������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	
*/

//���̺귯�� ����
import java.util.*;

public class Exec02 {
	// ���� �Լ��� �ʱ�ȭ, ���� ���� .. �������� ran���� �ʱ�ȭ�Ѵ�
int ran=0;
int ran2=0;

	public Exec02() {
		//ArrayList�� �ʱ�ȭ
		ArrayList list = new ArrayList(); 
		list.add(new Nemo());
		list.add(new Semo());
		list.add(new Won());

		
		
		for(int i = 0; i<list.size(); i++) {
			Figure f = (Figure)list.get(i);
		
//			System.out.println(f.calcArea((int[])(list2.get(i))));
//			System.out.println("num : "+num);	
		}
		int cnt = 0; 
		for(int i = 0; ; i++) {
			cnt++;	
			for(int k = 0; k<list.size();k++) {
				ran = (int)(Math.random()*61+40);
				ran2 = (int)(Math.random()*61+40);
			}
			ArrayList list2 = new ArrayList();
			list2.add(new int[]{ran, ran2});
			list2.add(new int[] {ran, ran2});
			list2.add(new int[] {ran});
			int num = (int)(Math.random()*3);
			System.out.println("===============");
			System.out.println("��"+cnt+"�� ° ����� �Դϴ�");
			System.out.println("   ============");
				for(int j = 0; j<1; j++) {

					int a = num;
					switch(a) {
						case 0:
							Figure n = (Figure)list.get(0);
							System.out.print("0�� : Nemo�Դϴ�."+"\t���δ� ["+ ran +"]���δ� ["+ran2+"]�̸�,"+"\n�簢���� ������ : ");
							System.out.println(n.calcArea((int[])(list2.get(0))));
							break;
						case 1:
							Figure s = (Figure)list.get(1);
							System.out.print("1�� : Semo�Դϴ�."+"\t�غ��� ["+ran+"] ���̴� ["+ran2+"]�̸�,"+"\n�ﰢ���� ������ : ");
							System.out.println(s.calcArea((int[])(list2.get(1))));
							break;
						case 2:
							Figure w = (Figure)list.get(2);
							System.out.print("2�� : Won�Դϴ�."+"\t�������� ["+ran+"]�̸�,"+"\n���� ������ : ");
							System.out.println(w.calcArea((int[])(list2.get(2))));
							break;
			
					}
					System.out.println("�ӡԡӡҡ����ӡԡӡҡ����ӡԡӡҡ����ӡԡӡҡ����ӡԡӡҡ����ӡԡӡҡ����ӡԡӡҡ���");
					System.out.println();
					
			
				}
				if(i == 9) {
					break;
				}
		}//for

	}
	public static void main(String[] args) {
		new Exec02();
	}

}
