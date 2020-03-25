package day11;

import java.util.Scanner;

/*
	���� 2]
		�� Ŭ������ �л� �Ѹ��� 
			�̸�, java, oracle, html, javascript, jsp, spring��
		������ ����� Ŭ�����̴�.
		�� Ŭ������ ��ü�� �� �� �����͸� �Է¹޾Ƽ� �� ������ ����� �ǰ� Ŭ������ �����ϼ���.
		
		��, �����Ͱ� �Է��� �� �� ��� �̸��� "�ڱ�ȣ"�� �Էµǰ� �ϰ� ������ �����ϰ� ���ǰ� �ϼ���.
		
 */
public class Score {
		//�� Ŭ������ �л��� ���� ������ ����ϴ� Ŭ�����̹Ƿ�
	// �̸�, ����, ������ ����ϰ� �ϸ� �� ���̴�.
	
	String name;
	int java, oracle, html, javascript, jsp, spring, total;
	double avg;
	//�� Ŭ������ ���� : �̸��� �Է��ϸ�. ���� 6������ ������ ����ڴ�.
	// 3-1 ������ �迭�� �־ �����ϰ� �Է����ش�.
//	int[] subj = new int[6];
//	String[] toSubj = new String[]{"java","oracle", "html", "javascript", "jsp", "spring"};
	

	// 1. �⺻ ������ �Լ� �����
	public Score() {
		this("�ڱ�ȣ");
		//name�� �������� �ʾ��� �� �ڱ�ȣ��� �̸��� �Էµǰ� �ϰ�.
	}
	
	public Score(String name) {
		/*this.name = name;
		this.java =(int)(Math.random()*61+40);
		this.oracle =(int)(Math.random()*61+40);
		this.html =(int)(Math.random()*61+40);
		this.javascript =(int)(Math.random()*61+40);
		this.jsp = (int)(Math.random()*61+40);
		this.spring = (int)(Math.random()*61+40);*/
		/*
		this(name, (int)(Math.random()*61 + 40), (int)(Math.random()*61 + 40), 
				(int)(Math.random()*61 + 40), (int)(Math.random()*61 + 40), 
				(int)(Math.random()*61 + 40),(int)(Math.random()*61 + 40));	
	}*/
	this(name, getJumsoo(),getJumsoo(),getJumsoo(),getJumsoo(),getJumsoo(),getJumsoo());	
	/*
	 	getJumsoo() �Լ��� �� Ŭ������ ����̰�
	 	�� �Լ��� ����� �� �ִ� ������
	 	�� Ŭ������ ��ü�� �� ���Ŀ� ��� �����ϴ�.
	 	
	 	���� �� �Լ���  ���ٸ� �Ӽ��� ���� ���Ǹ� �ϰ� �Ǹ�
	 	���� �޸𸮿� �÷����� ���� ���°�
	 	������ �Լ����� ȣ���� �� ���� �����̱� ������ ����� �� ����.
	 	
	 	 �� �Լ��� ���� ����ؾ߰ڴٸ�, �� �Լ��� �̸� �޸𸮿� �÷��ָ� �� ���̴�.
	 	 �� �� ����� �� �ִ�  �Ӽ��� "static" �Ӽ��̴�.
	 */
}
	// 2. �⺻������ �Լ� �����ε�
	public Score(String name, int java, int oracle, int html, int javascript, int jsp, int spring ) {
		//�� Ŭ������ �̸��� �Է��ϸ� ��ȯ���� �ִ� �Լ��̴�.
		this.name = name;
		
		//���������� ������ �Լ� �����س��´�.
		//���⼭ �������ִ°� ������ �Լ��̴�.
		this.java = java;
		this.oracle = oracle;
		this.html = html;
		this.javascript = javascript;
		this.jsp = jsp;
		this.spring = spring; 
		setTotal();
		setAvg();
	}
	
