package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {

		String select = "";
		int money = 0;

		Vanding ven = new Vanding();
		ven.init();// 음료준비

		System.out.println("돈을 투입하세요 : ");
		Scanner scan = new Scanner(System.in);
		money = scan.nextInt();
		ven.showCanS(money);

		System.out.println("음료를 선택하세요 : ");
		select = scan.next(); // 음료 종류 선택
		ven.outCan(select);
	}
}
