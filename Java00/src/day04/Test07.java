package day04;

/*
	label �� ���� for ����
		: �ݺ����� ��ø�� �� ���
			������ �ݺ������� ���ǿ� ���� �ٱ� �ݺ����� �����ؾ� �� ��찡 �����.
			�� ���� �ش� �ݺ����� �������� �뵵�� ���Ǵ� �ݺ����̴�.
			
			���� ������ break�� continue�� �� �� �ִ�.
			
		����]
			
			���̸�:
			for �Ǵ� while(;;){ -1
			
				for(;;){ - 2
					break ���̸�; // 'break;'�� ������2�� ���ᰡ �ȴ�. , 1�� �����ϰ� ���� ��쿡 'break �����̸�;'�� ������ش�
				}
			}
		
		***
		����]
			�󺧿� ���� ó���� ���Ӱ��迡 ���ؼ��� ������ �ȴ�.
			
			����]
				��1 :
				for(){
					
					��2:
					for(){
						
					}
					for(){
						break ��2; ==> ����� ������� �ʴ´�.
						continue label1; ==> OK.
					}
				}
 */
public class Test07 {

	public static void main(String[] args) {

//		�������� ����ϴµ� 3���� 5���̻��� ��µ��� ���� �ǳʶٰ� �ϼ���.
		
		t1:
		for(int dan = 2; dan <= 9; dan++) {
			for(int gop = 1; gop <= 9; gop ++) {
				if(dan == 3 && gop >= 5) {
					continue t1; // 3���� 5���ϱ� ���ʹ� ��µ��� �ʰ� ���� 4������ ���۵ȴ�.
				}				
				System.out.println(dan+"x"+gop+"="+(dan*gop));
				
			}
		}
	}

}