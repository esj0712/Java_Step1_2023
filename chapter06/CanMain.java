package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {

		String select = "";
		int money = 0;

		Vanding ven = new Vanding();
		ven.init();// �����غ�

		System.out.println("���� �����ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		money = scan.nextInt();
		ven.showCanS(money);

		System.out.println("���Ḧ �����ϼ��� : ");
		select = scan.next(); // ���� ���� ����
		ven.outCan(select);
	}
}
