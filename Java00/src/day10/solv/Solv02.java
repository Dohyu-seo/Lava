package day10.solv;


/*
	
문제 2]
	
	10개의 과목의 점수를 입력할 배열을 만들고 (배열의 길이는 10으로 한다.)
	그 배열에 담긴 정수의
	총점, 평균을 구해서 출력해주는 프로그램을 작성하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수를 제작해서 처리하세요.

*/

public class Solv02 {
	
	//전역 변수 선언
	Solv02[] ary;
	
	//총점, 평균 계산
	int gibon;
	int sum;
	int avg;
	//총점과 평균값 구할 클래스 만들기
	public void sumAar() {
		//정수담긴 배열 가져오기
//		array();
		//총점 만들기
		for(int i = 0; i<ary.length; i++) {
			
		}
		
		
	}
	public void avgAar() {
		
	}
	
	public void setPrint() {
		System.out.println();
		System.out.println("--------------");
		System.out.printf("점수 : %3d \n 총점 : %3d \n 평균 : %3d \n ",gibon, sum,avg);
		System.out.println("--------------");
	}
	
	// 배열에 점수 담기
	/*public void array(){
		//배열 길이 초기화
		ary = new Solv02[10];
		// 입력받을 준비
		for(int i = 0 ; i <ary.length; i ++) {
			ary[i] = new Solv02();
			//랜덤 숫자 만들기
			Solv02 random = (Solv02)(Math.random()*(10 - 1 + 1)+1);
			//랜덤값 평균 총점에 적용하기
			ary[i] = random;
			
		}
	}*/
	public static void main(String[] args) {
		Solv02 save = new Solv02();
		
//		save.array();
//		
//		for(int i = 0; i<save.ary.length; i++) {
//			save.ary[i].setPrint();
//		}
//	
	}

}
