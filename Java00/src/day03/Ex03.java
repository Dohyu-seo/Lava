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
public class Ex03 {

	public static void main(String[] args) {
		int won = 0;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("1 ~ 4의 사용자 코드를 입력하세요 : ");
		int code = sc.nextInt();
		if(!(code >=1 && code <=4)) {
			String str = "사용자 코드를 다시 입력하세요.";
			System.out.println(str) ; 
			 
		}else {
			System.out.println("사용량을 입력하세요 : ");
			int num = sc.nextInt();
			
			
			
			if(code == 1) {
				//가정용
					won = num *245+ 3800;
			}else {
				if(code == 2) {
					//산업용
					won = num *157+ 2400;
				} else {
					if(code == 3) {
						// 교육용
						won = num *169+ 2900;
					}else {
						if(code == 4) {
							//상업용
							won = num *174+ 3200;
							
						}
						//마지막if문
					}//else3차
				}//else2 차
			}//else1차
			
			System.out.println("사용한 전기요금은 : "+ won+ "원 입니다.");
		
		}
		
		
		
	}//main

}
