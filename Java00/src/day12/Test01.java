package day12;

public class Test01 {

	public static void main(String[] args) {
		Object[] obj = {'A', 10, true};
		// �⺻ ������ Ÿ��������, ��ü Ÿ���� �������� ����ִ�.
		// ==> �̷��� ����� ��찡 �ֱ� ������ ������ class�� ���� �ڹٿ���  Wrapper class�� �������ְ��ִ�.
		// �⺻������Ÿ�Ե��� ��üó�� �ٷ���� ������ Ŭ�����̴�.
		// ��üŸ������ ��������ȯ�� �Ǿ� �迭�� ���� �ȴ�. �� �� �� ��ü���� ObjectŸ������ ���� �Ǿ���
		// �� �ȿ� �ִ� �����ʹ� Object�� �Ǿ���, Object�� �ֻ��� Ŭ�����̸鼭 ��� Ÿ���� �ٷ�� �����̴�.
		
//		System.out.println(obj[1]+5);		// --> Object�� �������� ���ǰ� ���� ������ ���� ���Ѵ�..
		System.out.println((int)obj[1]+5); // --> Object Ÿ�Կ��� ������ ����ȯ�� �ϸ� ����� �����ϴ�
		// ������, Object�� �迭�� ������� � Ÿ���� ����ִ��� �� �� instanceof �� ����Ѵ�.
		
		for(int i = 0 ; i<obj.length; i++) {
			//instanceof ��� �����ڴ� ��ü�� �Ҽ��� ������ �� ����ϴ� ������ �Դϴ�. 
			if(obj[i] instanceof Character) { //Character�� �ν��Ͻ�����- �����.
				System.out.println((char)obj[i] + 5); //Character�� ������ char�� ���� ����ȯ �� ���� ���ؼ� int�� ��ȯ
				System.out.println((char)((char)obj[i] + 5)); //Character�� ������ char�� ���� ����ȯ �� �ٽ� charŸ������ ���� �� ��
			}else if(obj[i] instanceof Integer) { // Integer�� �ν��Ͻ����� �����.
				System.out.println((int)obj[i] + 10); //Integer�� ������ int�� ���� ����ȯ
			}else if(obj[i] instanceof Boolean) { // Boolean�� �ν��Ͻ����� �����.
				System.out.println(obj[i]); // �������� Boolean�̶�� �Ǵ��Ͽ� ��������ȯ ���� ����Ѵ�.
				
			}
		}
		
	}

}
