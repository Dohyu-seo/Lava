package exam;
import java.util.Arrays;

/*
  	JOptionPane으로 숫자를 입력받아서
  	배열을 만들고 배열이 기억할 수 있는 갯수만큼 숫자를 입력받아서
  	그 숫자들의 합을 구해주는 프로그램을 작성하세요.
  	단, 합을 구하는 기능은 함수를 만들어서 처리하세요. 
 */
import javax.swing.JOptionPane;
public class Ex01 {
	// 함수 계산할 때 쓸 변수
	int sum;
	// 함수에서 정수 담을 배열 
	int[] arr;
	// 정수 입력할 변수
	String str;
	
	
	public Ex01() {
		
		//	숫자 넣으면 그 숫자만큼 배열을 만들어서 그 안에 숫자 5개 넣고 합해주는 프로그램
		
		//예외처리 반복하기
		while(true) {
			 str = JOptionPane.showInputDialog(" 배열 길이를 입력하세요");
			//예외처리 넣기
			try {
				//	배열길이 지정하기
				arr = new int[Integer.parseInt(str)];
			//배열 만들 정수 입력받기
			
			 break;
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "숫자(정수)만 입력하세요.");
				continue;
			}
			
		}


//		 배열길이만큼 정수 넣기
//		for(int i = 0;i<arr.length; i++) {
//			String str2 = JOptionPane.showInputDialog("배열에 담아 더할 정수를 입력하세요.");
//			arr[i] = Integer.parseInt(str2);
//		}
		
		setSum(arr);
		
	}
	// 배열에 담긴 정수 계산하는 함수 만들기
	public int[] setSum(int[] arr) {
		// 변수정의
		this.arr = arr;
		//합을 넣을 변수
		int sum = 0;
		// 넣은함수 하나씩 더하기
		for(int i = 0; i<arr.length; i++) {
			String str2;
			try {
			str2 = JOptionPane.showInputDialog("배열에 담아 더할 정수를 입력하세요.");
			arr[i] = Integer.parseInt(str2);
			sum = arr[i]+sum;
			continue;
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "숫자(정수)만 입력하세요.");
				i--;
				continue;
			}
						
		}
		JOptionPane.showMessageDialog(null, sum);
		
		
		return  this.arr;
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
