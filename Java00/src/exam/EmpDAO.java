package exam;

public class EmpDAO {
	
	// 기본적으로 DB작업을 할 클래스
	// 어디서든 함수에서 질의명령을 갖고있어야하므로 ...
	public Chamgo eSql; // Chamgo 는 sql이라는 변수에 담겨져 있다.
	
	public EmpDAO() {
		// 선언
		eSql = new Chamgo();
		// 모든 회원의 정보를 조회할 질의명령 가져오기
		String sql = eSql.getSQL(eSql.SEL_ALL);
		System.out.println("sql : "+ sql);
		
	}

	public static void main(String[] args) {
		new EmpDAO();
	}

}
 
// 클래스가 갖는 기능대로 구분해주는게 좋습니다
// 명칭 따로, 질의명령 따로, 출력 따로