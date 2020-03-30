package exam;

import java.util.*;

import javax.swing.JOptionPane;

/*
 	President Trump said Sunday that the federal government’s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.
 	He had clashed with public health experts around the country when he suggested that the guidelines  which_urge people to stay at home and not to gather in groups of more than 10_might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion.
 
 	단어 단위로 문자열을 잘라서
 	단어 길이가 제일 긴 단어의 글자수와 단어를 출력하세요.
 	
 	단, ,와 . 그리고 ?, - 는 단어에서 제외 한다.
 */
public class Ex02 {
	String[] tmp1;
	public Ex02() {
		String str = "President Trump said Sunday that the federal government’s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.\r\n He had clashed with public health experts around the country when he suggested that the guidelines  which_urge people to stay at home and not to gather in groups of more than 10_might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion." ; 
		
		/*
		 	참고 ]
		 		
		 		거의 대부분의 언어에서 문자열 자체를 변경하는 기능은 없다.
		 		변경하는 작업을 하는 함수들은 변경 결과를 반환하는 기능만 가지고 있다.
		 */
		
		// 반환값에 특수문자 없애기
		String tmp = str.replaceAll(",","").replaceAll("\n","").replaceAll("\\.","").replaceAll("\\?","").replaceAll("-", "");
		// 확인차 출력
		System.out.println(tmp);
		
		// split이용해 공백기준으로 배열에 담기
		tmp1 = str.split(" ");
		System.out.println(Arrays.toString(tmp1));
		// 배열 총길이 확인하기.
		System.out.println(tmp1.length);
		
		
		for(String cnt : tmp1) {
			System.out.println(cnt);
		}
		// 길이랑 단어 담을 변수 만들기
		int len = 0;
		String word ="";
		for(int i = 0 ; i<tmp1.length; i++) {
			String daneo = tmp1[i];
			int gilee = daneo.length();
			
			if(len<gilee) {
				len = gilee;
				word = daneo;
			}
			
		}
			JOptionPane.showMessageDialog(null, "제일 긴 문자 길이 : "+len+"\n 제일긴 문자 : "+word);
		
//		----------------------------------------------------
/*		// 이제 단어를 공백을 기준으로 ArrayList에 담자
		// 금요일날 우리는 아주 편한 기능을 하나 배웠는데 그것이 StringTokenizer 이다.
		StringTokenizer token = new StringTokenizer(tmp);
		// 이제 공백을 기준으로 잘려진 겨로가가 버퍼메모리에 저장이 되어있으므로 하나씩 꺼내서 담으면 되겠다.
		// 참고로 ArrayList는 사이즈를 지정해주지 않아도 만들 수 있으므로 그대로 담자.
		
		// ArrayList 만들고
		ArrayList list = new ArrayList();
		
		// token에서 하나씩 꺼내서 채워넣자.
		while(token.hasMoreTokens()) { // 아직 버퍼메모리에 꺼낼 데이터가 남아있는가??
			list.add(token.nextToken());
		}
		
		for(Object obj : list) {
			System.out.println((String) obj+"####");
		}
		
		// 이제 리스트에 들어있는 단어들의 길이를 뽑아서
		// 제일 긴 단어의 길이와 단어를 출력한다.
		
		// 먼저 제일 긴 단어의 길이와 단어를 저장할 변수를 만들고
		int len = 0;
		String  word = "";
		for(int i = 0; i<list.size(); i++) {
			String daneo = (String)list.get(i); //list i번째의 배열 꺼내서 daneo에 담기
			int gilee= daneo.length(); // daneo의 길이인 정수를 gilee에 담기
			
			if(len < gilee) {	// len의 정수엔 결과값보다 큰 값만 채워지게 된다.
				len = gilee; // 길이는 len에 담고
				word = daneo; // 단어는 word에 담는다.
			}
		}
		
		// 이제 제일 긴 단어의 길이와 단어가 결정되었으니 출력해주자
		JOptionPane.showMessageDialog(null, "제일 긴 단어의 길이 : " + len + "\n 제일 긴 단어 : " + word);
	*/
	}
	
	public static void main(String[] agrs) {
		new Ex02();
	}
}
