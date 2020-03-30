package day15;

/**
 * 이 클래스는 회원 1명의 정보를 저장할 클래스
 * 
 * @author 서동혁
 * @since 2020.03.27
 * @version v.1.0
 * 
 */
public class Member {
	private int mno, avtNo;
	private String id, pw, name, tel, addr, mail, birth, gen, avatar, sDate, sTime, isShow;
	// DB에 있는 데이터로 날짜를 가져올 때는 날짜따로 시간따로 가져와야합니다, 한번에 꺼내는 함수는 없습니다.
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getAvtNo() {
		return avtNo;
	}
	public void setAvtNo(int avtNo) {
		this.avtNo = avtNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getsDate() {
		return sDate;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	public String getsTime() {
		return sTime;
	}
	public void setsTime(String sTime) {
		this.sTime = sTime;
	}
	public String getIsShow() {
		return isShow;
	}
	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	
	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("회원번호 : ");
		buff.append(mno);
		buff.append("\n");
		buff.append("회원이름 : ");
		buff.append(name);
		buff.append("\n");
		buff.append("회원ID : ");
		buff.append(id);
		buff.append("\n");
		buff.append("회원메일 : ");
		buff.append(mail);
		buff.append("\n");

	
		return buff.toString();
	}
}
