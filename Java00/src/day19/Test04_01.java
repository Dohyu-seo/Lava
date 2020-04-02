package day19;

/*
 	���� 4]
 		������ �����غ���.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Test04_01 {

	public Test04_01() {
		// ����
		// ���� ����� ������ ������ ���� ��
		// ���� ������ �ٸ� ���Ͽ� �������� �۾��̴�.
		// ���� ���� ������ ���� �⺻��Ʈ��(Target Stream) �� �غ��ϰ�
		// ���� �� ���� ������ ���ڿ��� �����صΰ� byte[] �� ����� ���Ͽ� ���� �� ���̴�.
		// ���� Ÿ�ٽ�Ʈ���� ���� �ɰ��̴�.

		// 1. �⺻��Ʈ�� �ΰ��� �غ��Ѵ�.
		FileInputStream fin = null; // ����
		FileOutputStream fout = null; // ���纻
		try {
			/*
			 * 2. �⺻ ��Ʈ�� �ΰ��� ����. fin = new FileInputStream("src/day19/etc/sample.txt"); fout
			 * = new FileOutputStream("src/day19/etc/increpas.whw"); �� ������ �о �״�� �ٸ� ���� ����
			 * �ȴ�. ��� �о�� �� �� �𸣹Ƿ�
			 */
			fin = new FileInputStream("src/day19/etc/sample.txt");
			fout = new FileOutputStream("src/day19/etc/increpas.whw");
			byte[] buff = new byte[1024];
			while (true) {
				Arrays.fill(buff, (byte) 0);
				int len = fin.read(buff);
				if (len == -1) {
					break;
				}
				fout.write(buff, 0, len);
			}
			// ���ڿ��� ���Ͽ� ����Ѵ�.
			// ���ڿ��� byte[]�� ������ְ�
			JOptionPane.showMessageDialog(null, "** ���� ���� �Ϸ� **");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				fout.close();
				fin.close();
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		new Test04_01();

	}

}
