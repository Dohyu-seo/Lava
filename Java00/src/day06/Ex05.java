package day06;

/*
     문제 5]
	
	피보나치 수열 10개를 저장할 배열을 만들고
	배열에 값을 입력해서
	배열에 저장된 데이터를 출력하세요.
 */
public class Ex05 {
	public static void main(String[] args) {
		int no1 = 0;
		int no2 = 0;
		//피보나치 수열 10개를 저장할 배열
		int fibonacci[] = new int[10];
		no1 = 1;
		no2 = 1;
		System.out.print(no1+","+no2+",");
		for(int i = 0; i < 10; i ++) {
			
				int no3 = no1 + no2;
				fibonacci[i]=no3;
				no2 = no1;
				no1++;
				System.out.print(fibonacci[i]);
				if(i!=9) {
				System.out.print(",");
				}
				
		}
		
	}

}
