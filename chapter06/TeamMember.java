package chapter06;

public class TeamMember {

	// 멤버변수
	public String teamName; // 팀명
	public String mName; // 팀장
	public String mphone; // 팀장 전화번호
	public String sName; // 부팀장
	public String name; // 팀원
	public String gender; // 성별

	// 기본 생성자
	public TeamMember() {
	}

	// 오버로딩(생성자를 통화여 초기화)
	public TeamMember(String name, String gender) {
		this.name = name;
		this.gender = gender;

	}

	// 메소드를 통한 초기화
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getmName(String mname) {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
