package DB;

/**
 *  이 클래스는 데이터베이스 작업을 위한 JDBC를 처리 할 때 필요한 공통적인 기능을 제공하기 위한 클래스
 *  @author 	서동혁
 *  @since 		2020.04.03
 *  @version	v.1.0
 *  @see		java.sql.*;
 */
import java.sql.*;

public class ORCLJDBC {
	/*
	 * 이 클래스를 누군가 new시키는 순간 기본적으로 가장 필요한 드라이버 로딩과 커넥션 얻는 작업을 동시에 실행할 것이다.
	 */
	private Connection con = null;

	public ORCLJDBC() {
		try {
			// 드라이버 로딩하고
			Class.forName("oracle.jdbc.driver.OracleDriver");// 클래스이름 적어준다..
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 커넥션 얻어오는 함수
	public Connection getCon() {
		return getCon("hello", "hello");
	}

	// 커넥션 얻어오는 함수
	public Connection getCon(String user, String pw) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.con = con;
		return con;
	}

	// Statement 얻어오는 함수
	public Statement getSTMT() {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}

	// PreparedStatment 얻어오는 함수
	public PreparedStatement getPSTMT(String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}

	// 필요가 없을 경우 대신 닫아주는 함수
	public void close(Object o) {
		try {

			if (o instanceof Connection) {
				((Connection) o).close();
			} else if (o instanceof Statement) {
				((Statement) o).close();
			} else if (o instanceof PreparedStatement) {
				((PreparedStatement) o).close();
			} else if (o instanceof ResultSet) {
				((ResultSet) o).close();
			}
		} catch (Exception e) {}

	}

}
