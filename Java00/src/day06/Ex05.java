package day06;

/*
     ���� 5]
	
	�Ǻ���ġ ���� 10���� ������ �迭�� �����
	�迭�� ���� �Է��ؼ�
	�迭�� ����� �����͸� ����ϼ���.
 */
public class Ex05 {
	public static void main(String[] args) {
		int no1 = 0;
		int no2 = 0;
		//�Ǻ���ġ ���� 10���� ������ �迭
		int fibonacci[] = new int[10];
		no1 = 1;
		no2 = 1;
		System.out.print(no1+","+no2+",");
		for(int i = 0; i < 10; i ++) {
			
				int no3 = no1 + no2;
				fibonacci[i]=no3;
				no2 = no1;
				no1++;
				System.out.print(fibonacci[i]);
				if(i!=9) {
				System.out.print(",");
				}
				
		}
		
	}

}
