package day09;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
    문제 2]
	1차 배열에 10개의 데이터를 입력한 후
	총점과 평균을 구하는 프로그램을 작성하세요.
	단, 입력, 총점계산, 평균계산, 출력을 함수로 처리하세요.
 */
public class Ex03 {
	String[] score = new String[10];
	
	public Ex03() {

		score = array();
		System.out.print(Arrays.toString(score));
//		System.out.println(Arrays.toString(sum()));
		System.out.println(Arrays.toString(avg()));
	}
	//입력받을 수 만들기
	public String[] array() {
		String[] input = new String[10];
		for(int i=0; i<10;i++) {
		input[i] = JOptionPane.showInputDialog("데이터 넣어주세요.");
		}
		return input;
	}
	//총점계산하는 함수 만들기
	public double[] sum() {
		double[] sum = new double[score.length];
		for(int i = 0; i<score.length; i++) {
			sum[i] += Double.parseDouble(score[i]);
		}
		return sum;
	}
	//평균 구하는 함수 만들기
	public double[] avg() {
		double[] avg = new double[score.length];
		for(int i = 0; i<score.length; i++) {
			avg[i] += Double.parseDouble(score[i]);
			avg[i] /= score.length;
		}
		
		return avg;
	}
	//출력하는 함수 만들기
	public void print() {
		
	}
	public static void main(String[] args) {
		new Ex03();
	}

}
