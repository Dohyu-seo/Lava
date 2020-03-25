package day13.sub;

public class Won implements Moyang {
	private int radius;
	private double area;
	
	public Won() {
		
	}
	public Won(int radius) {
		this.radius = radius;
		setArea();
		toPrint();
	}
	@Override
	public void setArea() {
		area = radius * radius*Math.PI;
	}

	@Override
	public void toPrint() {
		System.out.printf("원 입니다\n반지름 : %3d\n넓이 : %.2f\n",radius,area);
		System.out.println("---------------------");
	}

}
