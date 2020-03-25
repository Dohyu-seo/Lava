package day09;

/*
 	1���� �迭�� 'A'~'E'���� �ʱ�ȭ���ִ� �Լ��� �����ؼ�
 	�������� ch�� �ʱ�ȭ�� ���ְ�
 	
 	�빮�ڸ� �Է��ϸ� �ҹ��ڷ� ��ȯ���ִ� �Լ��� ����
 	ch�� ���ڸ� �ҹ��ڷ� ��� ���� �ϼ���.
 	
 	��ȭ�н�]
 		
 		���ڹ迭�� �Է��ϸ�
 		���ڹ迭�� 'A' ~ 'E'���� �ʱ�ȭ���ִ� ����� ���� �Լ��� �ۼ��ϰ�
 		�����ؼ� ����ϼ���.
 	 
 */
public class Test03 {
	char[] ch; // �������� �ʱ�ȭ�� �迭

	public Test03() {
		setCh();//���� �ʱ�ȭ ��Ű�� ���  : ȣ�����ִ°�.
		
		for(char c : ch) { //ch�迭���� ���ʴ�� ���ڸ� ������ char c ������ �ְڴٴ� �ǹ��̴�.
			System.out.printf("%2c |",c);
		}
		System.out.println();
		// �迭�� ��� ������ �ҹ��ڷ� �������ش�.
		
		for(int i = 0; i<ch.length; i++) {
			char d = ch[i];// ch�� i��° �ִ� �ָ� ������ d�� ��Ҵ�
//			char e = toSo(d);
			ch[i] = toSo(d);// �빮�� d�� toSo���� ���ڹ�ȯ�� ���ִ� �Լ�.
		}
		//���
		for(char c : ch) {
			System.out.printf("%2c |",c);
		}
		System.out.println();
		
		setCh();// << setCh�� �ֱ� ������ �ٽ� �ʱ�ȭ�� ������ ����� �빮�ڷ� ��µȴ�
		
		//���
		for(char c : ch) {
			System.out.printf("%2c |",c);
		}
		System.out.println();
	}
	// ���� �迭 �ʱ�ȭ��Ű�� ����� �Լ�
	public void setCh() {
		ch = new char[5]; // << ch�� ���� �ʱ�ȭ
//		for(int i = 'A'; i < 'E'+1; i ++) {// ���ڹ迭 �ʱ�ȭ ��Ű��
//			ch[i-'A'] = (char)i;// i - 'A'�� 0, ���� +1�� �ȴٴ� ���̴�.
		for(int i = 0; i < 5; i++) {
			ch[i] = (char)('A'+i);// ch�� i�� 'A'+i�� ���ڰ� ���� �ȴ�.(i++;)
		}
	}
	//�빮�ڸ� �ҹ��ڷ� ��ȯ��Ű�� ����� �Լ�
	public char toSo(char d){
		char result = (char)(d +('a'-'A'));
		return result;
	}
	public static void main(String[] args) {
		//Test03�� Heap�� �޸𸮰� �ö󰬱� ������ ��밡���ϴ�.
		new Test03();
		
		// static ������ �޸𸮿� �÷��� �ֵ� �Ǵ� static�� �÷����ִ� �ֵ鸸 �� �� �ִ�.
//		setCh();
	}

}
