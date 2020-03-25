package day13.home;

/*
		문제 3]
			Figure클래스를 정의하고
			상속받아서 삼각형, 사각형, 원의 클래스를 정의한 후
			
			1 ~ 3 까지의 정수를 랜덤하게 10개 만들어서
			1의 경우 삼각형
			2의 경우 사각형
			3의 경우 원
			을 배열에 넣고
			출력하세요.

 */
public class Figure {
	// 면적을 계산하는 함수 클래스
	int width = (int)(Math.random()*61+40);
	int height = (int)(Math.random()*61+40);
	int radius = (int)(Math.random()*61+40);
	double area;
	public void setArea() {
	}
}
