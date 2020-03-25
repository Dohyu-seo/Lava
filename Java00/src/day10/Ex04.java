package day10;

/*
   문제 4]
	 
	 학생의 점수를 입력하면 총점을 계산해주는 프로그램을 제작하세요.
	 
	 심화]
	 	랜덤하게 인수를 만들고
	 	그 인원수 만큼 점수를 랜덤하게 만들어서
	 	함수를 실행하게 하세요.
	 
 */
import javax.swing.*;
public class Ex04 {
	int peo;

	//학생의 점수를 입력하면 총점을 계산
	public Ex04() {
		peolpe();
		score();
System.out.println(peo);
	}
	// 총점을 계산하는 프로그램 만들기!
	/*	public void getsum() {
			int[] arr;
			int ran = (int)(Math.random()*31 -10)+10;*/
//			for(int i = 1; i<ran; i++) {
//				arr[i] = ran;
//			}
			/*	
		for(int i = 0; i<ran; i++) {
			String inScore =(JOptionPane.showInputDialog("학생의 점수를 입력하세요"));
			arr[i] = inScore;
		}
		*/
	//랜덤하게 인수를 만들자 
	public int peolpe(int ... num) {
		
		return peo = (int)(Math.random()*(10-1+1)+1);
	}
	//랜덤하게 점수를 받자!
	public void score(int...num) {
		peolpe();
		for(int i = 0; i<peo; i++) {
			peo = (int)(Math.random()*100-0+1);
//			score = peo;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new Ex04();
	}

}
