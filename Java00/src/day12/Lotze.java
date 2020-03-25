package day12;

public class Lotze extends Car{
	int speed = 60;
	String color = "silver";
	int used = 15;
	public void speedUp() { //Overriding
		speed += 40;
	}
	public void speedUp(int s) {	//Overloading
		speed += s;
	}
}
