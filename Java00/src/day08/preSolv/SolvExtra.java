package day08.preSolv;

import javax.swing.JOptionPane;

public class SolvExtra {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("영문을 입력하세요.");
		// 할일 
		// 0. 문자열에 포함된 문자로 이루어진 문자열을 만든다.
		String tmp = ""; // 새로운 문자가 나오면 여기에 덧붙일 것임.
		loop:
		for(int i =0; i<str.length(); i++) {
			char imsi = str.charAt(i);
			// tmp에 같은 문자가 있는지 검사하고 없으면 더해준다.
			for(int j = 0; j <tmp.length(); j++) {
				if(imsi == tmp.charAt(j)) {
					continue loop;
				}
			}
			tmp = tmp + imsi;
		}
		// 1. 포함되어 있는 문자의 가지수를 구한다.
		int cnt = tmp.length();
		// 포함된 문자의 배열을 만들 수 있게 되었으므로 문자배열과 카운트 배열을 만들면된다.
		char[] ch = tmp.toCharArray(); // 포함된 문자를 저자할 배열
		// 문자 배열을 문자의 아스키코드가 작은 순으로 정렬한다.
		for(int i = 0; i < ch.length-1; i ++) { // 맨 마지막에 있는 것은 꺼내올 필요가 없기에 length-1한다.
			for( int j = i + 1; j<ch.length; j++) {// 다음회차부터 확인할 것이기 때문에 i+1을 붙인다.
				if(ch[i] > ch[j]) { // 확인할 문자가 꺼내온 무낮보다 크면! 정렬.
					char c = ch[i]; //기억시키기
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
		}
			//카운트 저장할 배열
		int[] count = new int[cnt]; // 포함된 문자의 출현빈도를 저장할 배열
		// 2. 문자마다 출현하는 카운트를 구해준다.
		for(int i = 0; i < ch.length; i++) { // 문자배열에 있는 것중 하나씩 꺼내서 몇번 있는지 카운트해준다.
			char c = ch[i]; // 기억시키기
			for(int j = 0; j < str.length(); j++) {
				if(c == str.charAt(j)) {
					count[i] += 1;
				}
			}
		}
		// 3. 출력한다.
		
		//buff : Heap에 하나의 문자열을 만들고 그 안에서 문자열을 연산하는 함수.< 메모리 관리하기가 좋음.
		// Heap 영역에 메모리를 늘리지 않고 원래있는 문자열을 연산해 주는  함수
		// append : 맨 뒤에 덧붙인다는 buff의 함수
		StringBuffer buff = new StringBuffer();
				for(int i = 0; i < ch.length; i++) {
					buff.append(" ");
					buff.append(ch[i]);
					buff.append("\t : ");
//					System.out.printf("%3c : ", ch[i]);
					for(int j = 0; j <count[i] ; j++) {
//						System.out.print("*");
						buff.append("*");
					}
					buff.append("\n");
//					System.out.println();
				}
				JOptionPane.showMessageDialog(null, buff.toString());
						// buff를 문자열 함수로 변경시켜서 사용해야 하므로 toString함수를 쓴다.
	}
}