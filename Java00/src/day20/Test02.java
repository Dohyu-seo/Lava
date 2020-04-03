package day20;

/*
 	회원번호를 입력하면
 	회원 정보를 조회해주는 프로그램을 작성하세요.
 */
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Test02 {

	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public Test02() {
		dbInit();

		// 질의 명령을 작성해보자.
		// Statement 로 이 작업을 하게되면 매번 문자열을 만들어줘야 한다.
		// 회원 번호 입력 받는다.
		int no = -1;
		while (true) {
			String sno = JOptionPane.showInputDialog("조회할 회원 번호를 입력하세요!");
			try {
				no = Integer.parseInt(sno);
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 질의명령을 만든다.
		String sql = "SELECT mno, name, id, pw, mail email, gen, tel HP, ano avatarno, isshow status FROM member WHERE mno = " + no;
		String psql = "SELECT mno, name, id, pw, mail email, gen, tel HP, ano avatarno, isshow status FROM member WHERE mno = ?";
		
		try {
			/*
			//Statement를 얻어오고
			stmt = con.createStatement();
			// 질의 명령 실어서 보내고
			rs = stmt.executeQuery(sql);
			*/
			// ? 를 채워줘야하는 질의 명령을 사용하는 Statement는  PreparedStatement 이다.
			pstmt = con.prepareStatement(psql);
			// PreparedStatement는 질의 명령을 갖고 만들어야 하고
//			만들어진 후에는 질의 명령을 완성해야 질의명령이 정상적으로 작동한다.
			
			//질의 명령 완성하고
			pstmt.setInt(1, no); // ?의 위치 1에다 .. no를 채워준다
				
			// 질의명령을 실어 보내고 결과 받고
			rs = pstmt.executeQuery();// 이미 질의명령이 담겨있는 변수기 때문에 ()안을 비워도 된다.
			
			
			
			// 작업줄 한 줄 내리고
			rs.next();
			
			int mno = rs.getInt("mno");
			String name = rs.getString("name");
			String mid = rs.getString("id");
			String mpw = rs.getString("pw");
			String mail = rs.getString("email");
			String gen = rs.getString("gen");
			String tel = rs.getString("HP");
			int ano = rs.getInt("avatarno");
//			String isshow = rs.getString(9);
			char isshow = rs.getString("status").charAt(0);
			
			JOptionPane.showMessageDialog(null, name + " 선생님 정보 \n회원번호 : "+mno + 
					"\n회원아이디 : " + mid + "\n회원비밀번호 : " + mpw + "\n회원메일 : "+ 
					mail + "\n회원성별 : " +gen + "\n회원전화번호 : "+tel+"\n아바타번호 :"+ano+
					"\n활동여부 : "+((isshow == 'Y')? "활동중" : "탈퇴회원"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				stmt.close();
				con.close();
			}catch (Exception e) {}
		}
		
	}
	

	// 데이터베이스 드라이버 로딩하고 커넥션 얻어주는 함수
	public void dbInit() {
		try {
			// 드라이버 로딩하고
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 얻기
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("* 커넥션 성공 *");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test02();

	}

}
