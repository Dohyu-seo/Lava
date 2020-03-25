package day04;

/*
	두 사람이 등산을 하는데
	한 사람은 이제 등산을  0.54m/s 시작하고
	한 사람은 정상에서 1.07m/s내려오기 시작했다.
	
	산의 높이가 7564m라고 가정하고
	두 사람이 만나는 시간은 몇분 몇초 후인지와 높이를 출력해주는 프로그램을 작성하세요.
	시간 = 거리/속력
	속력 = 거리/시간
	거리 = 속력*시간
	
	
	1과 2가 만나는 시간 : i++ , i * 1.07 / i++ , i * 0.54 => % == 0 일때 만남.
	 1은 0부터 초당 0.54씩 7564까지 가고
	 2는 7564부터 초당 1.07씩 0으로 간다. 접전을 구해라 
	 초i 라고 한다. 
 */
public class Hw04 {
	
public static void main(String[] args) {
		
	double mount = 7564;
	double people1 = 0; // 하의 위치  +0.54
	double people2 = 7564; // 정상의 위치 - 1.07
	
//	for( people1=0; people1=<people2; people1++) {
		
		for(people2=7564; people2>=people1; people2--) {
			
			if(people1 == people2) {
				
				System.out.println(people1);
				break; 
			}
		}
	}
//	for(mount=1; mount<7564; mount++ ) {
//	
//			people1 /= mount; 14007
//			people2 /= mount; 7069
//			
//		if() {
//			System.out.println(people1+"<-1      2->"+people2);
//			System.out.println(mount);
//			break;
//		}
//	}
//	
	
//	마운틴을 i로 두고 1씩 증가시킨 뒤 
//	서로의 정수가 마운틴과 비교했을 때 0이 되는 위치
//
//		//두 변수 만들기
//		double people1 = 0.54;
//		double people2 = 1.07;
//		// 산 높이 변수 만들기
//		double mount = 7564;
//		double time1 = mount/0.54; // 1번이 정상까지 가는 시간
//		System.out.println(time1);
//		double time2 = mount/1.07; // 2번이 내려가는 시간.
//		System.out.println(time2);
//		double no1 = time1-time2;
//		double no2 = time2-time1;	
//		System.out.println("내려가는사람이 올라가는 사람을 뺏을 때 " +no1);
//		System.out.println("올라가는사람이 내려가는 사람을 뺏을 때 " +no2);
//		System.out.println("내려가는사람이 올라가는 사람을 뺏을 때 의 초 " +(int)no1);
//		int sum = (int)(no1/360) ;		
//		System.out.println("정수의 시간을 분으로 바꾸면"+sum+"분");
//		int str = sum;
//		
//		// 시간.소수점 -시간 , * 60 = 분.소수점 - 정수 분, *60 = 초 . 소수 - 정수 초 == 시간 분 초 나옴.  
//		2번이 정상에서 내려가는 시간이 1시간 57분 49초이다			7069-- < 
//		1번이 정상까지 올라간느 시간은 3시간 53분27초 이다. 		14007
//}
//}	
}
