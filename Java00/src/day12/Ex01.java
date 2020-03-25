package day12;

import java.util.Arrays;

/*
 	배열문제!
 		문제 1]
 			학생의 java, db, html, javascript, spring, sum, avg
 			점수를 관리할 배열을 만들고
 			총점과 평균을 구해서 출력하세요.
 			단, 과목별 총점과 평균도 같이 배열에서 관리하세요.(5명분으로..)
 			
 				java, db, html, javascript, spring, sum, avg
 				--------------------------------------------
 				100	  95   100    100         90     xxxx.xxx.xx
 				....
 		과목총점	450		480
 		과목평균	 90.00	 96.00
 		
 			의 형태로 만들어서 배열에 데이터를 채우고 출력하세요.
 			
 			배열은
 				double[][] score = new double[7][7];
 */
public class Ex01 {
	//변수 초기화
	double[][] score = new double[7][7];
	
	//총점을 담을 변수
	
	public Ex01() {
		setRandom();
	
	}
	
	//배열에 점수넣기
	public void setRandom() {
		toPrint();
	
		for(int i=0; i<score.length; i++) {
			double sum = 0;
			for(int j=0; j<score[i].length; j++) {
				//랜덤한 점수 기입
			score[i][j] = (int)(Math.random()*61+40);
			sum=sum+score[i][j];
			//총점 기입
			 if(j==5) {
				 score[i][j] =sum;
				 //평균 기입
			 }else if(j==6){
				 score[i][j] =sum/5;
			 }
		
				System.out.printf("%5.2f",score[i][j]);
				 System.out.println();
			}
			System.out.println("_------------_");

		}

	}
	//출력하기
	public void toPrint() {
		System.out.println("java, db, html, javascript, spring, sum, avg");
		System.out.println("---------------------------------------------");
	
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
