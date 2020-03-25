package day11.preSolv;

public class Ex04Solv {
	
	public Ex04Solv() { // 생성자함수( 매개변수가 하나도 없는 )
	
		//먼저 다섯명의 이름을 저장할 배열을 만들자.
		String[] name = {"우현우","박기윤","손은진","박광호","이한철"};
		
		// 다섯명의 데이터를 저장할 배열을 만든다.
		Stud[] ban = new Stud[5];
		
		
//		ban = setArr(ban, "우현우", "박기윤", "손은진", "박광호", "이한철");
		ban = setArr1(ban, name);

		// 함수내에서 1차 배열처럼 사용되는게 가변인수의 특징
		
		// 배열은 완성이 되었고
		// 정렬해보자.
		
		ban = setSort1(ban);
		
		
		// 출력한다.
		System.out.printf("%4s : %3s | %3s | %3s | %3s | %3s | %4s | %5s\n","이  름", "국  어", "영  어", "수  학", "물  리", "코   딩", "총   점", "평   균");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for(int i = 0; i < ban.length; i++) {
			ban[i].toPrint();
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		setArr(ban, name); // 생성자 함수를 다시 호출한다.
		setSort(ban);
		// 출력한다.
		System.out.printf("%4s : %3s | %3s | %3s | %3s | %3s | %4s | %5s\n","이  름", "국  어", "영  어", "수  학", "물  리", "코   딩", "총   점", "평   균");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for(int i = 0; i < ban.length; i++) {
			ban[i].toPrint();
		}
	}
	
	// 가변인수로 이름을 입력받아서 배열을 세팅해주는 함수를 만들어 보자.
	// 그런데 가변인수는 앞에 일반 변수가 와도 상관없지만 뒤에 오면 절대로 안됀다.
	public Stud[] setArr1(Stud[] s, String...name) {
		for(int i = 0; i < name.length; i ++) {
			s[i] = new Stud(name[i]);
		}
		return s;
		// Stud[] s 에 반환값을 지정해서 name 의 개수만큼 Stud를 받아서 반환해준다.
	}
	
	
	public void setArr(Stud[] s, String...name) {
		for(int i = 0; i < name.length; i ++) {
			s[i] = new Stud(name[i]);
		}
		// Stud[] s 에 반환값을 지정해서 name 의 개수만큼 Stud를 받아서 반환해준다.
	}
	
	// Stud 타입의 배열을 입력해주면 정렬해주는 함수를 만들자.
	public Stud[] setSort1(Stud[] s) {
		for(int i = 0 ; i < s.length-1; i++) {
			for( int j = i+1; j <s.length; j++) {
				if(s[i].getSum() < s[j].getSum()) {
					Stud tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
//					int tmp = s[i].getSum();
//					s[j].getSum() = tmp; ==> 사용 불가 총점은 그 값을 다 더한것인데, 변경해서 무엇하는가.
				}
			}
		}
		return s;
	}
	public void setSort(Stud[] s) {
		for(int i = 0 ; i < s.length-1; i++) {
			for( int j = i+1; j <s.length; j++) {
				if(s[i].getSum() < s[j].getSum()) {
					Stud tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex04Solv();
		
	}


}
