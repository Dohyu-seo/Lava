package day11;

public class Nemo extends Dohyung {
	// 변수 설정!
	int width;
	int height;
	double arround;
	
	public Nemo() {
		this(1,1);
	}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		setArround();
	}
	//사각형의 넓이 구하기 가로 x 세로
	public void setArea() {
		area = width * height;
	}
	//사각형의 둘레 구하기 : (가로 + 세로) X2
	public void setArround() {
		arround = (width + height)*2;
	}
	
	//출력함수
	public void toPrint() {
		System.out.printf("사각형 가로 : %3d\n사각형 세로 : %3d\n사각형의 둘레 : %5.2f\n사각형의 넓이 : %5.2f",width, height, arround, area );
	}
	
}
