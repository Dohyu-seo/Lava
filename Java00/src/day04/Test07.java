package day04;

/*
	label 이 붙은 for 명령
		: 반복문이 중첩이 될 경우
			내부의 반복문에서 조건에 따라서 바깥 반복문을 제어해야 될 경우가 생긴다.
			이 때에 해당 반복문을 제어해줄 용도로 사용되는 반복문이다.
			
			적용 명령은 break나 continue를 쓸 수 있다.
			
		형식]
			
			라벨이름:
			for 또는 while(;;){ -1
			
				for(;;){ - 2
					break 라벨이름; // 'break;'만 썻을때2가 종료가 된다. , 1을 종료하고 싶은 경우에 'break 레벨이름;'을 기술해준다
				}
			}
		
		***
		주의]
			라벨에 의한 처리는 직속관계에 한해서만 적용이 된다.
			
			예제]
				라벨1 :
				for(){
					
					라벨2:
					for(){
						
					}
					for(){
						break 라벨2; ==> 절대로 적용되지 않는다.
						continue label1; ==> OK.
					}
				}
 */
public class Test07 {

	public static void main(String[] args) {

//		구구단을 출력하는데 3단의 5곱이상은 출력되지 말고 건너뛰게 하세요.
		
		t1:
		for(int dan = 2; dan <= 9; dan++) {
			for(int gop = 1; gop <= 9; gop ++) {
				if(dan == 3 && gop >= 5) {
					continue t1; // 3단의 5곱하기 부터는 출력되지 않고 다음 4단으로 시작된다.
				}				
				System.out.println(dan+"x"+gop+"="+(dan*gop));
				
			}
		}
	}

}
