package day12;

import java.util.Arrays;

public class Supplement01 {
	
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int[][] ary = new int[5][5];
		int[][] ara = new int[5][5];
		int[][] arl = new int[5][5];
	int cnt = 1;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if(i%2 == 0) {
					arr[i][j] = cnt++;
				}
				if(i%2 != 0) {
					arr[i][j] = j+95+cnt;
				}
			}
//			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("+++++++++++++++++++++++++++");
		for(int i = 0; i<ary.length; i++) {
			for(int j = 0; j<ary[i].length; j++) {
				ary[i][j] = arr[j][i];
			}
//			System.out.println(Arrays.toString(ary[i]));
		
		}
		System.out.println("+++++++++++++++++++++++++++");
		
		/*	for(int i = 0; i<ara.length; i++) {
			for(int j = 0; j<ara[i].length; j++) {
				ara[i][j] = arr[arr.length - 1 -i][j];
				
			}
			
			System.out.println(Arrays.toString(ara[i]));
		}
		System.out.println("+++++++++++++++++++++++++++");
		*/
		for(int i = 0; i<arl.length; i++) {
			for(int j = 0; j<arl[i].length; j++) {
				arl[i][j] = arr[i][j];
			}
			System.out.println(Arrays.toString(ary[i]));
		
		}
	}
	
	
}
