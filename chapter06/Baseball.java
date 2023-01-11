package chapter06;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 컴퓨터가 발생한 난수 1개
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;

		do {
			// 1에서 9사이의 난수 발생
			com1 = new Random().nextInt(9) + 1;
			com2 = new Random().nextInt(9) + 1;
			com3 = new Random().nextInt(9) + 1;
		} while (com1 == com2 || com1 == com3 || com2 == com3);
		// 컴퓨터는 게임 준비 완료

		// 사용자가 입력할 수
		int user1 = 0;
		int user2 = 0;
		int user3 = 0;

		while (true) {
			System.out.println("--1~9 사이의 수를 입력하세요--");
			System.out.print("첫번쨰 수를 입력하세요 : ");
			user1 = scan.nextInt();
			System.out.print("두번쨰 수를 입력하세요 : ");
			user2 = scan.nextInt();
			System.out.print("세번쨰 수를 입력하세요 : ");
			user3 = scan.nextInt();

			int strike = 0;
			int ball = 0;

			// 만약 com1과 사용자가 입력한 첫번쨰(user1) 숫자가 같은 확률
			// 첫번째(user1) 숫자가 com2 또는 com3랑 숫자만 맞으면 ball
			if (com1 == user1) {// 숫자와 자리까지 모두 같을 경우
				strike++;
			} else if (user1 == com2 || user1 == com3) {// 자리는 틀리고 숫자만 맞을 경우
				ball++;
			}
			if (com2 == user2) {// 숫자와 자리까지 모두 같을 경우
				strike++;
			} else if (user2 == com1 || user1 == com3) {// 자리는 틀리고 숫자만 맞을 경우
				ball++;
			}
			if (com3 == user3) {// 숫자와 자리까지 모두 같을 경우
				strike++;
			} else if (user3 == com2 || user3 == com1) {// 자리는 틀리고 숫자만 맞을 경우
				ball++;
			}
			if (strike == 3) {
				System.out.println("정답" + com1 + com2 + com3);
				break;
			}else {
				if(strike >0 || ball>0) {
					System.out.println(strike + " strike, "+ball+"ball");
				}else {//단 한개도 일치하지 않을 경우
					System.out.println("OUT!!");
					System.out.println("===================================");
				}// in if
			}//out if
			
		}//while
	}

}
