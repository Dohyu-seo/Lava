package day06;

import java.util.Scanner;

public class Test0000 {

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
	}

}
