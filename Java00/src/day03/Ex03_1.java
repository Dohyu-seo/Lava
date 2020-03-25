package day03;

/*
 문제 2]
 	전기 요금을 계산하는 프로그램을 작성하세요.
 	
 			코드		기본요금		사용요금
 	가정용	(1)		3,800		245
 	산업용	(2)		2,400		157
 	교육용	(3)		2,900		169
 	상업용	(4)		3,200		174
 	
 	전기요금 = 기본요금 + 사용량*사용요금
 	당월청구요금  a + 부가가치세(a × 10%) + 전력산업기반기금(a × 3.7%)
 	사용자 코드와 사용량을 입력받아서
 	전기요금을 계산해주는 프로그램을 작성하세요.
*/
import java.util.*;
public class Ex03_1 {

	public static void main(String[] args) {
		//1. 입력바을 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 메세지 출력하고 입력값 변수에 담고..(코드, 사용량)
		
		// 2-1. 코드 입력받고
		System.out.print("1번 ~ 4번의 구분코드를 입력하세요! : ");
		int code = sc.nextInt();
		
		if(!(code >= 1 && code <=4)) {
			System.out.println("코드가 잘못되었습니다. 즉시 종료합니다.");
			return;
		}
		
		// 2-2. 사용량 입력받고
		System.out.print("사용량을 입력하세요! : ");
		int used = sc.nextInt();
		
		// 3. 코드에 따라서 용도 구분해서 전기요금 계산하고
		int calc = 0; // 전기요금 변수
		String yongdo = "가정용"; 
		
		int gibon = 3800; //기본요금 - 가정용 기본요금으로 초기화
		int yogm = 245; // 사용요금 - 가정용 사용요금으로 초기화
		
		
		
		/*if(code == 1) {
			// 여기는 가정용 ==> 용도는 기본값이 가정용으로 초기화 되어있으므로 수정할 필요가 없다.
			calc = 3800 + used*245;
		}else  */
		if(code == 2) { //용도가 산업용
			
			// 용도 변경
			yongdo = "산업용";
			gibon = 2400;
			yogm = 157;
			// 전기요금 계산
			//calc = 2400 + used*157;
		}else if(code == 3) { //용도가 교육용
			yongdo = "교육용";
			gibon = 2500;
			yogm = 169;
			//calc = 2500 +used*169;
		}else if(code == 4){ //용도가  상업용
			yongdo = "상업용";
			gibon = 3200;
			yogm = 174;
			//calc = 3200 + used*174;
		}
		//if ~ else 끝
		
		calc = gibon + used*yogm;
		// 4. 요금 출력하고
		System.out.println("****************");
		System.out.println("사용자 코드 : "+code+
							"\n용도 : " + yongdo+
							"\n사용량 : " + used+
							"\n전기요금 : "+ calc);
		System.out.println("****************");
	}

}
