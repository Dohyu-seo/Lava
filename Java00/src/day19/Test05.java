package day19;

/*
 	 예제 5 ]
 	 	1. day19/etc에 폴더하나를 강제 만든다.
 	 		day19/etc/snue
 	 	2. 경로상에 없는 폴더까지 한꺼번에 만든다
 	 		day19/etc/zzz/abc 폴더를 만든다고 한다면 ,..
 	 		
 	 	3. 만들어진 파일중 하나를 삭제한다.
 	 		(폴더도 삭제 가능, 파일도 삭제 가능)
 	 	
 	 	4. 특정 파일의 이름을 다른이름으로변경하자.
 */

import java.io.*;
import javax.swing.*;

public class Test05 {

	public Test05() {
		/*
		 * // 만들고 싶은 폴더(없어도 상관없다) 파일로 만든다. // 1. File file = new
		 * File("src/day19/etc/snue"); file.mkdir();
		 */

		/*
		 * File file = new File("src/day19/etc/zzz/abc"); file.mkdirs();
		 */
		/*
		 * File file = new File("src/day19/etc/zzz/abc"); file.delete();
		 */
		/*
		 * File oldF = new File("src/day19/etc/sample.txt"); File newF = new
		 * File("src/day19/etc/sample.increpas"); //바꿔주자 oldF.renameTo(newF);
		 */

	}

	public static void main(String[] args) {
		new Test05();

	}

}
