package chapter07;

public class CarMain {

	public static void main(String[] args) {
		//생성자를 통하여 초기화
		Car car=new Car("검정",3000);
		//멤버변수이용하여 하나씩 초기화
		
		
		//멤버변수에 직접 접근해서 초기화 후 출력
		
		
		System.out.println("자동차 색상 : "+car.color);
		System.out.println("자동차 cc : "+car.cc);
		System.out.println("-------------------------------");
		//메소드를 이용한 출력

		System.out.println("자동차 색상 : "+car.getColor());
		System.out.println("자동차 cc : "+car.getCc());
		System.out.println("-------------------------------");
	}

}
