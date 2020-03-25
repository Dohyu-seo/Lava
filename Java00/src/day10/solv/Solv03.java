package day10.solv;
/*

문제 2]
	
	10개의 과목의 점수를 입력할 배열을 만들고 (배열의 길이는 10으로 한다.)
	그 배열에 담긴 정수의
	총점, 평균을 구해서 출력해주는 프로그램을 작성하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수를 제작해서 처리하세요.


*/
public class Solv03 {
	
	// 클래스에 배열 선언~
	int[] stuList = new int [10];
	
	//초기화 받을 변수 만들기!
	int toSum;
	int toAvg;
	
	//생성자 함수 꼭 만들어 주기****
	public Solv03(){
		
	}
	//총점구하는 함수
	public void sum() {
		
		for(int i= 0; i<stuList.length; i++) {
			stuList[i] = (int)(Math.random()*(100-0+1));
			
		}
	}
	//평균 구하는 함수
	public void avg() {
		
	}
	//출력해주는 함수
	public void toPrint() {
		
	}
	//메인함수
	public static void main(String[] args) {
		new Solv03();
	}
}
