package day07;

import javax.swing.JOptionPane;

/*
	���� 4]
		��ȭ��ȣ�� �Է��ϸ� '-'�� �������� �����͸� �и��ؼ� ������ �迭�� �����
		�и� �� �����͸� ������ �°� �Է��ϰ� ����ϼ���.
		indexOf();
		substring();
*/
public class Ex04 {
	public static void main(String[] args) {
		
		//��ȭ��ȣ ������ �迭����� -> �迭�� int�� �ƴ� String���� 3���ҷ� ������.
		String tel[] = new String[3];
		//�Է¹��� �غ��ϰ�
		String Stel = JOptionPane.showInputDialog("��ȭ��ȣ�� �����ּ��� )\n �ۼ��� : 000-0000-0000");
//		3. indexOf(����)
//		: ���ڿ����� �ش� ���ڰ� ��ġ�ϴ� ��ĩ���� ��ȯ
//		5. substring()
//		: ���ڿ� �߿��� ���ϴ� ���ڿ��� �̾Ƽ� ��ȯ���ִ� �Լ�
		int idx = Stel.indexOf('-');
		tel[0] = Stel.substring(0, idx);
		String tmp = Stel.substring(idx+1);
		//idx �ʱ�ȭ
		idx = tmp.indexOf('-');
		//'-'����  �� ��° '-'���� 
		tel[1] = tmp.substring(0,idx);
		// '-'���� ����������.
		tel[2] = tmp.substring(idx+1);
		JOptionPane.showMessageDialog(null, tel);
		
	}
}
