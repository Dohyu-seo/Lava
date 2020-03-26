package day14;

/**
 *	이 클래스는 JButton의 이벤트 처리를 할 때 사용하는 무명 내부 클래스의 사용법을 연습용 클래스
 *	@author 서동혁
 *	@since	2020.03.26
 *	@version v.1.0
 *	@see
 *			JFrame, JPanel, JButton(<-Swing 클래스들), ActionListener(인터페이스)
 *
 *			2020.03.26 클래스 제작		-		담당자 서동혁		-	클래스 생성		
 */
import java.awt.*;	// 교재에 기재 되어있음.
import java.awt.event.*; // 직속인 패키지만 불러올 수 있으므로 event라는 폴더도 따로 불러줍니다.
import javax.swing.*;

public class ColorWin {
	/*
	 * 자바에서 GUI를 만들 수 있는 도구를 제공하고 있는데 javax.swing 패키지와 java.awt 패키지이다.
	 * 
	 * 이 클래스에서는 Windows에 창을 만들어주는 JFrame 을 사용해서 창을 만들고 내부에 JPanel을 이용해서 채운 후 JPanel의
	 * 색상을 변경하고 JButton에 기능을 부여해 보자~.
	 */
	// 전역변수- if, 외부에서 해당 데이터를 교체할 때 전역변수로 설정한 변수가 있기 때문에 수정이 가능하다.
	JFrame frame;
	JPanel pan1, pan2;
	JButton cBtn, eBtn, tBtn;

	// JPanel을 클릭했을 때, JPanel의 색을 변경시키는게 핀트입니다.

	public ColorWin() {
		// 변수 초기화
		// frame 객체를 만들어주고
		frame = new JFrame(); // ==> new 시키고 setVisible을 실행시켜야 화면이 뜹니다.

		// frame 창의 x 버튼 누를 때 프로그램을 종료하는 기능 부여해보자
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// JFrame.EXIT_ON_CLOSE는 JFrame이 갖고있는 멤버중의 하나이고 상수로 정의가 되어있다.

		// 타이틀 선언하기
		frame.setTitle("아무것도 아닙니다");

		// JPanel 1 선언하기 (CENTER)
		pan1 = new JPanel();
		// JPanel 1에서 색상 선언하기
		pan1.setBackground(Color.PINK);

		// JPanel 2 선언하기 (SOUTH)
		pan2 = new JPanel();
		// JPanel 2 에서 색상 선언하기
		pan2.setBackground(Color.PINK);

		// JButton 선언과 초기화 하기
		cBtn = new JButton("Color"); // 컬러를 변경할 버튼
		eBtn = new JButton("EXIT"); // 나가기 버튼
		tBtn = new JButton("Title");

		// 이벤트 객체 만들기 = 이벤트 함수 선언 , this< 현재 실행중인 객체 자기자신.
		TitleEvt evt1 = new TitleEvt(this);
		// 클래스 자체를 넘겨주면서 수정하기 위하므로 new를 시키지 않고 this를 사용해서 현재 객체를 수정할 수 있게 만든다.

		/*
		 * TitleEvt evt2 = new TitleEvt(new ColorWin()); 지금 실행되는 객체완 무관하게 새로운 객체를 다시
		 * 만든것. > ColorWin함수에서 ColorWin 함수를 부르는 것.... 오류!
		 */

		// TitleEvt 함수를 tBtn에 부여한다.
		tBtn.addActionListener(evt1);
		
		
		//eBtn에 이벤트 추가하기( EXIT ) 누르면 닫기
								// 상속해주는 클래스를 호출해서 그 내부에 오버라이드 해준다.
		eBtn.addActionListener(new ActionListener() {
			// 무명(익명) 내부 클래스 만들기!!
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
								//interface : ActionListener;
		cBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 이 함수는 칼라버튼이 클릭되면 실행되는 함수로
				// 칼라를 랜덤하게 만들어서 JPanel의 배경색을 변경시켜주는 함수이다.
				
				// 1. 먼저 칼라를 랜덤하게 만든다.
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				
				// 2. 칼라의 구성요소는 만들었으니 칼라를 만들자
				Color color = new Color(red, green, blue);
				
				// 3. 만들어진 칼라를 pan1, pan2에 넣을 것이다. ( pan에서 컬러를 지정했기 때문에..)
				pan1.setBackground(color);
				pan2.setBackground(color);
				
				
			}
		});
		// JButton에 버튼 추가하기.
		pan2.add(cBtn);
		pan2.add(eBtn);
		pan2.add(tBtn);// < 버튼생성 및 JOptionpane 만들기
		// JPanel을 JFrame 안에 정렬해서 넣기 --> BorederLayout.위치;
		frame.add(pan1, BorderLayout.CENTER);
		frame.add(pan2, BorderLayout.SOUTH);

		frame.setSize(500, 500); // JFrame의 사이즈를 정하는 부분입니다. 픽셀단위 입니다.
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new ColorWin();
	}

}

// 버튼 누를 때 마다 이 클래스가 new 되어 실행하는 이벤트 추상클래스.
// 현재 실행되고 있는 객체가 이 이벤트를 받아서 실행되어야 한다.
class TitleEvt implements ActionListener {
	// ColorWin은 new 시키면 안됀다. 별도의 주소를 또 만들게 되기 때문이다.
	ColorWin main;

	// 기본 생성자함수.
	public TitleEvt() {
	}

	// new 시키지 않기위해 오버로딩 해서 main에 채운다.
	public TitleEvt(ColorWin main) {
		this.main = main;
	}

	@Override
	// API에 Interface ActionListener -> actionPerformed의 항목에서 가져옴
	public void actionPerformed(ActionEvent e) {
		// 이벤트가 발생했을 때 e 를 자동적을 호출해주는 함수. 

		// 먼저 타입을 입력 받는다.
		/*
		 * String title = JOptionPane.showInputDialog("타이틀을 입력하세요!");
		 * main.frame.setTitle(title);
		 */
		main.frame.setTitle(JOptionPane.showInputDialog("타이틀을 입력하세요!"));
		// ColorWin의 변수인 main에 JFrame.의 변수인 frame인의 Title을 변경한다. 뭘로?? 입력받은 값으로..
	}

}