package day06;

/*
 	extre]
 		1, 1,...
 		로 시작하는 피보나치 수열을 10개 출력하세요.
 		
 		참고]
 			피보나치 수열:
 				앞의 두 수를 더한 값들의 집합...
 				
 				1, 1, 2, 3, 5, ...
 				// 더할 수를 기억해줘야하는게 포인트
 				
 */
public class Extre {

	public static void main(String[] args) {
		int jagn = 1;
		int kn = 1;
		System.out.print(jagn+", "+ kn + ", ");
		for(int i = 0; i < 8; i++){
			int result = jagn + kn; // jagn을 kn으로 바꾸기 전에 초기화.
			jagn = kn;
			kn = result; // 초기화 전에 jagn+kn한 값을 초기화
//			int tmp = jagn;
//			jagn = kn;
//			kn = kn + tmp;
			System.out.print(kn + ", ");
		}
	}
}
