package day03;

import java.util.*;
public class Hw01 {
	
	/*
	 조건 명령문
	 	: 조건을 주고 조건이 맞는 경우와 맞지 않는 경우를 구분해서 처리해주는 명령문
	 	
	 	종류 ]
	 		1. if문
	 			==> 조건을 제시하고 그 조건에 맞는 경우만 처리하는 조건문
	 			
	 			형식]
	 				if(조건식){
	 					실행문...
	 				}
	 				==> 조건식이 맞을 경우에만 실행, 맞지 않으면 조건문을 건너뛰는 방식
	 				
	 		2. if ~ else문
	 			==> 조건을 제시하고 조건에 맞는 경우와 맞지 않는 경우 두 가지를 처리하는 조건문
	 			
	 			형식]
	 			 	if(조건식){
	 			 		실행문1
	 			 	} else {
	 			 		실행문2
	 			 	}
	 			 	==> 조건식이 맞는 경우는 실행문1을 실행하고 맞지 않는경우는 실행문2를 실행하는 방식 
	 			 	
	 		3. if ~ else if ~ else문
	 			==> 두개 이상의 조건을 제시하고 각 조건에 맞는 경우를 처리하는 조건문 
	 			
	 			형식]
	 				if(조건식1){
	 					실행문1
	 				}	else if(조건식2){
	 					실행문2
	 				}	else if(조건식3){
	 					실행문3
	 					...			  
	 				}	else{
	 					실행문n
	 				}
	 				
	 				==> 여러개의 조건식을 제시해서 그 조건문에 맞는 실행문을 실행하는 방식
	 				
	 		4. switch ~ case문
	 			==> 조건을 처리하는데 여러개의 데이터를 제시하고 그 데이터에 맞는 경우 처리해주는 방법
	 		 	형식]
	 		 		switch(변수){
	 		 		case 데이터1:
	 		 			실행문1;
	 		 			break;
	 		 		case 데이터2:
	 		 			실행문2;
	 		 			break;
	 		 		...
	 		 		default:
	 		 			실행문 n;
	 		 		}
	 		 		
	 		 		==> 변수의 값이 일치하는 case문의 실행문을 실행 처리하는 조건식. 
	 		 		
	 		 		
*/	
		

	/*
 	
 	문제 1]
 	3자리로 구성된 숫자 하나를 입력을 받은 후 또는 랜덤하게 만든 후
 	백자리 이하를 버린 숫자를 만들어서 출력하세요.
 		예]
 			456 -- 400*/
	public Hw01() {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 메세지 출력하고 
		System.out.print("### 입력받아 처리할 경우 1, 랜덤하게 만들어서 처리할 경우 2를 입력하세요");
		
		int num = sc.nextInt();
		
		if (num == 1) {
			iFloor(sc);
		} else {
			rFloor();
		}
	}
	// 입력받아서 처리하는 함수
	public void iFloor(Scanner sc) { // Scanner을 입력받아서 이 함수를 쓸 때 Scanner을 넣어주면서 실행하세요.
		//메세지 출력하고
		System.out.print("세자리 정수를 입력하세요! : ");
		//숫자 꺼내서 변수에 기억하고
		int no = sc.nextInt();
		
		//십의 자리 이하는 버리고
		// 123 ==> 100 <-- (123-23)
		//			   <-- 123 / 100 * 100
		int no2 = no;
		
		System.out.print("입력한 수 : " + no);
		// 첫번 째 방법
		no = no / 100 * 100;
		System.out.println(" \n*** 1. 십의 자리에서 반올림 한 수 : " + no);
		// 두번째 방법
		no2 = no2 - (no2%100);
		System.out.println("\n*** 2.십의 자리에서 반올림 한 수 : "+ no2);
}
	// 랜덤하게 만든 후 처리하는 방법
	public void rFloor() {
		//랜덤하게 숫자 만들고
		int no = (int)(Math.random()*(999-100+1))+100; // Math의 random함수를 꺼내고 *(최대값-최소값+1))+최소값;
		
		//십의자리 반올림하고
		int no2 = no;
		
		System.out.print("입력한 수 : " + no);
		// 첫번 째 방법
		no = no / 100 * 100;
		System.out.println(" \n*** 1. 십의 자리에서 반올림 한 수 : " + no);
		// 두번째 방법
		no2 = no2 - (no2%100);
		System.out.println("\n*** 2.십의 자리에서 반올림 한 수 : "+ no2);
	}
	public static void main(String[] args) {
		new Hw01();
	}

}
