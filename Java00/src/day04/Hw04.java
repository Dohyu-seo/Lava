package day04;

/*
	�� ����� ����� �ϴµ�
	�� ����� ���� �����  0.54m/s �����ϰ�
	�� ����� ���󿡼� 1.07m/s�������� �����ߴ�.
	
	���� ���̰� 7564m��� �����ϰ�
	�� ����� ������ �ð��� ��� ���� �������� ���̸� ������ִ� ���α׷��� �ۼ��ϼ���.
	�ð� = �Ÿ�/�ӷ�
	�ӷ� = �Ÿ�/�ð�
	�Ÿ� = �ӷ�*�ð�
	
	
	1�� 2�� ������ �ð� : i++ , i * 1.07 / i++ , i * 0.54 => % == 0 �϶� ����.
	 1�� 0���� �ʴ� 0.54�� 7564���� ����
	 2�� 7564���� �ʴ� 1.07�� 0���� ����. ������ ���ض� 
	 ��i ��� �Ѵ�. 
 */
public class Hw04 {
	
public static void main(String[] args) {
		
	double mount = 7564;
	double people1 = 0; // ���� ��ġ  +0.54
	double people2 = 7564; // ������ ��ġ - 1.07
	
//	for( people1=0; people1=<people2; people1++) {
		
		for(people2=7564; people2>=people1; people2--) {
			
			if(people1 == people2) {
				
				System.out.println(people1);
				break; 
			}
		}
	}
//	for(mount=1; mount<7564; mount++ ) {
//	
//			people1 /= mount; 14007
//			people2 /= mount; 7069
//			
//		if() {
//			System.out.println(people1+"<-1      2->"+people2);
//			System.out.println(mount);
//			break;
//		}
//	}
//	
	
//	����ƾ�� i�� �ΰ� 1�� ������Ų �� 
//	������ ������ ����ƾ�� ������ �� 0�� �Ǵ� ��ġ
//
//		//�� ���� �����
//		double people1 = 0.54;
//		double people2 = 1.07;
//		// �� ���� ���� �����
//		double mount = 7564;
//		double time1 = mount/0.54; // 1���� ������� ���� �ð�
//		System.out.println(time1);
//		double time2 = mount/1.07; // 2���� �������� �ð�.
//		System.out.println(time2);
//		double no1 = time1-time2;
//		double no2 = time2-time1;	
//		System.out.println("�������»���� �ö󰡴� ����� ���� �� " +no1);
//		System.out.println("�ö󰡴»���� �������� ����� ���� �� " +no2);
//		System.out.println("�������»���� �ö󰡴� ����� ���� �� �� �� " +(int)no1);
//		int sum = (int)(no1/360) ;		
//		System.out.println("������ �ð��� ������ �ٲٸ�"+sum+"��");
//		int str = sum;
//		
//		// �ð�.�Ҽ��� -�ð� , * 60 = ��.�Ҽ��� - ���� ��, *60 = �� . �Ҽ� - ���� �� == �ð� �� �� ����.  
//		2���� ���󿡼� �������� �ð��� 1�ð� 57�� 49���̴�			7069-- < 
//		1���� ������� �ö󰣴� �ð��� 3�ð� 53��27�� �̴�. 		14007
//}
//}	
}
