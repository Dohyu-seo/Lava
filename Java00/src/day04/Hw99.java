package day04;

/*
반복문을 사용해서 다음 모양을 출력하세요.

	1 - 0. 
		
		*****
		*****
		*****
		*****
		*****
	
	1. 
		*
		**
		***
		****
		*****
	
	2.
		    *
		   **
		  ***
		 ****
		*****
	
	3. 
		*****
		****
		***
		**
		*
	
	4. 
		*****
		 ****
		  ***
		   **
		    *
		    
	5. 
		    *
		   ***
		  *****
		 *******
		*********
		
	6.
		    *
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
		    *
	
	7-0.
		    12345
		    12345
		    12345
		    12345
		    
	7-1.
			1  2  3  4  5
			6  7  8  9  10
			11 12 13 14 15
			16 17 18 19 20
			21 22 23 24 25
	
	7.
		1
		12
		123
		1234
		12345
		
	8.
		    1
		   12
		  123
		 1234
		12345
		
	9.
		12345
		1234
		123
		12
		1
		
	10.
		1
		2  3
		4  5  6
		7  8  9  10
		11 12 13 14 15
		
	00. ==> 반복문 중첩해서...
		1  1  1  1  1
		2  2  2  2  2
		3  3  3  3  3
		4  4  4  4  4
		5  5  5  5  5 
		
	00 - 01. ==> 반복문 중첩해서...
	
		1  1  1  1  2
		2  2  2  3  3
		3  3  4  4  4
		4  5  5  5  5
		6  6  6  6  6
	
	11.
		2 x 1 = 2 	3 x 1 = 3 	...		9 x 1 = 9
		...
		2 x 9 = 18	3 x 9 = 27	...		9 x 9 = 81
	
	12.
		
		A B C D E
		F G H I J
		K L M N O
		P Q R S T
		U V W X Y
	
	13.
		
		A
		B C
		D E F
		G H I J
		K L M N O
		
	14.
		
		1	6	11	16	21
		2	7	12	17	22
		3	8	13	18	23
		4	9	14	19	24
		5	10	15	20	25
		
	15.
		A	F	K	P	U
		B	G	L	Q	V
		C	H	M	R	W
		D	I	N	S	X
		E	J	O	T	Y
		
	16.
		1	2	3	4	5
		10	9	8	7	6
		11	12	13	14	15
		20	19	18	17	16
		21	22	23	24	25
		
	
*/
public class Hw99 {

	public static void main(String[] args) {
		
		/*String cha = "*";
		
		*
		 * System.out.println("1-0.------------------------------------------"); //1-0.
		 * for(int i = 0; i < 5; i++) { System.out.println("*****"); }//1-0.
		 * System.out.println("1. ---------------------------------------------"); // 1.
		 * 
		 * for(int i = 1; i<= 5; i++) { // low for(int j =0; j<i; j++) { // j는 i가 추가 될
		 * 때마다 별이 늘어나야 하니까 j<i(j부터 i까지) 반복 System.out.print(cha);
		 * 
		 * } System.out.println(""); // 띄어쓰기가 되는 부분! }//1.
		 * System.out.println("2. --------------------------------------------");
		 * for(int i = 1; i <= 5; i++) {
		 * 
		 * for(int j = 5; j>0; j--) {
		 * 
		 * if(j>i) { System.out.print(" "); }else { System.out.print("*"); } }
		 * System.out.println("");
		 * 
		 * 
		 * }// 2. System.out.println("3. --------------------------------------------");
		 * 
		 * for(int i=0; i<5; i++) { for(int j=5;j>i; j--) { System.out.print("*"); }
		 * System.out.println(); } }// 3.
		 * System.out.println("4. --------------------------------------------");
		 * for(int i = 0; i<= 5; i++) { // low for(int j =0; j<i; j++) { // j는 i가 추가 될
		 * 때마다 별이 늘어나야 하니까 j<i(j부터 i까지) 반복 System.out.print(" ");
		 * 
		 * } for(int j =5; j>0; j--) { if(j>i) { System.out.print("*"); // 띄어쓰기가 되는 부분!
		 * } } System.out.println(""); }// 4.
		 */	
		
		System.out.println("5. --------------------------------------------");
		for(int i=0; i<5; i++) {
				
			for(int j=5;j>i; j--) {
					System.out.print(" "); // 역삼각형 공백만들기
				 }
			for(int j=0; j<i; j++) {
				System.out.print("*");	// 직삼각형 별채우
				
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
				System.out.println("*");
			}//5.
//		System.out.println("6. --------------------------------------------");
//		for(int i=0; i<5; i++) {
//			
//			for(int j=5;j>i; j--) {
//					System.out.print(" "); // 역삼각형 공백만들기
//				 }
//			for(int j=0; j<i; j++) {
//				System.out.print("*");	// 직삼각형 별채우
//				
//			}
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("*");	
//			for(int j = 0; j<= 5; j++) { 
//				 System.out.print(" ");
//				  
//				  } for(int n =5; n>0; n--) {
//					 
//						System.out.print("*");	
//						for(int j = 0; j<= 5; j++) { 
//		
//							  
//							  }
//						System.out.println();
//				  }
//		}


		/*
				8.
				    1
				   12
				  123
				 1234
				12345
		 */



				


	}
}
