package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	extra]
	���� ���ڿ��� �Է¹޾Ƽ�
	�ش� ���ĺ��� �����ϴ� �󵵸� �����ϰ�
	�󵵸� *�� ǥ���ϼ���.	
 */
public class Ex05 {
	public static void main(String[] args) {
		//�Է¹ޱ�
		String input = JOptionPane.showInputDialog("���ڿ��� �Է��� �ּ���");
		//���ڿ� ������ �Է¹��� ���� ���
		char[] str = input.toCharArray();
		//���� ���ڿ���ŭ�� �����ִ� �迭
		char[] no = new char[str.length];
		System.out.println(str.length);
		int[] cnt = new int[27];
//		for(int i=0; i<no.length; i++) {
//			no[i] = toCharArray(str);
//		}
//										System.out.println(Arrays.toString(no));
//		char a = input.charAt(2);//��ġ ��ȯ�� �ε��������� ��ȯ��.
//		System.out.println(a);
//		char[] rpa = new char[10];//�迭����
//		input.getChars(0, 7, rpa, 0);
//		System.out.println(rpa);
		// �Է¹��� �� üũ�ϱ�
		for(int i=0;i<no.length; i++) {
			int idx = str[i]-'A';
			cnt[idx] +=1;
		}
		for(int i = 0; i < str.length; i++) {
//								System.out.printf("%3s : ", (char)('A'+i));
			System.out.printf(Arrays.toString(no));
			for(int j = 0; j < cnt[i]; j++) {
				System.out.print("*");//����� 
				}
	}

//	private static char toCharArray(char[] str) {
//		return 0;
//	}
	}
}
