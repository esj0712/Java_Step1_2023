package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		//�л� 2�� ����
		StdInfo studentJames=new StdInfo("James", 12000);
		StdInfo studentTom=new StdInfo("Tome", 10000);
		
		
		//����Ÿ��
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		//����Ȯ��
		studentJames.showInfo();//����
		bus100.showInfo();// ���� ����/�ο��� ����
		System.out.println("====================================");
		Bus bus160=new Bus(160);
		studentTom.showInfo();
		bus160.showInfo();
		System.out.println("====================================");
		
        //����öŸ��
		Subway subwayGreen=new Subway("2ȣ��");
		studentJames.takesubway(subwayGreen);
		studentJames.showInfo();
		subwayGreen.showInfo();
		System.out.println("====================================");
		Subway subwayBlue=new Subway("4ȣ��");
		studentTom.takesubway(subwayBlue);
		studentTom.showInfo();
		subwayBlue.showInfo();
		System.out.println("====================================");
	}

}
