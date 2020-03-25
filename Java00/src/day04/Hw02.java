package day04;

/*
	두 수를 입력받은 후
	두 수의 최소공배수를 구해서 출력해주는 프로그램을 작성하세요.
	
	최소공배수 : 두 수로 나누어 떨어지는 가장 작은 수
		
 */
import java.util.*;
public class Hw02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요:");
		int no1 = sc.nextInt();
		System.out.println("두번째 수를 입력하세요:");
		int no2 = sc.nextInt();
		// no1, no2가 각자 자기자신에게 *를 할 때 두 수가 맞게되는 수 .
		// no1가 3 이면 3 6 9 12 15 ...
		// no2가 4 이면 4 8 12 16 ... 일 때서로 12가 되는 수 
		// 그럼 no1 * no1 % no2 ==0, no2 * no2 %no1 == 0 
		if(no2 > no1) { // 뒷에 올 no2가 크다면 no1으로 자리를 바꿔준다
			int tmp = no1;
				no1 = no2;
				no2 = tmp;
		}
		for(int i = 1; i>0; i++) {
			if((no1*i)% no2 == 0 && (no2 *i)% no1 == 0) {
				System.out.println("이해하기"+no1+"과"+no2+" 의 최소 공배수는 " + i + "입니다.");
				break; 
			}
		}
	
	}

}
