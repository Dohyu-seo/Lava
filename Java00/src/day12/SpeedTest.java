package day12;

/*
 	상속받아서Overriding 활용하기.
 		함수의 형태에 중점을 두고 관찰하기
 		반환값 함수이름 매개변수리스트 가 동일해야한다..
 		
 		
 */
public class SpeedTest {
	
	//생성자함수 만들기
	public SpeedTest() {
		Car car = new Car();
		car.speedUp();
		System.out.println("Car speed : " + car.speed);
		 
		Mini mini = new Mini();
		mini.speedUp();
		System.out.println("Mini speed : "+ mini.speed+"m/h");
		
		Lotze lotze = new Lotze();
		lotze.speedUp(); 	// Overriding
		lotze.speedUp(20); 	// Overloading
		System.out.println("Lotze speed : " + lotze.speed);
		
		Car lotze1 = new Lotze();
		// Lotze가 형변환 없이 Car타입을 받을 수 있는 이유는
		// Car가 갖고있는 멤버만 갖고있다면 어떤 타입이던지 Car를 받을 수 있다 (자동 형변환)
		// 고로 Car는 상속해주는 클래스로 가장 넓은 범위에 속한다.
		
		// Lotze변경 후 출력해보기
//		System.out.println("Lotze color : "+ lotze1.color);
//		System.out.println("Lotze color : "+ lotze1.used);
		// Lotze를 상속하는건 괜찮지만, Car에서  color나 used라는 변수를 갖고있지 않기 때문에, 오류가 난다.

		System.out.println("Lotze speed : " + lotze1.speed);
		//**변수는 레퍼런스 변수를 따르고 함수는 인스턴스변수(맨 마지막에 재정의 한)를 따른다.**
		
//		Mini mi = (Mini) lotze1;// 되긴s 하지만 이렇게 사용하지 않는 방향으로 코딩을 해야한다.
		//사용이 가능하게 되는 이유 : Car에서 lotze1을 상속해주고 있기 때문에 상위클래스에서 허락을 해준 것이다. , 직접 접근은 오류이다.
		
//		Lotze car2 = new Car();
		// 범위로 생각을 하자면, 상위클래스가 범위가 더 넓은 반면 하위클래스인 Lotze의 범위는 좁기 때문에 담을 수 없다;
		/*
		Car p = new Lotze();
		Lotze c = (Lotze)p;
		
		System.out.println("Lotze : "+c.speed); // 60
		c.speedUp(); // 40
		System.out.println("Lotze : "+c.speed); // 100 
		*/
		
		Lotze car2 = (Lotze)new Car(); // Lotze는 Car보다 멤버가 추가되었다. 라는 조건하에 오류가 생기게 된다.
//		 하위클래스에서 상위클래스를 담을 때 강제형변환이 가능하다. 하지만 Lotze에 있는 멤버가 Car에 있지 않으면 오류가 난다.
		
		// 만약에 Lotze 클래스에서 Car의 멤버를 건들이지 않고 사용한다는 것은 : Overriding을 하기 때문에 위장이라고 볼 수 있다.
		
		/* Car lotze1 = new Lotze(); 에서.  Car란 무슨 타입인가?? 
			어떤 객채가 Car가 갖고잇는 멤버를 갖고있다면, 그 타입으로 볼 수 있다.
			.. class에 멤버(함수와 변수)를 갖고있다면 그것 외엔 갖을 수 있는게 없다는 말이다.
			
			그렇다면 class가 소유하고 있는 것들은 변수 아니면 함수라는 것인데.
			어떤 객체가 그 class 타입이 된다는 얘기는 그 class가 갖고있는 멤버가 동일하기 때문에
			그 class가 될 수 있다는 말이다.
			
			 상속받을 객체가 갖고있는 멤버들이  상속하는 class가 갖고있는 멤버와 동일하기 때문에
			 상속하는  class를 받을 수 있다는 말이다.
			 
			  정의&기능을 갖고있다 : 함수
			  정의&속성값을 갖고있 : 변수
			 
			 결론 ]
			 	상속받을 class의 멤버와 현재 객체의 멤버가 동일한 조건아래서 
			 	Car  : Car라는 멤버를 갖고있는 객체들(Mini, Lotze)은 Car라고 부를 수 있다.
			 	반면, Car를 상속받아 만들어진 Mini, Lotze는 Car라고 부를 수 없다.
			 	
			 
			 흔히들 하는 실수
			 상속하면 거기에 덧붙일 수 있는데
			 
			 함수나 변수가 추가 될 경우, 상속받은 클래스가 더 크지 않느냐 라는 오류가 나오지 않느냐 하는데
			  클래스는 멤버를 갖고 있는지 안갖고있는지로 따지게 된다.
			 제일 넓은 범위가 멤버를 조금 갖고있는 것이 된다.
		*/
	}
	public static void main(String[] args) {
		//생성자함수 메모리에 올리기
		new SpeedTest();
	}

}
