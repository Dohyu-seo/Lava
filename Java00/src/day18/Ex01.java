package day18;

import java.io.*;
import java.util.*;

import javax.swing.*;

public class Ex01 {
	/*
	 * 문제 1] 1. Ex01.txt에 저장된 데이터를 Properties에 담고 2. 키값을 모두 꺼내서 3. 데이터를 추출하고 4. 총점을
	 * 구해주세요. 5. 메세지창을 띄워서 총점을 출력해주세요.
	 */
	public Ex01() {
		// Properties 변수 만들고
		Properties prop = new Properties();
		// 불러올 파일 넣을 변수 만들고
		FileInputStream fin = null;
		// 파일 불러오는데 예외처리 같이 넣어주기
		try {
			// 파일 불러와서 fin에 담기
			fin = new FileInputStream("D:\\class\\Java\\git\\Lava\\Java00\\src\\day18\\Ex01.txt");
			// Properties에 파일의 데이터 담긔~
			prop.load(fin);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "파일 위치 에러");
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (Exception e) {}
		}

		Set<Object> key = prop.keySet();
		ArrayList<String> list = new ArrayList(key);
		Collections.sort(list);// 정렬
		int sum = 0;

		for (String s : list) {
//			System.out.println(s + " : " + prop.get(s));
			sum += Integer.parseInt((String) prop.get(s));
			
		}
		JOptionPane.showMessageDialog(null, ("총점 :" + sum));
		JOptionPane.showMessageDialog(null, ("평점 :" + sum / list.size()));
		/*
		 * 
		 * Set<Map.Entry<Object, Object>> set = prop.entrySet(); // 은닉화 시켜놓고 Map에 있는 키와
		 * 벨류를 한 꺼번에 꺼내서 사용할 수 있는 함수 ==> 저장 되는 곳 ...?
		 * 
		 * Iterator<Map.Entry<Object, Object>> itor = set.iterator(); // iterator 변환 ~
		 * sum = 0; // 이제 하나씩 꺼낸다 while(itor.hasNext()) { Map.Entry<Object, Object> ent
		 * = itor.next(); // k와 val 에 각각 next를 쓰지 않기위해서 초기화 시키기. String k = (String)
		 * ent.getKey(); String val = (String) ent.getValue();
		 * 
		 * // 출력하고... System.out.println(k + " : " + val); sum += Integer.parseInt(val);
		 * // JOptionPane.showMessageDialog(null, k+" : "+val); }
		 * 
		 * JOptionPane.showMessageDialog(null, "총점 :" +sum); }
		 */
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
