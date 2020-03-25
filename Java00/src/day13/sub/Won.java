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
		System.out.printf("�� �Դϴ�\n������ : %3d\n���� : %.2f\n",radius,area);
		System.out.println("---------------------");
	}

}
