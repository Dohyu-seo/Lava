package exam;

public class EmpDAO {
	
	// �⺻������ DB�۾��� �� Ŭ����
	// ��𼭵� �Լ����� ���Ǹ���� �����־���ϹǷ� ...
	public Chamgo eSql; // Chamgo �� sql�̶�� ������ ����� �ִ�.
	
	public EmpDAO() {
		// ����
		eSql = new Chamgo();
		// ��� ȸ���� ������ ��ȸ�� ���Ǹ�� ��������
		String sql = eSql.getSQL(eSql.SEL_ALL);
		System.out.println("sql : "+ sql);
		
	}

	public static void main(String[] args) {
		new EmpDAO();
	}

}
 
// Ŭ������ ���� ��ɴ�� �������ִ°� �����ϴ�
// ��Ī ����, ���Ǹ�� ����, ��� ����