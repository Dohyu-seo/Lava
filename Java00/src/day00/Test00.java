package day00;

public class Test00 {

	
	public static void main(String[] args) {
		// 배열 만들고
		int[] num = new int[5];
		
		years:
		for(int i = 0; i < 5; i++) {
			int tmp = (int)(Math.random() * 9) +1;
			for(int j = 0; j < i; j++) { // 반복문을 배열과 함께 처리.
				if(tmp == num[j]) {
					i--;
					continue years;
				}
			}
			num[i] = tmp;
		}
		for(int no : num) {
			System.out.println(no);
		}
		

	}

}


//
/////* 랜덤하게 4자리 숫자를 발생해서 평년인지 윤년인지 확인하세요
//// 4로 나눠떨어지고 100으로 나눠 떨어지지않고 400으로 나눠떨어지는 해 무한루프 끊기.
// */
//
//package day05;
//
///*
// 	1 ~ 9까지 숫자를 랜덤하게 5개를 발생시켜서 배열에 넣어서 출력하세요.
// */
//public class Test09 {
//	
//	public static void main(String[] args) {
//		// 배열 만들고   
//		int[] num = new int[5]; 
//		
//		lotto: // label이 붙은 for 명령 // continue나 break에 적용시킬 반복문을 지정시켜줄 수 있습니다.
//		for(int i = 0; i < 5; i++) {
//			int tmp = (int)(Math.random() * 9) +1;	
//			for(int j = 0; j < i; j++) { //반복문을 배열과 함께 처리하는건 중요하고 어려운 부분.
//				if(tmp == num[j]) {
//					i--;
//					continue lotto; // 원랜 continue가 붙은 반복문, 두 번째 for 인데 라벨을 붙이면 그 라벨이 붙은 반복문에 continue를 실행하게됨.
//				}
//			}
//			num[i] = tmp; 
//		} 
//		
//		// 출력
//		for(int no : num) { // 향상된 for 명령어 //[]배열은 여러개의 데이터를 담고있는데 이렇게 하면 순차적으로 변수에 데이터를 담음.
//	//  배열을 순차적으로 no라는 변수에 담아줌
//			System.out.println(no);
//		}
//	}
//}
