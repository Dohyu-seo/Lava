package day05;

/*
		8.
		    1
		   12
		  123
		 1234
		12345
 */
public class Test08_01 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 5 ; i++ ) {
			String str = " ";
			for(int j = 0 ; j < 5 ; j++ ) {
				if(3-j < i ) {
					str = j - (i - (2*i+ 1)) - 4 + "";
				}
				System.out.printf("%3s", str);
			}
			System.out.println();
		}
	}

}
