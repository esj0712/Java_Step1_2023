package chapter05;

import java.util.Scanner;

public class Method2 {

	int cnt, num;
	boolean run = true;
	String str = "";
	Method br = new Method();
	Scanner scan = new Scanner(System.in);

	public Method2() {
		Method br = new Method();

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.  | 2. | 3.");
			System.out.println("------------------------------------------");
			System.out.print(">>");

			num = scan.nextInt();

			switch (num) {
			case 1:{
				System.out.println("> ");
				int input_num = scan.nextInt();
				br.makebread(cnt);
				break;}
			case 2:{
				System.out.println(" : ");
				int cnt = scan.nextInt();
				System.out.println(" : ");
				String name = scan.next();
				br.makebread(cnt, str);
				break;}
		    default:{
		        System.out.println("");
		        break;}
			}// switch
			break;
		} // while
		run=false;

	}
}
