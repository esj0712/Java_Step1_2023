package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		//학생 2명 생성
		StdInfo studentJames=new StdInfo("James", 12000);
		StdInfo studentTom=new StdInfo("Tome", 10000);
		
		
		//버스타기
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		//정보확인
		studentJames.showInfo();//지출
		bus100.showInfo();// 수입 증가/인원수 증가
		System.out.println("====================================");
		Bus bus160=new Bus(160);
		studentTom.showInfo();
		bus160.showInfo();
		System.out.println("====================================");
		
        //지하철타기
		Subway subwayGreen=new Subway("2호선");
		studentJames.takesubway(subwayGreen);
		studentJames.showInfo();
		subwayGreen.showInfo();
		System.out.println("====================================");
		Subway subwayBlue=new Subway("4호선");
		studentTom.takesubway(subwayBlue);
		studentTom.showInfo();
		subwayBlue.showInfo();
		System.out.println("====================================");
	}

}
