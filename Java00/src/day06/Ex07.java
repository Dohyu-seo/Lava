package day06;

import java.util.Arrays;
import java.util.Scanner;

/*
���� 7]
		
		���ڿ��� �Է¹޾Ƽ�
		���ڹ迭�� ���ڿ��� �̷�� ���ڸ� ���������� �����ϼ���.
			"hong"
			-----------------
			|'h'|'o'|'n'|'g'|
			-----------------
		
		����]
			���ڿ��� Ư����ġ�� ���ڸ� �������ִ� �Լ�
			
				���ڿ�.charAt(��ġ��);
		
			���ڿ��� ���̸� ��ȯ���ִ� �Լ�
			
				���ڿ�.length();
			��ȯ���� �����Դϴ�.
			
				Arrays.toSting(); �迭�� ��� �����͸� ���ڿ��� ��ȯ
*/
public class Ex07 {

	public static void main(String[] args) {
		//���� �Է� ���� �غ��ϱ�
		Scanner sc = new Scanner(System.in);
		//�ֿܼ� �Է� ���� ����ϱ�
		System.out.println("���ڸ� �Է��ϼ���. : ");
		//���ڿ� ���� ���� �����
		String cha = sc.nextLine();
//		-------------------------------- 1�� ���� �ޱ�, �Է¹ޱ�
		//���� ���� �迭 �����
		String str[];
		// ���ڿ� �迭�ȿ� �Է¹��� ���� �ֱ�
		str = new String[] {cha};  
		//���ڿ��� Ư����ġ�� ���ڸ� �������ִ� �Լ� �����
		System.out.println("�迭�� ��� ������ : "+Arrays.toString(str)); 
		System.out.println("���ڿ��� ���� : "+cha.length());
		// ���ڿ��� ���̸�ŭ �ݺ��ϴ� for��
		System.out.println("--------------------");
		for(int i = 0; i<cha.length(); i++) { 
			//�Է¹��� ���ڿ��� �迭�� ���������� ����ϱ�
			System.out.print("|'"+cha.charAt(i)+"'|");
				
		}	System.out.println();
		System.out.println("--------------------");
		
	}
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�ֿܼ� �Է� ���� ����ϱ�
		System.out.println("���ڸ� �Է��ϼ���. : ");
		//���ڿ� ���� ���� �����
		String word = sc.nextLine();
		char[] array_word = new char[word.length()]; // ��Ʈ���� ���� �迭

		for(int i=0;i<array_word.length;i++){ 
			array_word[i]=(word.charAt(i));//��Ʈ���� �ѱ��ھ� ���� �迭�� ����
			System.out.print("|"+array_word[i]+"|"); //���
		}
	}*/

}
