package day03;

/*
 	����1]
 		�Խ��ǿ� ���� �� �������� 15�� ���� ǥ���� �� �ֽ��ϴ�.
 		�Խù��� ������ �����ϰ� (0 ~ 100) �߻��� ��
 		�ʿ��� ������ ���� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
 		��, �Խù����� 0�� ���� 1�������� �ʿ��Ѱ����� �Ѵ�.
 */
public class Ex02 {
	// �������� 15��
	// �Խù� ����.
	// �ʿ��� ������ �� ���
	// �Խù��� 0 = 1; 
	public static void main(String[] args) {
		
		double num = (int)(Math.random()*101);
		System.out.println("�Խù� �� :"+(int)num);
		double page = 0;
		if(num <= 14) { 
			page = 1;
		}else {
			if(101 > 15) {
				page =(((num/15)*100 +99) /100);
			}
		}
System.out.println(" �ʿ��� ������ �� : "+(int)page);
System.out.println(num/15);		

	}

}
