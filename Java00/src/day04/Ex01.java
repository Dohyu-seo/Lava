package day04;

/*
 	4자리 숫자로 된 년도를 입력받아서
 	윤년인지 평년인지 판단해서 출력하세요.
 	단, switch ~ case 구문으로 처리하세요.
 */
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		//변수선언
		Scanner sc;
		int year;
		
		
		//1. 입력받을 준비
		sc = new Scanner(System.in);
		//메세지출력
		for(;;){
		System.out.println("검색할 4자리 년도를 적으세요 : ");
		// 년도꺼내서 변수
		year = sc.nextInt(); // 입력되는걸 기다리는 함수를 블로킹함수라고함.
		//조건처리 판단 switch ~case ( 4로떨어지는 수  -1, 100 -2, 400 -3 )
		if(year == 9) {
			System.out.println("프로그램이 종료됩니다.");	
			return;
		}
		System.out.println("*** 입력한 년도는 " +year+"입니다.");	
		
		int code = 0;
		if(year % 400 == 0) {
			code = 3;
		}else if(year % 100 == 0) {
			code = 2;
		}else if(year % 4 == 0) {
			code = 1;
		}
		
		String hea = "평년";
		switch (code) {

		case 3: 
			hea = "윤년";

			break;
		case 2:

//			hea = "평년";
			break;
		case 1:
			hea = "윤년";

			break;
		}
		
		//결과출력
		System.out.println("입력한 해 [ "+ year + " ] 는 " + hea + "입니다.");
		}
	}

}
