package day13;
// ���� ������ ���ϴ� 
public class Won extends Figure {
	private int radius;
	@Override
	public double calcArea(int... a) {
		radius = a[0];
		return radius*radius*3.14;
	}

}
