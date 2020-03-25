package day13.sub;

public class Sagak implements Moyang {
	private int width;
	private int height;
	private double area;
	public Sagak() {
		
	}
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	@Override
	public void setArea() {
		area = width * height;
	}

	@Override
	public void toPrint() {
		System.out.printf("사각형 입니다 \n가로 : %3d\n세로 : %3d\n넓이 : %.2f\n",width, height, area);
		System.out.println("---------------------");
	}

}
