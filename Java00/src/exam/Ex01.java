package exam;
import java.util.Arrays;

/*
  	JOptionPane���� ���ڸ� �Է¹޾Ƽ�
  	�迭�� ����� �迭�� ����� �� �ִ� ������ŭ ���ڸ� �Է¹޾Ƽ�
  	�� ���ڵ��� ���� �����ִ� ���α׷��� �ۼ��ϼ���.
  	��, ���� ���ϴ� ����� �Լ��� ���� ó���ϼ���. 
 */
import javax.swing.JOptionPane;
public class Ex01 {
	// �Լ� ����� �� �� ����
	int sum;
	// �Լ����� ���� ���� �迭 
	int[] arr;
	// ���� �Է��� ����
	String str;
	
	
	public Ex01() {
		
		//	���� ������ �� ���ڸ�ŭ �迭�� ���� �� �ȿ� ���� 5�� �ְ� �����ִ� ���α׷�
		
		//����ó�� �ݺ��ϱ�
		while(true) {
			 str = JOptionPane.showInputDialog(" �迭 ���̸� �Է��ϼ���");
			//����ó�� �ֱ�
			try {
				//	�迭���� �����ϱ�
				arr = new int[Integer.parseInt(str)];
			//�迭 ���� ���� �Է¹ޱ�
			
			 break;
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "����(����)�� �Է��ϼ���.");
				continue;
			}
			
		}


//		 �迭���̸�ŭ ���� �ֱ�
//		for(int i = 0;i<arr.length; i++) {
//			String str2 = JOptionPane.showInputDialog("�迭�� ��� ���� ������ �Է��ϼ���.");
//			arr[i] = Integer.parseInt(str2);
//		}
		
		setSum(arr);
		
	}
	// �迭�� ��� ���� ����ϴ� �Լ� �����
	public int[] setSum(int[] arr) {
		// ��������
		this.arr = arr;
		//���� ���� ����
		int sum = 0;
		// �����Լ� �ϳ��� ���ϱ�
		for(int i = 0; i<arr.length; i++) {
			String str2;
			try {
			str2 = JOptionPane.showInputDialog("�迭�� ��� ���� ������ �Է��ϼ���.");
			arr[i] = Integer.parseInt(str2);
			sum = arr[i]+sum;
			continue;
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "����(����)�� �Է��ϼ���.");
				i--;
				continue;
			}
						
		}
		JOptionPane.showMessageDialog(null, sum);
		
		
		return  this.arr;
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
