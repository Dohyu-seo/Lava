package day19;

/*
 	fr01.txt 파일을 읽어보자.
 	이 파일은 ObjectOutputStream으로 저장한 파일이므로
 	반드시 저장할 때 사용한 클래스가 읽는 쪽에서 패키지와 파일이름까지 똑같아야하고
 	반드시 ObjectInputStream을 사용해서 읽어야한다.
 	
 */
import java.io.*;
import javax.swing.*;

public class Test14_01 {

	public Test14_01() {
		// 타겟 스트림 준비하고
		FileInputStream fin = null;
		// 보조
		ObjectInputStream oin = null;
		try {
			// 스트림만들고
			fin = new FileInputStream("src/day19/etc/fr01.txt");
			oin = new ObjectInputStream(fin);

			// 저장할 때 클래스로 저장을 했으니
			// 읽을 때도 클래스로 읽자.
			Friend fr = (Friend) oin.readObject();
			JOptionPane.showMessageDialog(null, fr.getName() + "\n" + fr.getTel() + "\n" + fr.getMail() + "\n"
					+ fr.getAge() + "\n" + fr.getHeight() + "\n" + fr.getGen());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			try {
				oin.close();
				fin.close();
			} catch (Exception e) {
			}
		}

	}

	public static void main(String[] args) {
		new Test14_01();

	}

}
