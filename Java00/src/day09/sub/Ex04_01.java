package day09.sub;

public class Ex04_01 {

	public static void main(String[] args) {
		
		for(int i = 0; i< 3 ; i++) {
			int sum = 0;
			for(int j = 0; j <5; j++) {
				int no=i*2+j+1;
				if(j==4) {
					no = sum;
				}else {
					sum +=no;
				}
				System.out.printf("%3d",no);
			}
			System.out.println();
		}
		System.out.println("----------------");
		for(int i = 0; i< 3 ; i++) {
			int sum = 0;
			for(int j = 0; j <5; j++) {
				int no=i*2+j+1;
				if(j==4) {
					no = i*8+10;
				}
				System.out.printf("%3d",no);
			}
			System.out.println();
		}
	}

}
