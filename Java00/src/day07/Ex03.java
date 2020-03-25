package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		//회원의 이름과 전화번호, 이메일을 저장할 배열을 만들자
		String name[] = new String[1] ;
		String tel[] = new String[1] ;
		String mail[] = new String[1] ;
		
//		이름 입력하면 그 이름 배열에 전화번호 메일을  넣고 출력
		//데이터를 담을 배열을 만들고
		String tmp[][] = new String[3][];
		tmp[0] = name;
		tmp[1] = tel;
		tmp[2] = mail;
		
		int idx = -1;
		
		
		for(int i = 0; i<tmp.length; i++) {
			
			for(int j =0; j<name.length; j++) {
				String str = JOptionPane.showInputDialog("이름을 입력하세요");
			tmp[j][i] = str;
			idx = i;
			j++;
			String hp = JOptionPane.showInputDialog("전화번호를 입력하세요.");
			tmp[j][i] = hp;
			idx = i;
			j++;
			String email = JOptionPane.showInputDialog("이메일을 입력하세요.");
			tmp[j][i] = email;
			idx = i;
			
			/*
				}
				for(int j =0; j<name.length; j++) {
				String hp = JOptionPane.showInputDialog("전화번호를 입력하세요.");
				tmp[j][i] = hp;
			}
					for(int j =0; j<name.length; j++) {
					String email = JOptionPane.showInputDialog("이메일을 입력하세요.");
					tmp[j][i] = email;
		}
			break;*/
			}break;
	}
		
		String msg;
		if(idx != -1) {
			msg = "name : "+tmp[0][idx]+"\ntel : " + tmp[1][idx]+"\nmail"+tmp[2][idx];
		JOptionPane.showMessageDialog(null,msg);
		}
		
		
		
		/*
		//문자열 입력받을 준비하고
		String str = JOptionPane.showInputDialog("이름을 입력하세요");		
		//인덱스 기억할 변수 만들어주기, -1로 값을 주어 0의 자리에있는 것과 혼동되지 않도록 한다.
		int idx = -1;
		//입력받은 문자열과 배열안에 이름이 맞는지 비교하기
		for(int i =0; i<name.length; i++) {
			if(name[i].equals(str)) {
				//idx에 i를 넣어서 해당 인덱스를 기억할 수 있도록 하고 이 인덱스는 후에 
				// 같은 인덱스에 있는 위칫값을 찾을 때 쓴다.(전화번호와 이메일)
				idx = i;
				//위칫값을 찾았으니 멈추기.
				break;
			}//if문
		}//for문
		//만약 여기서 인덱스를 찾지 못햇을 경우 메세지를 출력해준다
		// 이 역할은 idx에 i가 들어가지 않아 -1일 때 작용하게 된다.
		String msg = "존재하지 않는 이름입니다.";
		//조건문에서 인덱스 기억값인 idx를 활용해 데이터를 출력해줄 수 있는 조건문을 만든다.
		if(idx !=-1) {
			//위에서 만들었던 String msg를 if조건문에 의해 변형시켜 출력한다.
			msg = "name :"+name[idx]+ "\ntel"+tel[idx]+"\nmail"+mail[idx];
			
		}//if문 2번째
		JOptionPane.showMessageDialog(null, msg);*/
	}

}
