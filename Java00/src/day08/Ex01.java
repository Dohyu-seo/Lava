package day08;

import java.util.Arrays;

/*
 
	문제 1]
		
		우리반 학생들의 정보를 배열로 관리하려고 한다.
		이름, 전화번호, 이메일을 배열의 형태로 만들어 관리하고 - 3종류
		다시 팀 별로 데이터를 정리해서 배열을 만들고 출력하세요. - 4팀
		3차원 배열 
		[클래스][팀][학생이름, 전화번호, 이메일]
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
		String[] name = {	"1팀A","1팀B","1팀C","1팀D","1팀E",
							"2팀F","2팀G","2팀H","2팀I","2팀J",
							"3팀K","3팀L","3팀M","3팀N","3팀O"};
		String[] tel = {	"010-1111-1111", "010-2222-2222","010-3333-3333","010-5555-5555", "010-8888-8888",
							"010-9999-9999", "010-1122-1122","010-2211-2211","010-3344-3344", "010-5533-5533",
							"010-8844-8844", "010-9977-9977","010-1234-5678","010-9874-6541", "010-3578-9512"};
		String[] mail = new String[]{	"AA@increpas.com", "BB@increpas.com","CC@increpas.com",
										"DD@increpas.com","EE@increpas.com", "FF@increpas.com",
										"GG@increpas.com","HH@increpas.com", "II@increpas.com",
										"JJ@increpas.com","KK@increpas.com", "LL@increpas.com",
										"MM@increpas.com","NN@increpas.com", "OO@increpas.com",
										};
		// 1차원 배열 넣을 2차원 배열 만들기.
		String[][] team = new String[3][5];
//		String[][] team2 = new String[3][name.length];
//		String[][] team3 = new String[3][name.length];
		// 반복문을 이용한 2차원에 배열넣기 1팀
		
		for(int i = 0; i<team.length; i++) {//3바퀴 3팀.
//			team[0][i] = name[i];
//			team[0][i] = tel[i];
//			team[0][i] = mail[i];
//	
//				for(int j = 0 ; j<5; j++) { //15바퀴 15정보
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
			
		//2차원에 배열넣기 2팀
	/*			if(i ==5) {
					for(int j = 0; j<name.length; j++) {
					team[1][j] = name[i];
					team[1][j] = tel[i];
					team[1][j] = mail[i];
					//2차원에 배열넣기 3팀
						if(j == 5) {
							for(int k = 0; k<name.length; k++) {
								team[2][k] = name[i];
								team[2][k] = tel[i];
								team[2][k] = mail[i];
							}
						}//3팀 if문 
					}
				}//2팀 if문 
	}	// 1팀 for문 */
//		[increpas][학생[1~3]][정보[1~3]]
//				[학원][팀][]
//		팀을 넣을 구단 만들기
				/*	String[][][] increpas = new String[3][team.length][name.length];
					for(int i = 0; i<team.length; i++) {
//						increpas[i] = team[i];
					}
					System.out.println(Arrays.deepToString(team));*/
		}
	}
}
	

