package chapter07;

public class CarMain {

	public static void main(String[] args) {
		//�����ڸ� ���Ͽ� �ʱ�ȭ
		Car car=new Car("����",3000);
		//��������̿��Ͽ� �ϳ��� �ʱ�ȭ
		
		
		//��������� ���� �����ؼ� �ʱ�ȭ �� ���
		
		
		System.out.println("�ڵ��� ���� : "+car.color);
		System.out.println("�ڵ��� cc : "+car.cc);
		System.out.println("-------------------------------");
		//�޼ҵ带 �̿��� ���

		System.out.println("�ڵ��� ���� : "+car.getColor());
		System.out.println("�ڵ��� cc : "+car.getCc());
		System.out.println("-------------------------------");
	}

}
