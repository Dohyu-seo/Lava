package day04;

/*
 	���� 5]
 		
 		1 - 2 + 3 - 4 + 5 - 6......
 		Ȧ - ¦ + Ȧ - ¦ + Ȧ  - ¦ 
 		�̷��� ����� �� ��� ������� ó�� 100�� �Ѿ�� ���ڴ� ������ ������� �Բ� ����ϼ���.
 */
public class Ex05 { 

	public static void main(String[] args) {
		int hol = 0;
		int giho = -1;
		for(int i = 1;  ; i++) {
			giho *= -1; // <- +1 -1 +1 -1 ... �� �ݺ��ؼ� ���.
			hol += giho*i; // <- ������ 1�� i��  giho�� ���ؼ� -1...  
			System.out.println(i);
			if(hol > 100) {
				System.out.println(i+"��° �̰� 100�� �Ѵ� ������ �� "+hol);
				break;
			}
		}	
		
		}
		
	}
	


