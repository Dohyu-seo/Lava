package day12;
/*
 	���� 2]
	
		�л��� �̸�, java, db, html, js, css, ����, ���
		�� ������ Ŭ������ �����
		5�л��� �����͸� �Է��ؼ� ����ϼ���.
		��, ������ ����ȭ ��Ű����.
 */

public class Stud {
	private String name;
	private int java, db, html, js, css, sum;
	private double avg;
	//������ �Լ� �����
	public Stud() {}
	// name �� ���� �Ű���������Ʈ �����
	public Stud(int java, int db, int html, int js, int css) {
		this("������",java, db, html, js, css);
	}
	//�Ű���������Ʈ �����
	public Stud(String name, int java, int db, int html, int js, int css) {
		this.name = name;
		this.java = java;
		this.db = db;
		this.html = html;
		this.js = js;
		this.css = css;
	}
	// getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}

	public int getDb() {
		return db;
	}
	
	public void setDb(int db) {
		this.db = db;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	public int getJs() {
		return js;
	}

	public void setJs(int js) {
		this.js = js;
	}

	public int getCss() {
		return css;
	}
	
	public void setCss(int css) {
		this.css = css;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}


}
