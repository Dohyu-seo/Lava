package day19;
/*
  	���� 2] FileInputStream
  		etc ��Ű���� �ִ�
  		day19.sample.txt ������ �о��
 */

import java.io.*;
import java.util.Arrays;

import javax.swing.*;

public class Test02 {

	public Test02() {
		// ���� ���Ͽ� ������ Ÿ�ٽ�Ʈ��(�⺻��Ʈ��)�� �غ��Ѵ�.
		FileInputStream fin = null; // ����ó���� ���ؼ� null��.

		try {
			fin = new FileInputStream("D:\\class\\Java\\git\\Lava\\Java00\\src\\day19\\etc\\sample.txt");

			/*
			 * // 1.�ѱ��ڸ� �о��. int ch = fin.read(); // byte�ڵ� �ϳ��� �д´�.
			 * System.out.println("���� ���� : " + (char)ch);
			 */
			/*
			 * 
			 * 
			 * // 2. �������ڸ� �о�� // �� ��Ʈ���� ����Ʈ ����� ��Ʈ���̰� ������ ó���� ����Ʈ�� ó���Ѵ�. // ���� �� ���ڴ�
			 * ����Ʈ������ �Ѱ��̰� �������ڴ� ����Ʈ ������ �������� �ɰ��̴�. // �̰��� �ϳ��� �������� �����Ϸ��� ����Ʈ �迭�� �ʿ��ϰڴ�.
			 * byte[] buff = new byte[1024]; // 1kByte // ���� ���� �˷��ֱ�.. int len =
			 * fin.read(buff);
			 * 
			 * //���� buff�� ���ڿ��� ��ȯ�ؼ� .. String str = new String(buff, 0, len);
			 * 
			 * // ���ڿ��� ����Ѵ�. System.out.println("########�ϱत ���##############");
			 * System.out.println("���� ���ڿ� : " + str);
			 * 
			 * 
			 */

			/*
			 * 
			 * 
			 * // 3. ���� ��ü�� �о��. // byte[] buff = new byte[1024]; // �̷��� �ϸ� 1kByte�� ���� ���̰�
			 * ���Ͽ��� �� �̻��� �����Ͱ� ������ �� �ִ�.
			 * 
			 * // ���� �ݺ��ؼ� ������ ������� ó�� �غ���. while(true) { // �д� �۾��� ���� ������ �𸣱� ������ ������ true��
			 * �Ѵ�. byte[] buff = new byte[1024]; int len = fin.read(buff);
			 * 
			 * if(len == -1) { // ���̻� ���� �����Ͱ� ������ �ݺ��� �����Ѵ�. // �� �� read()�� ���� �����Ͱ� ������ -1��
			 * ��ȯ�ϰ� �ȴ�.. break; } // ���������͸� ���ڿ��� ��ȯ ��Ų��. String str = new String(buff, 0,
			 * len); System.out.print(str); }
			 */

			byte[] buff = new byte[1024];
			while (true) {
				 // �ݺ� �� ������ �⺻ �ʱ�ȭ�� 0 ���� �ʱ�ȭ ���ѵ� �ȴ�.
				Arrays.fill(buff, (byte) 0);
				int len = fin.read(buff);
				if (len == -1) {
					break;
				}
				String str = new String(buff, 0, len);
				System.out.print(str);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "���� ��ġ �����Դϴ�.");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Test02();

	}

}
