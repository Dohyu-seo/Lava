package day19;

import java.util.Arrays;

public class Test01 {

	/*
	 * ���� ] Ű���� ���� �ܺ� ��ġ�̴�. ���� ���̴� �ܺ���ġ �̱⋚���� �̹� ��Ʈ������ �غ��� ������ �����Ѵ�.
	 * 
	 * SYstem.in
	 * 
	 */
	public Test01() {
		System.out.print("�� ���ڸ� �Է��� �ּ���!");
		// ���� ����
		// InPutStream : static �̸�, new ��ų �� ���� �ϳ��� ��ü���� ���´�.

		int ch = 0;

		try {
			/*
			 * //1. ch = System.in.read(); // --> ��Ģ���̸� ���ڴ� Char�� �޾ƾ� ������, char�� Ascii��
			 * ��ȯ���شٴ� ��.. ��� SYstem.in�� ��ȯ���� int�� ���� ASCII�� ��ȯ�� �ְڴٴ� ���̴�.
			 * System.out.println("�Է��� ���� : " + (char)ch);
			 */
			/*
			 * // 2. ***(�߿�) // String�� ����Ʈ�� ���ڴ����� ó�������� �����Ѵ�. // ���� �츮�� String�� byte���� ó����
			 * �ϰ� �ֵ�... // byte������ ó�� �ϴ� ����� ��
			 * 
			 * byte[] buff = new byte[256]; // 256�� ���ڿ� ���� �ѹ��� �д� �������� ���� ��������. int len =
			 * System.in.read(buff); // byte[] �־��ָ� int ��ȯ : ���� �������� ������ ��ȯ ���ش�.
			 * 
			 * // ���� ����� ���ڷ� ��ȯ�ؼ� �������. String str = new String(buff, 0, len);
			 * System.out.println("���� ���� : " + str); //public String(byte bytes[], int
			 * offset, int length) {
			 */

			/*
			 * buff�� ��� �迭�� 'A'�� ASCii�� ä���. Arrays.fill(buff, (byte) 'A');
			 * System.out.println(Arrays.toString(buff));
			 */

			/*
			 */
			// 3. �ַ� ��Ʈ��ũ ó���� �� �� ���� ���Ǵ� ���.
			byte[] buff = new byte[256];
			Arrays.fill(buff, (byte) 'A'); // �迭�� ��� �����͸� 'A'�� ä���ش�.
//			System.out.println(Arrays.toString(buff));
			int len = System.in.read(buff, 10, 100); // �غ�� �迭 buff�� 10��° �����
			// �ִ� 100������ ��������... ( --> 100���ڸ� �Է¹��� �� �ֵ�.)
			String str = new String(buff, 0, len + 20);
			// \n�� ��������
			str = str.replaceAll("\r\n", "*"); // \r : �ٹٲ� , \n : �ٹٲٰ� Ŀ���� �� ������ �ű�..
			System.out.print("�Է��� ���ڿ� : " + str);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test01();

	}

}