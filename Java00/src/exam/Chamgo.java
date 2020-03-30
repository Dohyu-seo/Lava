package exam;

/**
 *  �� Ŭ������ emp ���̺��� ��� ������ ���� ���� ����� �����
 *  ��û�� ���� ��ȯ���ִ� Ŭ����
 *  
 * @author ������
 * @since 2020.03.30
 * @version v.1.0
 *
 */
public class Chamgo {
	// �ڵ带 ���� ����
	public final int SEL_ALL = 1001;
	public final int SEL_DNO = 1002;
	
	public final int EDIT_SAL = 2001;
	
	
	// buffer�� ����ϱ� ���� ��
	//�ڵ带 �Է¹޾� �������ִ� �Լ�
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		// ��� ����� ���� �������� ���� ���
		switch(code) {
		case SEL_ALL:
			buff.append("SELECT "); // ��Ʈ�������� append�� �� �ڿ� ������ �ξ�� ������ �ȳ���.**
			buff.append("	empno, ename, job, mgr, hiredate, sal, comm, deptno ");
			buff.append("FORM ");
			buff.append("	emp ");
			break;
		case SEL_DNO:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, mgr, hiredate, sal, comm, deptno ");
			buff.append("FORM ");
			buff.append("	emp ");
			buff.append("WHERE ");
			buff.append("	deptno = ? "); // ? �� ����ó���ϴ� �Լ��� ���� �����ϹǷ� �� �Լ��� �̿��Ͽ� ó���ϸ� �ȴ�.
			break;
		case EDIT_SAL:
			buff.append("UPDATE ");
			buff.append("	emp ");
			buff.append("SET ");
			buff.append("	sal = ? ");
			buff.append("WHERE ");
			buff.append("	empno = ? ");
			break;
		}
		return buff.toString();
	}
}
