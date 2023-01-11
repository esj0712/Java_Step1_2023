package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {

		int side;
		int heigth;
		int Area;

		side = Integer.parseInt(JOptionPane.showInputDialog("밑변"));
		heigth = Integer.parseInt(JOptionPane.showInputDialog("높이"));

		// 객체생성
		Encapsulation obj = new Encapsulation();

		// 넓이 구하기
		Area = obj.Cal_Area(side, heigth);

		System.out.println("사각형의 넓이 : " + Area);
		String str = "사각형의 넓이 : " + Area;
		JOptionPane.showMessageDialog(null, str);

	}

}
