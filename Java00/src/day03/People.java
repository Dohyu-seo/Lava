package day03;

public class People {

	public People() {
			int no = 1001;
			String[] id = {"sung", "han", "son", "soo", "jin"};
			String pw = "12345";
			String[] name = {"김성현","이한철","손은진","김수진","이진수"};
			String[] tel = {"010-1234-5678","010-2345-6789","010-9876-3541","010-1111-1111","010-0101-1101"};

			int no1 = 2001;
			String[] id1 = {"pengsoon", "doo", "tae", "winner", "jh", "lim"};
			String[] name1 = {"김소영","반장님","김태희","정우승","김종형","임세진"};
			String[] tel1 = {"010-7777-7777","010-2222-2222","010-3333-3333","010-5555-5555","010-8888-8888","010-9999-9999"};
								
			Member[][] team1 = new Member[4][6]; // class를 불러오는 변수.
				
				//1team
				for(int i = 0; i < 5; i++) { 
					// i를 배열에 담아서 , i번째의 배열에 나올것을 정의해줌 변수[수]
					team1[0][i] = new Member(no++, id[i], pw, name[i], tel[i]);
		}
				//2team 
				for(int i = 0; i < 6; i++) { 
					// i를 배열에 담아서 , i번째의 배열에 나올것을 정의해줌 변수[수]
					team1[1][i] = new Member(no++, id1[i], pw, name1[i], tel1[i]);
		}		 
				System.out.println("----------------------------------------\n");
				for(int j = 0; j<2; j++) {
					System.out.println("\n----------------------------------------");
					System.out.print("| ");
					for(int i = 0; i< team1[j].length ; i++) {
						if(j == 0 && i == 5) {
								continue;
						}
						System.out.print(team1[j][i].name + " | ");
					}
				}
				System.out.println();
				System.out.println("----------------------------------------");
	}
 
	public static void main(String[] args) {
		new People();

	}
	
}
