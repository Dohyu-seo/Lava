package exam;

import java.util.*;

import javax.swing.JOptionPane;

/*
 	President Trump said Sunday that the federal government��s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.
 	He had clashed with public health experts around the country when he suggested that the guidelines  which_urge people to stay at home and not to gather in groups of more than 10_might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion.
 
 	�ܾ� ������ ���ڿ��� �߶�
 	�ܾ� ���̰� ���� �� �ܾ��� ���ڼ��� �ܾ ����ϼ���.
 	
 	��, ,�� . �׸��� ?, - �� �ܾ�� ���� �Ѵ�.
 */
public class Ex02 {
	String[] tmp1;
	public Ex02() {
		String str = "President Trump said Sunday that the federal government��s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.\r\n He had clashed with public health experts around the country when he suggested that the guidelines  which_urge people to stay at home and not to gather in groups of more than 10_might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion." ; 
		
		/*
		 	���� ]
		 		
		 		���� ��κ��� ���� ���ڿ� ��ü�� �����ϴ� ����� ����.
		 		�����ϴ� �۾��� �ϴ� �Լ����� ���� ����� ��ȯ�ϴ� ��ɸ� ������ �ִ�.
		 */
		
		// ��ȯ���� Ư������ ���ֱ�
		String tmp = str.replaceAll(",","").replaceAll("\n","").replaceAll("\\.","").replaceAll("\\?","").replaceAll("-", "");
		// Ȯ���� ���
		System.out.println(tmp);
		
		// split�̿��� ����������� �迭�� ���
		tmp1 = str.split(" ");
		System.out.println(Arrays.toString(tmp1));
		// �迭 �ѱ��� Ȯ���ϱ�.
		System.out.println(tmp1.length);
		
		
		for(String cnt : tmp1) {
			System.out.println(cnt);
		}
		// ���̶� �ܾ� ���� ���� �����
		int len = 0;
		String word ="";
		for(int i = 0 ; i<tmp1.length; i++) {
			String daneo = tmp1[i];
			int gilee = daneo.length();
			
			if(len<gilee) {
				len = gilee;
				word = daneo;
			}
			
		}
			JOptionPane.showMessageDialog(null, "���� �� ���� ���� : "+len+"\n ���ϱ� ���� : "+word);
		
//		----------------------------------------------------
/*		// ���� �ܾ ������ �������� ArrayList�� ����
		// �ݿ��ϳ� �츮�� ���� ���� ����� �ϳ� ����µ� �װ��� StringTokenizer �̴�.
		StringTokenizer token = new StringTokenizer(tmp);
		// ���� ������ �������� �߷��� �ܷΰ��� ���۸޸𸮿� ������ �Ǿ������Ƿ� �ϳ��� ������ ������ �ǰڴ�.
		// ����� ArrayList�� ����� ���������� �ʾƵ� ���� �� �����Ƿ� �״�� ����.
		
		// ArrayList �����
		ArrayList list = new ArrayList();
		
		// token���� �ϳ��� ������ ä������.
		while(token.hasMoreTokens()) { // ���� ���۸޸𸮿� ���� �����Ͱ� �����ִ°�??
			list.add(token.nextToken());
		}
		
		for(Object obj : list) {
			System.out.println((String) obj+"####");
		}
		
		// ���� ����Ʈ�� ����ִ� �ܾ���� ���̸� �̾Ƽ�
		// ���� �� �ܾ��� ���̿� �ܾ ����Ѵ�.
		
		// ���� ���� �� �ܾ��� ���̿� �ܾ ������ ������ �����
		int len = 0;
		String  word = "";
		for(int i = 0; i<list.size(); i++) {
			String daneo = (String)list.get(i); //list i��°�� �迭 ������ daneo�� ���
			int gilee= daneo.length(); // daneo�� ������ ������ gilee�� ���
			
			if(len < gilee) {	// len�� ������ ��������� ū ���� ä������ �ȴ�.
				len = gilee; // ���̴� len�� ���
				word = daneo; // �ܾ�� word�� ��´�.
			}
		}
		
		// ���� ���� �� �ܾ��� ���̿� �ܾ �����Ǿ����� ���������
		JOptionPane.showMessageDialog(null, "���� �� �ܾ��� ���� : " + len + "\n ���� �� �ܾ� : " + word);
	*/
	}
	
	public static void main(String[] agrs) {
		new Ex02();
	}
}
