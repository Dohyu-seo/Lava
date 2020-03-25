package day03;
/*
 	문제3]
 		부서 번호를 입력하면
 		부서 이름을 출력해주는 프로그램을 작성하세요.
 		
 			10 - 총무부
 			20 - 회계부
 			30 - 영업부
 			40 - 기술부
 			나머지 - 다음기회에...
 */
import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" 10~ 40번 중의 부서 번호를 입력하세요 : ");
		int dno = sc.nextInt();
		String num = "";
		if(dno == 10) {
			num = "총무부";
		}else {
			if (dno == 20) {
				num = "회계부";
			}else {
				if(dno == 30) {
					num = "영업부";
				}else {
					if(dno == 40) {
						num = "기술부";
					}else {
						num = "다음기회에..";
					}
				}
			}
		}
			System.out.println("조회하신 부서는 : "+num);
	}

}
