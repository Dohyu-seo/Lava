package day16;

// SimpleDateFormat
import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;

/*
 	 데이터에서 DATE타입의 DATA를 가져올 때, java에서 꺼내는 함수가 : 날짜랑 시간을 분리해서 따로꺼내야한다..
 	 꺼내올때 날짜따로 만들고 시간따로 만들어서 (은닉화 & 캡슐화)vo클래스에서 처리가 되어야 한다.
 	 함수 따로 만들어서 처리하는 것....
 	 
 	 JAVA의 DATE타입 : 1900.01.01. 00:00
 	 ORACLE의 DATE타입 : 1970.01.01. 00:00
 	 
 	 
 */
public class Test02 {
	
	public Test02() {
		// Calendar 클래스로 현재 시간을 기억할 변수를 만들자
		Calendar cal = Calendar.getInstance();
		
		//Calendar  데이터는 Date 타입으로 변환 시킬 때
		Date date = cal.getTime();
		
		// 출력 문자엵 반환받고
			
		String sTime = getStr(date);
		
		// JOptionPane으로 출력하고
		JOptionPane.showMessageDialog(null, date);
		JOptionPane.showMessageDialog(null, sTime);
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	// date 타입의 데이터를 입력하면 형식에 맞도록 문자열로 만들어서 반환해주는 함수
	public String getStr(Date date) {
		// 패턴 만들고
		SimpleDateFormat form = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		// 만들어진 패턴으로 문자열 데이터 만들고
		String result =form.format(date);
		
		// 데이터 만들었으면 넘겨주고..
		return result;
	}

}

