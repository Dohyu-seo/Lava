package day05;

public class Test8 {

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
		for(int i = 0 ; i < 5 ; i++ ) {
					
			for(int j = 0 ; j < 5 ; j++ ) {
				if(3-j < i ) {
					System.out.printf("%3d", i + j - 3);
				} else {
					System.out.printf("%3s", " ");
				}
			}
			System.out.println();
		}
	}
}
