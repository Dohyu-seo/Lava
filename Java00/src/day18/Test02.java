package day18;

import java.io.*;
import java.util.*;

public class Test02 {

	public Test02() {
		Properties prop = new Properties();

		// 파일 읽을 준비를 하고
		FileInputStream fin = null;

		// 파일 읽고
		try {
			fin = new FileInputStream("src/day18/Jinro.properties");

			// prop에 파일내용 담는다
			prop.load(fin);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("진로 이웃 이	름 : "+prop.get("name"));
		System.out.println("진로 이웃 나	이 : "+prop.get("age"));
		System.out.println("진로 이웃 전화번호 : "+prop.get("tel"));
		System.out.println("진로 이웃 주	소 : "+prop.get("addr"));
	}

	public static void main(String[] args) {
		new Test02();
	}

}
