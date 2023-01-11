package chapter07;

public class Encapsulation {

	private int Side;
	private int Heigth;

	public Encapsulation() {
		Side = 0;
		Heigth = 0;
	}

	public int Cal_Area(int S, int H) {
		Side = S;
		Heigth = H;

		return (S * H);
	}
}
