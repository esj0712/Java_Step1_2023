package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {

		int side;
		int heigth;
		int Area;

		side = Integer.parseInt(JOptionPane.showInputDialog("�غ�"));
		heigth = Integer.parseInt(JOptionPane.showInputDialog("����"));

		// ��ü����
		Encapsulation obj = new Encapsulation();

		// ���� ���ϱ�
		Area = obj.Cal_Area(side, heigth);

		System.out.println("�簢���� ���� : " + Area);
		String str = "�簢���� ���� : " + Area;
		JOptionPane.showMessageDialog(null, str);

	}

}
