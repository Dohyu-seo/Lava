package day10;
/*
 	Nemo 클래스를 5개 관리할 배열을 만들고
 	가로 세로는 1 ~ 29 까지 랜덤하게 만들어서 배열을 완성하고
 	
 	 그리고 각 Nemo에 가로 세로 넓이를 출력해주세요.
 */
public class Test03 {
	// Nemo 배열변수를 만들고
	Nemo[] nemo;
//	Nemo[] nemo = new Nemo[5];
	// Nemo를 초기화하는 함수를 만들자.
	public void setNemo() {
		// 먼저 배열을 초기화 해준다.
		nemo = new Nemo[5];
		
		// 아직 nemo에 데이터는 채워져 있지 않고 데이터가 들어갈 방만 만들어 놓은  상태다.
		// 각 방에 데이터를 넣어주자.
		for(int i=0; i<nemo.length; i++) {
			// 반복문이 한 번 반복될 때 마다
			// Nemo클래스의 인스턴스를 만들어서 각 방에 넣어줘야 한다.
			//1번
			nemo[i] = new Nemo();
			
			// Nemo 인스턴스는 만들어 뒀는데 아직 가로, 세로, 넓이는 입력해주지 않았다.
			// 따라서 현재 가로 세로 넓이는 0으로 세팅이 되어 있다.
			// 이제 가로 세로 넓이를 세팅해주자. 우리는 그것의 기능을 만들어 두었으므로 그 기능을 사용해보자.
			
			// 먼저 숫자 두개를 만든다.
			int garo = (int)(Math.random()*(29-1+1)+1);
			int sero = (int)(Math.random()*(29-1+1)+1);
			
			//일단 네모방에 있는 애를 꺼내서. garo sero를 넣어주면 끝난다
			nemo[i].setVal(garo, sero);
			// 이제 class 변수의 Nemo()에 기억되어있따.
			
		}
	}
	public static void main(String[] args) {
		// nemo를 실행시켜서 t에  담았다.
		Test03 t = new Test03(); // 아직 멤버변수 nemo는 세팅되어있지 않다.
		Test03 t1 = new Test03(); 
		
		// 이제 함수 준비는 끝났고 함수만 호출해주면 사용할 수 있다.
		t.setNemo(); // 여기서 nemo를 셋팅해준다.
		t1.setNemo();
		
		//출력해준다, 우리는 멤머변수의 내용을 출력해주는 함수를 만들어 두었기 때문에 그것을 호출하자.
		for(int i =0; i< t.nemo.length; i ++) { 
			t.nemo[i].toPrint();  
		}
		System.out.println(); 
		System.out.println("###############"); 
		for(int i =0; i< t.nemo.length; i ++) {// null인 상태, 오류// 세팅이 안돼어 있다 ( t1.setNemo();)라고 메인에 정의해준 뒤 사용한다.
			t1.nemo[i].toPrint();  
		}
		System.out.println("###########");
	}

}
