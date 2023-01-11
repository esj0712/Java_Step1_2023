package chapter06;

public class TeamGroup {

	private TeamMember[] member = new TeamMember[6];

	//기본 생성자
	
	// 초기화 메소드
	public void init() {
		member[0] = new TeamMember("박창훈", "남자");
		member[1] = new TeamMember("이석진", "남자");
		member[2] = new TeamMember("한성무", "남자");
		member[3] = new TeamMember("박찬우", "남자");
		member[4] = new TeamMember("이세정", "여자");
		member[5] = new TeamMember("장준근", "남자");
	}

	// 출력 메소드
	public void Disp() {
		for (int i = 0; i < member.length; i++) {
			System.out.print("성별 : " + member[i].getGender());
			System.out.println(", 성명 : " + member[i].getName());

		}
	}

}
