package day17;

public class Semo implements Comparable{
	// ���� ���� ����
	private int width, height;
	private double area;

// �⺻ ������ �Լ�
	public Semo() {
	}

	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	@Override
	public int compareTo(Object o1) {
		Semo s1 = (Semo) o1;
		
		double result = s1.getArea() - this.getArea();
		return (int) result;
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setArea() {
		this.area = width * height * 0.5;
	}



}
