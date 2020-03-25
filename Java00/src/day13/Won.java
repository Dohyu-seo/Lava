package day13;
// 원의 면적을 구하는 
public class Won extends Figure {
	private int radius;
	@Override
	public double calcArea(int... a) {
		radius = a[0];
		return radius*radius*3.14;
	}

}
