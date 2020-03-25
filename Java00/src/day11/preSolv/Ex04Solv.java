package day11.preSolv;

public class Ex04Solv {
	
	public Ex04Solv() { // �������Լ�( �Ű������� �ϳ��� ���� )
	
		//���� �ټ����� �̸��� ������ �迭�� ������.
		String[] name = {"������","�ڱ���","������","�ڱ�ȣ","����ö"};
		
		// �ټ����� �����͸� ������ �迭�� �����.
		Stud[] ban = new Stud[5];
		
		
//		ban = setArr(ban, "������", "�ڱ���", "������", "�ڱ�ȣ", "����ö");
		ban = setArr1(ban, name);

		// �Լ������� 1�� �迭ó�� ���Ǵ°� �����μ��� Ư¡
		
		// �迭�� �ϼ��� �Ǿ���
		// �����غ���.
		
		ban = setSort1(ban);
		
		
		// ����Ѵ�.
		System.out.printf("%4s : %3s | %3s | %3s | %3s | %3s | %4s | %5s\n","��  ��", "��  ��", "��  ��", "��  ��", "��  ��", "��   ��", "��   ��", "��   ��");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for(int i = 0; i < ban.length; i++) {
			ban[i].toPrint();
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		setArr(ban, name); // ������ �Լ��� �ٽ� ȣ���Ѵ�.
		setSort(ban);
		// ����Ѵ�.
		System.out.printf("%4s : %3s | %3s | %3s | %3s | %3s | %4s | %5s\n","��  ��", "��  ��", "��  ��", "��  ��", "��  ��", "��   ��", "��   ��", "��   ��");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for(int i = 0; i < ban.length; i++) {
			ban[i].toPrint();
		}
	}
	
	// �����μ��� �̸��� �Է¹޾Ƽ� �迭�� �������ִ� �Լ��� ����� ����.
	// �׷��� �����μ��� �տ� �Ϲ� ������ �͵� ��������� �ڿ� ���� ����� �ȉ´�.
	public Stud[] setArr1(Stud[] s, String...name) {
		for(int i = 0; i < name.length; i ++) {
			s[i] = new Stud(name[i]);
		}
		return s;
		// Stud[] s �� ��ȯ���� �����ؼ� name �� ������ŭ Stud�� �޾Ƽ� ��ȯ���ش�.
	}
	
	
	public void setArr(Stud[] s, String...name) {
		for(int i = 0; i < name.length; i ++) {
			s[i] = new Stud(name[i]);
		}
		// Stud[] s �� ��ȯ���� �����ؼ� name �� ������ŭ Stud�� �޾Ƽ� ��ȯ���ش�.
	}
	
	// Stud Ÿ���� �迭�� �Է����ָ� �������ִ� �Լ��� ������.
	public Stud[] setSort1(Stud[] s) {
		for(int i = 0 ; i < s.length-1; i++) {
			for( int j = i+1; j <s.length; j++) {
				if(s[i].getSum() < s[j].getSum()) {
					Stud tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
//					int tmp = s[i].getSum();
//					s[j].getSum() = tmp; ==> ��� �Ұ� ������ �� ���� �� ���Ѱ��ε�, �����ؼ� �����ϴ°�.
				}
			}
		}
		return s;
	}
	public void setSort(Stud[] s) {
		for(int i = 0 ; i < s.length-1; i++) {
			for( int j = i+1; j <s.length; j++) {
				if(s[i].getSum() < s[j].getSum()) {
					Stud tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex04Solv();
		
	}


}
