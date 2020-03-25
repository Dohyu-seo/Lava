package day13;

/*
문제 1]
	
	Figure 클래스를 상속 받아서 Nemo, Semo, Won 클래스를 작성하세요.
	Figure 클래스는 면적을 구해주는 추상함수만 멤버로 가지고 있습니다.
	
	ArrayList에 각 도형의 인스턴스를 10개 랜덤하게 담고
	꺼내서 출력하는 프로그램을 작성하세요.
	
*/

//라이브러리 정의
import java.util.*;

public class Exec02 {
	// 랜덤 함수의 초기화, 가로 세로 .. 반지름은 ran으로 초기화한다
int ran=0;
int ran2=0;

	public Exec02() {
		//ArrayList의 초기화
		ArrayList list = new ArrayList(); 
		list.add(new Nemo());
		list.add(new Semo());
		list.add(new Won());

		
		
		for(int i = 0; i<list.size(); i++) {
			Figure f = (Figure)list.get(i);
		
//			System.out.println(f.calcArea((int[])(list2.get(i))));
//			System.out.println("num : "+num);	
		}
		int cnt = 0; 
		for(int i = 0; ; i++) {
			cnt++;	
			for(int k = 0; k<list.size();k++) {
				ran = (int)(Math.random()*61+40);
				ran2 = (int)(Math.random()*61+40);
			}
			ArrayList list2 = new ArrayList();
			list2.add(new int[]{ran, ran2});
			list2.add(new int[] {ran, ran2});
			list2.add(new int[] {ran});
			int num = (int)(Math.random()*3);
			System.out.println("===============");
			System.out.println("↓"+cnt+"번 째 결과값 입니다");
			System.out.println("   ============");
				for(int j = 0; j<1; j++) {

					int a = num;
					switch(a) {
						case 0:
							Figure n = (Figure)list.get(0);
							System.out.print("0번 : Nemo입니다."+"\t가로는 ["+ ran +"]세로는 ["+ran2+"]이며,"+"\n사각형의 면적은 : ");
							System.out.println(n.calcArea((int[])(list2.get(0))));
							break;
						case 1:
							Figure s = (Figure)list.get(1);
							System.out.print("1번 : Semo입니다."+"\t밑변은 ["+ran+"] 높이는 ["+ran2+"]이며,"+"\n삼각형의 면적은 : ");
							System.out.println(s.calcArea((int[])(list2.get(1))));
							break;
						case 2:
							Figure w = (Figure)list.get(2);
							System.out.print("2번 : Won입니다."+"\t반지름은 ["+ran+"]이며,"+"\n원의 면적은 : ");
							System.out.println(w.calcArea((int[])(list2.get(2))));
							break;
			
					}
					System.out.println("∂∇∂⌒　　∂∇∂⌒　　∂∇∂⌒　　∂∇∂⌒　　∂∇∂⌒　　∂∇∂⌒　　∂∇∂⌒　　");
					System.out.println();
					
			
				}
				if(i == 9) {
					break;
				}
		}//for

	}
	public static void main(String[] args) {
		new Exec02();
	}

}
