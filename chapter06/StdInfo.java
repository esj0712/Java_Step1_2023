package chapter06;

public class StdInfo {

	//�ʵ�
	public String studentname;
	public int grade;
	public int money;
	
	// free compile
	
	// ������ �����ε�
	public StdInfo(String studentname,int money) {
		this.studentname=studentname;
		this.money=money;
	}
	
	// ����
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -=1000; //�л� ����
	}
	// ����ö
	public void takesubway(Subway subway) {
		subway.take(1500);
		this.money -=1000; //�л� ����
	}
	//���� �ܾ�
	public void showInfo() {
		System.out.println(studentname+"���� ���� �ܾ��� :"+money+"�� �Դϴ�");
	}
	}
