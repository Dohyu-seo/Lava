package day02;
/*
 숙제]
	1년은 365.2426일이다.
	이 날짜는 과연 며칠 몇시간, 몇분, 몇초인지 계산해서 출력하세요.
*/
public class Sol01 {

	public static void main(String[] args) {
		double data = 365.2426;
		//1. 날짜를 계산한다
		int day = (int)data; // data -(date % 1);
		// 2. 떨어지는 날짜 이외의 데이터를 초로 환산한다.
		int sec = (int)((data % 1 )* 24 * 60 * 60); // (data% 1) *
		// 0.2426일 => 0.2426*24(시간)
		// 		   => 0.2426 * 24 * 60 (분)
		//         => 0.2426 * 24 * 60 * 60(초)
		
		int hour = sec / 3600;
		
		sec %= 3600; // sec = sec % 3600;
		
		int min = sec / 60;
		sec = sec % 60;
		
		System.out.print("일년은  " + day + " 일, " + hour + " 시간 ");
		System.out.print(min + " 분 "+ sec + "초 입니다.");
	}

}
