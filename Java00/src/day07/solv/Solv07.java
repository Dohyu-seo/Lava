package day07.solv;

import java.util.Arrays;

/*
���� 7]
		
		���ڿ��� �Է¹޾Ƽ�
		���ڹ迭�� ���ڿ��� �̷�� ���ڸ� ���������� �����ϼ���.
			"hong"
			-----------------
			|'h'|'o'|'n'|'g'|
			-----------------
		
		����]
			���ڿ��� Ư����ġ�� ���ڸ� �������ִ� �Լ�
			
				���ڿ�.charAt(��ġ��);
		
			���ڿ��� ���̸� ��ȯ���ִ� �Լ�
			
				���ڿ�.length();
			��ȯ���� �����Դϴ�.
			
				Arrays.toSting(); �迭�� ��� �����͸� ���ڿ��� ��ȯ
*/
import javax.swing.JOptionPane;
public class Solv07 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("���ڿ��� �ƹ��ų� �־��ּ���");
		//		static�̶� ���α׷� ����� �������Է��� �ٷε�.
		//String<<���ڿ��� �̿��ϰ�
		//showInputDialog(Object message<<������Ʈ Ŭ������ �̿��϶�� �մϴ�. 
		
		// ����]
			//������ƮŬ������ �ƴ� ���ڿ��� ��µ�- ����� ������ ����!
		// �ڹ��� Ŭ�����߿� �� ���� Ŭ�����z ObjectŬ�����Դϴ�, API���� Ȯ�ΰ���
		// Object���� ��ӽ��� �ٸ� Ŭ�����鿡�� ������ �ο��Ͽ� ��밡���մϴ�.
		
		// ***���� Object�� ���ǰ� �� �Լ��� ��� Ÿ���� ����� �� �ֵ�.***
		
		
		
		
		//���� �迭�� ���̸�ŭ ���� �迭�� ������ش�.
		char[] ch = new char[str.length()];
		// ���ڿ� ������ ���ڹ迭
		char[] ch1 = new char[str.length()];
		
		//���ڿ��� ���̸�ŭ �ݺ��ؼ� ���ڸ� ������, ���� ���ڸ� ���� ���ڹ迭�� �������� �־��ش�.
		for(int i = 0; i <str.length(); i++ ) {
			ch[i] = str.charAt(i);
			ch1[i] = str.charAt(str.length()-1 -i);
//			ch1[0] = str.charAt(str.length()-1 -0); �� ���ڸ� �ε���
//			ch1[1] = str.charAt(str.length()-1 -1); �ڿ��� �ι�° ...
		}
		/*
		 * System.out.println("���ڿ� : " + str); System.out.println("ch : "+
		 * Arrays.toString(ch)); System.out.println("ch : "+ Arrays.toString(ch1));
		 */
		
		String msg = "���ڿ� : " + str +"\nch : " + Arrays.toString(ch)+
				"\nch : "+ Arrays.toString(ch1);
		JOptionPane.showMessageDialog(null, msg);
	}

}
