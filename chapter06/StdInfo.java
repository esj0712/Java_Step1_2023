package chapter06;

public class StdInfo {

	//필드
	public String studentname;
	public int grade;
	public int money;
	
	// free compile
	
	// 생성자 오버로딩
	public StdInfo(String studentname,int money) {
		this.studentname=studentname;
		this.money=money;
	}
	
	// 버스
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -=1000; //학생 지출
	}
	// 지하철
	public void takesubway(Subway subway) {
		subway.take(1500);
		this.money -=1000; //학생 지출
	}
	//남은 잔액
	public void showInfo() {
		System.out.println(studentname+"님의 남은 잔액은 :"+money+"원 입니다");
	}
	}