	public static int getJumsoo() {
		return (int)(Math.random()*61 + 40);
	}
	//������ �����ִ� �Լ�
	public void setTotal() {
		this.total = java + oracle + html + javascript + jsp + spring;
	}
	// ����� �����ִ� �Լ�
	public void setAvg() {
		this.avg = this.total / 6.;
	}
	public void toPrint() {
		System.out.printf("%4s : %3d | %3d | %3d | %3d | %3d | %4s | %5.3f\n",
						name, java, oracle, html, javascript, jsp, spring, total, avg);
	}
}
/*		this.java = toJava(name);
		this.oracle = toOracle(name);
		this.html = toHtml(name);
		this.javascript = toJavascript(name);
		this.jsp = toJsp(name);
		this.spring = toSpring(name);
		
	}*/
	/*
	// 3. ������ ������ �����ִ� �Լ�
	public void getSubj(String name) {
		// ������ ������ �������� ���ǰ� �ϰ� ��µǰ� �Ѵ�.
		for(int i = 0 ; i < subj.length; i++) {
			subj[i] = (int)(Math.random()*41+60);
			System.out.println(toSubj[i]+"�� ������ : "+subj[i]);
		}
	}
	*/
	/*
	// 3 - 2�� ���� �����ϰ� ������ ���� �Լ����� ������.
	public int toJava(String name) {
		//�̸��� �Է��ϸ� ������ java�� ������ �������ִ� �Լ�
		return java = (int)(Math.random()*41+60);
	}
	public int toOracle(String name) {
		//�̸��� �Է��ϸ� ������ java�� ������ �������ִ� �Լ�
		return oracle = (int)(Math.random()*41+60);
	}
	public int toHtml(String name) {
		//�̸��� �Է��ϸ� ������ java�� ������ �������ִ� �Լ�
		return html = (int)(Math.random()*41+60);
	}
	public int toJavascript(String name) {
		//�̸��� �Է��ϸ� ������ java�� ������ �������ִ� �Լ�
		return javascript = (int)(Math.random()*41+60);
	}
	public int toJsp(String name) {
		//�̸��� �Է��ϸ� ������ java�� ������ �������ִ� �Լ�
		return jsp = (int)(Math.random()*41+60);
	}
	public int toSpring(String name) {
		//�̸��� �Է��ϸ� ������ java�� ������ �������ִ� �Լ�
		return spring = (int)(Math.random()*41+60);
	}
}
*/


/*
 	���-
 	//�л� �Ѹ��� �������̹Ƿ� 
	String name = "�ڱ�ȣ";
	
	//���� ������ ������ �迭
	int[] arr;
	//���� ������ ������ �������� 
	int java, oracle, html, javascript, jsp, spring;
	
	// �� Ŭ������ �ν��Ͻ��� �Ǵ� ����
	// �ش� �ν��Ͻ� �����ָ� �����ѳ����� ���� �� ����.
	// => �л� �Ѹ� �ν��Ͻ��� ���� �� ���� new ��ų ���̴�.
	// ����� �ʱ�ȭ ������ �ϴ� �Լ��� ������ �Լ��̹Ƿ�
	// ������ �Լ����� �ԷµǴ� �̸��� �ʱ�ȭ ��Ű��� ����
	
	
	
	//������ �ȳ����ִ� �迭�� �ֱ�
	String[] score1 = new String[] {"java","oracle", "html", "javascript", "jsp", "spring"};
	
	public Score() { // ������ �Լ���, ����ʱ�ȭ�� �����ش�, ����߿� �Լ��� �ִٸ� �Լ��� �ʱ�ȭ�����ִ� ������ �Ѵ�.
		setSubj();
	}// ������ �Լ��� ����� ���´�.
	
	//�̸��� ������ �������Լ��� �����.
	public Score(String name) {
		this();
		this.name = name;
	}
	
	
	// ���ھ �Է�����
	public void setSubj() {
		for(int i = 0; i < 6;i++) {
			 Scanner sc = new Scanner(System.in);
			 System.out.print(score1[i]+"�� ������ �Է��ϼ���.");
			 int str = sc.nextInt(); 
			 arr[i] = str;
		}
	}
 */
