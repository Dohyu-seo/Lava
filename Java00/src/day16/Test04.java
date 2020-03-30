package day16;

// ChoiceFormat
import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Test04 {

	public Test04() {
			// ChoiceFormat 을 만들때 limits, formats를 하나로 만들 수도 있다.
			/*
			  	만드는 형식
			  		60#D		( <=	의 의미)
			  		70<C		( < 	의 의미)
			 		
			 		이것을 | 을 이용해서 연결해서 사용하면 된다.
			 */
		String pattren = "0#F | 60#D | 70#C | 80<B | 90#A";
		// 60#D 의 의미는 60보다 크거나 같을 때 다음 숫자보다는 작은 경우는 D로 처리한다.
		
		ChoiceFormat form = new ChoiceFormat(pattren);
		 
		while(true) {
			String sno =JOptionPane.showInputDialog("점수를 입력하세요. \n종료는 Q"); 
			
			if(sno.equals("q") || sno.equals("Q")) {
				break;
			}
			
			int score = 0;
			
			try {
				score = Integer.parseInt(sno);
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "잘못 된 점수입니다.");
				continue;
			}
			
			// 이제 등급 구하고
			String grade = form.format(score);
			
			// 이제 결과 출력하고
			JOptionPane.showMessageDialog(null, "점수는 : "+score +"\n학점 : "+grade);
		}	
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
