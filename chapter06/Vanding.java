package chapter06;

public class Vanding {

	// �������
	private Can can[] = new Can[5]; // ����
	private int money;

	// can[0]=new Can("ȯŸ",1000); //private �������̹Ƿ� �ݵ�� �޼ҵ�ȿ��� �ʱ�ȭ �Ѵ�

	// �޼ҵ�
	public void init() {
		can[0] = new Can("ȯŸ", 1000);
		can[1] = new Can("�ݶ�", 1100);
		can[2] = new Can("���̴�", 1200);
		can[3] = new Can("��ġ��", 1300);
		can[4] = new Can("��������", 1400);
	}

	// ��� ������ ���Ḹ �����ֱ�
	public void showCanS(int m) {

		money = m; //��

		for (int i = 0; i < can.length; i++) {
			// ���� ���ݰ� �� �Ǵ�
			if (can[i].getPrice() <= money) {
				System.out.println(can[i].getCanName() + " - " + can[i].getPrice() + "��");

			} // if
		} // for

	}// method

	// ������ ����� ������ �ܾ�
	public void outCan(String name) {
		for (int i = 0; i < can.length; i++) {
			if (can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName() + " ��(��) �����ϼ̽��ϴ�");
				System.out.println("�� �� : " + (money - can[i].getPrice() + "��"));
			}
		}

	}

}// class
