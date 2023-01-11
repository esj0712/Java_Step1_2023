package chapter06;

public class Subway {

	//멤버
    public String linenum;
    int passengerCount;
    int money; //지하철 수입
    //디폴트 생성자는 생략
    public Subway(String linenum) {
		this.linenum=linenum;
	}
	
    public void take(int money) { //승객이 낸 돈
		this.money+=money; //지하철의 수입이 증가
		passengerCount++; //승객의 수
	}
    
    public void showInfo() { //지하철의 정보를 출력
    	
    	System.out.println("지하철  "+linenum+"의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원 입니다");
    	
		
	}
    
	
}
