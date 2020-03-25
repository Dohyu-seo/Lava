package day12;

import java.util.Arrays;

public class Supplement02 {

	
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
	int cnt = 1;
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = 0; j<arr[i].length; j++) {
				
				if(j%1 == 1 || j%3 ==1) {
					arr[i][j] = i+101; 
				}
				if(j%1 != 1 && j%3 !=1) {
					arr[i][j] = i+1;
				}
				/*	arr[i][j] = j+1;
				if(i == 1) {
					arr[i][j] = j+101;
				}else if(i == 2) {
					arr[i][j] = j+6;
				}else if( i == 3) {
					arr[i][j] = j+106;
				}else if(i ==4) {
					arr[i][j] = j+11;
				}*/
			}
			
//			for(int j = 0; j<arr[i].length; j++) {
				
//			}
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
}
