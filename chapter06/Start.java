package chapter06;

import java.util.Random;

public class Start {
	
	private int random=new Random().nextInt(50)+1;
	private int count=0;
	private String result="FAIL";
	
	public  String check(int mynumber) {
		
		count++;
		if(mynumber<random) {
			System.out.println("UP!");
		}else if(mynumber>random) {
			System.out.println("DOWN!");
		}else if(mynumber==random) {
			System.out.println(count + "ȸ ���� ����!");
			result="SUCCES";
		}
		return result;
	}
		
		///random������ ������ up / ũ�� down / ��ġ�ϸ�  => result="SUCCES"
		
}
