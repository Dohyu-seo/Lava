package day18;

/*
  	문제 2]
 		학생의 이름, 번호, 반, 국어, 영어, 수학, 총점, 평균을
 		저장할 VO클래스를 만들고
 		
 		5학생의 데이터를 입력해서 관리할 Set을 만들어서
 		이름 순으로 출력하세요.
 */
public class Ex02_01 {
	private String name;
	private int sno, ban, kor, eng, math, sum;
	private double avg;

	public Ex02_01() {
	}

	public Ex02_01(int sno, int ban, int kor, int eng, int math) {
		this("서동혁", sno, ban, kor, eng, math);

	}

	public Ex02_01(String name, int sno, int ban, int kor, int eng, int math) {
		this.name = name;
		this.sno = sno;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum() {
		this.sum = kor + eng + math;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = sum / 3;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}
