package chapter06;

public class Bus {
	
	//멤버
    int busNum;
    int passengerCount;
    int money;
    //디폴트 생성자는 생략
    public Bus(int busNum) {
		this.busNum=busNum;
	}
	
    public void take(int money) { //승객이 낸 돈
		this.money+=money; //버스의 수입이 증가
		passengerCount++; //승객의 수
	}
    
    public void showInfo() { //버스의 정보를 출력
    	
    	System.out.println("버스 "+busNum+"번의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원 입니다");
    	
		
	}
    
	
}
