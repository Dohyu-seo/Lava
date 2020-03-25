package day07;

import javax.swing.JOptionPane;

/*
	문제 4]
		전화번호를 입력하면 '-'를 기준으로 데이터를 분리해서 저장할 배열을 만들고
		분리 된 데이터를 순서에 맞게 입력하고 출력하세요.
		indexOf();
		substring();
*/
public class Ex04 {
	public static void main(String[] args) {
		
		//전화번호 저장할 배열만들기 -> 배열에 int가 아닌 String으로 3분할로 나눈다.
		String tel[] = new String[3];
		//입력받을 준비하고
		String Stel = JOptionPane.showInputDialog("전화번호를 적어주세요 )\n 작성법 : 000-0000-0000");
//		3. indexOf(문자)
//		: 문자열에서 해당 문자가 위치하는 위칫값을 반환
//		5. substring()
//		: 문자열 중에서 원하는 문자열만 뽑아서 반환해주는 함수
		int idx = Stel.indexOf('-');
		tel[0] = Stel.substring(0, idx);
		String tmp = Stel.substring(idx+1);
		//idx 초기화
		idx = tmp.indexOf('-');
		//'-'부터  두 번째 '-'까지 
		tel[1] = tmp.substring(0,idx);
		// '-'부터 마지막까지.
		tel[2] = tmp.substring(idx+1);
		JOptionPane.showMessageDialog(null, tel);
		
	}
}
