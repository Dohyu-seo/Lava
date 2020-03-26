package day14;

import javax.swing.JOptionPane;

public class SamgakTest {

	public SamgakTest() throws NumberFormatException {

		// JOptionpane�� �Է¹ޱ�~
		String s1num = JOptionPane.showInputDialog("ù ��° �ﰢ���� �غ��� �Է��ϼ���.");
		String s1num2 = JOptionPane.showInputDialog("ù ��° �ﰢ���� ���̸� �Է��ϼ���.");
		String s2num = JOptionPane.showInputDialog("�� ��° �ﰢ����  �غ��� �Է��ϼ���.");
		String s2num2 = JOptionPane.showInputDialog("�� ��° �ﰢ����  ���̸� �Է��ϼ���.");
		
		try {
		// �Է¹��� �� ������ ���~
		int s1Base = Integer.parseInt(s1num);
		int s1Height = Integer.parseInt(s1num2);
		int s2Base = Integer.parseInt(s2num);
		int s2Height = Integer.parseInt(s2num2);
		
		// ���� �ﰢ�� �ΰ� �����~
		Samgak s1 = new Samgak(s1Base, s1Height);
		Samgak s2 = new Samgak(s2Base, s2Height);
		
		// private���� ���� �Ǿ� �ֱ� ������ toString���� ��������~
		JOptionPane.showMessageDialog(null,
				(s1.toString() + s2.toString() + "�� �ﰢ���� " + 
						((s1.equals(s2)) ? ("���� �ﰢ�� �Դϴ�.") : ("�ٸ� �ﰢ�� �Դϴ�."))));
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "������ �Է��� �ּ���~");
		}
	}

	public static void main(String[] args) {
		new SamgakTest();
	}

}
