package day07;

public class Ex01 {

	public static void main(String[] args) {
		//배열 만들고
		char[] rpa1 = new char[10];
		char cha = 'A' +10;
		char cha2 = 'a'-'A';
		char[] rpa2;
		//배열에 알파벳 담기
		for(int i=0 ; i<rpa1.length; i++) {
			//랜덤한 알파벳만들기
			int random = (int)(Math.random()*(cha-'A'+1)+'A');
			//원본배열에 랜덤한 알파벳 담기
			rpa1[i] = (char)random;
			//원본배열 출력해보기
			System.out.print(rpa1[i]);
			// 얕은복사
			rpa2 = rpa1;
			// 원본배열과 얕은배열 출력 및  원본배열 소문자로 바꾸기
			if(i==9) {
				System.out.println();
				System.out.println("원본배열 출력이 끝났습니다.");
				System.out.println(rpa2);
				System.out.println("얕은복사가 완료되었습니다.");
				// 원본배열 소문자로 바꿔넣기
				for(int j=0; j<rpa1.length; j++) {
				//소문자로 바꾸는 계산식.
					rpa1[j] +=(char)cha2;
				//출력하기
				}
				System.out.println("***이제 소문자로 변경된 원본배열을 출력합니다.***");
				System.out.println(rpa1);
				System.out.println("수정된 원본배열 출력이 끝났습니다.");
				// 얕은복사된 배열 다시 출력하기
				System.out.println(rpa2);
				System.out.println("얕은복사된 배열을 다시 출력했습니다.");

			}
			
		}
		
	}

}
