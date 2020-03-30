package day14;

import javax.swing.JOptionPane;

public class SamgakTest {
	Samgak s1, s2;
	public SamgakTest() throws NumberFormatException {
		//ArrayList
		// JOptionpane로 입력받기	for문으로 사용..
		String s1num = JOptionPane.showInputDialog("첫 번째 삼각형의 밑변을 입력하세요.");
		String s1num2 = JOptionPane.showInputDialog("첫 번째 삼각형의 높이를 입력하세요.");
		String s2num = JOptionPane.showInputDialog("두 번째 삼각형의  밑변을 입력하세요.");
		String s2num2 = JOptionPane.showInputDialog("두 번째 삼각형의  높이를 입력하세요.");
		
		try {
			// 입력받은 값 변수에 담기~
			int s1Base = Integer.parseInt(s1num);
			int s1Height = Integer.parseInt(s1num2);
			int s2Base = Integer.parseInt(s2num);
			int s2Height = Integer.parseInt(s2num2);
			
			// 비교할 삼각형 두개 만들기~
			s1 = new Samgak(s1Base, s1Height);
			s2 = new Samgak(s2Base, s2Height);
			
			// private으로 설정 되어 있기 때문에 toString으로 꺼내오자~
			JOptionPane.showMessageDialog(null,
					(s1.toString() + s2.toString() + "두 삼각형은 " + 
							((s1.equals(s2)) ? ("같은 삼각형 입니다.") : ("다른 삼각형 입니다."))));
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "정수를 입력해 주세요~");
		}
	}

	public static void main(String[] args) {
		new SamgakTest();
	}

}
