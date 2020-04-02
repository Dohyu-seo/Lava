package day19;

/*
 	���� 7�� ]
 		�ƹ������� ���Ͽ� �����ϴ� ���α׷��� �ۼ��ϼ���.
 		��, ������Ʈ�� Buffered Stream�� ����ϼ���.
 		
 */
import java.io.*;
import javax.swing.*;

public class Test07 {

	public Test07() {
		// 1. ���Ϸ� �������� ��Ʈ���� �غ��Ѵ�.
		FileOutputStream fout = null;

		// 2. �ʿ信 ���� ������Ʈ���� ���� �A �� �ִ�.
		BufferedOutputStream bout = null;
		try {
			fout = new FileOutputStream("src/day19/etc/buffer_test.txt");
			// ������Ʈ���� �����Ű��.
			bout = new BufferedOutputStream(fout);
			
			// ������ ������ �غ�
			String str = "������ ���� �׸�...";
			
			// byte �迭 �����
			byte[] buff = str.getBytes();
			
			//���� ���ۿ� ���� ���ϱ��� �����Ͱ� �Ѿ ���̴�.
			bout.write(buff);
			// ������ �ر� ���۰� ä������ �ʾ����Ƿ� 
			// ������ ������ FileOutputStream ���� ���� ���� �ʾҴ�.
			// ���� ���� ������ �ȉ��.
			
			// �̷� ��� �ʿ��� �����...
			// ������ ������ ������ ��� �����ִ� ����ε� ...
			bout.flush();
			// ���� ���۵� ��Ʈ���� ����� ��쿡�� ���������� flush �Լ��� �����ؾ� �Ѵ�.
			
			JOptionPane.showMessageDialog(null, "������ �����̤�����!! ��������!");
			
			
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				bout.close();
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test07();

	}

}
