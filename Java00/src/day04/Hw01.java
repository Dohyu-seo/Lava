package day04;

/*
 	반복문 처리하기.
	1씩 빼주면서 나눴을 때 나오는 최소값 제일 큰 수 부터 1씩 감소해가면서 그 수를 나눌 수 있는 수가 나왔다면 그 수가 최소값
 	두 수를 입력받은 후
 	두 수의 최대공약수를 구해서 출력해주는 프로그램을 작성하세요.
 	
 	최대공약수 : 두 수를 나눌 수 있는 최대 수.
 		
 */
import java.util.*;
public class Hw01 {

	public static void main(String[] args) {
		
		/*
			// 입력받을 준비하고
			 Scanner sc = new Scanner(System.in);
			// 메세지 출력하고
			// 숫자 변수에 담고 X 2
			System.out.print("첫번째 숫자 :");
		int no1 = sc.nextInt();
			System.out.println("두번째 숫자 :");
		int no2 = sc.nextInt();
		
		// 두 수중 작은 수를 찾고 for에서 i에 사용할 변수에 담기 
		 int val = (no2 >no1) ? (no1) : (no2);
		 
			// 계산해서 찾고 
		 for(int i = val <==작은값으로 세팅; i > 0; i--){
		 	if(no1 % i == 0 && no2 % i == 0){
		 	// 조건 만족 : i = no1, no2를 나눌 수 있는 수
		 		
			 // 최대 공약수 출력하고 
		 		System.out.println(no1+"과"+no2+" 의 최소 공배수는 " + i + "입니다.");
			 // 반복문 중지하고 
		 		break; // i가 no1과 no2를 나눌 수 있는 수가 되면 멈춘다!
		 	}
			}
			 
			  
	 */
		//입력받을 준비 *2
		Scanner sc = new Scanner(System.in);
		//입력받아 변수에 담고
		System.out.println("첫째 수를 입력하세요. : ");
		int no1 = sc.nextInt();
		System.out.println("두번 째 수를 입력하세요. : ");
		int no2 = sc.nextInt();
		// 최대 공약수 프로그램 만들기. 
		if(no2>no1) { //큰수 담기
			int tmp = no1;
			no1 = no2; 
			no2 = tmp;
		}	// 4(no4)가 2(no1)보다 크면 2(no1)를 변수에 담고, 2에 4를 담고(no1=4), no2에 no1(tmp)를 담아서 2가 된다. 위치 바꾸기. 뜻 : no2는 언제나 작은 수이다. 
		for(int i = no2; i > 0; i --) { // i가 no2이다; i(no2)가 0보다 클때까지 반복한다; i(no2)는 -1씩된다.
			if(no1 % i == 0 && no2 % i ==0) { // no1을 no2로 나눴을 때 0, no2를 no2로 나눴을 때 0
				System.out.println("이해하기"+no1+"과"+no2+" 의 최대 공약수는 " + i + "입니다.");
				break;  
			}
			
			//두 수를 입력받는다 -> no1, no2
//			두수중 큰 수를 찾는다. -> no1 >= no2 && no2 >= no1
//			큰 수에서 -1 씩 하면서 두 수를 나눠준다. -> no1 || no2 /i++ 
//			그 수가 나눠지면 멈춘다. - max. 
//			나눈 수를 출력한다. println();
			
		}
		//출력하기.
		
	}

}
