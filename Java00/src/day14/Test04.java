package day14;

import javax.swing.JOptionPane;

public class Test04 extends Test03 {

	// getNum()�� ����� �����غ��� @Override
	// �Է¹��� ���ڷ� 10�� ���� ������ ��ȣ�����ֵ��� �������̵� �غ���
	/*
	 * �������̵� ��Ģ] 0. ��� �޾ƾ��Ѵ�.
	 * 1. �Լ��� ������ �����Ѵ�. 
	 * 2. ���������ڴ� ���ų� ���������̾�� �Ѵ�. 
	 * 3. ����ó���� ���ų� ������������ �Ѵ�.
	 */
	public int getNum() throws NumberFormatException {
		// ��ȯ�� ���� ���� ���� �� �ʱ�ȭ
		int num = 0;
		// ���� �Է� �޾Ƽ� ���ڿ��� ���
		String sno = JOptionPane.showInputDialog("���� �Է�");

		// ���ڿ��� ������ ��ȯ���ֱ�
		num = Integer.parseInt(sno);

		// �����ϰ�� ������ ���ܸ� �߻���Ų��.
		if (num < 0) {
			throw new NumberFormatException();
//			throw new IllegalThreadStateException();
		}

		return num * 10;
	}

	public Test04() {

	}

	public static void main(String[] args) {
		new Test04();
	}

}
