package day07.solv;

import javax.swing.JOptionPane;

/*
 	문제 8]
	
	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고 -- 문자열 배열 3개 [5]
	데이터를 입력해서
	
	회원의 이름을 입력하면
	회원의 이름과 전화번호, 이메일을 출력해주는 프로그램을 작성하세요.	
	JOptionpane.showMessageDiarlog	
 */
public class Solv08 {
	public static void main(String[] args){
		String[] name = {"김소영", "최두용", "정우승", "유태희", "김종형", "임서진"};
		String[] tel = {"010-1111-1111", "010-2222-2222", "010-3333-3333",
						"010-5555-5555", "010-8888-8888", "010-9999-9999"};
		String[] mail = new String[]{"pengsoon@increpas.com", "dDragon@increpas.com",
								"victory@increpas.com", "nobody@increpas.com",
								"bell@increpas.com", "leem@increpas.com"};
		// 만약 임서진이라는 이름을 입력한다면
		// 임서진이 가지는 인덱스를 알아내기 위해
		// name 배열에 각 방에 저장된 데이터를 모두 꺼내서
		// 임서진 이라는 문자열과 비교해서 맞는 경우 name의 해당 인덱스를 기억시켜놓으면 될 것이다.
		
		// 이 때 인덱스를 이거할 변수는
		// 반복문의 블럭 내부에 만들경우 블럭을 빠져나가게 되면
		// 사용할 수 없게 되므로. 따라서 인덱스를 기억할 변수는 반복문의 블럭 밖에다 만들어 둔다.
		// 문자열 입력받고
		String str = JOptionPane.showInputDialog("이름을 입력하세요!");
		
		// 인덱스 기억할 변수 만들어주기
		int idx = -1;
		for(int i = 0; i < name.length; i++) {
			// name 배열에서 str과 같은 문자열이 있는지 검사한다.
			// 이때 주의 사항은 문자열의 데이터 비교는 동등비교연산자를 쓰는것이 아니고
			// 반드시		문자열1.equals(문자열2)로 비교한다.
			
			// 같은 문자열이면 해당 이름의 인덱스를 기억시켜야 할 것이다.
			if(name[i].equals(str)) { // 네임에서 꺼낸 애 하고 str하고 같다면!
				idx = i; // idx에 i를 집어넣으면 해당 인덱스를 기억할 수 있다.
				 // 찾는 사람의 인덱스를 기억했기 때문에  더이상 인덱스를 검색할 의미가 없다.
				// 고로 이 반복문을 종료한다.
				break;
			}
		}
		
		// 이제 인덱스는 알아냈으니 해당 인덱스에 해당하는 정보를 출력해주자
		String msg = "존재하지 않는 팀원입니다.";
		
		//그런데  3팀이 아닌 광호씨 일므이 입력되는 경우는 해당 인덱스를 찾지 못할 것이고
		// 이때 역시 반복문이 모두 실행이 될 것이다.
		// 이 경우는 idx 변수의 값이 교체가 되지 않고 -1로 유지가 될 것이기 때문에
		// idx의 값이 -1인 경우 해당 사람을 찾지 못했다는 의미가 될 것이다.
		// 조건문으로 idx값에 따라서 출력을 해주면 된다.
		if(idx != -1) {//if idx가 -1과 다른 경우 
			// 이 경우 입력한 사람의 인덱스를 찾은경우
			// 이제 인덱스를 알아냈으니 해당 인덱스에 해당하는 정보를 출력해주자
			msg = "name \t: " + name[idx] + 
					"\ntel \t: " + tel[idx] +
					"\nmail \t: " + mail[idx];
		}
		/*else {
			// 입력한 사람의 인덱스를 못찾은 경우 ==> 없는 팀원의 경
			
			//이 경우는 msg에 초기값을 세팅이 되어있으므로
			// 따로 처리해줘야할 작업이 없다다.
		}*/
		JOptionPane.showMessageDialog(null, msg);
	}
}
