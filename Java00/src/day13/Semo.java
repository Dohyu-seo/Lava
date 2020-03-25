package day13;
 // 세모의 면적
public class Semo extends Figure {
	private int mit;
	private int height;
	@Override
	public double calcArea(int... a) {
		mit = a[0];
		height = a[1];
		return mit * height*0.5;
	}

}
