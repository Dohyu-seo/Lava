package day15;

import java.util.*;
public class Test08 {

	public Test08() {
	
			
		for(int i = 0; i < 20 ; i ++) {
			Date date = new Date();
			System.out.println(date.getHours()+ ":"+date.getMinutes()+":"+date.getSeconds());
			try{
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}

		}
	
	}
	

	public static void main(String[] args) {
		new Test08();
	}

}
