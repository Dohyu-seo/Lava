package day13.sub;

// 삼각형 클래스, 나중에 사각형, 원형을 만드세오
public class Samgak implements Moyang {
	private int width;
	private int height;
	private double area;
	
	public Samgak() {
		
	}
	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		toPrint();
	}
	@Override // 컴파일러에게 이 함수가 어떤 함수인지 알려주는 것, 어노테이션(Annotation)
	public void setArea() {
		area = width*height * 0.5;
	}

	@Override
	public void toPrint() {
		
		System.out.printf("삼각형 입니다 \n가로 : %3d\n세로 : %3d\n넓이 : %.2f\n",width, height, area);
		System.out.println("---------------------");
	}

}
