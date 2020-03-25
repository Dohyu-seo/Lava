//package day03;
//
//public class Ex01 {
/*
 	1 ~ 100까지의 정수 세개를 랜덤하게 만들어서
 	세 수가 큰 수부터 차례로 출력되게 하세요.
 	단, 변수는 4개를 넘기지 마세요.
 */
	
/*	public Ex01() {
		max >= mid >= min
		max >= min >= mid
		
		mid >= max >= min
		mid >= min >= max
		
		min >= max >= mid
		min >= mid >= max
		
		int tmp = 0;

		int max = solv();
		int mid = solv1();
		int min = solv2();
		
		if(max >= mid) { // max > mid > min
			if (mid >= min) {
				
			}else { //아니면
				if(max >= min) { // max > min > mid 
					tmp = mid;
					mid = min;
					min = tmp;
					
					
				}
			}
			 
		}else {
			if(mid >= max) {
				if(max >= min) { // mid > max > min
					
				}else {
					if(mid >= min) { // mid > min > max
						tmp = mid;
						mid = max;
						max = tmp;
						
						tmp = min;
						min = mid;
						mid = tmp;
					}
					
				}if(min >= max) {
					if(max >= mid) {	// min > max > mid
					
					}else {
						if(min >= mid) { // min > mid > max 
							tmp = min;
							min = max;
							max = tmp;
							
							tmp = mid;
							mid = min;
							min = tmp;
						}
					}
				}
				}
		
		}
		System.out.println("\n"+max +" -- "+ mid + " -- " + min);
		
		}
	


				
		

	// 랜덤한 숫자 만들기
	public int solv() {
		int max = (int)(Math.random()*(100 - 1 +1))+1; 
		System.out.print(max);
		return max;
	}
	// 랜덤한 숫자 만들기 2
	public int solv1() {
		int mid = (int)(Math.random()*(100 - 1 +1))+1; 
		System.out.print(mid);
		return mid;
	}
	
	// 랜덤한 숫자 만들기 3
	public int solv2() {
		int min = (int)(Math.random()*(100 - 1 +1))+1;
		System.out.print(min);
		return min;

		
	}

	public static void main(String[] args) {
		new Ex01();

	}

}

*/
package day03;

public class Ex01 {
/*
	1 ~ 100까지의 정수 세개를 랜덤하게 만들어서
	세 수가 큰수부터 차례로 출력되게 하세요.
	단, 변수는 4개를 넘기지 마세요.
 */
	public static void main(String[] args) {
		
		for(int i = 0; i < 10 ; i++ ) {
			// 세 정수를 랜덤하게 만든다.
			int max = (int)(Math.random()*(100 - 1 + 1) + 1);
			int mid = (int)(Math.random()*(100 - 1 + 1) + 1);
			int min = (int)(Math.random()*(100 - 1 + 1) + 1);
			// 임시변수를 만든다.
			int tmp = 0;
			
			// 비교해서 처리한다.
			if(max >= mid) {
				// max > mid
				if(mid >= min) { // max > mid > min
					// 할일 없음
				} else { // min > mid
					// max와 min 이 대소비교가 아니된 상태
					if(max >= min) { // max > min > mid
						tmp = mid;
						mid = min;
						min = tmp;
					} else { // min > max > mid
						tmp = max;
						max = min;
						min = tmp;
						
						tmp = mid;
						mid = min;
						min = tmp;
					}
				}
			} else {
				// mid > max
				
				if(mid >= min) { // mid > max & min
					if(max > min) { // mid > max >min
						tmp = max;
						max = mid;
						mid = tmp;
					} else { // mid > min > max
						tmp = max;
						max = mid;
						mid = tmp;
						
						tmp = mid;
						mid = min;
						min = tmp;
					}
				} else { // min > mid > max
					tmp = max;
					max = min;
					min = tmp;
				}
			}
			
			// 출력한다.
			System.out.print("max : " + max + " | ");
			System.out.print("mid : " + mid + " | ");
			System.out.print("min : " + min + " ");
			System.out.println((max >= mid)&&(mid >= min));
			
		}
		
	}

}