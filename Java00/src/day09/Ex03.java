package day09;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
    ���� 2]
	1�� �迭�� 10���� �����͸� �Է��� ��
	������ ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
	��, �Է�, �������, ��հ��, ����� �Լ��� ó���ϼ���.
 */
public class Ex03 {
	String[] score = new String[10];
	
	public Ex03() {

		score = array();
		System.out.print(Arrays.toString(score));
//		System.out.println(Arrays.toString(sum()));
		System.out.println(Arrays.toString(avg()));
	}
	//�Է¹��� �� �����
	public String[] array() {
		String[] input = new String[10];
		for(int i=0; i<10;i++) {
		input[i] = JOptionPane.showInputDialog("������ �־��ּ���.");
		}
		return input;
	}
	//��������ϴ� �Լ� �����
	public double[] sum() {
		double[] sum = new double[score.length];
		for(int i = 0; i<score.length; i++) {
			sum[i] += Double.parseDouble(score[i]);
		}
		return sum;
	}
	//��� ���ϴ� �Լ� �����
	public double[] avg() {
		double[] avg = new double[score.length];
		for(int i = 0; i<score.length; i++) {
			avg[i] += Double.parseDouble(score[i]);
			avg[i] /= score.length;
		}
		
		return avg;
	}
	//����ϴ� �Լ� �����
	public void print() {
		
	}
	public static void main(String[] args) {
		new Ex03();
	}

}
