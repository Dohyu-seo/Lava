package day03;

/*
 	문제1]
 		게시판에 글을 한 페이지에 15개 글을 표시할 수 있습니다.
 		게시물의 갯수를 랜덤하게 (0 ~ 100) 발생한 후
 		필요한 페이지 수를 계산해서 출력해주는 프로그램을 작성하세요.
 		단, 게시물수가 0인 경우는 1페이지가 필요한것으로 한다.
 */
public class Ex02 {
	// 페이지당 15개
	// 게시물 랜덤.
	// 필요한 페이지 수 계산
	// 게시물이 0 = 1; 
	public static void main(String[] args) {
		
		double num = (int)(Math.random()*101);
		System.out.println("게시물 수 :"+(int)num);
		double page = 0;
		if(num <= 14) { 
			page = 1;
		}else {
			if(101 > 15) {
				page =(((num/15)*100 +99) /100);
			}
		}
System.out.println(" 필요한 페이지 수 : "+(int)page);
System.out.println(num/15);		

	}

}
