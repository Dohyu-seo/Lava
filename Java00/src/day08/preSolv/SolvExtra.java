package day08.preSolv;

import javax.swing.JOptionPane;

public class SolvExtra {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("������ �Է��ϼ���.");
		// ���� 
		// 0. ���ڿ��� ���Ե� ���ڷ� �̷���� ���ڿ��� �����.
		String tmp = ""; // ���ο� ���ڰ� ������ ���⿡ ������ ����.
		loop:
		for(int i =0; i<str.length(); i++) {
			char imsi = str.charAt(i);
			// tmp�� ���� ���ڰ� �ִ��� �˻��ϰ� ������ �����ش�.
			for(int j = 0; j <tmp.length(); j++) {
				if(imsi == tmp.charAt(j)) {
					continue loop;
				}
			}
			tmp = tmp + imsi;
		}
		// 1. ���ԵǾ� �ִ� ������ �������� ���Ѵ�.
		int cnt = tmp.length();
		// ���Ե� ������ �迭�� ���� �� �ְ� �Ǿ����Ƿ� ���ڹ迭�� ī��Ʈ �迭�� �����ȴ�.
		char[] ch = tmp.toCharArray(); // ���Ե� ���ڸ� ������ �迭
		// ���� �迭�� ������ �ƽ�Ű�ڵ尡 ���� ������ �����Ѵ�.
		for(int i = 0; i < ch.length-1; i ++) { // �� �������� �ִ� ���� ������ �ʿ䰡 ���⿡ length-1�Ѵ�.
			for( int j = i + 1; j<ch.length; j++) {// ����ȸ������ Ȯ���� ���̱� ������ i+1�� ���δ�.
				if(ch[i] > ch[j]) { // Ȯ���� ���ڰ� ������ �������� ũ��! ����.
					char c = ch[i]; //����Ű��
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
		}
			//ī��Ʈ ������ �迭
		int[] count = new int[cnt]; // ���Ե� ������ �����󵵸� ������ �迭
		// 2. ���ڸ��� �����ϴ� ī��Ʈ�� �����ش�.
		for(int i = 0; i < ch.length; i++) { // ���ڹ迭�� �ִ� ���� �ϳ��� ������ ��� �ִ��� ī��Ʈ���ش�.
			char c = ch[i]; // ����Ű��
			for(int j = 0; j < str.length(); j++) {
				if(c == str.charAt(j)) {
					count[i] += 1;
				}
			}
		}
		// 3. ����Ѵ�.
		
		//buff : Heap�� �ϳ��� ���ڿ��� ����� �� �ȿ��� ���ڿ��� �����ϴ� �Լ�.< �޸� �����ϱⰡ ����.
		// Heap ������ �޸𸮸� �ø��� �ʰ� �����ִ� ���ڿ��� ������ �ִ�  �Լ�
		// append : �� �ڿ� �����δٴ� buff�� �Լ�
		StringBuffer buff = new StringBuffer();
				for(int i = 0; i < ch.length; i++) {
					buff.append(" ");
					buff.append(ch[i]);
					buff.append("\t : ");
//					System.out.printf("%3c : ", ch[i]);
					for(int j = 0; j <count[i] ; j++) {
//						System.out.print("*");
						buff.append("*");
					}
					buff.append("\n");
//					System.out.println();
				}
				JOptionPane.showMessageDialog(null, buff.toString());
						// buff�� ���ڿ� �Լ��� ������Ѽ� ����ؾ� �ϹǷ� toString�Լ��� ����.
	}
}