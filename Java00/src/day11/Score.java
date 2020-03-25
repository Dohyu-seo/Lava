package day11;

import java.util.Scanner;

/*
	문제 2]
		이 클래스는 학생 한명의 
			이름, java, oracle, html, javascript, jsp, spring의
		점수를 기억할 클래스이다.
		이 클래스가 객체가 될 때 데이터를 입력받아서 각 변수에 기억이 되게 클래스를 정의하세요.
		
		단, 데이터가 입력이 안 될 경우 이름은 "박광호"로 입력되게 하고 성적은 랜덤하게 기억되게 하세요.
		
 */
public class Score {
		//이 클래스는 학생에 대한 정보를 기억하는 클래스이므로
	// 이름, 과목, 점수를 기억하게 하면 될 것이다.
	
	String name;
	int java, oracle, html, javascript, jsp, spring, total;
	double avg;
	//이 클래스의 목적 : 이름을 입력하면. 과목 6가지의 점수를 만들겠다.
	// 3-1 점수는 배열에 넣어서 랜덤하게 입력해준다.
//	int[] subj = new int[6];
//	String[] toSubj = new String[]{"java","oracle", "html", "javascript", "jsp", "spring"};
	

	// 1. 기본 생성자 함수 만들기
	public Score() {
		this("박광호");
		//name이 정해지지 않았을 때 박광호라는 이름이 입력되게 하고.
	}
	
	public Score(String name) {
		/*this.name = name;
		this.java =(int)(Math.random()*61+40);
		this.oracle =(int)(Math.random()*61+40);
		this.html =(int)(Math.random()*61+40);
		this.javascript =(int)(Math.random()*61+40);
		this.jsp = (int)(Math.random()*61+40);
		this.spring = (int)(Math.random()*61+40);*/
		/*
		this(name, (int)(Math.random()*61 + 40), (int)(Math.random()*61 + 40), 
				(int)(Math.random()*61 + 40), (int)(Math.random()*61 + 40), 
				(int)(Math.random()*61 + 40),(int)(Math.random()*61 + 40));	
	}*/
	this(name, getJumsoo(),getJumsoo(),getJumsoo(),getJumsoo(),getJumsoo(),getJumsoo());	
	/*
	 	getJumsoo() 함수는 이 클래스의 멤버이고
	 	이 함수를 사용할 수 있는 시점은
	 	이 클래스가 객체가 된 이후에 사용 가능하다.
	 	
	 	따라서 이 함수를  별다른 속성이 없이 정의를 하게 되면
	 	아직 메모리에 올려지지 않은 상태고
	 	생성자 함수에서 호출할 수 없는 상태이기 때문에 사용할 수 없다.
	 	
	 	 이 함수를 굳이 사용해야겠다면, 이 함수를 미리 메모리에 올려주면 될 것이다.
	 	 이 때 사용할 수 있는  속성이 "static" 속성이다.
	 */
}
	// 2. 기본생성자 함수 오버로딩
	public Score(String name, int java, int oracle, int html, int javascript, int jsp, int spring ) {
		//이 클래스는 이름을 입력하면 반환값을 주는 함수이다.
		this.name = name;
		
		//전역변수에 생성자 함수 실행해놓는다.
		//여기서 세팅해주는게 생성자 함수이다.
		this.java = java;
		this.oracle = oracle;
		this.html = html;
		this.javascript = javascript;
		this.jsp = jsp;
		this.spring = spring; 
		setTotal();
		setAvg();
	}
	
	public static int getJumsoo() {
		return (int)(Math.random()*61 + 40);
	}
	//총점을 구해주는 함수
	public void setTotal() {
		this.total = java + oracle + html + javascript + jsp + spring;
	}
	// 평균을 구해주는 함수
	public void setAvg() {
		this.avg = this.total / 6.;
	}
	public void toPrint() {
		System.out.printf("%4s : %3d | %3d | %3d | %3d | %3d | %4s | %5.3f\n",
						name, java, oracle, html, javascript, jsp, spring, total, avg);
	}
}
/*		this.java = toJava(name);
		this.oracle = toOracle(name);
		this.html = toHtml(name);
		this.javascript = toJavascript(name);
		this.jsp = toJsp(name);
		this.spring = toSpring(name);
		
	}*/
	/*
	// 3. 과목의 점수를 구해주는 함수
	public void getSubj(String name) {
		// 과목의 점수는 랜덤으로 기억되게 하고 출력되게 한다.
		for(int i = 0 ; i < subj.length; i++) {
			subj[i] = (int)(Math.random()*41+60);
			System.out.println(toSubj[i]+"의 점수는 : "+subj[i]);
		}
	}
	*/
	/*
	// 3 - 2각 과목에 랜덤하게 점수를 넣을 함수들을 만들자.
	public int toJava(String name) {
		//이름을 입력하면 랜덤한 java의 점수를 기억시켜주는 함수
		return java = (int)(Math.random()*41+60);
	}
	public int toOracle(String name) {
		//이름을 입력하면 랜덤한 java의 점수를 기억시켜주는 함수
		return oracle = (int)(Math.random()*41+60);
	}
	public int toHtml(String name) {
		//이름을 입력하면 랜덤한 java의 점수를 기억시켜주는 함수
		return html = (int)(Math.random()*41+60);
	}
	public int toJavascript(String name) {
		//이름을 입력하면 랜덤한 java의 점수를 기억시켜주는 함수
		return javascript = (int)(Math.random()*41+60);
	}
	public int toJsp(String name) {
		//이름을 입력하면 랜덤한 java의 점수를 기억시켜주는 함수
		return jsp = (int)(Math.random()*41+60);
	}
	public int toSpring(String name) {
		//이름을 입력하면 랜덤한 java의 점수를 기억시켜주는 함수
		return spring = (int)(Math.random()*41+60);
	}
}
*/


/*
 	백업-
 	//학생 한명의 데이터이므로 
	String name = "박광호";
	
	//과목별 점수를 저장한 배열
	int[] arr;
	//과목별 점수를 저장할 목적으로 
	int java, oracle, html, javascript, jsp, spring;
	
	// 이 클래스가 인스턴스가 되는 순간
	// 해당 인스턴스 소유주를 기억시켜놓으면 좋을 것 같다.
	// => 학생 한명 인스턴스를 만들 때 마다 new 시킬 것이다.
	// 멤버의 초기화 역할을 하는 함수가 생성자 함수이므로
	// 생성자 함수에서 입력되는 이름을 초기화 시키기로 하자
	
	
	
	//과목을 안내해주는 배열에 넣기
	String[] score1 = new String[] {"java","oracle", "html", "javascript", "jsp", "spring"};
	
	public Score() { // 생성자 함수는, 멤버초기화를 시켜준다, 멤버중에 함수가 있다면 함수를 초기화시켜주는 역할을 한다.
		setSubj();
	}// 생성자 함수를 만들어 놓는다.
	
	//이름을 지정할 생성자함수를 만든다.
	public Score(String name) {
		this();
		this.name = name;
	}
	
	
	// 스코어를 입력하자
	public void setSubj() {
		for(int i = 0; i < 6;i++) {
			 Scanner sc = new Scanner(System.in);
			 System.out.print(score1[i]+"의 점수를 입력하세요.");
			 int str = sc.nextInt(); 
			 arr[i] = str;
		}
	}
 */
