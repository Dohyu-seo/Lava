package day10.solv;

public class Solv04_01 {
	public static void main(String[] args) {
		String[] name = {"�ڱ�ȣ", "�ڱ���", "��ȫ��", "��ҿ�", "������"	};
		Solv04[] ban = new Solv04[5];
		for(int i = 0; i < ban.length; i++) {
			ban[i] = new Solv04(name[i]);
		}
		
		//��� ���� �ݺ��ؼ� ����ϴ� ����� �Լ��� ȣ�����ָ�ȴ�.
		for(int i =0; i<ban.length; i++) {
			ban[i].toPrint();
		}
	
	}
}
