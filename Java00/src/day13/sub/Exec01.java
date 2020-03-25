package day13.sub;

import java.util.*;
public class Exec01 {

	int num = 0;

	public Exec01() {
		ArrayList list = new ArrayList();
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			cnt++;
			num = (int) (Math.random() * 3);
			int no1 = (int) (Math.random() * 41 + 10);
			int no2 = (int) (Math.random() * 41 + 10);
			if (num == 0) {
				list.add(new Samgak(no1, no2));
				System.out.println(cnt+"번째 입니다.");
				System.out.println();
			}else if(num == 1) {
				list.add(new Won(no1));
				System.out.println(cnt+"번째 입니다.");
				System.out.println();
			}else {
				list.add(new Samgak(no1, no2));
				System.out.println(cnt+"번째 입니다.");
				System.out.println();
			}
			
		}
	}

	public static void main(String[] args) {
		new Exec01();

	}

}
