package chapter06;

public class Subway {

	//���
    public String linenum;
    int passengerCount;
    int money; //����ö ����
    //����Ʈ �����ڴ� ����
    public Subway(String linenum) {
		this.linenum=linenum;
	}
	
    public void take(int money) { //�°��� �� ��
		this.money+=money; //����ö�� ������ ����
		passengerCount++; //�°��� ��
	}
    
    public void showInfo() { //����ö�� ������ ���
    	
    	System.out.println("����ö  "+linenum+"�� �°��� "+passengerCount+"���̰�, ������ "+money+"�� �Դϴ�");
    	
		
	}
    
	
}
