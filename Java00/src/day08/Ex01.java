package day08;

import java.util.Arrays;

/*
 
	���� 1]
		
		�츮�� �л����� ������ �迭�� �����Ϸ��� �Ѵ�.
		�̸�, ��ȭ��ȣ, �̸����� �迭�� ���·� ����� �����ϰ� - 3����
		�ٽ� �� ���� �����͸� �����ؼ� �迭�� ����� ����ϼ���. - 4��
		3���� �迭 
		[Ŭ����][��][�л��̸�, ��ȭ��ȣ, �̸���]
 */
public class Ex01 {


	public static void main(String[] args) {

		/*String[][][] team = {{{	"A","B","C","D","E","F","G","H","I","J","K","L"},
							{	"010-1111-1111", "010-2222-2222","010-3333-3333",
								"010-5555-5555","010-8888-8888", "010-9999-9999",
								"010-1122-1122", "010-2211-2211","010-3344-3344",
								"010-5533-5533","010-8844-8844", "010-9977-9977"},
							{
								"AA@increpas.com", "BB@increpas.com","CC@increpas.com",
								"DD@increpas.com", "EE@increpas.com", "FF@increpas.com",
								"GG@increpas.com", "HH@increpas.com","II@increpas.com",
								"JJ@increpas.com", "KK@increpas.com","LL@increpas.com"}}};
*/
		String[] name = {	"1��A","1��B","1��C","1��D","1��E",
							"2��F","2��G","2��H","2��I","2��J",
							"3��K","3��L","3��M","3��N","3��O"};
		String[] tel = {	"010-1111-1111", "010-2222-2222","010-3333-3333","010-5555-5555", "010-8888-8888",
							"010-9999-9999", "010-1122-1122","010-2211-2211","010-3344-3344", "010-5533-5533",
							"010-8844-8844", "010-9977-9977","010-1234-5678","010-9874-6541", "010-3578-9512"};
		String[] mail = new String[]{	"AA@increpas.com", "BB@increpas.com","CC@increpas.com",
										"DD@increpas.com","EE@increpas.com", "FF@increpas.com",
										"GG@increpas.com","HH@increpas.com", "II@increpas.com",
										"JJ@increpas.com","KK@increpas.com", "LL@increpas.com",
										"MM@increpas.com","NN@increpas.com", "OO@increpas.com",
										};
		// 1���� �迭 ���� 2���� �迭 �����.
		String[][] team = new String[3][5];
//		String[][] team2 = new String[3][name.length];
//		String[][] team3 = new String[3][name.length];
		// �ݺ����� �̿��� 2������ �迭�ֱ� 1��
		
		for(int i = 0; i<team.length; i++) {//3���� 3��.
//			team[0][i] = name[i];
//			team[0][i] = tel[i];
//			team[0][i] = mail[i];
//	
//				for(int j = 0 ; j<5; j++) { //15���� 15����
//					team[i][j] = name[j];
////						if(j > 0 && j <5) {
////							for(int k = 4; k<10; k++) {
////								team[i][j] = name[k]; 
////							}
////						}
//					}	
//				for(int j = 1 ; j<1; j++) {
//					team[i][j] = tel[j];
//					}
//				for(int j = 2 ; j<1; j++) {
//					team[i][j] = mail[j];
//					}
//				System.out.println(Arrays.deepToString(team));
//				System.out.println(Arrays.toString(name));
//				}
//		System.out.println(Arrays.toString(team));
			
		//2������ �迭�ֱ� 2��
	/*			if(i ==5) {
					for(int j = 0; j<name.length; j++) {
					team[1][j] = name[i];
					team[1][j] = tel[i];
					team[1][j] = mail[i];
					//2������ �迭�ֱ� 3��
						if(j == 5) {
							for(int k = 0; k<name.length; k++) {
								team[2][k] = name[i];
								team[2][k] = tel[i];
								team[2][k] = mail[i];
							}
						}//3�� if�� 
					}
				}//2�� if�� 
	}	// 1�� for�� */
//		[increpas][�л�[1~3]][����[1~3]]
//				[�п�][��][]
//		���� ���� ���� �����
				/*	String[][][] increpas = new String[3][team.length][name.length];
					for(int i = 0; i<team.length; i++) {
//						increpas[i] = team[i];
					}
					System.out.println(Arrays.deepToString(team));*/
		}
	}
}
	

