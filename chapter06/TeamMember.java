package chapter06;

public class TeamMember {

	// �������
	public String teamName; // ����
	public String mName; // ����
	public String mphone; // ���� ��ȭ��ȣ
	public String sName; // ������
	public String name; // ����
	public String gender; // ����

	// �⺻ ������
	public TeamMember() {
	}

	// �����ε�(�����ڸ� ��ȭ�� �ʱ�ȭ)
	public TeamMember(String name, String gender) {
		this.name = name;
		this.gender = gender;

	}

	// �޼ҵ带 ���� �ʱ�ȭ
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
