package day08.preSolv;

import java.util.Arrays;

/*
	문제 4]
			전화번호를 입력하면 '-'를 기준으로 데이터를 분리해서 저장할 배열을 만들고
			분리 된 데이터를 순서에 맞게 입력하고 출력하세요.
			indexOf();
			substring();
*/		
import javax.swing.*;
public class Solv04 {

	public static void main(String[] args) {
		// 전화번호는 xxx-xxxx-xxxx의 형식으로 입력 받을 것이고
		
		// 이 번호를 문자열로 저장하고
		/*(꼭 문자열로 저장해야하는 이유 : 마이너스 연산을 한다, 즉 마이너스라는 형태를 쓸 수 없다)
		 (숫자 맨 앞자리는 0이 오면 보이지 않는다.)*/
		// 문자열중에 -의 갯수만큼 반복해서
		// 번호를 나누고 배열에 저장하면 된다.
		
		// 1. 먼저 입력받아서 변수에 저장하고
		String phone = JOptionPane.showInputDialog("전화번호를 입력해주세요.");
		// 2. '-'의 갯수를 카운트하고 숫자타입이 아닌 것만 카운트해서 +1 해주면 되고
		// for문 안에 넣으면 for문 종료와 함께 카운트가 사라지니 for문 밖에 만들어둔다.
		int cnt = 0;
		for(int i=0; i<phone.length(); i++) {
			char ch = phone.charAt(i);
			if(ch < '0' || ch > '9')++cnt; // ASCII는 0부터 9까지 1씩증가한다. 1부터 10까지가 아니다.
		}
		
		// 3. 분리된 문자열을 입력할 배열을 만들고
		// ==> 전화번호를 분리하게 되면 '-' 개수보다 1개가 더 많은 문자열로 분리가 된다.
		String[] arr = new String[cnt + 1];
		
		// 4. 배열의 문자열을 짤라서 입력하고
		// 잘려진 문자열을 저장할 변수(작업할 변수)를 만든다.
		// 처음에는 전체 문자열이 모두 저장되어야 될 것이다
		String tmp = phone; // < 전체 문자열
		int idx = 0;
		for(int i = 0; i < cnt; i++) {
			// '-' 의 인덱스를 알아낸다. indexOf를 이용해 처음나오는 '-' 의 인덱스를 알아낸다.
//			idx = tmp.indexOf('-');
			//간혹 반장님 같은 전문가는 - 를 넣지 않고 ) 지역번호를 구분하는 경우가 있다.
			for(int j= 0; j<tmp.length(); j++) {
				if(tmp.charAt(j)< '0' || tmp.charAt(j)>'9') {
					idx = j;
				break;
				}
			}
			
			// 이제 '-'의 인덱스를 알아냈으니
			// '-' 이전까지의 문자열을 추출해내면 된다.
			arr[i] = tmp.substring(0,idx); //*idx위치의 인덱스는 포함시키지 않는다.
			/*			주의]
				시작위치는 0부터 카운트를 하고 
				종료위치는 반환 문자열에서 제외되서 반환된다.
				종료위치 전 문자까지만 추출해서 반환해준다.
				*/
			//이제 뒷 번호를 다시 짤라서 tmp에다 저장해놓고
			// 다시 위의 명령들을 반복하면 된다. 
			tmp = tmp.substring(idx+1); // 시작위치만 정해주면 그 위치부터 맨 뒤까지 뽑아준다.
			
			
		}
		
		arr[cnt] = tmp;
		// 5. 출력하고
		JOptionPane.showMessageDialog(null,"입력한 번호 : "+phone+
										"\n 분리해놓은 배열 : "+ Arrays.toString(arr));
		
		
	}

}
