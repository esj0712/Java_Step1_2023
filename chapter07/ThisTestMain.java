package chapter07;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {

		Thistest R1 = new Thistest();

		R1.Move();
		R1.Move();
		System.out.println("=================================");
		R1.RAge();
		System.out.println("=================================");
		int R_speed = Integer.parseInt(JOptionPane.showInputDialog("�κ� �ӵ�"));
		int R_age = Integer.parseInt(JOptionPane.showInputDialog("�κ� ����"));
		String R_name = JOptionPane.showInputDialog("�κ� �̸�");
		String R_num = JOptionPane.showInputDialog("�κ� ��ȣ");

		Thistest R2 = new Thistest(R_speed, R_age, R_name, R_num);
		int speed = R2.getSpeed();
		System.out.println("�ӵ� : " + speed);
		System.out.println("���� : " + R2.getAge());
		System.out.println("�̸� : " + R2.getRobotName());
		System.out.println("��ȣ : " + R2.getRobotNum());
		System.out.println("=================================");
		R2.Move();
		R2.Rname();
		R2.RAge();

	}

}
