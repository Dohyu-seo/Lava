package day15;

 import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		Random rand1 = new Random();
		
		for(int i = 0 ; i <10; i++) {
			int rnd = rand1.nextInt(100); // 0 ���� 100������ ������ �߻��ض�.. => ()�ȿ� ���ڱ���
			boolean bRnd = rand1.nextBoolean(); // true, false �����ϰ� ���
			System.out.println("rnd : "+rnd + " , bRnd : "+bRnd); 
		}
		System.out.println();
		Random r1 = new Random(10);// �������̺� , 10�����̺�
		for(int i = 0 ; i <3; i++) {
			int rnd = r1.nextInt(100); // 0 ���� 100������ ������ �߻��ض�.. => ()�ȿ� ���ڱ���
			boolean bRnd = r1.nextBoolean(); // true, false �����ϰ� ���
			System.out.println("rnd : "+rnd + " , bRnd : "+bRnd); 
		}
		// seed ���̺��� ��ȣ�� �����ϰ� �����ؼ� �̾ƿ��� �ٲ�� �Ű�. 
		// �Ʒ� ������ä�� ���� �� longŸ�� seed���� < ����,
		// �ȳ����� �����ϰ� �����ؼ� ������ 
		// --> ������ü�� �Ű������� �������̺� �����͸� ������ ����, �ȳ����� �����ϰ� �����ؼ� �����͸� ������.
		// ==> �ڹٴ� ������ ���� �������� ���ϴ���. ���õǾ��ִ� ���� �������� �������� �� �̴�.
	}

}
